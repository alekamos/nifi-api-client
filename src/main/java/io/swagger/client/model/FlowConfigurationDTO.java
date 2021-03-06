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
 * FlowConfigurationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class FlowConfigurationDTO {
  @SerializedName("supportsManagedAuthorizer")
  private Boolean supportsManagedAuthorizer = null;

  @SerializedName("supportsConfigurableAuthorizer")
  private Boolean supportsConfigurableAuthorizer = null;

  @SerializedName("supportsConfigurableUsersAndGroups")
  private Boolean supportsConfigurableUsersAndGroups = null;

  @SerializedName("autoRefreshIntervalSeconds")
  private Long autoRefreshIntervalSeconds = null;

  @SerializedName("currentTime")
  private String currentTime = null;

  @SerializedName("timeOffset")
  private Integer timeOffset = null;

  @SerializedName("defaultBackPressureObjectThreshold")
  private Long defaultBackPressureObjectThreshold = null;

  @SerializedName("defaultBackPressureDataSizeThreshold")
  private String defaultBackPressureDataSizeThreshold = null;

   /**
   * Whether this NiFi supports a managed authorizer. Managed authorizers can visualize users, groups, and policies in the UI.
   * @return supportsManagedAuthorizer
  **/
  @ApiModelProperty(value = "Whether this NiFi supports a managed authorizer. Managed authorizers can visualize users, groups, and policies in the UI.")
  public Boolean isSupportsManagedAuthorizer() {
    return supportsManagedAuthorizer;
  }

   /**
   * Whether this NiFi supports a configurable authorizer.
   * @return supportsConfigurableAuthorizer
  **/
  @ApiModelProperty(value = "Whether this NiFi supports a configurable authorizer.")
  public Boolean isSupportsConfigurableAuthorizer() {
    return supportsConfigurableAuthorizer;
  }

   /**
   * Whether this NiFi supports configurable users and groups.
   * @return supportsConfigurableUsersAndGroups
  **/
  @ApiModelProperty(value = "Whether this NiFi supports configurable users and groups.")
  public Boolean isSupportsConfigurableUsersAndGroups() {
    return supportsConfigurableUsersAndGroups;
  }

   /**
   * The interval in seconds between the automatic NiFi refresh requests.
   * @return autoRefreshIntervalSeconds
  **/
  @ApiModelProperty(value = "The interval in seconds between the automatic NiFi refresh requests.")
  public Long getAutoRefreshIntervalSeconds() {
    return autoRefreshIntervalSeconds;
  }

  public FlowConfigurationDTO currentTime(String currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * The current time on the system.
   * @return currentTime
  **/
  @ApiModelProperty(value = "The current time on the system.")
  public String getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(String currentTime) {
    this.currentTime = currentTime;
  }

  public FlowConfigurationDTO timeOffset(Integer timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

   /**
   * The time offset of the system.
   * @return timeOffset
  **/
  @ApiModelProperty(value = "The time offset of the system.")
  public Integer getTimeOffset() {
    return timeOffset;
  }

  public void setTimeOffset(Integer timeOffset) {
    this.timeOffset = timeOffset;
  }

  public FlowConfigurationDTO defaultBackPressureObjectThreshold(Long defaultBackPressureObjectThreshold) {
    this.defaultBackPressureObjectThreshold = defaultBackPressureObjectThreshold;
    return this;
  }

   /**
   * The default back pressure object threshold.
   * @return defaultBackPressureObjectThreshold
  **/
  @ApiModelProperty(value = "The default back pressure object threshold.")
  public Long getDefaultBackPressureObjectThreshold() {
    return defaultBackPressureObjectThreshold;
  }

  public void setDefaultBackPressureObjectThreshold(Long defaultBackPressureObjectThreshold) {
    this.defaultBackPressureObjectThreshold = defaultBackPressureObjectThreshold;
  }

  public FlowConfigurationDTO defaultBackPressureDataSizeThreshold(String defaultBackPressureDataSizeThreshold) {
    this.defaultBackPressureDataSizeThreshold = defaultBackPressureDataSizeThreshold;
    return this;
  }

   /**
   * The default back pressure data size threshold.
   * @return defaultBackPressureDataSizeThreshold
  **/
  @ApiModelProperty(value = "The default back pressure data size threshold.")
  public String getDefaultBackPressureDataSizeThreshold() {
    return defaultBackPressureDataSizeThreshold;
  }

  public void setDefaultBackPressureDataSizeThreshold(String defaultBackPressureDataSizeThreshold) {
    this.defaultBackPressureDataSizeThreshold = defaultBackPressureDataSizeThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowConfigurationDTO flowConfigurationDTO = (FlowConfigurationDTO) o;
    return Objects.equals(this.supportsManagedAuthorizer, flowConfigurationDTO.supportsManagedAuthorizer) &&
        Objects.equals(this.supportsConfigurableAuthorizer, flowConfigurationDTO.supportsConfigurableAuthorizer) &&
        Objects.equals(this.supportsConfigurableUsersAndGroups, flowConfigurationDTO.supportsConfigurableUsersAndGroups) &&
        Objects.equals(this.autoRefreshIntervalSeconds, flowConfigurationDTO.autoRefreshIntervalSeconds) &&
        Objects.equals(this.currentTime, flowConfigurationDTO.currentTime) &&
        Objects.equals(this.timeOffset, flowConfigurationDTO.timeOffset) &&
        Objects.equals(this.defaultBackPressureObjectThreshold, flowConfigurationDTO.defaultBackPressureObjectThreshold) &&
        Objects.equals(this.defaultBackPressureDataSizeThreshold, flowConfigurationDTO.defaultBackPressureDataSizeThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportsManagedAuthorizer, supportsConfigurableAuthorizer, supportsConfigurableUsersAndGroups, autoRefreshIntervalSeconds, currentTime, timeOffset, defaultBackPressureObjectThreshold, defaultBackPressureDataSizeThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowConfigurationDTO {\n");
    
    sb.append("    supportsManagedAuthorizer: ").append(toIndentedString(supportsManagedAuthorizer)).append("\n");
    sb.append("    supportsConfigurableAuthorizer: ").append(toIndentedString(supportsConfigurableAuthorizer)).append("\n");
    sb.append("    supportsConfigurableUsersAndGroups: ").append(toIndentedString(supportsConfigurableUsersAndGroups)).append("\n");
    sb.append("    autoRefreshIntervalSeconds: ").append(toIndentedString(autoRefreshIntervalSeconds)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
    sb.append("    defaultBackPressureObjectThreshold: ").append(toIndentedString(defaultBackPressureObjectThreshold)).append("\n");
    sb.append("    defaultBackPressureDataSizeThreshold: ").append(toIndentedString(defaultBackPressureDataSizeThreshold)).append("\n");
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

