package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Promoter;
import io.swagger.model.Revision;
import java.util.ArrayList;
import java.util.List;




/**
 * Shelf
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class Shelf   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("promoters")
  private List<Promoter> promoters = new ArrayList<Promoter>();

  @JsonProperty("revisions")
  private List<Revision> revisions = new ArrayList<Revision>();

  @JsonProperty("latest")
  private Revision latest = null;

  public Shelf id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Shelf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Shelf url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Shelf promoters(List<Promoter> promoters) {
    this.promoters = promoters;
    return this;
  }

  public Shelf addPromotersItem(Promoter promotersItem) {
    this.promoters.add(promotersItem);
    return this;
  }

   /**
   * Get promoters
   * @return promoters
  **/
  @ApiModelProperty(value = "")
  public List<Promoter> getPromoters() {
    return promoters;
  }

  public void setPromoters(List<Promoter> promoters) {
    this.promoters = promoters;
  }

  public Shelf revisions(List<Revision> revisions) {
    this.revisions = revisions;
    return this;
  }

  public Shelf addRevisionsItem(Revision revisionsItem) {
    this.revisions.add(revisionsItem);
    return this;
  }

   /**
   * Get revisions
   * @return revisions
  **/
  @ApiModelProperty(value = "")
  public List<Revision> getRevisions() {
    return revisions;
  }

  public void setRevisions(List<Revision> revisions) {
    this.revisions = revisions;
  }

  public Shelf latest(Revision latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")
  public Revision getLatest() {
    return latest;
  }

  public void setLatest(Revision latest) {
    this.latest = latest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shelf shelf = (Shelf) o;
    return Objects.equals(this.id, shelf.id) &&
        Objects.equals(this.name, shelf.name) &&
        Objects.equals(this.url, shelf.url) &&
        Objects.equals(this.promoters, shelf.promoters) &&
        Objects.equals(this.revisions, shelf.revisions) &&
        Objects.equals(this.latest, shelf.latest);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

