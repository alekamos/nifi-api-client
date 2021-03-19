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
 * BundleDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class BundleDTO {
  @SerializedName("group")
  private String group = null;

  @SerializedName("artifact")
  private String artifact = null;

  @SerializedName("version")
  private String version = null;

  public BundleDTO group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The group of the bundle.
   * @return group
  **/
  @ApiModelProperty(value = "The group of the bundle.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public BundleDTO artifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

   /**
   * The artifact of the bundle.
   * @return artifact
  **/
  @ApiModelProperty(value = "The artifact of the bundle.")
  public String getArtifact() {
    return artifact;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public BundleDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the bundle.
   * @return version
  **/
  @ApiModelProperty(value = "The version of the bundle.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleDTO bundleDTO = (BundleDTO) o;
    return Objects.equals(this.group, bundleDTO.group) &&
        Objects.equals(this.artifact, bundleDTO.artifact) &&
        Objects.equals(this.version, bundleDTO.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, artifact, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleDTO {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

