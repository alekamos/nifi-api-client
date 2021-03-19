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
 * FlowFileSummaryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class FlowFileSummaryDTO {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("queuedDuration")
  private Long queuedDuration = null;

  @SerializedName("lineageDuration")
  private Long lineageDuration = null;

  @SerializedName("penaltyExpiresIn")
  private Long penaltyExpiresIn = null;

  @SerializedName("clusterNodeId")
  private String clusterNodeId = null;

  @SerializedName("clusterNodeAddress")
  private String clusterNodeAddress = null;

  @SerializedName("penalized")
  private Boolean penalized = null;

  public FlowFileSummaryDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI that can be used to access this FlowFile.
   * @return uri
  **/
  @ApiModelProperty(value = "The URI that can be used to access this FlowFile.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public FlowFileSummaryDTO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The FlowFile UUID.
   * @return uuid
  **/
  @ApiModelProperty(value = "The FlowFile UUID.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public FlowFileSummaryDTO filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The FlowFile filename.
   * @return filename
  **/
  @ApiModelProperty(value = "The FlowFile filename.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public FlowFileSummaryDTO position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The FlowFile&#39;s position in the queue.
   * @return position
  **/
  @ApiModelProperty(value = "The FlowFile's position in the queue.")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public FlowFileSummaryDTO size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The FlowFile file size.
   * @return size
  **/
  @ApiModelProperty(value = "The FlowFile file size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FlowFileSummaryDTO queuedDuration(Long queuedDuration) {
    this.queuedDuration = queuedDuration;
    return this;
  }

   /**
   * How long this FlowFile has been enqueued.
   * @return queuedDuration
  **/
  @ApiModelProperty(value = "How long this FlowFile has been enqueued.")
  public Long getQueuedDuration() {
    return queuedDuration;
  }

  public void setQueuedDuration(Long queuedDuration) {
    this.queuedDuration = queuedDuration;
  }

  public FlowFileSummaryDTO lineageDuration(Long lineageDuration) {
    this.lineageDuration = lineageDuration;
    return this;
  }

   /**
   * Duration since the FlowFile&#39;s greatest ancestor entered the flow.
   * @return lineageDuration
  **/
  @ApiModelProperty(value = "Duration since the FlowFile's greatest ancestor entered the flow.")
  public Long getLineageDuration() {
    return lineageDuration;
  }

  public void setLineageDuration(Long lineageDuration) {
    this.lineageDuration = lineageDuration;
  }

  public FlowFileSummaryDTO penaltyExpiresIn(Long penaltyExpiresIn) {
    this.penaltyExpiresIn = penaltyExpiresIn;
    return this;
  }

   /**
   * How long in milliseconds until the FlowFile penalty expires.
   * @return penaltyExpiresIn
  **/
  @ApiModelProperty(value = "How long in milliseconds until the FlowFile penalty expires.")
  public Long getPenaltyExpiresIn() {
    return penaltyExpiresIn;
  }

  public void setPenaltyExpiresIn(Long penaltyExpiresIn) {
    this.penaltyExpiresIn = penaltyExpiresIn;
  }

  public FlowFileSummaryDTO clusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
    return this;
  }

   /**
   * The id of the node where this FlowFile resides.
   * @return clusterNodeId
  **/
  @ApiModelProperty(value = "The id of the node where this FlowFile resides.")
  public String getClusterNodeId() {
    return clusterNodeId;
  }

  public void setClusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
  }

  public FlowFileSummaryDTO clusterNodeAddress(String clusterNodeAddress) {
    this.clusterNodeAddress = clusterNodeAddress;
    return this;
  }

   /**
   * The label for the node where this FlowFile resides.
   * @return clusterNodeAddress
  **/
  @ApiModelProperty(value = "The label for the node where this FlowFile resides.")
  public String getClusterNodeAddress() {
    return clusterNodeAddress;
  }

  public void setClusterNodeAddress(String clusterNodeAddress) {
    this.clusterNodeAddress = clusterNodeAddress;
  }

  public FlowFileSummaryDTO penalized(Boolean penalized) {
    this.penalized = penalized;
    return this;
  }

   /**
   * If the FlowFile is penalized.
   * @return penalized
  **/
  @ApiModelProperty(value = "If the FlowFile is penalized.")
  public Boolean isPenalized() {
    return penalized;
  }

  public void setPenalized(Boolean penalized) {
    this.penalized = penalized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowFileSummaryDTO flowFileSummaryDTO = (FlowFileSummaryDTO) o;
    return Objects.equals(this.uri, flowFileSummaryDTO.uri) &&
        Objects.equals(this.uuid, flowFileSummaryDTO.uuid) &&
        Objects.equals(this.filename, flowFileSummaryDTO.filename) &&
        Objects.equals(this.position, flowFileSummaryDTO.position) &&
        Objects.equals(this.size, flowFileSummaryDTO.size) &&
        Objects.equals(this.queuedDuration, flowFileSummaryDTO.queuedDuration) &&
        Objects.equals(this.lineageDuration, flowFileSummaryDTO.lineageDuration) &&
        Objects.equals(this.penaltyExpiresIn, flowFileSummaryDTO.penaltyExpiresIn) &&
        Objects.equals(this.clusterNodeId, flowFileSummaryDTO.clusterNodeId) &&
        Objects.equals(this.clusterNodeAddress, flowFileSummaryDTO.clusterNodeAddress) &&
        Objects.equals(this.penalized, flowFileSummaryDTO.penalized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, uuid, filename, position, size, queuedDuration, lineageDuration, penaltyExpiresIn, clusterNodeId, clusterNodeAddress, penalized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowFileSummaryDTO {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    queuedDuration: ").append(toIndentedString(queuedDuration)).append("\n");
    sb.append("    lineageDuration: ").append(toIndentedString(lineageDuration)).append("\n");
    sb.append("    penaltyExpiresIn: ").append(toIndentedString(penaltyExpiresIn)).append("\n");
    sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
    sb.append("    clusterNodeAddress: ").append(toIndentedString(clusterNodeAddress)).append("\n");
    sb.append("    penalized: ").append(toIndentedString(penalized)).append("\n");
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

