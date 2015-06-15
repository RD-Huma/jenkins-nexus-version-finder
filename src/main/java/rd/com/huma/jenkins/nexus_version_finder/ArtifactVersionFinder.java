package rd.com.huma.jenkins.nexus_version_finder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import rd.com.huma.jenkins.nexus_version_finder.model.Data;
import rd.com.huma.jenkins.nexus_version_finder.model.Nexus;

public class ArtifactVersionFinder {

	private final String server;
	private final int port;
	private final String groupId;
	private final String artifact;
	private final String repositoryId;


	public ArtifactVersionFinder(String server, int port, String groupId, String artifact,	String repositoryId) {
		this.server = server;
		this.port = port;
		this.groupId = groupId;
		this.artifact = artifact;
		this.repositoryId = repositoryId;
	}


	public List<String> getVersions(){
		try {

			Client client = ClientBuilder.newClient();


			WebTarget webResource = client.target(new StringBuilder(350).append("http://").append(server).append(":").append(port).append("/nexus/service/local/lucene/search?g=").append(groupId).append("&a=").append(artifact).append("&repositoryId=").append(repositoryId).toString());

			Response response = webResource.request("application/json").get(Response.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "	+ response.getStatus());
			}

			Nexus output = response.readEntity(Nexus.class);

			List<String> versiones = new ArrayList<String>();
			for (Data data : output.getData() ) {
				versiones.add(data.getVersion());
			}
			return versiones;

		  } catch (Exception e) {
			e.printStackTrace();
		  }
		return Collections.emptyList();
	}

}