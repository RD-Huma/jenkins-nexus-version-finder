package rd.com.huma.jenkins.nexus_version_finder;

import hudson.Launcher;
import hudson.model.BuildListener;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import net.sf.json.JSONObject;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;

import rd.com.huma.jenkins.nexus_version_finder.model.Data;
import rd.com.huma.jenkins.nexus_version_finder.model.Nexus;


/**
 *
 * @author edwincollado
 * @since  06/Junio/2015
 */
public class NexusJenkins extends Builder  {

	private List<String> version;

	@DataBoundConstructor
    public NexusJenkins(List<String> version) {
    	this.version = version;

    }

	public List<String> getVersion() {
		return version;
	}

	@Override
    public boolean perform(AbstractBuild<?, ?> build, Launcher launcher, BuildListener listener) {

		try {

			Client client = ClientBuilder.newClient();


			WebTarget webResource = client.target("http://172.16.7.40:8080/nexus/service/local/lucene/search?g=dr.gov.sigef&a=sigef_actual&repositoryId=releases");

			Response response = webResource.request("application/json").get(Response.class);
			Response response2 = webResource.request("application/json").get(Response.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			Nexus output = response.readEntity(Nexus.class);
			String output2 = response2.readEntity(String.class);

			//System.out.println("Output from Server .... \n");
			//System.out.println(output2);

			for (Data data : output.getData() ) {
				this.version.add(data.getVersion());
				//System.out.println(data.getVersion());
			}



		  } catch (Exception e) {

			e.printStackTrace();

		  }


		return true;
    }

	@Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl)super.getDescriptor();
    }



	//@Extension // This indicates to Jenkins that this is an implementation of an extension point.
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {
        /**
         * To persist global configuration information,
         * simply store it in a field and call save().
         *
         * <p>
         * If you don't want fields to be persisted, use <tt>transient</tt>.
         */

        private String version;



        /**
         * In order to load the persisted global configuration, you have to
         * call load() in the constructor.
         */
        public DescriptorImpl() {
            load();
        }

        /**
         * Performs on-the-fly validation of the form field 'name'.
         *
         * @param value
         *      This parameter receives the value that the user has typed.
         * @return
         *      Indicates the outcome of the validation. This is sent to the browser.
         *      <p>
         *      Note that returning {@link FormValidation#error(String)} does not
         *      prevent the form from being saved. It just means that a message
         *      will be displayed to the user.
         */
        public FormValidation doCheckName(@QueryParameter String value)     throws IOException, ServletException {
            if (value.length() == 0){
                return FormValidation.error("Please fill the value");
            }

            return FormValidation.ok();
        }

        @Override
        public boolean isApplicable(@SuppressWarnings("rawtypes") Class<? extends AbstractProject> aClass) {
            return true;
        }

        /**
         * This human readable name is used in the configuration screen.
         */
        public String getDisplayName() {
            return "Configuration of Jenkins-Nexus";
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            save();
            return super.configure(req,formData);
        }


        public String getVersion() {
			return version;
		}
    }
}