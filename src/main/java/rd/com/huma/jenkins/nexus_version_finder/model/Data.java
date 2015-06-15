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
"groupId",
"artifactId",
"version",
"latestRelease",
"latestReleaseRepositoryId",
"artifactHits"
})
public class Data {

@JsonProperty("groupId")
private String groupId;
@JsonProperty("artifactId")
private String artifactId;
@JsonProperty("version")
private String version;
@JsonProperty("latestRelease")
private String latestRelease;
@JsonProperty("latestReleaseRepositoryId")
private String latestReleaseRepositoryId;
@JsonProperty("artifactHits")
private List<ArtifactHits> artifactHits = new ArrayList<ArtifactHits>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The groupId
*/
@JsonProperty("groupId")
public String getGroupId() {
return groupId;
}

/**
*
* @param groupId
* The groupId
*/
@JsonProperty("groupId")
public void setGroupId(String groupId) {
this.groupId = groupId;
}

/**
*
* @return
* The artifactId
*/
@JsonProperty("artifactId")
public String getArtifactId() {
return artifactId;
}

/**
*
* @param artifactId
* The artifactId
*/
@JsonProperty("artifactId")
public void setArtifactId(String artifactId) {
this.artifactId = artifactId;
}

/**
*
* @return
* The version
*/
@JsonProperty("version")
public String getVersion() {
return version;
}

/**
*
* @param version
* The version
*/
@JsonProperty("version")
public void setVersion(String version) {
this.version = version;
}

/**
*
* @return
* The latestRelease
*/
@JsonProperty("latestRelease")
public String getLatestRelease() {
return latestRelease;
}

/**
*
* @param latestRelease
* The latestRelease
*/
@JsonProperty("latestRelease")
public void setLatestRelease(String latestRelease) {
this.latestRelease = latestRelease;
}

/**
*
* @return
* The latestReleaseRepositoryId
*/
@JsonProperty("latestReleaseRepositoryId")
public String getLatestReleaseRepositoryId() {
return latestReleaseRepositoryId;
}

/**
*
* @param latestReleaseRepositoryId
* The latestReleaseRepositoryId
*/
@JsonProperty("latestReleaseRepositoryId")
public void setLatestReleaseRepositoryId(String latestReleaseRepositoryId) {
this.latestReleaseRepositoryId = latestReleaseRepositoryId;
}

/**
*
* @return
* The artifactHits
*/
@JsonProperty("artifactHits")
public List<ArtifactHits> getArtifactHits() {
return artifactHits;
}

/**
*
* @param artifactHits
* The artifactHits
*/
@JsonProperty("artifactHits")
public void setArtifactHits(List<ArtifactHits> artifactHits) {
this.artifactHits = artifactHits;
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