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
import io.swagger.client.model.FlowSnippetDTO;
import java.io.IOException;

/**
 * TemplateDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class TemplateDTO {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("encodingVersion")
  private String encodingVersion = null;

  @SerializedName("snippet")
  private FlowSnippetDTO snippet = null;

  public TemplateDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for the template.
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for the template.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public TemplateDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the template.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the template.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TemplateDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the Process Group that the template belongs to.
   * @return groupId
  **/
  @ApiModelProperty(value = "The id of the Process Group that the template belongs to.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public TemplateDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the template.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemplateDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the template.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the template.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TemplateDTO timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp when this template was created.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The timestamp when this template was created.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public TemplateDTO encodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
    return this;
  }

   /**
   * The encoding version of this template.
   * @return encodingVersion
  **/
  @ApiModelProperty(value = "The encoding version of this template.")
  public String getEncodingVersion() {
    return encodingVersion;
  }

  public void setEncodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
  }

  public TemplateDTO snippet(FlowSnippetDTO snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * The contents of the template.
   * @return snippet
  **/
  @ApiModelProperty(value = "The contents of the template.")
  public FlowSnippetDTO getSnippet() {
    return snippet;
  }

  public void setSnippet(FlowSnippetDTO snippet) {
    this.snippet = snippet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDTO templateDTO = (TemplateDTO) o;
    return Objects.equals(this.uri, templateDTO.uri) &&
        Objects.equals(this.id, templateDTO.id) &&
        Objects.equals(this.groupId, templateDTO.groupId) &&
        Objects.equals(this.name, templateDTO.name) &&
        Objects.equals(this.description, templateDTO.description) &&
        Objects.equals(this.timestamp, templateDTO.timestamp) &&
        Objects.equals(this.encodingVersion, templateDTO.encodingVersion) &&
        Objects.equals(this.snippet, templateDTO.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, id, groupId, name, description, timestamp, encodingVersion, snippet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDTO {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    encodingVersion: ").append(toIndentedString(encodingVersion)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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

