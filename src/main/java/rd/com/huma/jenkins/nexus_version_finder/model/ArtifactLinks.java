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
"extension",
"classifier"
})
public class ArtifactLinks {

@JsonProperty("extension")
private String extension;
@JsonProperty("classifier")
private String classifier;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The extension
*/
@JsonProperty("extension")
public String getExtension() {
return extension;
}

/**
*
* @param extension
* The extension
*/
@JsonProperty("extension")
public void setExtension(String extension) {
this.extension = extension;
}

/**
*
* @return
* The classifier
*/
@JsonProperty("classifier")
public String getClassifier() {
return classifier;
}

/**
*
* @param classifier
* The classifier
*/
@JsonProperty("classifier")
public void setClassifier(String classifier) {
this.classifier = classifier;
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