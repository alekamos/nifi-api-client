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
import io.swagger.client.model.ProvenanceEventDTO;
import java.io.IOException;

/**
 * ProvenanceEventEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-11T15:06:11.268+01:00")
public class ProvenanceEventEntity {
  @SerializedName("provenanceEvent")
  private ProvenanceEventDTO provenanceEvent = null;

  public ProvenanceEventEntity provenanceEvent(ProvenanceEventDTO provenanceEvent) {
    this.provenanceEvent = provenanceEvent;
    return this;
  }

   /**
   * Get provenanceEvent
   * @return provenanceEvent
  **/
  @ApiModelProperty(value = "")
  public ProvenanceEventDTO getProvenanceEvent() {
    return provenanceEvent;
  }

  public void setProvenanceEvent(ProvenanceEventDTO provenanceEvent) {
    this.provenanceEvent = provenanceEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceEventEntity provenanceEventEntity = (ProvenanceEventEntity) o;
    return Objects.equals(this.provenanceEvent, provenanceEventEntity.provenanceEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provenanceEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceEventEntity {\n");
    
    sb.append("    provenanceEvent: ").append(toIndentedString(provenanceEvent)).append("\n");
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

