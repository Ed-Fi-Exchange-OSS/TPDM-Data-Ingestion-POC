/**
 * Ed-Fi Operational Data Store API
 * The Ed-Fi ODS / API enables applications to read and write education data stored in an Ed-Fi ODS through a secure REST interface. The Ed-Fi ODS / API supports both transactional and bulk modes of operation.  ***  > *Note: Consumers of ODS / API information should sanitize all data for display and storage. The ODS / API provides reasonable safeguards against cross-site scripting attacks and other malicious content, but the platform does not and cannot guarantee that the data it contains is free of all potentially harmful content.*  *** 
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.edfi.model.descriptor;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;


/**
 * EdFiInternetAccessDescriptor
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:43.982-07:00")
public class EdFiInternetAccessDescriptor   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("internetAccessDescriptorId")
  private Integer internetAccessDescriptorId = null;

  @SerializedName("codeValue")
  private String codeValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("effectiveBeginDate")
  private LocalDate effectiveBeginDate = null;

  @SerializedName("effectiveEndDate")
  private LocalDate effectiveEndDate = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("priorDescriptorId")
  private Integer priorDescriptorId = null;

  @SerializedName("shortDescription")
  private String shortDescription = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiInternetAccessDescriptor id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EdFiInternetAccessDescriptor internetAccessDescriptorId(Integer internetAccessDescriptorId) {
    this.internetAccessDescriptorId = internetAccessDescriptorId;
    return this;
  }

   /**
   * A unique identifier used as Primary Key, not derived from business logic, when acting as Foreign Key, references the parent table.
   * @return internetAccessDescriptorId
  **/
  @ApiModelProperty(example = "null", value = "A unique identifier used as Primary Key, not derived from business logic, when acting as Foreign Key, references the parent table.")
  public Integer getInternetAccessDescriptorId() {
    return internetAccessDescriptorId;
  }

  public void setInternetAccessDescriptorId(Integer internetAccessDescriptorId) {
    this.internetAccessDescriptorId = internetAccessDescriptorId;
  }

  public EdFiInternetAccessDescriptor codeValue(String codeValue) {
    this.codeValue = codeValue;
    return this;
  }

   /**
   * A code or abbreviation that is used to refer to the descriptor.
   * @return codeValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "A code or abbreviation that is used to refer to the descriptor.")
  public String getCodeValue() {
    return codeValue;
  }

  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }

  public EdFiInternetAccessDescriptor description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the descriptor.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the descriptor.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EdFiInternetAccessDescriptor effectiveBeginDate(LocalDate effectiveBeginDate) {
    this.effectiveBeginDate = effectiveBeginDate;
    return this;
  }

   /**
   * The beginning date of the period when the descriptor is in effect. If omitted, the default is immediate effectiveness.
   * @return effectiveBeginDate
  **/
  @ApiModelProperty(example = "null", value = "The beginning date of the period when the descriptor is in effect. If omitted, the default is immediate effectiveness.")
  public LocalDate getEffectiveBeginDate() {
    return effectiveBeginDate;
  }

  public void setEffectiveBeginDate(LocalDate effectiveBeginDate) {
    this.effectiveBeginDate = effectiveBeginDate;
  }

  public EdFiInternetAccessDescriptor effectiveEndDate(LocalDate effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * The end date of the period when the descriptor is in effect.
   * @return effectiveEndDate
  **/
  @ApiModelProperty(example = "null", value = "The end date of the period when the descriptor is in effect.")
  public LocalDate getEffectiveEndDate() {
    return effectiveEndDate;
  }

  public void setEffectiveEndDate(LocalDate effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }

  public EdFiInternetAccessDescriptor namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * A globally unique namespace that identifies this descriptor set. Author is strongly encouraged to use the Universal Resource Identifier (http, ftp, file, etc.) for the source of the descriptor definition. Best practice is for this source to be the descriptor file itself, so that it can be machine-readable and be fetched in real-time, if necessary.
   * @return namespace
  **/
  @ApiModelProperty(example = "null", required = true, value = "A globally unique namespace that identifies this descriptor set. Author is strongly encouraged to use the Universal Resource Identifier (http, ftp, file, etc.) for the source of the descriptor definition. Best practice is for this source to be the descriptor file itself, so that it can be machine-readable and be fetched in real-time, if necessary.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public EdFiInternetAccessDescriptor priorDescriptorId(Integer priorDescriptorId) {
    this.priorDescriptorId = priorDescriptorId;
    return this;
  }

   /**
   * A unique identifier used as Primary Key, not derived from business logic, when acting as Foreign Key, references the parent table.
   * @return priorDescriptorId
  **/
  @ApiModelProperty(example = "null", value = "A unique identifier used as Primary Key, not derived from business logic, when acting as Foreign Key, references the parent table.")
  public Integer getPriorDescriptorId() {
    return priorDescriptorId;
  }

  public void setPriorDescriptorId(Integer priorDescriptorId) {
    this.priorDescriptorId = priorDescriptorId;
  }

  public EdFiInternetAccessDescriptor shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A shortened description for the descriptor.
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", required = true, value = "A shortened description for the descriptor.")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public EdFiInternetAccessDescriptor etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * A unique system-generated value that identifies the version of the resource.
   * @return etag
  **/
  @ApiModelProperty(example = "null", value = "A unique system-generated value that identifies the version of the resource.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiInternetAccessDescriptor edFiInternetAccessDescriptor = (EdFiInternetAccessDescriptor) o;
    return Objects.equals(this.id, edFiInternetAccessDescriptor.id) &&
        Objects.equals(this.internetAccessDescriptorId, edFiInternetAccessDescriptor.internetAccessDescriptorId) &&
        Objects.equals(this.codeValue, edFiInternetAccessDescriptor.codeValue) &&
        Objects.equals(this.description, edFiInternetAccessDescriptor.description) &&
        Objects.equals(this.effectiveBeginDate, edFiInternetAccessDescriptor.effectiveBeginDate) &&
        Objects.equals(this.effectiveEndDate, edFiInternetAccessDescriptor.effectiveEndDate) &&
        Objects.equals(this.namespace, edFiInternetAccessDescriptor.namespace) &&
        Objects.equals(this.priorDescriptorId, edFiInternetAccessDescriptor.priorDescriptorId) &&
        Objects.equals(this.shortDescription, edFiInternetAccessDescriptor.shortDescription) &&
        Objects.equals(this.etag, edFiInternetAccessDescriptor.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, internetAccessDescriptorId, codeValue, description, effectiveBeginDate, effectiveEndDate, namespace, priorDescriptorId, shortDescription, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiInternetAccessDescriptor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internetAccessDescriptorId: ").append(toIndentedString(internetAccessDescriptorId)).append("\n");
    sb.append("    codeValue: ").append(toIndentedString(codeValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveBeginDate: ").append(toIndentedString(effectiveBeginDate)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    priorDescriptorId: ").append(toIndentedString(priorDescriptorId)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

