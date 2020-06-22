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


package org.edfi.model.resource;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.edfi.model.resource.Link;


/**
 * EdFiOpenStaffPositionReference
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiOpenStaffPositionReference   {
  @SerializedName("educationOrganizationId")
  private Integer educationOrganizationId = null;

  @SerializedName("requisitionNumber")
  private String requisitionNumber = null;

  @SerializedName("link")
  private Link link = null;

  public EdFiOpenStaffPositionReference educationOrganizationId(Integer educationOrganizationId) {
    this.educationOrganizationId = educationOrganizationId;
    return this;
  }

   /**
   * The identifier assigned to an education organization.
   * @return educationOrganizationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier assigned to an education organization.")
  public Integer getEducationOrganizationId() {
    return educationOrganizationId;
  }

  public void setEducationOrganizationId(Integer educationOrganizationId) {
    this.educationOrganizationId = educationOrganizationId;
  }

  public EdFiOpenStaffPositionReference requisitionNumber(String requisitionNumber) {
    this.requisitionNumber = requisitionNumber;
    return this;
  }

   /**
   * The number or identifier assigned to an open staff position, typically a requisition number assigned by Human Resources.
   * @return requisitionNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "The number or identifier assigned to an open staff position, typically a requisition number assigned by Human Resources.")
  public String getRequisitionNumber() {
    return requisitionNumber;
  }

  public void setRequisitionNumber(String requisitionNumber) {
    this.requisitionNumber = requisitionNumber;
  }

  public EdFiOpenStaffPositionReference link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiOpenStaffPositionReference edFiOpenStaffPositionReference = (EdFiOpenStaffPositionReference) o;
    return Objects.equals(this.educationOrganizationId, edFiOpenStaffPositionReference.educationOrganizationId) &&
        Objects.equals(this.requisitionNumber, edFiOpenStaffPositionReference.requisitionNumber) &&
        Objects.equals(this.link, edFiOpenStaffPositionReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(educationOrganizationId, requisitionNumber, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiOpenStaffPositionReference {\n");
    
    sb.append("    educationOrganizationId: ").append(toIndentedString(educationOrganizationId)).append("\n");
    sb.append("    requisitionNumber: ").append(toIndentedString(requisitionNumber)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

