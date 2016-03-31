package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Shelf;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-03-31T01:56:49.084-04:00")
public class Stack   {
  
  private Integer id = null;
  private String name = null;
  private String authGroup = null;
  private List<Shelf> shelves = new ArrayList<Shelf>();

  
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
  @JsonProperty("authGroup")
  public String getAuthGroup() {
    return authGroup;
  }
  public void setAuthGroup(String authGroup) {
    this.authGroup = authGroup;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shelves")
  public List<Shelf> getShelves() {
    return shelves;
  }
  public void setShelves(List<Shelf> shelves) {
    this.shelves = shelves;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stack stack = (Stack) o;
    return Objects.equals(id, stack.id) &&
        Objects.equals(name, stack.name) &&
        Objects.equals(authGroup, stack.authGroup) &&
        Objects.equals(shelves, stack.shelves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, authGroup, shelves);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stack {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authGroup: ").append(toIndentedString(authGroup)).append("\n");
    sb.append("    shelves: ").append(toIndentedString(shelves)).append("\n");
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

