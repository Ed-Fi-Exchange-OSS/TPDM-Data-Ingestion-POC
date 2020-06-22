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
import org.edfi.model.resource.EdFiParentAddress;
import org.edfi.model.resource.EdFiParentElectronicMail;
import org.edfi.model.resource.EdFiParentInternationalAddress;
import org.edfi.model.resource.EdFiParentLanguage;
import org.edfi.model.resource.EdFiParentOtherName;
import org.edfi.model.resource.EdFiParentPersonalIdentificationDocument;
import org.edfi.model.resource.EdFiParentTelephone;


/**
 * EdFiParent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiParent   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentUniqueId")
  private String parentUniqueId = null;

  @SerializedName("addresses")
  private List<EdFiParentAddress> addresses = new ArrayList<EdFiParentAddress>();

  @SerializedName("electronicMails")
  private List<EdFiParentElectronicMail> electronicMails = new ArrayList<EdFiParentElectronicMail>();

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("generationCodeSuffix")
  private String generationCodeSuffix = null;

  @SerializedName("internationalAddresses")
  private List<EdFiParentInternationalAddress> internationalAddresses = new ArrayList<EdFiParentInternationalAddress>();

  @SerializedName("languages")
  private List<EdFiParentLanguage> languages = new ArrayList<EdFiParentLanguage>();

  @SerializedName("lastSurname")
  private String lastSurname = null;

  @SerializedName("loginId")
  private String loginId = null;

  @SerializedName("maidenName")
  private String maidenName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("otherNames")
  private List<EdFiParentOtherName> otherNames = new ArrayList<EdFiParentOtherName>();

  @SerializedName("personalIdentificationDocuments")
  private List<EdFiParentPersonalIdentificationDocument> personalIdentificationDocuments = new ArrayList<EdFiParentPersonalIdentificationDocument>();

  @SerializedName("personalTitlePrefix")
  private String personalTitlePrefix = null;

  @SerializedName("sexDescriptor")
  private String sexDescriptor = null;

  @SerializedName("telephones")
  private List<EdFiParentTelephone> telephones = new ArrayList<EdFiParentTelephone>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiParent id(String id) {
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

  public EdFiParent parentUniqueId(String parentUniqueId) {
    this.parentUniqueId = parentUniqueId;
    return this;
  }

   /**
   * A unique alphanumeric code assigned to a parent.
   * @return parentUniqueId
  **/
  @ApiModelProperty(example = "null", required = true, value = "A unique alphanumeric code assigned to a parent.")
  public String getParentUniqueId() {
    return parentUniqueId;
  }

  public void setParentUniqueId(String parentUniqueId) {
    this.parentUniqueId = parentUniqueId;
  }

  public EdFiParent addresses(List<EdFiParentAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public EdFiParent addAddressesItem(EdFiParentAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * An unordered collection of parentAddresses. Parent's address, if different from the student address.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of parentAddresses. Parent's address, if different from the student address.")
  public List<EdFiParentAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<EdFiParentAddress> addresses) {
    this.addresses = addresses;
  }

  public EdFiParent electronicMails(List<EdFiParentElectronicMail> electronicMails) {
    this.electronicMails = electronicMails;
    return this;
  }

  public EdFiParent addElectronicMailsItem(EdFiParentElectronicMail electronicMailsItem) {
    this.electronicMails.add(electronicMailsItem);
    return this;
  }

   /**
   * An unordered collection of parentElectronicMails. The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the individual or organization belongs.
   * @return electronicMails
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of parentElectronicMails. The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the individual or organization belongs.")
  public List<EdFiParentElectronicMail> getElectronicMails() {
    return electronicMails;
  }

  public void setElectronicMails(List<EdFiParentElectronicMail> electronicMails) {
    this.electronicMails = electronicMails;
  }

  public EdFiParent firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * A name given to an individual at birth, baptism, or during another naming ceremony, or through legal change.
   * @return firstName
  **/
  @ApiModelProperty(example = "null", required = true, value = "A name given to an individual at birth, baptism, or during another naming ceremony, or through legal change.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public EdFiParent generationCodeSuffix(String generationCodeSuffix) {
    this.generationCodeSuffix = generationCodeSuffix;
    return this;
  }

   /**
   * An appendage, if any, used to denote an individual's generation in his family (e.g., Jr., Sr., III).
   * @return generationCodeSuffix
  **/
  @ApiModelProperty(example = "null", value = "An appendage, if any, used to denote an individual's generation in his family (e.g., Jr., Sr., III).")
  public String getGenerationCodeSuffix() {
    return generationCodeSuffix;
  }

  public void setGenerationCodeSuffix(String generationCodeSuffix) {
    this.generationCodeSuffix = generationCodeSuffix;
  }

  public EdFiParent internationalAddresses(List<EdFiParentInternationalAddress> internationalAddresses) {
    this.internationalAddresses = internationalAddresses;
    return this;
  }

  public EdFiParent addInternationalAddressesItem(EdFiParentInternationalAddress internationalAddressesItem) {
    this.internationalAddresses.add(internationalAddressesItem);
    return this;
  }

   /**
   * An unordered collection of parentInternationalAddresses. The set of elements that describes an international address.
   * @return internationalAddresses
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of parentInternationalAddresses. The set of elements that describes an international address.")
  public List<EdFiParentInternationalAddress> getInternationalAddresses() {
    return internationalAddresses;
  }

  public void setInternationalAddresses(List<EdFiParentInternationalAddress> internationalAddresses) {
    this.internationalAddresses = internationalAddresses;
  }

  public EdFiParent languages(List<EdFiParentLanguage> languages) {
    this.languages = languages;
    return this;
  }

  public EdFiParent addLanguagesItem(EdFiParentLanguage languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * An unordered collection of parentLanguages. The language(s) the individual uses to communicate. It is strongly recommended that entries use only ISO 639-2 language codes.
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of parentLanguages. The language(s) the individual uses to communicate. It is strongly recommended that entries use only ISO 639-2 language codes.")
  public List<EdFiParentLanguage> getLanguages() {
    return languages;
  }

  public void setLanguages(List<EdFiParentLanguage> languages) {
    this.languages = languages;
  }

  public EdFiParent lastSurname(String lastSurname) {
    this.lastSurname = lastSurname;
    return this;
  }

   /**
   * The name borne in common by members of a family.
   * @return lastSurname
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name borne in common by members of a family.")
  public String getLastSurname() {
    return lastSurname;
  }

  public void setLastSurname(String lastSurname) {
    this.lastSurname = lastSurname;
  }

  public EdFiParent loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

   /**
   * The login ID for the user; used for security access control interface.
   * @return loginId
  **/
  @ApiModelProperty(example = "null", value = "The login ID for the user; used for security access control interface.")
  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public EdFiParent maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

   /**
   * The person's maiden name.
   * @return maidenName
  **/
  @ApiModelProperty(example = "null", value = "The person's maiden name.")
  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  public EdFiParent middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * A secondary name given to an individual at birth, baptism, or during another naming ceremony.
   * @return middleName
  **/
  @ApiModelProperty(example = "null", value = "A secondary name given to an individual at birth, baptism, or during another naming ceremony.")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public EdFiParent otherNames(List<EdFiParentOtherName> otherNames) {
    this.otherNames = otherNames;
    return this;
  }

  public EdFiParent addOtherNamesItem(EdFiParentOtherName otherNamesItem) {
    this.otherNames.add(otherNamesItem);
    return this;
  }

   /**
   * An unordered collection of parentOtherNames. Other names (e.g., alias, nickname, previous legal name) associated with a person.
   * @return otherNames
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of parentOtherNames. Other names (e.g., alias, nickname, previous legal name) associated with a person.")
  public List<EdFiParentOtherName> getOtherNames() {
    return otherNames;
  }

  public void setOtherNames(List<EdFiParentOtherName> otherNames) {
    this.otherNames = otherNames;
  }

  public EdFiParent personalIdentificationDocuments(List<EdFiParentPersonalIdentificationDocument> personalIdentificationDocuments) {
    this.personalIdentificationDocuments = personalIdentificationDocuments;
    return this;
  }

  public EdFiParent addPersonalIdentificationDocumentsItem(EdFiParentPersonalIdentificationDocument personalIdentificationDocumentsItem) {
    this.personalIdentificationDocuments.add(personalIdentificationDocumentsItem);
    return this;
  }

   /**
   * An unordered collection of parentPersonalIdentificationDocuments. The documents presented as evident to verify one's personal identity; for example: drivers license, passport, birth certificate, etc.
   * @return personalIdentificationDocuments
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of parentPersonalIdentificationDocuments. The documents presented as evident to verify one's personal identity; for example: drivers license, passport, birth certificate, etc.")
  public List<EdFiParentPersonalIdentificationDocument> getPersonalIdentificationDocuments() {
    return personalIdentificationDocuments;
  }

  public void setPersonalIdentificationDocuments(List<EdFiParentPersonalIdentificationDocument> personalIdentificationDocuments) {
    this.personalIdentificationDocuments = personalIdentificationDocuments;
  }

  public EdFiParent personalTitlePrefix(String personalTitlePrefix) {
    this.personalTitlePrefix = personalTitlePrefix;
    return this;
  }

   /**
   * A prefix used to denote the title, degree, position, or seniority of the person.
   * @return personalTitlePrefix
  **/
  @ApiModelProperty(example = "null", value = "A prefix used to denote the title, degree, position, or seniority of the person.")
  public String getPersonalTitlePrefix() {
    return personalTitlePrefix;
  }

  public void setPersonalTitlePrefix(String personalTitlePrefix) {
    this.personalTitlePrefix = personalTitlePrefix;
  }

  public EdFiParent sexDescriptor(String sexDescriptor) {
    this.sexDescriptor = sexDescriptor;
    return this;
  }

   /**
   * A person's gender.
   * @return sexDescriptor
  **/
  @ApiModelProperty(example = "null", value = "A person's gender.")
  public String getSexDescriptor() {
    return sexDescriptor;
  }

  public void setSexDescriptor(String sexDescriptor) {
    this.sexDescriptor = sexDescriptor;
  }

  public EdFiParent telephones(List<EdFiParentTelephone> telephones) {
    this.telephones = telephones;
    return this;
  }

  public EdFiParent addTelephonesItem(EdFiParentTelephone telephonesItem) {
    this.telephones.add(telephonesItem);
    return this;
  }

   /**
   * An unordered collection of parentTelephones. The 10-digit telephone number, including the area code, for the person.
   * @return telephones
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of parentTelephones. The 10-digit telephone number, including the area code, for the person.")
  public List<EdFiParentTelephone> getTelephones() {
    return telephones;
  }

  public void setTelephones(List<EdFiParentTelephone> telephones) {
    this.telephones = telephones;
  }

  public EdFiParent etag(String etag) {
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
    EdFiParent edFiParent = (EdFiParent) o;
    return Objects.equals(this.id, edFiParent.id) &&
        Objects.equals(this.parentUniqueId, edFiParent.parentUniqueId) &&
        Objects.equals(this.addresses, edFiParent.addresses) &&
        Objects.equals(this.electronicMails, edFiParent.electronicMails) &&
        Objects.equals(this.firstName, edFiParent.firstName) &&
        Objects.equals(this.generationCodeSuffix, edFiParent.generationCodeSuffix) &&
        Objects.equals(this.internationalAddresses, edFiParent.internationalAddresses) &&
        Objects.equals(this.languages, edFiParent.languages) &&
        Objects.equals(this.lastSurname, edFiParent.lastSurname) &&
        Objects.equals(this.loginId, edFiParent.loginId) &&
        Objects.equals(this.maidenName, edFiParent.maidenName) &&
        Objects.equals(this.middleName, edFiParent.middleName) &&
        Objects.equals(this.otherNames, edFiParent.otherNames) &&
        Objects.equals(this.personalIdentificationDocuments, edFiParent.personalIdentificationDocuments) &&
        Objects.equals(this.personalTitlePrefix, edFiParent.personalTitlePrefix) &&
        Objects.equals(this.sexDescriptor, edFiParent.sexDescriptor) &&
        Objects.equals(this.telephones, edFiParent.telephones) &&
        Objects.equals(this.etag, edFiParent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentUniqueId, addresses, electronicMails, firstName, generationCodeSuffix, internationalAddresses, languages, lastSurname, loginId, maidenName, middleName, otherNames, personalIdentificationDocuments, personalTitlePrefix, sexDescriptor, telephones, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiParent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentUniqueId: ").append(toIndentedString(parentUniqueId)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    electronicMails: ").append(toIndentedString(electronicMails)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    generationCodeSuffix: ").append(toIndentedString(generationCodeSuffix)).append("\n");
    sb.append("    internationalAddresses: ").append(toIndentedString(internationalAddresses)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    otherNames: ").append(toIndentedString(otherNames)).append("\n");
    sb.append("    personalIdentificationDocuments: ").append(toIndentedString(personalIdentificationDocuments)).append("\n");
    sb.append("    personalTitlePrefix: ").append(toIndentedString(personalTitlePrefix)).append("\n");
    sb.append("    sexDescriptor: ").append(toIndentedString(sexDescriptor)).append("\n");
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

