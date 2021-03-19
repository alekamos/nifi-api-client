/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.13.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ParameterContextReferenceDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class ParameterContextReferenceDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public ParameterContextReferenceDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the Parameter Context
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the Parameter Context")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ParameterContextReferenceDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Parameter Context
   * @return name
  **/
  @ApiModelProperty(value = "The name of the Parameter Context")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterContextReferenceDTO parameterContextReferenceDTO = (ParameterContextReferenceDTO) o;
    return Objects.equals(this.id, parameterContextReferenceDTO.id) &&
        Objects.equals(this.name, parameterContextReferenceDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterContextReferenceDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

