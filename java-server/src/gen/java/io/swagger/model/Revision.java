package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;




/**
 * Revision
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class Revision   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("dateAdded")
  private Date dateAdded = null;

  public Revision id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Revision dateAdded(Date dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @ApiModelProperty(value = "")
  public Date getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(Date dateAdded) {
    this.dateAdded = dateAdded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Revision revision = (Revision) o;
    return Objects.equals(this.id, revision.id) &&
        Objects.equals(this.dateAdded, revision.dateAdded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateAdded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Revision {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
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

