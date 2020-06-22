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
import org.edfi.model.resource.CommunityProviderExtensions;
import org.edfi.model.resource.EdFiCommunityOrganizationReference;
import org.edfi.model.resource.EdFiEducationOrganizationAddress;
import org.edfi.model.resource.EdFiEducationOrganizationCategory;
import org.edfi.model.resource.EdFiEducationOrganizationIdentificationCode;
import org.edfi.model.resource.EdFiEducationOrganizationInstitutionTelephone;
import org.edfi.model.resource.EdFiEducationOrganizationInternationalAddress;


/**
 * EdFiCommunityProvider
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiCommunityProvider   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("addresses")
  private List<EdFiEducationOrganizationAddress> addresses = new ArrayList<EdFiEducationOrganizationAddress>();

  @SerializedName("categories")
  private List<EdFiEducationOrganizationCategory> categories = new ArrayList<EdFiEducationOrganizationCategory>();

  @SerializedName("communityProviderId")
  private Integer communityProviderId = null;

  @SerializedName("communityOrganizationReference")
  private EdFiCommunityOrganizationReference communityOrganizationReference = null;

  @SerializedName("identificationCodes")
  private List<EdFiEducationOrganizationIdentificationCode> identificationCodes = new ArrayList<EdFiEducationOrganizationIdentificationCode>();

  @SerializedName("institutionTelephones")
  private List<EdFiEducationOrganizationInstitutionTelephone> institutionTelephones = new ArrayList<EdFiEducationOrganizationInstitutionTelephone>();

  @SerializedName("internationalAddresses")
  private List<EdFiEducationOrganizationInternationalAddress> internationalAddresses = new ArrayList<EdFiEducationOrganizationInternationalAddress>();

  @SerializedName("licenseExemptIndicator")
  private Boolean licenseExemptIndicator = null;

  @SerializedName("nameOfInstitution")
  private String nameOfInstitution = null;

  @SerializedName("operationalStatusDescriptor")
  private String operationalStatusDescriptor = null;

  @SerializedName("providerCategoryDescriptor")
  private String providerCategoryDescriptor = null;

  @SerializedName("providerProfitabilityDescriptor")
  private String providerProfitabilityDescriptor = null;

  @SerializedName("providerStatusDescriptor")
  private String providerStatusDescriptor = null;

  @SerializedName("schoolIndicator")
  private Boolean schoolIndicator = null;

  @SerializedName("shortNameOfInstitution")
  private String shortNameOfInstitution = null;

  @SerializedName("webSite")
  private String webSite = null;

  @SerializedName("_etag")
  private String etag = null;

  @SerializedName("_ext")
  private CommunityProviderExtensions ext = null;

  public EdFiCommunityProvider id(String id) {
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

  public EdFiCommunityProvider addresses(List<EdFiEducationOrganizationAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public EdFiCommunityProvider addAddressesItem(EdFiEducationOrganizationAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * An unordered collection of educationOrganizationAddresses. The set of elements that describes the physical location of the education entity, including the street address, city, state, ZIP code, and ZIP code + 4.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", required = true, value = "An unordered collection of educationOrganizationAddresses. The set of elements that describes the physical location of the education entity, including the street address, city, state, ZIP code, and ZIP code + 4.")
  public List<EdFiEducationOrganizationAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<EdFiEducationOrganizationAddress> addresses) {
    this.addresses = addresses;
  }

  public EdFiCommunityProvider categories(List<EdFiEducationOrganizationCategory> categories) {
    this.categories = categories;
    return this;
  }

  public EdFiCommunityProvider addCategoriesItem(EdFiEducationOrganizationCategory categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * An unordered collection of educationOrganizationCategories. The classification of the education agency within the geographic boundaries of a state according to the level of administrative and operational control granted by the state.
   * @return categories
  **/
  @ApiModelProperty(example = "null", required = true, value = "An unordered collection of educationOrganizationCategories. The classification of the education agency within the geographic boundaries of a state according to the level of administrative and operational control granted by the state.")
  public List<EdFiEducationOrganizationCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<EdFiEducationOrganizationCategory> categories) {
    this.categories = categories;
  }

  public EdFiCommunityProvider communityProviderId(Integer communityProviderId) {
    this.communityProviderId = communityProviderId;
    return this;
  }

   /**
   * The identifier assigned to a CommunityProvider.
   * @return communityProviderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier assigned to a CommunityProvider.")
  public Integer getCommunityProviderId() {
    return communityProviderId;
  }

  public void setCommunityProviderId(Integer communityProviderId) {
    this.communityProviderId = communityProviderId;
  }

  public EdFiCommunityProvider communityOrganizationReference(EdFiCommunityOrganizationReference communityOrganizationReference) {
    this.communityOrganizationReference = communityOrganizationReference;
    return this;
  }

   /**
   * Get communityOrganizationReference
   * @return communityOrganizationReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiCommunityOrganizationReference getCommunityOrganizationReference() {
    return communityOrganizationReference;
  }

  public void setCommunityOrganizationReference(EdFiCommunityOrganizationReference communityOrganizationReference) {
    this.communityOrganizationReference = communityOrganizationReference;
  }

  public EdFiCommunityProvider identificationCodes(List<EdFiEducationOrganizationIdentificationCode> identificationCodes) {
    this.identificationCodes = identificationCodes;
    return this;
  }

  public EdFiCommunityProvider addIdentificationCodesItem(EdFiEducationOrganizationIdentificationCode identificationCodesItem) {
    this.identificationCodes.add(identificationCodesItem);
    return this;
  }

   /**
   * An unordered collection of educationOrganizationIdentificationCodes. A unique number or alphanumeric code assigned to an education organization by a school, school system, a state, or other agency or entity.
   * @return identificationCodes
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of educationOrganizationIdentificationCodes. A unique number or alphanumeric code assigned to an education organization by a school, school system, a state, or other agency or entity.")
  public List<EdFiEducationOrganizationIdentificationCode> getIdentificationCodes() {
    return identificationCodes;
  }

  public void setIdentificationCodes(List<EdFiEducationOrganizationIdentificationCode> identificationCodes) {
    this.identificationCodes = identificationCodes;
  }

  public EdFiCommunityProvider institutionTelephones(List<EdFiEducationOrganizationInstitutionTelephone> institutionTelephones) {
    this.institutionTelephones = institutionTelephones;
    return this;
  }

  public EdFiCommunityProvider addInstitutionTelephonesItem(EdFiEducationOrganizationInstitutionTelephone institutionTelephonesItem) {
    this.institutionTelephones.add(institutionTelephonesItem);
    return this;
  }

   /**
   * An unordered collection of educationOrganizationInstitutionTelephones. The 10-digit telephone number, including the area code, for the education entity.
   * @return institutionTelephones
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of educationOrganizationInstitutionTelephones. The 10-digit telephone number, including the area code, for the education entity.")
  public List<EdFiEducationOrganizationInstitutionTelephone> getInstitutionTelephones() {
    return institutionTelephones;
  }

  public void setInstitutionTelephones(List<EdFiEducationOrganizationInstitutionTelephone> institutionTelephones) {
    this.institutionTelephones = institutionTelephones;
  }

  public EdFiCommunityProvider internationalAddresses(List<EdFiEducationOrganizationInternationalAddress> internationalAddresses) {
    this.internationalAddresses = internationalAddresses;
    return this;
  }

  public EdFiCommunityProvider addInternationalAddressesItem(EdFiEducationOrganizationInternationalAddress internationalAddressesItem) {
    this.internationalAddresses.add(internationalAddressesItem);
    return this;
  }

   /**
   * An unordered collection of educationOrganizationInternationalAddresses. The set of elements that describes the international physical location of the education entity.
   * @return internationalAddresses
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of educationOrganizationInternationalAddresses. The set of elements that describes the international physical location of the education entity.")
  public List<EdFiEducationOrganizationInternationalAddress> getInternationalAddresses() {
    return internationalAddresses;
  }

  public void setInternationalAddresses(List<EdFiEducationOrganizationInternationalAddress> internationalAddresses) {
    this.internationalAddresses = internationalAddresses;
  }

  public EdFiCommunityProvider licenseExemptIndicator(Boolean licenseExemptIndicator) {
    this.licenseExemptIndicator = licenseExemptIndicator;
    return this;
  }

   /**
   * An indication of whether the provider is exempt from having a license.
   * @return licenseExemptIndicator
  **/
  @ApiModelProperty(example = "null", value = "An indication of whether the provider is exempt from having a license.")
  public Boolean getLicenseExemptIndicator() {
    return licenseExemptIndicator;
  }

  public void setLicenseExemptIndicator(Boolean licenseExemptIndicator) {
    this.licenseExemptIndicator = licenseExemptIndicator;
  }

  public EdFiCommunityProvider nameOfInstitution(String nameOfInstitution) {
    this.nameOfInstitution = nameOfInstitution;
    return this;
  }

   /**
   * The full, legally accepted name of the institution.
   * @return nameOfInstitution
  **/
  @ApiModelProperty(example = "null", required = true, value = "The full, legally accepted name of the institution.")
  public String getNameOfInstitution() {
    return nameOfInstitution;
  }

  public void setNameOfInstitution(String nameOfInstitution) {
    this.nameOfInstitution = nameOfInstitution;
  }

  public EdFiCommunityProvider operationalStatusDescriptor(String operationalStatusDescriptor) {
    this.operationalStatusDescriptor = operationalStatusDescriptor;
    return this;
  }

   /**
   * The current operational status of the EducationOrganization (e.g., active, inactive).
   * @return operationalStatusDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The current operational status of the EducationOrganization (e.g., active, inactive).")
  public String getOperationalStatusDescriptor() {
    return operationalStatusDescriptor;
  }

  public void setOperationalStatusDescriptor(String operationalStatusDescriptor) {
    this.operationalStatusDescriptor = operationalStatusDescriptor;
  }

  public EdFiCommunityProvider providerCategoryDescriptor(String providerCategoryDescriptor) {
    this.providerCategoryDescriptor = providerCategoryDescriptor;
    return this;
  }

   /**
   * Indicates the category of the provider.
   * @return providerCategoryDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "Indicates the category of the provider.")
  public String getProviderCategoryDescriptor() {
    return providerCategoryDescriptor;
  }

  public void setProviderCategoryDescriptor(String providerCategoryDescriptor) {
    this.providerCategoryDescriptor = providerCategoryDescriptor;
  }

  public EdFiCommunityProvider providerProfitabilityDescriptor(String providerProfitabilityDescriptor) {
    this.providerProfitabilityDescriptor = providerProfitabilityDescriptor;
    return this;
  }

   /**
   * Indicates the profitability status of the provider.
   * @return providerProfitabilityDescriptor
  **/
  @ApiModelProperty(example = "null", value = "Indicates the profitability status of the provider.")
  public String getProviderProfitabilityDescriptor() {
    return providerProfitabilityDescriptor;
  }

  public void setProviderProfitabilityDescriptor(String providerProfitabilityDescriptor) {
    this.providerProfitabilityDescriptor = providerProfitabilityDescriptor;
  }

  public EdFiCommunityProvider providerStatusDescriptor(String providerStatusDescriptor) {
    this.providerStatusDescriptor = providerStatusDescriptor;
    return this;
  }

   /**
   * Indicates the status of the provider.
   * @return providerStatusDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "Indicates the status of the provider.")
  public String getProviderStatusDescriptor() {
    return providerStatusDescriptor;
  }

  public void setProviderStatusDescriptor(String providerStatusDescriptor) {
    this.providerStatusDescriptor = providerStatusDescriptor;
  }

  public EdFiCommunityProvider schoolIndicator(Boolean schoolIndicator) {
    this.schoolIndicator = schoolIndicator;
    return this;
  }

   /**
   * An indication of whether the community provider is a school.
   * @return schoolIndicator
  **/
  @ApiModelProperty(example = "null", value = "An indication of whether the community provider is a school.")
  public Boolean getSchoolIndicator() {
    return schoolIndicator;
  }

  public void setSchoolIndicator(Boolean schoolIndicator) {
    this.schoolIndicator = schoolIndicator;
  }

  public EdFiCommunityProvider shortNameOfInstitution(String shortNameOfInstitution) {
    this.shortNameOfInstitution = shortNameOfInstitution;
    return this;
  }

   /**
   * A short name for the institution.
   * @return shortNameOfInstitution
  **/
  @ApiModelProperty(example = "null", value = "A short name for the institution.")
  public String getShortNameOfInstitution() {
    return shortNameOfInstitution;
  }

  public void setShortNameOfInstitution(String shortNameOfInstitution) {
    this.shortNameOfInstitution = shortNameOfInstitution;
  }

  public EdFiCommunityProvider webSite(String webSite) {
    this.webSite = webSite;
    return this;
  }

   /**
   * The public web site address (URL) for the EducationOrganization.
   * @return webSite
  **/
  @ApiModelProperty(example = "null", value = "The public web site address (URL) for the EducationOrganization.")
  public String getWebSite() {
    return webSite;
  }

  public void setWebSite(String webSite) {
    this.webSite = webSite;
  }

  public EdFiCommunityProvider etag(String etag) {
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

  public EdFiCommunityProvider ext(CommunityProviderExtensions ext) {
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommunityProviderExtensions getExt() {
    return ext;
  }

  public void setExt(CommunityProviderExtensions ext) {
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
    EdFiCommunityProvider edFiCommunityProvider = (EdFiCommunityProvider) o;
    return Objects.equals(this.id, edFiCommunityProvider.id) &&
        Objects.equals(this.addresses, edFiCommunityProvider.addresses) &&
        Objects.equals(this.categories, edFiCommunityProvider.categories) &&
        Objects.equals(this.communityProviderId, edFiCommunityProvider.communityProviderId) &&
        Objects.equals(this.communityOrganizationReference, edFiCommunityProvider.communityOrganizationReference) &&
        Objects.equals(this.identificationCodes, edFiCommunityProvider.identificationCodes) &&
        Objects.equals(this.institutionTelephones, edFiCommunityProvider.institutionTelephones) &&
        Objects.equals(this.internationalAddresses, edFiCommunityProvider.internationalAddresses) &&
        Objects.equals(this.licenseExemptIndicator, edFiCommunityProvider.licenseExemptIndicator) &&
        Objects.equals(this.nameOfInstitution, edFiCommunityProvider.nameOfInstitution) &&
        Objects.equals(this.operationalStatusDescriptor, edFiCommunityProvider.operationalStatusDescriptor) &&
        Objects.equals(this.providerCategoryDescriptor, edFiCommunityProvider.providerCategoryDescriptor) &&
        Objects.equals(this.providerProfitabilityDescriptor, edFiCommunityProvider.providerProfitabilityDescriptor) &&
        Objects.equals(this.providerStatusDescriptor, edFiCommunityProvider.providerStatusDescriptor) &&
        Objects.equals(this.schoolIndicator, edFiCommunityProvider.schoolIndicator) &&
        Objects.equals(this.shortNameOfInstitution, edFiCommunityProvider.shortNameOfInstitution) &&
        Objects.equals(this.webSite, edFiCommunityProvider.webSite) &&
        Objects.equals(this.etag, edFiCommunityProvider.etag) &&
        Objects.equals(this.ext, edFiCommunityProvider.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addresses, categories, communityProviderId, communityOrganizationReference, identificationCodes, institutionTelephones, internationalAddresses, licenseExemptIndicator, nameOfInstitution, operationalStatusDescriptor, providerCategoryDescriptor, providerProfitabilityDescriptor, providerStatusDescriptor, schoolIndicator, shortNameOfInstitution, webSite, etag, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCommunityProvider {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    communityProviderId: ").append(toIndentedString(communityProviderId)).append("\n");
    sb.append("    communityOrganizationReference: ").append(toIndentedString(communityOrganizationReference)).append("\n");
    sb.append("    identificationCodes: ").append(toIndentedString(identificationCodes)).append("\n");
    sb.append("    institutionTelephones: ").append(toIndentedString(institutionTelephones)).append("\n");
    sb.append("    internationalAddresses: ").append(toIndentedString(internationalAddresses)).append("\n");
    sb.append("    licenseExemptIndicator: ").append(toIndentedString(licenseExemptIndicator)).append("\n");
    sb.append("    nameOfInstitution: ").append(toIndentedString(nameOfInstitution)).append("\n");
    sb.append("    operationalStatusDescriptor: ").append(toIndentedString(operationalStatusDescriptor)).append("\n");
    sb.append("    providerCategoryDescriptor: ").append(toIndentedString(providerCategoryDescriptor)).append("\n");
    sb.append("    providerProfitabilityDescriptor: ").append(toIndentedString(providerProfitabilityDescriptor)).append("\n");
    sb.append("    providerStatusDescriptor: ").append(toIndentedString(providerStatusDescriptor)).append("\n");
    sb.append("    schoolIndicator: ").append(toIndentedString(schoolIndicator)).append("\n");
    sb.append("    shortNameOfInstitution: ").append(toIndentedString(shortNameOfInstitution)).append("\n");
    sb.append("    webSite: ").append(toIndentedString(webSite)).append("\n");
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

