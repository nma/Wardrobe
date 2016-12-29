package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-12-29T11:48:52.770-05:00")
public class Revision   {
  
  private Integer id = null;
  private Date dateAdded = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dateAdded")
  public Date getDateAdded() {
    return dateAdded;
  }
  public void setDateAdded(Date dateAdded) {
    this.dateAdded = dateAdded;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Revision revision = (Revision) o;
    return Objects.equals(id, revision.id) &&
        Objects.equals(dateAdded, revision.dateAdded);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

