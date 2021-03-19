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
 * VersionedPropertyDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class VersionedPropertyDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("identifiesControllerService")
  private Boolean identifiesControllerService = null;

  @SerializedName("sensitive")
  private Boolean sensitive = null;

  public VersionedPropertyDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the property
   * @return name
  **/
  @ApiModelProperty(value = "The name of the property")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedPropertyDescriptor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the property
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the property")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public VersionedPropertyDescriptor identifiesControllerService(Boolean identifiesControllerService) {
    this.identifiesControllerService = identifiesControllerService;
    return this;
  }

   /**
   * Whether or not the property provides the identifier of a Controller Service
   * @return identifiesControllerService
  **/
  @ApiModelProperty(value = "Whether or not the property provides the identifier of a Controller Service")
  public Boolean isIdentifiesControllerService() {
    return identifiesControllerService;
  }

  public void setIdentifiesControllerService(Boolean identifiesControllerService) {
    this.identifiesControllerService = identifiesControllerService;
  }

  public VersionedPropertyDescriptor sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

   /**
   * Whether or not the property is considered sensitive
   * @return sensitive
  **/
  @ApiModelProperty(value = "Whether or not the property is considered sensitive")
  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedPropertyDescriptor versionedPropertyDescriptor = (VersionedPropertyDescriptor) o;
    return Objects.equals(this.name, versionedPropertyDescriptor.name) &&
        Objects.equals(this.displayName, versionedPropertyDescriptor.displayName) &&
        Objects.equals(this.identifiesControllerService, versionedPropertyDescriptor.identifiesControllerService) &&
        Objects.equals(this.sensitive, versionedPropertyDescriptor.sensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, identifiesControllerService, sensitive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedPropertyDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    identifiesControllerService: ").append(toIndentedString(identifiesControllerService)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
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

