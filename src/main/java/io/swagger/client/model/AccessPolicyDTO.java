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
import io.swagger.client.model.ComponentReferenceEntity;
import io.swagger.client.model.PositionDTO;
import io.swagger.client.model.TenantEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessPolicyDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class AccessPolicyDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("versionedComponentId")
  private String versionedComponentId = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("resource")
  private String resource = null;

  /**
   * The action associated with this access policy.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    READ("read"),
    
    WRITE("write");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("componentReference")
  private ComponentReferenceEntity componentReference = null;

  @SerializedName("configurable")
  private Boolean configurable = null;

  @SerializedName("users")
  private List<TenantEntity> users = null;

  @SerializedName("userGroups")
  private List<TenantEntity> userGroups = null;

  public AccessPolicyDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccessPolicyDTO versionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @ApiModelProperty(value = "The ID of the corresponding component that is under version control")
  public String getVersionedComponentId() {
    return versionedComponentId;
  }

  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }

  public AccessPolicyDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public AccessPolicyDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public AccessPolicyDTO resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The resource for this access policy.
   * @return resource
  **/
  @ApiModelProperty(value = "The resource for this access policy.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public AccessPolicyDTO action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The action associated with this access policy.
   * @return action
  **/
  @ApiModelProperty(value = "The action associated with this access policy.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AccessPolicyDTO componentReference(ComponentReferenceEntity componentReference) {
    this.componentReference = componentReference;
    return this;
  }

   /**
   * Component this policy references if applicable.
   * @return componentReference
  **/
  @ApiModelProperty(value = "Component this policy references if applicable.")
  public ComponentReferenceEntity getComponentReference() {
    return componentReference;
  }

  public void setComponentReference(ComponentReferenceEntity componentReference) {
    this.componentReference = componentReference;
  }

  public AccessPolicyDTO configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

   /**
   * Whether this policy is configurable.
   * @return configurable
  **/
  @ApiModelProperty(value = "Whether this policy is configurable.")
  public Boolean isConfigurable() {
    return configurable;
  }

  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  public AccessPolicyDTO users(List<TenantEntity> users) {
    this.users = users;
    return this;
  }

  public AccessPolicyDTO addUsersItem(TenantEntity usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<TenantEntity>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The set of user IDs associated with this access policy.
   * @return users
  **/
  @ApiModelProperty(value = "The set of user IDs associated with this access policy.")
  public List<TenantEntity> getUsers() {
    return users;
  }

  public void setUsers(List<TenantEntity> users) {
    this.users = users;
  }

  public AccessPolicyDTO userGroups(List<TenantEntity> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public AccessPolicyDTO addUserGroupsItem(TenantEntity userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<TenantEntity>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * The set of user group IDs associated with this access policy.
   * @return userGroups
  **/
  @ApiModelProperty(value = "The set of user group IDs associated with this access policy.")
  public List<TenantEntity> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<TenantEntity> userGroups) {
    this.userGroups = userGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPolicyDTO accessPolicyDTO = (AccessPolicyDTO) o;
    return Objects.equals(this.id, accessPolicyDTO.id) &&
        Objects.equals(this.versionedComponentId, accessPolicyDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, accessPolicyDTO.parentGroupId) &&
        Objects.equals(this.position, accessPolicyDTO.position) &&
        Objects.equals(this.resource, accessPolicyDTO.resource) &&
        Objects.equals(this.action, accessPolicyDTO.action) &&
        Objects.equals(this.componentReference, accessPolicyDTO.componentReference) &&
        Objects.equals(this.configurable, accessPolicyDTO.configurable) &&
        Objects.equals(this.users, accessPolicyDTO.users) &&
        Objects.equals(this.userGroups, accessPolicyDTO.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, resource, action, componentReference, configurable, users, userGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPolicyDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    componentReference: ").append(toIndentedString(componentReference)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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

