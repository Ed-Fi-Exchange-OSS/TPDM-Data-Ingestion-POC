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
import org.edfi.model.resource.EdFiCommunityProviderReference;
import org.joda.time.LocalDate;


/**
 * EdFiCommunityProviderLicense
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiCommunityProviderLicense   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("licenseIdentifier")
  private String licenseIdentifier = null;

  @SerializedName("licensingOrganization")
  private String licensingOrganization = null;

  @SerializedName("communityProviderReference")
  private EdFiCommunityProviderReference communityProviderReference = null;

  @SerializedName("authorizedFacilityCapacity")
  private Integer authorizedFacilityCapacity = null;

  @SerializedName("licenseEffectiveDate")
  private LocalDate licenseEffectiveDate = null;

  @SerializedName("licenseExpirationDate")
  private LocalDate licenseExpirationDate = null;

  @SerializedName("licenseIssueDate")
  private LocalDate licenseIssueDate = null;

  @SerializedName("licenseStatusDescriptor")
  private String licenseStatusDescriptor = null;

  @SerializedName("licenseTypeDescriptor")
  private String licenseTypeDescriptor = null;

  @SerializedName("oldestAgeAuthorizedToServe")
  private Integer oldestAgeAuthorizedToServe = null;

  @SerializedName("youngestAgeAuthorizedToServe")
  private Integer youngestAgeAuthorizedToServe = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiCommunityProviderLicense id(String id) {
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

  public EdFiCommunityProviderLicense licenseIdentifier(String licenseIdentifier) {
    this.licenseIdentifier = licenseIdentifier;
    return this;
  }

   /**
   * The unique identifier issued by the licensing organization.
   * @return licenseIdentifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier issued by the licensing organization.")
  public String getLicenseIdentifier() {
    return licenseIdentifier;
  }

  public void setLicenseIdentifier(String licenseIdentifier) {
    this.licenseIdentifier = licenseIdentifier;
  }

  public EdFiCommunityProviderLicense licensingOrganization(String licensingOrganization) {
    this.licensingOrganization = licensingOrganization;
    return this;
  }

   /**
   * The organization issuing the license.
   * @return licensingOrganization
  **/
  @ApiModelProperty(example = "null", required = true, value = "The organization issuing the license.")
  public String getLicensingOrganization() {
    return licensingOrganization;
  }

  public void setLicensingOrganization(String licensingOrganization) {
    this.licensingOrganization = licensingOrganization;
  }

  public EdFiCommunityProviderLicense communityProviderReference(EdFiCommunityProviderReference communityProviderReference) {
    this.communityProviderReference = communityProviderReference;
    return this;
  }

   /**
   * Get communityProviderReference
   * @return communityProviderReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiCommunityProviderReference getCommunityProviderReference() {
    return communityProviderReference;
  }

  public void setCommunityProviderReference(EdFiCommunityProviderReference communityProviderReference) {
    this.communityProviderReference = communityProviderReference;
  }

  public EdFiCommunityProviderLicense authorizedFacilityCapacity(Integer authorizedFacilityCapacity) {
    this.authorizedFacilityCapacity = authorizedFacilityCapacity;
    return this;
  }

   /**
   * The maximum number that can be contained or accommodated which a provider is authorized or licensed to serve.
   * @return authorizedFacilityCapacity
  **/
  @ApiModelProperty(example = "null", value = "The maximum number that can be contained or accommodated which a provider is authorized or licensed to serve.")
  public Integer getAuthorizedFacilityCapacity() {
    return authorizedFacilityCapacity;
  }

  public void setAuthorizedFacilityCapacity(Integer authorizedFacilityCapacity) {
    this.authorizedFacilityCapacity = authorizedFacilityCapacity;
  }

  public EdFiCommunityProviderLicense licenseEffectiveDate(LocalDate licenseEffectiveDate) {
    this.licenseEffectiveDate = licenseEffectiveDate;
    return this;
  }

   /**
   * The month, day, and year on which a license is active or becomes effective.
   * @return licenseEffectiveDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The month, day, and year on which a license is active or becomes effective.")
  public LocalDate getLicenseEffectiveDate() {
    return licenseEffectiveDate;
  }

  public void setLicenseEffectiveDate(LocalDate licenseEffectiveDate) {
    this.licenseEffectiveDate = licenseEffectiveDate;
  }

  public EdFiCommunityProviderLicense licenseExpirationDate(LocalDate licenseExpirationDate) {
    this.licenseExpirationDate = licenseExpirationDate;
    return this;
  }

   /**
   * The month, day, and year on which a license will expire.
   * @return licenseExpirationDate
  **/
  @ApiModelProperty(example = "null", value = "The month, day, and year on which a license will expire.")
  public LocalDate getLicenseExpirationDate() {
    return licenseExpirationDate;
  }

  public void setLicenseExpirationDate(LocalDate licenseExpirationDate) {
    this.licenseExpirationDate = licenseExpirationDate;
  }

  public EdFiCommunityProviderLicense licenseIssueDate(LocalDate licenseIssueDate) {
    this.licenseIssueDate = licenseIssueDate;
    return this;
  }

   /**
   * The month, day, and year on which an active license was issued.
   * @return licenseIssueDate
  **/
  @ApiModelProperty(example = "null", value = "The month, day, and year on which an active license was issued.")
  public LocalDate getLicenseIssueDate() {
    return licenseIssueDate;
  }

  public void setLicenseIssueDate(LocalDate licenseIssueDate) {
    this.licenseIssueDate = licenseIssueDate;
  }

  public EdFiCommunityProviderLicense licenseStatusDescriptor(String licenseStatusDescriptor) {
    this.licenseStatusDescriptor = licenseStatusDescriptor;
    return this;
  }

   /**
   * An indication of the status of the license.
   * @return licenseStatusDescriptor
  **/
  @ApiModelProperty(example = "null", value = "An indication of the status of the license.")
  public String getLicenseStatusDescriptor() {
    return licenseStatusDescriptor;
  }

  public void setLicenseStatusDescriptor(String licenseStatusDescriptor) {
    this.licenseStatusDescriptor = licenseStatusDescriptor;
  }

  public EdFiCommunityProviderLicense licenseTypeDescriptor(String licenseTypeDescriptor) {
    this.licenseTypeDescriptor = licenseTypeDescriptor;
    return this;
  }

   /**
   * An indication of the category of the license.
   * @return licenseTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "An indication of the category of the license.")
  public String getLicenseTypeDescriptor() {
    return licenseTypeDescriptor;
  }

  public void setLicenseTypeDescriptor(String licenseTypeDescriptor) {
    this.licenseTypeDescriptor = licenseTypeDescriptor;
  }

  public EdFiCommunityProviderLicense oldestAgeAuthorizedToServe(Integer oldestAgeAuthorizedToServe) {
    this.oldestAgeAuthorizedToServe = oldestAgeAuthorizedToServe;
    return this;
  }

   /**
   * The oldest age of children a provider is authorized or licensed to serve.
   * @return oldestAgeAuthorizedToServe
  **/
  @ApiModelProperty(example = "null", value = "The oldest age of children a provider is authorized or licensed to serve.")
  public Integer getOldestAgeAuthorizedToServe() {
    return oldestAgeAuthorizedToServe;
  }

  public void setOldestAgeAuthorizedToServe(Integer oldestAgeAuthorizedToServe) {
    this.oldestAgeAuthorizedToServe = oldestAgeAuthorizedToServe;
  }

  public EdFiCommunityProviderLicense youngestAgeAuthorizedToServe(Integer youngestAgeAuthorizedToServe) {
    this.youngestAgeAuthorizedToServe = youngestAgeAuthorizedToServe;
    return this;
  }

   /**
   * The youngest age of children a provider is authorized or licensed to serve.
   * @return youngestAgeAuthorizedToServe
  **/
  @ApiModelProperty(example = "null", value = "The youngest age of children a provider is authorized or licensed to serve.")
  public Integer getYoungestAgeAuthorizedToServe() {
    return youngestAgeAuthorizedToServe;
  }

  public void setYoungestAgeAuthorizedToServe(Integer youngestAgeAuthorizedToServe) {
    this.youngestAgeAuthorizedToServe = youngestAgeAuthorizedToServe;
  }

  public EdFiCommunityProviderLicense etag(String etag) {
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
    EdFiCommunityProviderLicense edFiCommunityProviderLicense = (EdFiCommunityProviderLicense) o;
    return Objects.equals(this.id, edFiCommunityProviderLicense.id) &&
        Objects.equals(this.licenseIdentifier, edFiCommunityProviderLicense.licenseIdentifier) &&
        Objects.equals(this.licensingOrganization, edFiCommunityProviderLicense.licensingOrganization) &&
        Objects.equals(this.communityProviderReference, edFiCommunityProviderLicense.communityProviderReference) &&
        Objects.equals(this.authorizedFacilityCapacity, edFiCommunityProviderLicense.authorizedFacilityCapacity) &&
        Objects.equals(this.licenseEffectiveDate, edFiCommunityProviderLicense.licenseEffectiveDate) &&
        Objects.equals(this.licenseExpirationDate, edFiCommunityProviderLicense.licenseExpirationDate) &&
        Objects.equals(this.licenseIssueDate, edFiCommunityProviderLicense.licenseIssueDate) &&
        Objects.equals(this.licenseStatusDescriptor, edFiCommunityProviderLicense.licenseStatusDescriptor) &&
        Objects.equals(this.licenseTypeDescriptor, edFiCommunityProviderLicense.licenseTypeDescriptor) &&
        Objects.equals(this.oldestAgeAuthorizedToServe, edFiCommunityProviderLicense.oldestAgeAuthorizedToServe) &&
        Objects.equals(this.youngestAgeAuthorizedToServe, edFiCommunityProviderLicense.youngestAgeAuthorizedToServe) &&
        Objects.equals(this.etag, edFiCommunityProviderLicense.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, licenseIdentifier, licensingOrganization, communityProviderReference, authorizedFacilityCapacity, licenseEffectiveDate, licenseExpirationDate, licenseIssueDate, licenseStatusDescriptor, licenseTypeDescriptor, oldestAgeAuthorizedToServe, youngestAgeAuthorizedToServe, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCommunityProviderLicense {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licenseIdentifier: ").append(toIndentedString(licenseIdentifier)).append("\n");
    sb.append("    licensingOrganization: ").append(toIndentedString(licensingOrganization)).append("\n");
    sb.append("    communityProviderReference: ").append(toIndentedString(communityProviderReference)).append("\n");
    sb.append("    authorizedFacilityCapacity: ").append(toIndentedString(authorizedFacilityCapacity)).append("\n");
    sb.append("    licenseEffectiveDate: ").append(toIndentedString(licenseEffectiveDate)).append("\n");
    sb.append("    licenseExpirationDate: ").append(toIndentedString(licenseExpirationDate)).append("\n");
    sb.append("    licenseIssueDate: ").append(toIndentedString(licenseIssueDate)).append("\n");
    sb.append("    licenseStatusDescriptor: ").append(toIndentedString(licenseStatusDescriptor)).append("\n");
    sb.append("    licenseTypeDescriptor: ").append(toIndentedString(licenseTypeDescriptor)).append("\n");
    sb.append("    oldestAgeAuthorizedToServe: ").append(toIndentedString(oldestAgeAuthorizedToServe)).append("\n");
    sb.append("    youngestAgeAuthorizedToServe: ").append(toIndentedString(youngestAgeAuthorizedToServe)).append("\n");
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

