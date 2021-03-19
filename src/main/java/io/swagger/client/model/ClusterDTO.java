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
import io.swagger.client.model.NodeDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class ClusterDTO {
  @SerializedName("nodes")
  private List<NodeDTO> nodes = null;

  @SerializedName("generated")
  private String generated = null;

  public ClusterDTO nodes(List<NodeDTO> nodes) {
    this.nodes = nodes;
    return this;
  }

  public ClusterDTO addNodesItem(NodeDTO nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeDTO>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * The collection of nodes that are part of the cluster.
   * @return nodes
  **/
  @ApiModelProperty(value = "The collection of nodes that are part of the cluster.")
  public List<NodeDTO> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeDTO> nodes) {
    this.nodes = nodes;
  }

  public ClusterDTO generated(String generated) {
    this.generated = generated;
    return this;
  }

   /**
   * The timestamp the report was generated.
   * @return generated
  **/
  @ApiModelProperty(value = "The timestamp the report was generated.")
  public String getGenerated() {
    return generated;
  }

  public void setGenerated(String generated) {
    this.generated = generated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterDTO clusterDTO = (ClusterDTO) o;
    return Objects.equals(this.nodes, clusterDTO.nodes) &&
        Objects.equals(this.generated, clusterDTO.generated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, generated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterDTO {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
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

