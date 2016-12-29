package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Promoter;
import io.swagger.model.Revision;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-12-29T11:48:52.770-05:00")
public class Shelf   {
  
  private Long id = null;
  private String name = null;
  private String url = null;
  private List<Promoter> promoters = new ArrayList<Promoter>();
  private List<Revision> revisions = new ArrayList<Revision>();
  private Revision latest = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("promoters")
  public List<Promoter> getPromoters() {
    return promoters;
  }
  public void setPromoters(List<Promoter> promoters) {
    this.promoters = promoters;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("revisions")
  public List<Revision> getRevisions() {
    return revisions;
  }
  public void setRevisions(List<Revision> revisions) {
    this.revisions = revisions;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latest")
  public Revision getLatest() {
    return latest;
  }
  public void setLatest(Revision latest) {
    this.latest = latest;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shelf shelf = (Shelf) o;
    return Objects.equals(id, shelf.id) &&
        Objects.equals(name, shelf.name) &&
        Objects.equals(url, shelf.url) &&
        Objects.equals(promoters, shelf.promoters) &&
        Objects.equals(revisions, shelf.revisions) &&
        Objects.equals(latest, shelf.latest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, promoters, revisions, latest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shelf {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    promoters: ").append(toIndentedString(promoters)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

