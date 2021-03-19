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
import io.swagger.client.model.RevisionDTO;
import io.swagger.client.model.VersionControlInformationDTO;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VersionControlComponentMappingEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class VersionControlComponentMappingEntity {
  @SerializedName("versionControlComponentMapping")
  private Map<String, String> versionControlComponentMapping = null;

  @SerializedName("processGroupRevision")
  private RevisionDTO processGroupRevision = null;

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  @SerializedName("versionControlInformation")
  private VersionControlInformationDTO versionControlInformation = null;

  public VersionControlComponentMappingEntity versionControlComponentMapping(Map<String, String> versionControlComponentMapping) {
    this.versionControlComponentMapping = versionControlComponentMapping;
    return this;
  }

  public VersionControlComponentMappingEntity putVersionControlComponentMappingItem(String key, String versionControlComponentMappingItem) {
    if (this.versionControlComponentMapping == null) {
      this.versionControlComponentMapping = new HashMap<String, String>();
    }
    this.versionControlComponentMapping.put(key, versionControlComponentMappingItem);
    return this;
  }

   /**
   * The mapping of Versioned Component Identifiers to instance ID&#39;s
   * @return versionControlComponentMapping
  **/
  @ApiModelProperty(value = "The mapping of Versioned Component Identifiers to instance ID's")
  public Map<String, String> getVersionControlComponentMapping() {
    return versionControlComponentMapping;
  }

  public void setVersionControlComponentMapping(Map<String, String> versionControlComponentMapping) {
    this.versionControlComponentMapping = versionControlComponentMapping;
  }

  public VersionControlComponentMappingEntity processGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * The revision of the Process Group
   * @return processGroupRevision
  **/
  @ApiModelProperty(value = "The revision of the Process Group")
  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }

  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }

  public VersionControlComponentMappingEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean isDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }

  public VersionControlComponentMappingEntity versionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
    return this;
  }

   /**
   * The Version Control information
   * @return versionControlInformation
  **/
  @ApiModelProperty(value = "The Version Control information")
  public VersionControlInformationDTO getVersionControlInformation() {
    return versionControlInformation;
  }

  public void setVersionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionControlComponentMappingEntity versionControlComponentMappingEntity = (VersionControlComponentMappingEntity) o;
    return Objects.equals(this.versionControlComponentMapping, versionControlComponentMappingEntity.versionControlComponentMapping) &&
        Objects.equals(this.processGroupRevision, versionControlComponentMappingEntity.processGroupRevision) &&
        Objects.equals(this.disconnectedNodeAcknowledged, versionControlComponentMappingEntity.disconnectedNodeAcknowledged) &&
        Objects.equals(this.versionControlInformation, versionControlComponentMappingEntity.versionControlInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionControlComponentMapping, processGroupRevision, disconnectedNodeAcknowledged, versionControlInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlComponentMappingEntity {\n");
    
    sb.append("    versionControlComponentMapping: ").append(toIndentedString(versionControlComponentMapping)).append("\n");
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
    sb.append("    versionControlInformation: ").append(toIndentedString(versionControlInformation)).append("\n");
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

