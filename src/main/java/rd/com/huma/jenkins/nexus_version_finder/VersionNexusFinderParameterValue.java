package rd.com.huma.jenkins.nexus_version_finder;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.model.StringParameterValue;

public class VersionNexusFinderParameterValue extends StringParameterValue {

	/**
	 *
	 */
	private static final long serialVersionUID = 3604252275776087573L;

	@DataBoundConstructor
	public VersionNexusFinderParameterValue(String name, String value) {
		super(name, value);
	}

	public VersionNexusFinderParameterValue(String name, String value,	String description) {
		super(name, value, description);
	}
}