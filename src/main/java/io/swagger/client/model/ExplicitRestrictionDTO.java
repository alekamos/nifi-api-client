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
import io.swagger.client.model.RequiredPermissionDTO;
import java.io.IOException;

/**
 * ExplicitRestrictionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class ExplicitRestrictionDTO {
  @SerializedName("requiredPermission")
  private RequiredPermissionDTO requiredPermission = null;

  @SerializedName("explanation")
  private String explanation = null;

  public ExplicitRestrictionDTO requiredPermission(RequiredPermissionDTO requiredPermission) {
    this.requiredPermission = requiredPermission;
    return this;
  }

   /**
   * The required permission necessary for this restriction.
   * @return requiredPermission
  **/
  @ApiModelProperty(value = "The required permission necessary for this restriction.")
  public RequiredPermissionDTO getRequiredPermission() {
    return requiredPermission;
  }

  public void setRequiredPermission(RequiredPermissionDTO requiredPermission) {
    this.requiredPermission = requiredPermission;
  }

  public ExplicitRestrictionDTO explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * The description of why the usage of this component is restricted for this required permission.
   * @return explanation
  **/
  @ApiModelProperty(value = "The description of why the usage of this component is restricted for this required permission.")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplicitRestrictionDTO explicitRestrictionDTO = (ExplicitRestrictionDTO) o;
    return Objects.equals(this.requiredPermission, explicitRestrictionDTO.requiredPermission) &&
        Objects.equals(this.explanation, explicitRestrictionDTO.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredPermission, explanation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplicitRestrictionDTO {\n");
    
    sb.append("    requiredPermission: ").append(toIndentedString(requiredPermission)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

