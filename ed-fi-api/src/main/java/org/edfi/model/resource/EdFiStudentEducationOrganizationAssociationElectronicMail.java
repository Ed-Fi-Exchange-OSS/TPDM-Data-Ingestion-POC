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


/**
 * EdFiStudentEducationOrganizationAssociationElectronicMail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentEducationOrganizationAssociationElectronicMail   {
  @SerializedName("electronicMailTypeDescriptor")
  private String electronicMailTypeDescriptor = null;

  @SerializedName("doNotPublishIndicator")
  private Boolean doNotPublishIndicator = null;

  @SerializedName("electronicMailAddress")
  private String electronicMailAddress = null;

  @SerializedName("primaryEmailAddressIndicator")
  private Boolean primaryEmailAddressIndicator = null;

  public EdFiStudentEducationOrganizationAssociationElectronicMail electronicMailTypeDescriptor(String electronicMailTypeDescriptor) {
    this.electronicMailTypeDescriptor = electronicMailTypeDescriptor;
    return this;
  }

   /**
   * The type of email listed for an individual or organization. For example: Home/Personal, Work, etc.)
   * @return electronicMailTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of email listed for an individual or organization. For example: Home/Personal, Work, etc.)")
  public String getElectronicMailTypeDescriptor() {
    return electronicMailTypeDescriptor;
  }

  public void setElectronicMailTypeDescriptor(String electronicMailTypeDescriptor) {
    this.electronicMailTypeDescriptor = electronicMailTypeDescriptor;
  }

  public EdFiStudentEducationOrganizationAssociationElectronicMail doNotPublishIndicator(Boolean doNotPublishIndicator) {
    this.doNotPublishIndicator = doNotPublishIndicator;
    return this;
  }

   /**
   * An indication that the electronic email address should not be published.
   * @return doNotPublishIndicator
  **/
  @ApiModelProperty(example = "null", value = "An indication that the electronic email address should not be published.")
  public Boolean getDoNotPublishIndicator() {
    return doNotPublishIndicator;
  }

  public void setDoNotPublishIndicator(Boolean doNotPublishIndicator) {
    this.doNotPublishIndicator = doNotPublishIndicator;
  }

  public EdFiStudentEducationOrganizationAssociationElectronicMail electronicMailAddress(String electronicMailAddress) {
    this.electronicMailAddress = electronicMailAddress;
    return this;
  }

   /**
   * The electronic mail (e-mail) address listed for an individual or organization.
   * @return electronicMailAddress
  **/
  @ApiModelProperty(example = "null", required = true, value = "The electronic mail (e-mail) address listed for an individual or organization.")
  public String getElectronicMailAddress() {
    return electronicMailAddress;
  }

  public void setElectronicMailAddress(String electronicMailAddress) {
    this.electronicMailAddress = electronicMailAddress;
  }

  public EdFiStudentEducationOrganizationAssociationElectronicMail primaryEmailAddressIndicator(Boolean primaryEmailAddressIndicator) {
    this.primaryEmailAddressIndicator = primaryEmailAddressIndicator;
    return this;
  }

   /**
   * An indication that the electronic mail address should be used as the principal electronic mail address for an individual or organization.
   * @return primaryEmailAddressIndicator
  **/
  @ApiModelProperty(example = "null", value = "An indication that the electronic mail address should be used as the principal electronic mail address for an individual or organization.")
  public Boolean getPrimaryEmailAddressIndicator() {
    return primaryEmailAddressIndicator;
  }

  public void setPrimaryEmailAddressIndicator(Boolean primaryEmailAddressIndicator) {
    this.primaryEmailAddressIndicator = primaryEmailAddressIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentEducationOrganizationAssociationElectronicMail edFiStudentEducationOrganizationAssociationElectronicMail = (EdFiStudentEducationOrganizationAssociationElectronicMail) o;
    return Objects.equals(this.electronicMailTypeDescriptor, edFiStudentEducationOrganizationAssociationElectronicMail.electronicMailTypeDescriptor) &&
        Objects.equals(this.doNotPublishIndicator, edFiStudentEducationOrganizationAssociationElectronicMail.doNotPublishIndicator) &&
        Objects.equals(this.electronicMailAddress, edFiStudentEducationOrganizationAssociationElectronicMail.electronicMailAddress) &&
        Objects.equals(this.primaryEmailAddressIndicator, edFiStudentEducationOrganizationAssociationElectronicMail.primaryEmailAddressIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electronicMailTypeDescriptor, doNotPublishIndicator, electronicMailAddress, primaryEmailAddressIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociationElectronicMail {\n");
    
    sb.append("    electronicMailTypeDescriptor: ").append(toIndentedString(electronicMailTypeDescriptor)).append("\n");
    sb.append("    doNotPublishIndicator: ").append(toIndentedString(doNotPublishIndicator)).append("\n");
    sb.append("    electronicMailAddress: ").append(toIndentedString(electronicMailAddress)).append("\n");
    sb.append("    primaryEmailAddressIndicator: ").append(toIndentedString(primaryEmailAddressIndicator)).append("\n");
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

