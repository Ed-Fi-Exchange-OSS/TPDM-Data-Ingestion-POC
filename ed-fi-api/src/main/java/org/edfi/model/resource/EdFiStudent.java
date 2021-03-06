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
import org.edfi.model.resource.EdFiStudentIdentificationDocument;
import org.edfi.model.resource.EdFiStudentOtherName;
import org.edfi.model.resource.EdFiStudentPersonalIdentificationDocument;
import org.edfi.model.resource.EdFiStudentVisa;
import org.joda.time.LocalDate;


/**
 * EdFiStudent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudent   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("studentUniqueId")
  private String studentUniqueId = null;

  @SerializedName("birthCity")
  private String birthCity = null;

  @SerializedName("birthCountryDescriptor")
  private String birthCountryDescriptor = null;

  @SerializedName("birthDate")
  private LocalDate birthDate = null;

  @SerializedName("birthInternationalProvince")
  private String birthInternationalProvince = null;

  @SerializedName("birthSexDescriptor")
  private String birthSexDescriptor = null;

  @SerializedName("birthStateAbbreviationDescriptor")
  private String birthStateAbbreviationDescriptor = null;

  @SerializedName("citizenshipStatusDescriptor")
  private String citizenshipStatusDescriptor = null;

  @SerializedName("dateEnteredUS")
  private LocalDate dateEnteredUS = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("generationCodeSuffix")
  private String generationCodeSuffix = null;

  @SerializedName("identificationDocuments")
  private List<EdFiStudentIdentificationDocument> identificationDocuments = new ArrayList<EdFiStudentIdentificationDocument>();

  @SerializedName("lastSurname")
  private String lastSurname = null;

  @SerializedName("maidenName")
  private String maidenName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("multipleBirthStatus")
  private Boolean multipleBirthStatus = null;

  @SerializedName("otherNames")
  private List<EdFiStudentOtherName> otherNames = new ArrayList<EdFiStudentOtherName>();

  @SerializedName("personalIdentificationDocuments")
  private List<EdFiStudentPersonalIdentificationDocument> personalIdentificationDocuments = new ArrayList<EdFiStudentPersonalIdentificationDocument>();

  @SerializedName("personalTitlePrefix")
  private String personalTitlePrefix = null;

  @SerializedName("visas")
  private List<EdFiStudentVisa> visas = new ArrayList<EdFiStudentVisa>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStudent id(String id) {
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

  public EdFiStudent studentUniqueId(String studentUniqueId) {
    this.studentUniqueId = studentUniqueId;
    return this;
  }

   /**
   * A unique alphanumeric code assigned to a student.
   * @return studentUniqueId
  **/
  @ApiModelProperty(example = "null", required = true, value = "A unique alphanumeric code assigned to a student.")
  public String getStudentUniqueId() {
    return studentUniqueId;
  }

  public void setStudentUniqueId(String studentUniqueId) {
    this.studentUniqueId = studentUniqueId;
  }

  public EdFiStudent birthCity(String birthCity) {
    this.birthCity = birthCity;
    return this;
  }

   /**
   * The city the student was born in.
   * @return birthCity
  **/
  @ApiModelProperty(example = "null", value = "The city the student was born in.")
  public String getBirthCity() {
    return birthCity;
  }

  public void setBirthCity(String birthCity) {
    this.birthCity = birthCity;
  }

  public EdFiStudent birthCountryDescriptor(String birthCountryDescriptor) {
    this.birthCountryDescriptor = birthCountryDescriptor;
    return this;
  }

   /**
   * The country in which an individual is born. It is strongly recommended that entries use only ISO 3166 2-letter country codes.
   * @return birthCountryDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The country in which an individual is born. It is strongly recommended that entries use only ISO 3166 2-letter country codes.")
  public String getBirthCountryDescriptor() {
    return birthCountryDescriptor;
  }

  public void setBirthCountryDescriptor(String birthCountryDescriptor) {
    this.birthCountryDescriptor = birthCountryDescriptor;
  }

  public EdFiStudent birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * The month, day, and year on which an individual was born.
   * @return birthDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The month, day, and year on which an individual was born.")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public EdFiStudent birthInternationalProvince(String birthInternationalProvince) {
    this.birthInternationalProvince = birthInternationalProvince;
    return this;
  }

   /**
   * For students born outside of the U.S., the Province or jurisdiction in which an individual is born.
   * @return birthInternationalProvince
  **/
  @ApiModelProperty(example = "null", value = "For students born outside of the U.S., the Province or jurisdiction in which an individual is born.")
  public String getBirthInternationalProvince() {
    return birthInternationalProvince;
  }

  public void setBirthInternationalProvince(String birthInternationalProvince) {
    this.birthInternationalProvince = birthInternationalProvince;
  }

  public EdFiStudent birthSexDescriptor(String birthSexDescriptor) {
    this.birthSexDescriptor = birthSexDescriptor;
    return this;
  }

   /**
   * A person's gender at birth.
   * @return birthSexDescriptor
  **/
  @ApiModelProperty(example = "null", value = "A person's gender at birth.")
  public String getBirthSexDescriptor() {
    return birthSexDescriptor;
  }

  public void setBirthSexDescriptor(String birthSexDescriptor) {
    this.birthSexDescriptor = birthSexDescriptor;
  }

  public EdFiStudent birthStateAbbreviationDescriptor(String birthStateAbbreviationDescriptor) {
    this.birthStateAbbreviationDescriptor = birthStateAbbreviationDescriptor;
    return this;
  }

   /**
   * The abbreviation for the name of the state (within the United States) or extra-state jurisdiction in which an individual was born.
   * @return birthStateAbbreviationDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The abbreviation for the name of the state (within the United States) or extra-state jurisdiction in which an individual was born.")
  public String getBirthStateAbbreviationDescriptor() {
    return birthStateAbbreviationDescriptor;
  }

  public void setBirthStateAbbreviationDescriptor(String birthStateAbbreviationDescriptor) {
    this.birthStateAbbreviationDescriptor = birthStateAbbreviationDescriptor;
  }

  public EdFiStudent citizenshipStatusDescriptor(String citizenshipStatusDescriptor) {
    this.citizenshipStatusDescriptor = citizenshipStatusDescriptor;
    return this;
  }

   /**
   * An indicator of whether or not the person is a U.S. citizen.
   * @return citizenshipStatusDescriptor
  **/
  @ApiModelProperty(example = "null", value = "An indicator of whether or not the person is a U.S. citizen.")
  public String getCitizenshipStatusDescriptor() {
    return citizenshipStatusDescriptor;
  }

  public void setCitizenshipStatusDescriptor(String citizenshipStatusDescriptor) {
    this.citizenshipStatusDescriptor = citizenshipStatusDescriptor;
  }

  public EdFiStudent dateEnteredUS(LocalDate dateEnteredUS) {
    this.dateEnteredUS = dateEnteredUS;
    return this;
  }

   /**
   * For students born outside of the U.S., the date the student entered the U.S.
   * @return dateEnteredUS
  **/
  @ApiModelProperty(example = "null", value = "For students born outside of the U.S., the date the student entered the U.S.")
  public LocalDate getDateEnteredUS() {
    return dateEnteredUS;
  }

  public void setDateEnteredUS(LocalDate dateEnteredUS) {
    this.dateEnteredUS = dateEnteredUS;
  }

  public EdFiStudent firstName(String firstName) {
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

  public EdFiStudent generationCodeSuffix(String generationCodeSuffix) {
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

  public EdFiStudent identificationDocuments(List<EdFiStudentIdentificationDocument> identificationDocuments) {
    this.identificationDocuments = identificationDocuments;
    return this;
  }

  public EdFiStudent addIdentificationDocumentsItem(EdFiStudentIdentificationDocument identificationDocumentsItem) {
    this.identificationDocuments.add(identificationDocumentsItem);
    return this;
  }

   /**
   * An unordered collection of studentIdentificationDocuments. Describe the documentation of citizenship.
   * @return identificationDocuments
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentIdentificationDocuments. Describe the documentation of citizenship.")
  public List<EdFiStudentIdentificationDocument> getIdentificationDocuments() {
    return identificationDocuments;
  }

  public void setIdentificationDocuments(List<EdFiStudentIdentificationDocument> identificationDocuments) {
    this.identificationDocuments = identificationDocuments;
  }

  public EdFiStudent lastSurname(String lastSurname) {
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

  public EdFiStudent maidenName(String maidenName) {
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

  public EdFiStudent middleName(String middleName) {
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

  public EdFiStudent multipleBirthStatus(Boolean multipleBirthStatus) {
    this.multipleBirthStatus = multipleBirthStatus;
    return this;
  }

   /**
   * Indicator of whether the student was born with other siblings (i.e., twins, triplets, etc.)
   * @return multipleBirthStatus
  **/
  @ApiModelProperty(example = "null", value = "Indicator of whether the student was born with other siblings (i.e., twins, triplets, etc.)")
  public Boolean getMultipleBirthStatus() {
    return multipleBirthStatus;
  }

  public void setMultipleBirthStatus(Boolean multipleBirthStatus) {
    this.multipleBirthStatus = multipleBirthStatus;
  }

  public EdFiStudent otherNames(List<EdFiStudentOtherName> otherNames) {
    this.otherNames = otherNames;
    return this;
  }

  public EdFiStudent addOtherNamesItem(EdFiStudentOtherName otherNamesItem) {
    this.otherNames.add(otherNamesItem);
    return this;
  }

   /**
   * An unordered collection of studentOtherNames. Other names (e.g., alias, nickname, previous legal name) associated with a person.
   * @return otherNames
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentOtherNames. Other names (e.g., alias, nickname, previous legal name) associated with a person.")
  public List<EdFiStudentOtherName> getOtherNames() {
    return otherNames;
  }

  public void setOtherNames(List<EdFiStudentOtherName> otherNames) {
    this.otherNames = otherNames;
  }

  public EdFiStudent personalIdentificationDocuments(List<EdFiStudentPersonalIdentificationDocument> personalIdentificationDocuments) {
    this.personalIdentificationDocuments = personalIdentificationDocuments;
    return this;
  }

  public EdFiStudent addPersonalIdentificationDocumentsItem(EdFiStudentPersonalIdentificationDocument personalIdentificationDocumentsItem) {
    this.personalIdentificationDocuments.add(personalIdentificationDocumentsItem);
    return this;
  }

   /**
   * An unordered collection of studentPersonalIdentificationDocuments. The documents presented as evident to verify one's personal identity; for example: drivers license, passport, birth certificate, etc.
   * @return personalIdentificationDocuments
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentPersonalIdentificationDocuments. The documents presented as evident to verify one's personal identity; for example: drivers license, passport, birth certificate, etc.")
  public List<EdFiStudentPersonalIdentificationDocument> getPersonalIdentificationDocuments() {
    return personalIdentificationDocuments;
  }

  public void setPersonalIdentificationDocuments(List<EdFiStudentPersonalIdentificationDocument> personalIdentificationDocuments) {
    this.personalIdentificationDocuments = personalIdentificationDocuments;
  }

  public EdFiStudent personalTitlePrefix(String personalTitlePrefix) {
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

  public EdFiStudent visas(List<EdFiStudentVisa> visas) {
    this.visas = visas;
    return this;
  }

  public EdFiStudent addVisasItem(EdFiStudentVisa visasItem) {
    this.visas.add(visasItem);
    return this;
  }

   /**
   * An unordered collection of studentVisas. An indicator of a non-US citizen's Visa type.
   * @return visas
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentVisas. An indicator of a non-US citizen's Visa type.")
  public List<EdFiStudentVisa> getVisas() {
    return visas;
  }

  public void setVisas(List<EdFiStudentVisa> visas) {
    this.visas = visas;
  }

  public EdFiStudent etag(String etag) {
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
    EdFiStudent edFiStudent = (EdFiStudent) o;
    return Objects.equals(this.id, edFiStudent.id) &&
        Objects.equals(this.studentUniqueId, edFiStudent.studentUniqueId) &&
        Objects.equals(this.birthCity, edFiStudent.birthCity) &&
        Objects.equals(this.birthCountryDescriptor, edFiStudent.birthCountryDescriptor) &&
        Objects.equals(this.birthDate, edFiStudent.birthDate) &&
        Objects.equals(this.birthInternationalProvince, edFiStudent.birthInternationalProvince) &&
        Objects.equals(this.birthSexDescriptor, edFiStudent.birthSexDescriptor) &&
        Objects.equals(this.birthStateAbbreviationDescriptor, edFiStudent.birthStateAbbreviationDescriptor) &&
        Objects.equals(this.citizenshipStatusDescriptor, edFiStudent.citizenshipStatusDescriptor) &&
        Objects.equals(this.dateEnteredUS, edFiStudent.dateEnteredUS) &&
        Objects.equals(this.firstName, edFiStudent.firstName) &&
        Objects.equals(this.generationCodeSuffix, edFiStudent.generationCodeSuffix) &&
        Objects.equals(this.identificationDocuments, edFiStudent.identificationDocuments) &&
        Objects.equals(this.lastSurname, edFiStudent.lastSurname) &&
        Objects.equals(this.maidenName, edFiStudent.maidenName) &&
        Objects.equals(this.middleName, edFiStudent.middleName) &&
        Objects.equals(this.multipleBirthStatus, edFiStudent.multipleBirthStatus) &&
        Objects.equals(this.otherNames, edFiStudent.otherNames) &&
        Objects.equals(this.personalIdentificationDocuments, edFiStudent.personalIdentificationDocuments) &&
        Objects.equals(this.personalTitlePrefix, edFiStudent.personalTitlePrefix) &&
        Objects.equals(this.visas, edFiStudent.visas) &&
        Objects.equals(this.etag, edFiStudent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentUniqueId, birthCity, birthCountryDescriptor, birthDate, birthInternationalProvince, birthSexDescriptor, birthStateAbbreviationDescriptor, citizenshipStatusDescriptor, dateEnteredUS, firstName, generationCodeSuffix, identificationDocuments, lastSurname, maidenName, middleName, multipleBirthStatus, otherNames, personalIdentificationDocuments, personalTitlePrefix, visas, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentUniqueId: ").append(toIndentedString(studentUniqueId)).append("\n");
    sb.append("    birthCity: ").append(toIndentedString(birthCity)).append("\n");
    sb.append("    birthCountryDescriptor: ").append(toIndentedString(birthCountryDescriptor)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthInternationalProvince: ").append(toIndentedString(birthInternationalProvince)).append("\n");
    sb.append("    birthSexDescriptor: ").append(toIndentedString(birthSexDescriptor)).append("\n");
    sb.append("    birthStateAbbreviationDescriptor: ").append(toIndentedString(birthStateAbbreviationDescriptor)).append("\n");
    sb.append("    citizenshipStatusDescriptor: ").append(toIndentedString(citizenshipStatusDescriptor)).append("\n");
    sb.append("    dateEnteredUS: ").append(toIndentedString(dateEnteredUS)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    generationCodeSuffix: ").append(toIndentedString(generationCodeSuffix)).append("\n");
    sb.append("    identificationDocuments: ").append(toIndentedString(identificationDocuments)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    multipleBirthStatus: ").append(toIndentedString(multipleBirthStatus)).append("\n");
    sb.append("    otherNames: ").append(toIndentedString(otherNames)).append("\n");
    sb.append("    personalIdentificationDocuments: ").append(toIndentedString(personalIdentificationDocuments)).append("\n");
    sb.append("    personalTitlePrefix: ").append(toIndentedString(personalTitlePrefix)).append("\n");
    sb.append("    visas: ").append(toIndentedString(visas)).append("\n");
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

