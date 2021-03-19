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
 * ParameterContextValidationStepDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class ParameterContextValidationStepDTO {
  @SerializedName("description")
  private String description = null;

  @SerializedName("complete")
  private Boolean complete = null;

  @SerializedName("failureReason")
  private String failureReason = null;

   /**
   * Explanation of what happens in this step
   * @return description
  **/
  @ApiModelProperty(value = "Explanation of what happens in this step")
  public String getDescription() {
    return description;
  }

   /**
   * Whether or not this step has completed
   * @return complete
  **/
  @ApiModelProperty(value = "Whether or not this step has completed")
  public Boolean isComplete() {
    return complete;
  }

   /**
   * An explanation of why this step failed, or null if this step did not fail
   * @return failureReason
  **/
  @ApiModelProperty(value = "An explanation of why this step failed, or null if this step did not fail")
  public String getFailureReason() {
    return failureReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterContextValidationStepDTO parameterContextValidationStepDTO = (ParameterContextValidationStepDTO) o;
    return Objects.equals(this.description, parameterContextValidationStepDTO.description) &&
        Objects.equals(this.complete, parameterContextValidationStepDTO.complete) &&
        Objects.equals(this.failureReason, parameterContextValidationStepDTO.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, complete, failureReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterContextValidationStepDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

