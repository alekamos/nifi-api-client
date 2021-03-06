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
import io.swagger.client.model.Bundle;
import io.swagger.client.model.Position;
import io.swagger.client.model.VersionedPropertyDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VersionedProcessor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class VersionedProcessor {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private Position position = null;

  @SerializedName("bundle")
  private Bundle bundle = null;

  @SerializedName("style")
  private Map<String, String> style = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("propertyDescriptors")
  private Map<String, VersionedPropertyDescriptor> propertyDescriptors = null;

  @SerializedName("annotationData")
  private String annotationData = null;

  @SerializedName("schedulingPeriod")
  private String schedulingPeriod = null;

  @SerializedName("schedulingStrategy")
  private String schedulingStrategy = null;

  @SerializedName("executionNode")
  private String executionNode = null;

  @SerializedName("penaltyDuration")
  private String penaltyDuration = null;

  @SerializedName("yieldDuration")
  private String yieldDuration = null;

  @SerializedName("bulletinLevel")
  private String bulletinLevel = null;

  @SerializedName("runDurationMillis")
  private Long runDurationMillis = null;

  @SerializedName("concurrentlySchedulableTaskCount")
  private Integer concurrentlySchedulableTaskCount = null;

  @SerializedName("autoTerminatedRelationships")
  private List<String> autoTerminatedRelationships = null;

  /**
   * The scheduled state of the component
   */
  @JsonAdapter(ScheduledStateEnum.Adapter.class)
  public enum ScheduledStateEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    ScheduledStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScheduledStateEnum fromValue(String text) {
      for (ScheduledStateEnum b : ScheduledStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScheduledStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduledStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScheduledStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScheduledStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scheduledState")
  private ScheduledStateEnum scheduledState = null;

  /**
   * Gets or Sets componentType
   */
  @JsonAdapter(ComponentTypeEnum.Adapter.class)
  public enum ComponentTypeEnum {
    CONNECTION("CONNECTION"),
    
    PROCESSOR("PROCESSOR"),
    
    PROCESS_GROUP("PROCESS_GROUP"),
    
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    
    INPUT_PORT("INPUT_PORT"),
    
    OUTPUT_PORT("OUTPUT_PORT"),
    
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    FUNNEL("FUNNEL"),
    
    LABEL("LABEL"),
    
    CONTROLLER_SERVICE("CONTROLLER_SERVICE");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComponentTypeEnum fromValue(String text) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComponentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("componentType")
  private ComponentTypeEnum componentType = null;

  @SerializedName("groupIdentifier")
  private String groupIdentifier = null;

  public VersionedProcessor identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The component&#39;s unique identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "The component's unique identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public VersionedProcessor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component&#39;s name
   * @return name
  **/
  @ApiModelProperty(value = "The component's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedProcessor comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @ApiModelProperty(value = "The user-supplied comments for the component")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedProcessor position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * The component&#39;s position on the graph
   * @return position
  **/
  @ApiModelProperty(value = "The component's position on the graph")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public VersionedProcessor bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Information about the bundle from which the component came
   * @return bundle
  **/
  @ApiModelProperty(value = "Information about the bundle from which the component came")
  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public VersionedProcessor style(Map<String, String> style) {
    this.style = style;
    return this;
  }

  public VersionedProcessor putStyleItem(String key, String styleItem) {
    if (this.style == null) {
      this.style = new HashMap<String, String>();
    }
    this.style.put(key, styleItem);
    return this;
  }

   /**
   * Stylistic data for rendering in a UI
   * @return style
  **/
  @ApiModelProperty(value = "Stylistic data for rendering in a UI")
  public Map<String, String> getStyle() {
    return style;
  }

  public void setStyle(Map<String, String> style) {
    this.style = style;
  }

  public VersionedProcessor type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Processor
   * @return type
  **/
  @ApiModelProperty(value = "The type of Processor")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VersionedProcessor properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public VersionedProcessor putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties for the processor. Properties whose value is not set will only contain the property name.
   * @return properties
  **/
  @ApiModelProperty(value = "The properties for the processor. Properties whose value is not set will only contain the property name.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public VersionedProcessor propertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
    return this;
  }

  public VersionedProcessor putPropertyDescriptorsItem(String key, VersionedPropertyDescriptor propertyDescriptorsItem) {
    if (this.propertyDescriptors == null) {
      this.propertyDescriptors = new HashMap<String, VersionedPropertyDescriptor>();
    }
    this.propertyDescriptors.put(key, propertyDescriptorsItem);
    return this;
  }

   /**
   * The property descriptors for the processor.
   * @return propertyDescriptors
  **/
  @ApiModelProperty(value = "The property descriptors for the processor.")
  public Map<String, VersionedPropertyDescriptor> getPropertyDescriptors() {
    return propertyDescriptors;
  }

  public void setPropertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
  }

  public VersionedProcessor annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation data for the processor used to relay configuration between a custom UI and the procesosr.
   * @return annotationData
  **/
  @ApiModelProperty(value = "The annotation data for the processor used to relay configuration between a custom UI and the procesosr.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public VersionedProcessor schedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
    return this;
  }

   /**
   * The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy.
   * @return schedulingPeriod
  **/
  @ApiModelProperty(value = "The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy.")
  public String getSchedulingPeriod() {
    return schedulingPeriod;
  }

  public void setSchedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
  }

  public VersionedProcessor schedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
    return this;
  }

   /**
   * Indcates whether the prcessor should be scheduled to run in event or timer driven mode.
   * @return schedulingStrategy
  **/
  @ApiModelProperty(value = "Indcates whether the prcessor should be scheduled to run in event or timer driven mode.")
  public String getSchedulingStrategy() {
    return schedulingStrategy;
  }

  public void setSchedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
  }

  public VersionedProcessor executionNode(String executionNode) {
    this.executionNode = executionNode;
    return this;
  }

   /**
   * Indicates the node where the process will execute.
   * @return executionNode
  **/
  @ApiModelProperty(value = "Indicates the node where the process will execute.")
  public String getExecutionNode() {
    return executionNode;
  }

  public void setExecutionNode(String executionNode) {
    this.executionNode = executionNode;
  }

  public VersionedProcessor penaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
    return this;
  }

   /**
   * The amout of time that is used when the process penalizes a flowfile.
   * @return penaltyDuration
  **/
  @ApiModelProperty(value = "The amout of time that is used when the process penalizes a flowfile.")
  public String getPenaltyDuration() {
    return penaltyDuration;
  }

  public void setPenaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
  }

  public VersionedProcessor yieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
    return this;
  }

   /**
   * The amount of time that must elapse before this processor is scheduled again after yielding.
   * @return yieldDuration
  **/
  @ApiModelProperty(value = "The amount of time that must elapse before this processor is scheduled again after yielding.")
  public String getYieldDuration() {
    return yieldDuration;
  }

  public void setYieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
  }

  public VersionedProcessor bulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
    return this;
  }

   /**
   * The level at which the processor will report bulletins.
   * @return bulletinLevel
  **/
  @ApiModelProperty(value = "The level at which the processor will report bulletins.")
  public String getBulletinLevel() {
    return bulletinLevel;
  }

  public void setBulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
  }

  public VersionedProcessor runDurationMillis(Long runDurationMillis) {
    this.runDurationMillis = runDurationMillis;
    return this;
  }

   /**
   * The run duration for the processor in milliseconds.
   * @return runDurationMillis
  **/
  @ApiModelProperty(value = "The run duration for the processor in milliseconds.")
  public Long getRunDurationMillis() {
    return runDurationMillis;
  }

  public void setRunDurationMillis(Long runDurationMillis) {
    this.runDurationMillis = runDurationMillis;
  }

  public VersionedProcessor concurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    return this;
  }

   /**
   * The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#39;t allow parallol processing then any positive input will be ignored.
   * @return concurrentlySchedulableTaskCount
  **/
  @ApiModelProperty(value = "The number of tasks that should be concurrently schedule for the processor. If the processor doesn't allow parallol processing then any positive input will be ignored.")
  public Integer getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  public VersionedProcessor autoTerminatedRelationships(List<String> autoTerminatedRelationships) {
    this.autoTerminatedRelationships = autoTerminatedRelationships;
    return this;
  }

  public VersionedProcessor addAutoTerminatedRelationshipsItem(String autoTerminatedRelationshipsItem) {
    if (this.autoTerminatedRelationships == null) {
      this.autoTerminatedRelationships = new ArrayList<String>();
    }
    this.autoTerminatedRelationships.add(autoTerminatedRelationshipsItem);
    return this;
  }

   /**
   * The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#39;isAutoTerminate&#39; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated.
   * @return autoTerminatedRelationships
  **/
  @ApiModelProperty(value = "The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the 'isAutoTerminate' property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated.")
  public List<String> getAutoTerminatedRelationships() {
    return autoTerminatedRelationships;
  }

  public void setAutoTerminatedRelationships(List<String> autoTerminatedRelationships) {
    this.autoTerminatedRelationships = autoTerminatedRelationships;
  }

  public VersionedProcessor scheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
    return this;
  }

   /**
   * The scheduled state of the component
   * @return scheduledState
  **/
  @ApiModelProperty(value = "The scheduled state of the component")
  public ScheduledStateEnum getScheduledState() {
    return scheduledState;
  }

  public void setScheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
  }

  public VersionedProcessor componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @ApiModelProperty(value = "")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public VersionedProcessor groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @ApiModelProperty(value = "The ID of the Process Group that this component belongs to")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedProcessor versionedProcessor = (VersionedProcessor) o;
    return Objects.equals(this.identifier, versionedProcessor.identifier) &&
        Objects.equals(this.name, versionedProcessor.name) &&
        Objects.equals(this.comments, versionedProcessor.comments) &&
        Objects.equals(this.position, versionedProcessor.position) &&
        Objects.equals(this.bundle, versionedProcessor.bundle) &&
        Objects.equals(this.style, versionedProcessor.style) &&
        Objects.equals(this.type, versionedProcessor.type) &&
        Objects.equals(this.properties, versionedProcessor.properties) &&
        Objects.equals(this.propertyDescriptors, versionedProcessor.propertyDescriptors) &&
        Objects.equals(this.annotationData, versionedProcessor.annotationData) &&
        Objects.equals(this.schedulingPeriod, versionedProcessor.schedulingPeriod) &&
        Objects.equals(this.schedulingStrategy, versionedProcessor.schedulingStrategy) &&
        Objects.equals(this.executionNode, versionedProcessor.executionNode) &&
        Objects.equals(this.penaltyDuration, versionedProcessor.penaltyDuration) &&
        Objects.equals(this.yieldDuration, versionedProcessor.yieldDuration) &&
        Objects.equals(this.bulletinLevel, versionedProcessor.bulletinLevel) &&
        Objects.equals(this.runDurationMillis, versionedProcessor.runDurationMillis) &&
        Objects.equals(this.concurrentlySchedulableTaskCount, versionedProcessor.concurrentlySchedulableTaskCount) &&
        Objects.equals(this.autoTerminatedRelationships, versionedProcessor.autoTerminatedRelationships) &&
        Objects.equals(this.scheduledState, versionedProcessor.scheduledState) &&
        Objects.equals(this.componentType, versionedProcessor.componentType) &&
        Objects.equals(this.groupIdentifier, versionedProcessor.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, bundle, style, type, properties, propertyDescriptors, annotationData, schedulingPeriod, schedulingStrategy, executionNode, penaltyDuration, yieldDuration, bulletinLevel, runDurationMillis, concurrentlySchedulableTaskCount, autoTerminatedRelationships, scheduledState, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedProcessor {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    propertyDescriptors: ").append(toIndentedString(propertyDescriptors)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    schedulingPeriod: ").append(toIndentedString(schedulingPeriod)).append("\n");
    sb.append("    schedulingStrategy: ").append(toIndentedString(schedulingStrategy)).append("\n");
    sb.append("    executionNode: ").append(toIndentedString(executionNode)).append("\n");
    sb.append("    penaltyDuration: ").append(toIndentedString(penaltyDuration)).append("\n");
    sb.append("    yieldDuration: ").append(toIndentedString(yieldDuration)).append("\n");
    sb.append("    bulletinLevel: ").append(toIndentedString(bulletinLevel)).append("\n");
    sb.append("    runDurationMillis: ").append(toIndentedString(runDurationMillis)).append("\n");
    sb.append("    concurrentlySchedulableTaskCount: ").append(toIndentedString(concurrentlySchedulableTaskCount)).append("\n");
    sb.append("    autoTerminatedRelationships: ").append(toIndentedString(autoTerminatedRelationships)).append("\n");
    sb.append("    scheduledState: ").append(toIndentedString(scheduledState)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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

