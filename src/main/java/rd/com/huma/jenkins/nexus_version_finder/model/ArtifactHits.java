package rd.com.huma.jenkins.nexus_version_finder.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"repositoryId",
"artifactLinks"
})
public class ArtifactHits {

@JsonProperty("repositoryId")
private String repositoryId;
@JsonProperty("artifactLinks")
private List<ArtifactLinks> artifactLinks = new ArrayList<ArtifactLinks>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The repositoryId
*/
@JsonProperty("repositoryId")
public String getRepositoryId() {
return repositoryId;
}

/**
*
* @param repositoryId
* The repositoryId
*/
@JsonProperty("repositoryId")
public void setRepositoryId(String repositoryId) {
this.repositoryId = repositoryId;
}

/**
*
* @return
* The artifactLinks
*/
@JsonProperty("artifactLinks")
public List<ArtifactLinks> getArtifactLinks() {
return artifactLinks;
}

/**
*
* @param artifactLinks
* The artifactLinks
*/
@JsonProperty("artifactLinks")
public void setArtifactLinks(List<ArtifactLinks> artifactLinks) {
this.artifactLinks = artifactLinks;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}