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
import org.edfi.model.resource.EdFiCredentialReference;
import org.edfi.model.resource.EdFiEducationOrganizationReference;
import org.edfi.model.resource.EdFiStaffEducationOrganizationEmploymentAssociationReference;
import org.edfi.model.resource.EdFiStaffReference;
import org.edfi.model.resource.StaffEducationOrganizationAssignmentAssociationExtensions;
import org.joda.time.LocalDate;


/**
 * EdFiStaffEducationOrganizationAssignmentAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStaffEducationOrganizationAssignmentAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("beginDate")
  private LocalDate beginDate = null;

  @SerializedName("staffClassificationDescriptor")
  private String staffClassificationDescriptor = null;

  @SerializedName("credentialReference")
  private EdFiCredentialReference credentialReference = null;

  @SerializedName("educationOrganizationReference")
  private EdFiEducationOrganizationReference educationOrganizationReference = null;

  @SerializedName("employmentStaffEducationOrganizationEmploymentAssociationReference")
  private EdFiStaffEducationOrganizationEmploymentAssociationReference employmentStaffEducationOrganizationEmploymentAssociationReference = null;

  @SerializedName("staffReference")
  private EdFiStaffReference staffReference = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("orderOfAssignment")
  private Integer orderOfAssignment = null;

  @SerializedName("positionTitle")
  private String positionTitle = null;

  @SerializedName("_etag")
  private String etag = null;

  @SerializedName("_ext")
  private StaffEducationOrganizationAssignmentAssociationExtensions ext = null;

  public EdFiStaffEducationOrganizationAssignmentAssociation id(String id) {
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

  public EdFiStaffEducationOrganizationAssignmentAssociation beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Month, day, and year of the start or effective date of a staff member's employment, contract, or relationship with the LEA.
   * @return beginDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Month, day, and year of the start or effective date of a staff member's employment, contract, or relationship with the LEA.")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation staffClassificationDescriptor(String staffClassificationDescriptor) {
    this.staffClassificationDescriptor = staffClassificationDescriptor;
    return this;
  }

   /**
   * The titles of employment, official status, or rank of education staff.
   * @return staffClassificationDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The titles of employment, official status, or rank of education staff.")
  public String getStaffClassificationDescriptor() {
    return staffClassificationDescriptor;
  }

  public void setStaffClassificationDescriptor(String staffClassificationDescriptor) {
    this.staffClassificationDescriptor = staffClassificationDescriptor;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation credentialReference(EdFiCredentialReference credentialReference) {
    this.credentialReference = credentialReference;
    return this;
  }

   /**
   * Get credentialReference
   * @return credentialReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiCredentialReference getCredentialReference() {
    return credentialReference;
  }

  public void setCredentialReference(EdFiCredentialReference credentialReference) {
    this.credentialReference = credentialReference;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }

  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation employmentStaffEducationOrganizationEmploymentAssociationReference(EdFiStaffEducationOrganizationEmploymentAssociationReference employmentStaffEducationOrganizationEmploymentAssociationReference) {
    this.employmentStaffEducationOrganizationEmploymentAssociationReference = employmentStaffEducationOrganizationEmploymentAssociationReference;
    return this;
  }

   /**
   * Get employmentStaffEducationOrganizationEmploymentAssociationReference
   * @return employmentStaffEducationOrganizationEmploymentAssociationReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiStaffEducationOrganizationEmploymentAssociationReference getEmploymentStaffEducationOrganizationEmploymentAssociationReference() {
    return employmentStaffEducationOrganizationEmploymentAssociationReference;
  }

  public void setEmploymentStaffEducationOrganizationEmploymentAssociationReference(EdFiStaffEducationOrganizationEmploymentAssociationReference employmentStaffEducationOrganizationEmploymentAssociationReference) {
    this.employmentStaffEducationOrganizationEmploymentAssociationReference = employmentStaffEducationOrganizationEmploymentAssociationReference;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation staffReference(EdFiStaffReference staffReference) {
    this.staffReference = staffReference;
    return this;
  }

   /**
   * Get staffReference
   * @return staffReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiStaffReference getStaffReference() {
    return staffReference;
  }

  public void setStaffReference(EdFiStaffReference staffReference) {
    this.staffReference = staffReference;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Month, day, and year of the end or termination date of a staff member's employment, contract, or relationship with the LEA.
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "Month, day, and year of the end or termination date of a staff member's employment, contract, or relationship with the LEA.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation orderOfAssignment(Integer orderOfAssignment) {
    this.orderOfAssignment = orderOfAssignment;
    return this;
  }

   /**
   * Describes whether the assignment is this the staff member's primary assignment, secondary assignment, etc.
   * @return orderOfAssignment
  **/
  @ApiModelProperty(example = "null", value = "Describes whether the assignment is this the staff member's primary assignment, secondary assignment, etc.")
  public Integer getOrderOfAssignment() {
    return orderOfAssignment;
  }

  public void setOrderOfAssignment(Integer orderOfAssignment) {
    this.orderOfAssignment = orderOfAssignment;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation positionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
    return this;
  }

   /**
   * The descriptive name of an individual's position.
   * @return positionTitle
  **/
  @ApiModelProperty(example = "null", value = "The descriptive name of an individual's position.")
  public String getPositionTitle() {
    return positionTitle;
  }

  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }

  public EdFiStaffEducationOrganizationAssignmentAssociation etag(String etag) {
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

  public EdFiStaffEducationOrganizationAssignmentAssociation ext(StaffEducationOrganizationAssignmentAssociationExtensions ext) {
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @ApiModelProperty(example = "null", value = "")
  public StaffEducationOrganizationAssignmentAssociationExtensions getExt() {
    return ext;
  }

  public void setExt(StaffEducationOrganizationAssignmentAssociationExtensions ext) {
    this.ext = ext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStaffEducationOrganizationAssignmentAssociation edFiStaffEducationOrganizationAssignmentAssociation = (EdFiStaffEducationOrganizationAssignmentAssociation) o;
    return Objects.equals(this.id, edFiStaffEducationOrganizationAssignmentAssociation.id) &&
        Objects.equals(this.beginDate, edFiStaffEducationOrganizationAssignmentAssociation.beginDate) &&
        Objects.equals(this.staffClassificationDescriptor, edFiStaffEducationOrganizationAssignmentAssociation.staffClassificationDescriptor) &&
        Objects.equals(this.credentialReference, edFiStaffEducationOrganizationAssignmentAssociation.credentialReference) &&
        Objects.equals(this.educationOrganizationReference, edFiStaffEducationOrganizationAssignmentAssociation.educationOrganizationReference) &&
        Objects.equals(this.employmentStaffEducationOrganizationEmploymentAssociationReference, edFiStaffEducationOrganizationAssignmentAssociation.employmentStaffEducationOrganizationEmploymentAssociationReference) &&
        Objects.equals(this.staffReference, edFiStaffEducationOrganizationAssignmentAssociation.staffReference) &&
        Objects.equals(this.endDate, edFiStaffEducationOrganizationAssignmentAssociation.endDate) &&
        Objects.equals(this.orderOfAssignment, edFiStaffEducationOrganizationAssignmentAssociation.orderOfAssignment) &&
        Objects.equals(this.positionTitle, edFiStaffEducationOrganizationAssignmentAssociation.positionTitle) &&
        Objects.equals(this.etag, edFiStaffEducationOrganizationAssignmentAssociation.etag) &&
        Objects.equals(this.ext, edFiStaffEducationOrganizationAssignmentAssociation.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, staffClassificationDescriptor, credentialReference, educationOrganizationReference, employmentStaffEducationOrganizationEmploymentAssociationReference, staffReference, endDate, orderOfAssignment, positionTitle, etag, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffEducationOrganizationAssignmentAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    staffClassificationDescriptor: ").append(toIndentedString(staffClassificationDescriptor)).append("\n");
    sb.append("    credentialReference: ").append(toIndentedString(credentialReference)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    employmentStaffEducationOrganizationEmploymentAssociationReference: ").append(toIndentedString(employmentStaffEducationOrganizationEmploymentAssociationReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    orderOfAssignment: ").append(toIndentedString(orderOfAssignment)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
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

