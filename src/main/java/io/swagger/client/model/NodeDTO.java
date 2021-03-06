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
import io.swagger.client.model.NodeEventDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class NodeDTO {
  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("apiPort")
  private Integer apiPort = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("heartbeat")
  private String heartbeat = null;

  @SerializedName("connectionRequested")
  private String connectionRequested = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  @SerializedName("queued")
  private String queued = null;

  @SerializedName("events")
  private List<NodeEventDTO> events = null;

  @SerializedName("nodeStartTime")
  private String nodeStartTime = null;

   /**
   * The id of the node.
   * @return nodeId
  **/
  @ApiModelProperty(value = "The id of the node.")
  public String getNodeId() {
    return nodeId;
  }

   /**
   * The node&#39;s host/ip address.
   * @return address
  **/
  @ApiModelProperty(value = "The node's host/ip address.")
  public String getAddress() {
    return address;
  }

   /**
   * The port the node is listening for API requests.
   * @return apiPort
  **/
  @ApiModelProperty(value = "The port the node is listening for API requests.")
  public Integer getApiPort() {
    return apiPort;
  }

  public NodeDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The node&#39;s status.
   * @return status
  **/
  @ApiModelProperty(value = "The node's status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * the time of the nodes&#39;s last heartbeat.
   * @return heartbeat
  **/
  @ApiModelProperty(value = "the time of the nodes's last heartbeat.")
  public String getHeartbeat() {
    return heartbeat;
  }

   /**
   * The time of the node&#39;s last connection request.
   * @return connectionRequested
  **/
  @ApiModelProperty(value = "The time of the node's last connection request.")
  public String getConnectionRequested() {
    return connectionRequested;
  }

   /**
   * The roles of this node.
   * @return roles
  **/
  @ApiModelProperty(value = "The roles of this node.")
  public List<String> getRoles() {
    return roles;
  }

   /**
   * The active threads for the NiFi on the node.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The active threads for the NiFi on the node.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

   /**
   * The queue the NiFi on the node.
   * @return queued
  **/
  @ApiModelProperty(value = "The queue the NiFi on the node.")
  public String getQueued() {
    return queued;
  }

   /**
   * The node&#39;s events.
   * @return events
  **/
  @ApiModelProperty(value = "The node's events.")
  public List<NodeEventDTO> getEvents() {
    return events;
  }

   /**
   * The time at which this Node was last refreshed.
   * @return nodeStartTime
  **/
  @ApiModelProperty(value = "The time at which this Node was last refreshed.")
  public String getNodeStartTime() {
    return nodeStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDTO nodeDTO = (NodeDTO) o;
    return Objects.equals(this.nodeId, nodeDTO.nodeId) &&
        Objects.equals(this.address, nodeDTO.address) &&
        Objects.equals(this.apiPort, nodeDTO.apiPort) &&
        Objects.equals(this.status, nodeDTO.status) &&
        Objects.equals(this.heartbeat, nodeDTO.heartbeat) &&
        Objects.equals(this.connectionRequested, nodeDTO.connectionRequested) &&
        Objects.equals(this.roles, nodeDTO.roles) &&
        Objects.equals(this.activeThreadCount, nodeDTO.activeThreadCount) &&
        Objects.equals(this.queued, nodeDTO.queued) &&
        Objects.equals(this.events, nodeDTO.events) &&
        Objects.equals(this.nodeStartTime, nodeDTO.nodeStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, status, heartbeat, connectionRequested, roles, activeThreadCount, queued, events, nodeStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDTO {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    heartbeat: ").append(toIndentedString(heartbeat)).append("\n");
    sb.append("    connectionRequested: ").append(toIndentedString(connectionRequested)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    nodeStartTime: ").append(toIndentedString(nodeStartTime)).append("\n");
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

