package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Promoter;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class Drawer   {
  
  private Integer id = null;
  private Date dateAdded = null;
  private Promoter promoter = null;

  
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("promoter")
  public Promoter getPromoter() {
    return promoter;
  }
  public void setPromoter(Promoter promoter) {
    this.promoter = promoter;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drawer drawer = (Drawer) o;
    return Objects.equals(id, drawer.id) &&
        Objects.equals(dateAdded, drawer.dateAdded) &&
        Objects.equals(promoter, drawer.promoter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateAdded, promoter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drawer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    promoter: ").append(toIndentedString(promoter)).append("\n");
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

