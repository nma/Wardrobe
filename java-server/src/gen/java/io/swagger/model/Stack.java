package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Shelf;
import java.util.ArrayList;
import java.util.List;




/**
 * Stack
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-08T01:47:19.572-05:00")
public class Stack   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("authGroup")
  private String authGroup = null;

  @JsonProperty("shelves")
  private List<Shelf> shelves = new ArrayList<Shelf>();

  public Stack id(String id) {
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

  public Stack name(String name) {
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

  public Stack authGroup(String authGroup) {
    this.authGroup = authGroup;
    return this;
  }

   /**
   * Get authGroup
   * @return authGroup
  **/
  @ApiModelProperty(value = "")
  public String getAuthGroup() {
    return authGroup;
  }

  public void setAuthGroup(String authGroup) {
    this.authGroup = authGroup;
  }

  public Stack shelves(List<Shelf> shelves) {
    this.shelves = shelves;
    return this;
  }

  public Stack addShelvesItem(Shelf shelvesItem) {
    this.shelves.add(shelvesItem);
    return this;
  }

   /**
   * Get shelves
   * @return shelves
  **/
  @ApiModelProperty(value = "")
  public List<Shelf> getShelves() {
    return shelves;
  }

  public void setShelves(List<Shelf> shelves) {
    this.shelves = shelves;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stack stack = (Stack) o;
    return Objects.equals(this.id, stack.id) &&
        Objects.equals(this.name, stack.name) &&
        Objects.equals(this.authGroup, stack.authGroup) &&
        Objects.equals(this.shelves, stack.shelves);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

