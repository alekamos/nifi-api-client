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
import io.swagger.client.model.ProcessorStatusDTO;
import java.io.IOException;

/**
 * ProcessorStatusEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class ProcessorStatusEntity {
  @SerializedName("processorStatus")
  private ProcessorStatusDTO processorStatus = null;

  @SerializedName("canRead")
  private Boolean canRead = null;

  public ProcessorStatusEntity processorStatus(ProcessorStatusDTO processorStatus) {
    this.processorStatus = processorStatus;
    return this;
  }

   /**
   * Get processorStatus
   * @return processorStatus
  **/
  @ApiModelProperty(value = "")
  public ProcessorStatusDTO getProcessorStatus() {
    return processorStatus;
  }

  public void setProcessorStatus(ProcessorStatusDTO processorStatus) {
    this.processorStatus = processorStatus;
  }

   /**
   * Indicates whether the user can read a given resource.
   * @return canRead
  **/
  @ApiModelProperty(value = "Indicates whether the user can read a given resource.")
  public Boolean isCanRead() {
    return canRead;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorStatusEntity processorStatusEntity = (ProcessorStatusEntity) o;
    return Objects.equals(this.processorStatus, processorStatusEntity.processorStatus) &&
        Objects.equals(this.canRead, processorStatusEntity.canRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorStatus, canRead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorStatusEntity {\n");
    
    sb.append("    processorStatus: ").append(toIndentedString(processorStatus)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
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

