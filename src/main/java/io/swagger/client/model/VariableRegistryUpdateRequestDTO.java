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
import io.swagger.client.model.AffectedComponentEntity;
import io.swagger.client.model.VariableRegistryUpdateStepDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * VariableRegistryUpdateRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class VariableRegistryUpdateRequestDTO {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("submissionTime")
  private OffsetDateTime submissionTime = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("complete")
  private Boolean complete = null;

  @SerializedName("failureReason")
  private String failureReason = null;

  @SerializedName("percentCompleted")
  private Integer percentCompleted = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("updateSteps")
  private List<VariableRegistryUpdateStepDTO> updateSteps = null;

  @SerializedName("processGroupId")
  private String processGroupId = null;

  @SerializedName("affectedComponents")
  private List<AffectedComponentEntity> affectedComponents = null;

   /**
   * The ID of the request
   * @return requestId
  **/
  @ApiModelProperty(value = "The ID of the request")
  public String getRequestId() {
    return requestId;
  }

   /**
   * The URI for the request
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for the request")
  public String getUri() {
    return uri;
  }

   /**
   * The timestamp of when the request was submitted
   * @return submissionTime
  **/
  @ApiModelProperty(value = "The timestamp of when the request was submitted")
  public OffsetDateTime getSubmissionTime() {
    return submissionTime;
  }

   /**
   * The timestamp of when the request was last updated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "The timestamp of when the request was last updated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

   /**
   * Whether or not the request is completed
   * @return complete
  **/
  @ApiModelProperty(value = "Whether or not the request is completed")
  public Boolean isComplete() {
    return complete;
  }

   /**
   * The reason for the request failing, or null if the request has not failed
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the request failing, or null if the request has not failed")
  public String getFailureReason() {
    return failureReason;
  }

   /**
   * A value between 0 and 100 (inclusive) indicating how close the request is to completion
   * @return percentCompleted
  **/
  @ApiModelProperty(value = "A value between 0 and 100 (inclusive) indicating how close the request is to completion")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

   /**
   * A description of the current state of the request
   * @return state
  **/
  @ApiModelProperty(value = "A description of the current state of the request")
  public String getState() {
    return state;
  }

   /**
   * The steps that are required in order to complete the request, along with the status of each
   * @return updateSteps
  **/
  @ApiModelProperty(value = "The steps that are required in order to complete the request, along with the status of each")
  public List<VariableRegistryUpdateStepDTO> getUpdateSteps() {
    return updateSteps;
  }

  public VariableRegistryUpdateRequestDTO processGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
    return this;
  }

   /**
   * The unique ID of the Process Group that the variable registry belongs to
   * @return processGroupId
  **/
  @ApiModelProperty(value = "The unique ID of the Process Group that the variable registry belongs to")
  public String getProcessGroupId() {
    return processGroupId;
  }

  public void setProcessGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
  }

   /**
   * A set of all components that will be affected if the value of this variable is changed
   * @return affectedComponents
  **/
  @ApiModelProperty(value = "A set of all components that will be affected if the value of this variable is changed")
  public List<AffectedComponentEntity> getAffectedComponents() {
    return affectedComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableRegistryUpdateRequestDTO variableRegistryUpdateRequestDTO = (VariableRegistryUpdateRequestDTO) o;
    return Objects.equals(this.requestId, variableRegistryUpdateRequestDTO.requestId) &&
        Objects.equals(this.uri, variableRegistryUpdateRequestDTO.uri) &&
        Objects.equals(this.submissionTime, variableRegistryUpdateRequestDTO.submissionTime) &&
        Objects.equals(this.lastUpdated, variableRegistryUpdateRequestDTO.lastUpdated) &&
        Objects.equals(this.complete, variableRegistryUpdateRequestDTO.complete) &&
        Objects.equals(this.failureReason, variableRegistryUpdateRequestDTO.failureReason) &&
        Objects.equals(this.percentCompleted, variableRegistryUpdateRequestDTO.percentCompleted) &&
        Objects.equals(this.state, variableRegistryUpdateRequestDTO.state) &&
        Objects.equals(this.updateSteps, variableRegistryUpdateRequestDTO.updateSteps) &&
        Objects.equals(this.processGroupId, variableRegistryUpdateRequestDTO.processGroupId) &&
        Objects.equals(this.affectedComponents, variableRegistryUpdateRequestDTO.affectedComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, uri, submissionTime, lastUpdated, complete, failureReason, percentCompleted, state, updateSteps, processGroupId, affectedComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableRegistryUpdateRequestDTO {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updateSteps: ").append(toIndentedString(updateSteps)).append("\n");
    sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
    sb.append("    affectedComponents: ").append(toIndentedString(affectedComponents)).append("\n");
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

