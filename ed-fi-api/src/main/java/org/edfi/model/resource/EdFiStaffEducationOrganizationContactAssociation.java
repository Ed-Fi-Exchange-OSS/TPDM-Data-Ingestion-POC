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
import java.util.ArrayList;
import java.util.List;
import org.edfi.model.resource.EdFiEducationOrganizationReference;
import org.edfi.model.resource.EdFiStaffEducationOrganizationContactAssociationAddress;
import org.edfi.model.resource.EdFiStaffEducationOrganizationContactAssociationTelephone;
import org.edfi.model.resource.EdFiStaffReference;


/**
 * EdFiStaffEducationOrganizationContactAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStaffEducationOrganizationContactAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("contactTitle")
  private String contactTitle = null;

  @SerializedName("educationOrganizationReference")
  private EdFiEducationOrganizationReference educationOrganizationReference = null;

  @SerializedName("staffReference")
  private EdFiStaffReference staffReference = null;

  @SerializedName("address")
  private EdFiStaffEducationOrganizationContactAssociationAddress address = null;

  @SerializedName("contactTypeDescriptor")
  private String contactTypeDescriptor = null;

  @SerializedName("electronicMailAddress")
  private String electronicMailAddress = null;

  @SerializedName("telephones")
  private List<EdFiStaffEducationOrganizationContactAssociationTelephone> telephones = new ArrayList<EdFiStaffEducationOrganizationContactAssociationTelephone>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStaffEducationOrganizationContactAssociation id(String id) {
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

  public EdFiStaffEducationOrganizationContactAssociation contactTitle(String contactTitle) {
    this.contactTitle = contactTitle;
    return this;
  }

   /**
   * The title of the contact in the context of the EducationOrganization.
   * @return contactTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "The title of the contact in the context of the EducationOrganization.")
  public String getContactTitle() {
    return contactTitle;
  }

  public void setContactTitle(String contactTitle) {
    this.contactTitle = contactTitle;
  }

  public EdFiStaffEducationOrganizationContactAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
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

  public EdFiStaffEducationOrganizationContactAssociation staffReference(EdFiStaffReference staffReference) {
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

  public EdFiStaffEducationOrganizationContactAssociation address(EdFiStaffEducationOrganizationContactAssociationAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiStaffEducationOrganizationContactAssociationAddress getAddress() {
    return address;
  }

  public void setAddress(EdFiStaffEducationOrganizationContactAssociationAddress address) {
    this.address = address;
  }

  public EdFiStaffEducationOrganizationContactAssociation contactTypeDescriptor(String contactTypeDescriptor) {
    this.contactTypeDescriptor = contactTypeDescriptor;
    return this;
  }

   /**
   * Indicates the type for the contact information.
   * @return contactTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "Indicates the type for the contact information.")
  public String getContactTypeDescriptor() {
    return contactTypeDescriptor;
  }

  public void setContactTypeDescriptor(String contactTypeDescriptor) {
    this.contactTypeDescriptor = contactTypeDescriptor;
  }

  public EdFiStaffEducationOrganizationContactAssociation electronicMailAddress(String electronicMailAddress) {
    this.electronicMailAddress = electronicMailAddress;
    return this;
  }

   /**
   * The email for the contact associated with the EducationOrganization.
   * @return electronicMailAddress
  **/
  @ApiModelProperty(example = "null", required = true, value = "The email for the contact associated with the EducationOrganization.")
  public String getElectronicMailAddress() {
    return electronicMailAddress;
  }

  public void setElectronicMailAddress(String electronicMailAddress) {
    this.electronicMailAddress = electronicMailAddress;
  }

  public EdFiStaffEducationOrganizationContactAssociation telephones(List<EdFiStaffEducationOrganizationContactAssociationTelephone> telephones) {
    this.telephones = telephones;
    return this;
  }

  public EdFiStaffEducationOrganizationContactAssociation addTelephonesItem(EdFiStaffEducationOrganizationContactAssociationTelephone telephonesItem) {
    this.telephones.add(telephonesItem);
    return this;
  }

   /**
   * An unordered collection of staffEducationOrganizationContactAssociationTelephones. The optional telephone for the contact associated with the EducationOrganization.
   * @return telephones
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of staffEducationOrganizationContactAssociationTelephones. The optional telephone for the contact associated with the EducationOrganization.")
  public List<EdFiStaffEducationOrganizationContactAssociationTelephone> getTelephones() {
    return telephones;
  }

  public void setTelephones(List<EdFiStaffEducationOrganizationContactAssociationTelephone> telephones) {
    this.telephones = telephones;
  }

  public EdFiStaffEducationOrganizationContactAssociation etag(String etag) {
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
    EdFiStaffEducationOrganizationContactAssociation edFiStaffEducationOrganizationContactAssociation = (EdFiStaffEducationOrganizationContactAssociation) o;
    return Objects.equals(this.id, edFiStaffEducationOrganizationContactAssociation.id) &&
        Objects.equals(this.contactTitle, edFiStaffEducationOrganizationContactAssociation.contactTitle) &&
        Objects.equals(this.educationOrganizationReference, edFiStaffEducationOrganizationContactAssociation.educationOrganizationReference) &&
        Objects.equals(this.staffReference, edFiStaffEducationOrganizationContactAssociation.staffReference) &&
        Objects.equals(this.address, edFiStaffEducationOrganizationContactAssociation.address) &&
        Objects.equals(this.contactTypeDescriptor, edFiStaffEducationOrganizationContactAssociation.contactTypeDescriptor) &&
        Objects.equals(this.electronicMailAddress, edFiStaffEducationOrganizationContactAssociation.electronicMailAddress) &&
        Objects.equals(this.telephones, edFiStaffEducationOrganizationContactAssociation.telephones) &&
        Objects.equals(this.etag, edFiStaffEducationOrganizationContactAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactTitle, educationOrganizationReference, staffReference, address, contactTypeDescriptor, electronicMailAddress, telephones, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffEducationOrganizationContactAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactTitle: ").append(toIndentedString(contactTitle)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactTypeDescriptor: ").append(toIndentedString(contactTypeDescriptor)).append("\n");
    sb.append("    electronicMailAddress: ").append(toIndentedString(electronicMailAddress)).append("\n");
    sb.append("    telephones: ").append(toIndentedString(telephones)).append("\n");
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

