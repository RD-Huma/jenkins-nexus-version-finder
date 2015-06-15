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
"totalCount",
"from",
"count",
"tooManyResults",
"collapsed",
"repoDetails",
"data"
})
public class Nexus {

@JsonProperty("totalCount")
private Integer totalCount;
@JsonProperty("from")
private Integer from;
@JsonProperty("count")
private Integer count;
@JsonProperty("tooManyResults")
private Boolean tooManyResults;
@JsonProperty("collapsed")
private Boolean collapsed;
@JsonProperty("repoDetails")
private List<RepoDetails> repoDetails = new ArrayList<RepoDetails>();
@JsonProperty("data")
private List<Data> data = new ArrayList<Data>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
*
* @return
* The totalCount
*/
@JsonProperty("totalCount")
public Integer getTotalCount() {
return totalCount;
}

/**
*
* @param totalCount
* The totalCount
*/
@JsonProperty("totalCount")
public void setTotalCount(Integer totalCount) {
this.totalCount = totalCount;
}

/**
*
* @return
* The from
*/
@JsonProperty("from")
public Integer getFrom() {
return from;
}

/**
*
* @param from
* The from
*/
@JsonProperty("from")
public void setFrom(Integer from) {
this.from = from;
}

/**
*
* @return
* The count
*/
@JsonProperty("count")
public Integer getCount() {
return count;
}

/**
*
* @param count
* The count
*/
@JsonProperty("count")
public void setCount(Integer count) {
this.count = count;
}

/**
*
* @return
* The tooManyResults
*/
@JsonProperty("tooManyResults")
public Boolean getTooManyResults() {
return tooManyResults;
}

/**
*
* @param tooManyResults
* The tooManyResults
*/
@JsonProperty("tooManyResults")
public void setTooManyResults(Boolean tooManyResults) {
this.tooManyResults = tooManyResults;
}

/**
*
* @return
* The collapsed
*/
@JsonProperty("collapsed")
public Boolean getCollapsed() {
return collapsed;
}

/**
*
* @param collapsed
* The collapsed
*/
@JsonProperty("collapsed")
public void setCollapsed(Boolean collapsed) {
this.collapsed = collapsed;
}

/**
*
* @return
* The repoDetails
*/
@JsonProperty("repoDetails")
public List<RepoDetails> getRepoDetails() {
return repoDetails;
}

/**
*
* @param repoDetails
* The repoDetails
*/
@JsonProperty("repoDetails")
public void setRepoDetails(List<RepoDetails> repoDetails) {
this.repoDetails = repoDetails;
}

/**
*
* @return
* The data
*/
@JsonProperty("data")
public List<Data> getData() {
return data;
}

/**
*
* @param data
* The data
*/
@JsonProperty("data")
public void setData(List<Data> data) {
this.data = data;
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