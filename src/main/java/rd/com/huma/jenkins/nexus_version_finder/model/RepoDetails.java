package rd.com.huma.jenkins.nexus_version_finder.model;

import java.util.HashMap;
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
"repositoryName",
"repositoryContentClass",
"repositoryKind",
"repositoryPolicy",
"repositoryURL"
})
public class RepoDetails {

@JsonProperty("repositoryId")
private String repositoryId;
@JsonProperty("repositoryName")
private String repositoryName;
@JsonProperty("repositoryContentClass")
private String repositoryContentClass;
@JsonProperty("repositoryKind")
private String repositoryKind;
@JsonProperty("repositoryPolicy")
private String repositoryPolicy;
@JsonProperty("repositoryURL")
private String repositoryURL;
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
* The repositoryName
*/
@JsonProperty("repositoryName")
public String getRepositoryName() {
return repositoryName;
}

/**
*
* @param repositoryName
* The repositoryName
*/
@JsonProperty("repositoryName")
public void setRepositoryName(String repositoryName) {
this.repositoryName = repositoryName;
}

/**
*
* @return
* The repositoryContentClass
*/
@JsonProperty("repositoryContentClass")
public String getRepositoryContentClass() {
return repositoryContentClass;
}

/**
*
* @param repositoryContentClass
* The repositoryContentClass
*/
@JsonProperty("repositoryContentClass")
public void setRepositoryContentClass(String repositoryContentClass) {
this.repositoryContentClass = repositoryContentClass;
}

/**
*
* @return
* The repositoryKind
*/
@JsonProperty("repositoryKind")
public String getRepositoryKind() {
return repositoryKind;
}

/**
*
* @param repositoryKind
* The repositoryKind
*/
@JsonProperty("repositoryKind")
public void setRepositoryKind(String repositoryKind) {
this.repositoryKind = repositoryKind;
}

/**
*
* @return
* The repositoryPolicy
*/
@JsonProperty("repositoryPolicy")
public String getRepositoryPolicy() {
return repositoryPolicy;
}

/**
*
* @param repositoryPolicy
* The repositoryPolicy
*/
@JsonProperty("repositoryPolicy")
public void setRepositoryPolicy(String repositoryPolicy) {
this.repositoryPolicy = repositoryPolicy;
}

/**
*
* @return
* The repositoryURL
*/
@JsonProperty("repositoryURL")
public String getRepositoryURL() {
return repositoryURL;
}

/**
*
* @param repositoryURL
* The repositoryURL
*/
@JsonProperty("repositoryURL")
public void setRepositoryURL(String repositoryURL) {
this.repositoryURL = repositoryURL;
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