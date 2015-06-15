package rd.com.huma.jenkins.nexus_version_finder;

import hudson.Extension;
import hudson.model.ParameterValue;
import hudson.model.SimpleParameterDefinition;
import hudson.model.StringParameterValue;

import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;

public class VersionNexusFinderParameterDefinition extends SimpleParameterDefinition {


	/**
	 *
	 */
	private static final long serialVersionUID = 683320664028375513L;


	private String defaultVersion;
	private String groupId;
	private String repositoryId;
	private String artifactId;
	private String port;
	private String server;

	@DataBoundConstructor
	public VersionNexusFinderParameterDefinition(String name, String description, String groupId, String repositoryId, String artifactId, String server, String port, String defaultVersion) {
		super(name, description);
		this.groupId = groupId;
		this.artifactId = artifactId;
		this.server = server;
		this.port = port;
		this.repositoryId = repositoryId;
		this.defaultVersion = defaultVersion;

	}

	@Override
	public ParameterValue createValue(String value) {
		return new VersionNexusFinderParameterValue(this.getName(), value, this.getDescription());
	}

	@Override
	public ParameterValue createValue(StaplerRequest req, JSONObject jo) {
	    final JSONObject parameterJsonModel = new JSONObject(false);

	    final Object value = jo.get("value");
	    final String valueAsText;
	    if (JSONUtils.isArray(value)){
	      valueAsText = ((JSONArray)value).join(",", true);
	    } else{
	      valueAsText = String.valueOf(value);
	    }
	    parameterJsonModel.put("name",  jo.get("name"));
	    parameterJsonModel.put("value", valueAsText);

	    StringParameterValue parameterValue = req.bindJSON(StringParameterValue.class, parameterJsonModel);
	    parameterValue.setDescription(getDescription());
	    return parameterValue;
	}




	public final List<String> getChoices(){
		if (server == null || server.length()==0){
			return defecto();
		}
		List<String> versiones = new ArtifactVersionFinder(server, Integer.valueOf(port), groupId, artifactId, repositoryId).getVersions();
		if (versiones.isEmpty()){
			return defecto();
		}
		return versiones;
	}

	private List<String> defecto(){
		if (defaultVersion == null){
			defaultVersion = "version not defined";
		}

		return Arrays.asList(new String[]{defaultVersion});

	}



	public String getDefaultVersion() {
		return defaultVersion;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getRepositoryId() {
		return repositoryId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public String getPort() {
		return port;
	}

	public String getServer() {
		return server;
	}


	public void setDefaultVersion(String defaultVersion) {
		this.defaultVersion = defaultVersion;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setServer(String server) {
		this.server = server;
	}





	@Extension()
	 public static final class DescriptorImpl extends ParameterDescriptor{

		@Override
		public String getDisplayName() {
			return "Version Nexus Finder";
		}
	}
}