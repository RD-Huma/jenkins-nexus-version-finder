package rd.com.huma.jenkins.nexus_version_finder;

import org.junit.Assert;
import org.junit.Test;

import rd.com.huma.jenkins.nexus_version_finder.ArtifactVersionFinder;

public class ArtifactVersionFinderTest {

	@Test
	public void probar(){
		Assert.assertEquals(

		new ArtifactVersionFinder("172.16.7.40", 8080, "dr.gov.sigef", "sigef_actual", "releases").getVersions().isEmpty()
		,
		false);
		;
	}

}