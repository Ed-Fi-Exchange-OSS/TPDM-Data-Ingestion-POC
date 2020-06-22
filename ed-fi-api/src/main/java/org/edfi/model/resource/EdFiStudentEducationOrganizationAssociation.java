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
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationAddress;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationCohortYear;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationDisability;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationElectronicMail;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationInternationalAddress;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationLanguage;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationProgramParticipation;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationRace;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationStudentCharacteristic;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationStudentIdentificationCode;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationStudentIndicator;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationTelephone;
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationTribalAffiliation;
import org.edfi.model.resource.EdFiStudentReference;


/**
 * EdFiStudentEducationOrganizationAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentEducationOrganizationAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("educationOrganizationReference")
  private EdFiEducationOrganizationReference educationOrganizationReference = null;

  @SerializedName("studentReference")
  private EdFiStudentReference studentReference = null;

  @SerializedName("addresses")
  private List<EdFiStudentEducationOrganizationAssociationAddress> addresses = new ArrayList<EdFiStudentEducationOrganizationAssociationAddress>();

  @SerializedName("cohortYears")
  private List<EdFiStudentEducationOrganizationAssociationCohortYear> cohortYears = new ArrayList<EdFiStudentEducationOrganizationAssociationCohortYear>();

  @SerializedName("disabilities")
  private List<EdFiStudentEducationOrganizationAssociationDisability> disabilities = new ArrayList<EdFiStudentEducationOrganizationAssociationDisability>();

  @SerializedName("electronicMails")
  private List<EdFiStudentEducationOrganizationAssociationElectronicMail> electronicMails = new ArrayList<EdFiStudentEducationOrganizationAssociationElectronicMail>();

  @SerializedName("hispanicLatinoEthnicity")
  private Boolean hispanicLatinoEthnicity = null;

  @SerializedName("internationalAddresses")
  private List<EdFiStudentEducationOrganizationAssociationInternationalAddress> internationalAddresses = new ArrayList<EdFiStudentEducationOrganizationAssociationInternationalAddress>();

  @SerializedName("languages")
  private List<EdFiStudentEducationOrganizationAssociationLanguage> languages = new ArrayList<EdFiStudentEducationOrganizationAssociationLanguage>();

  @SerializedName("limitedEnglishProficiencyDescriptor")
  private String limitedEnglishProficiencyDescriptor = null;

  @SerializedName("loginId")
  private String loginId = null;

  @SerializedName("oldEthnicityDescriptor")
  private String oldEthnicityDescriptor = null;

  @SerializedName("profileThumbnail")
  private String profileThumbnail = null;

  @SerializedName("programParticipations")
  private List<EdFiStudentEducationOrganizationAssociationProgramParticipation> programParticipations = new ArrayList<EdFiStudentEducationOrganizationAssociationProgramParticipation>();

  @SerializedName("races")
  private List<EdFiStudentEducationOrganizationAssociationRace> races = new ArrayList<EdFiStudentEducationOrganizationAssociationRace>();

  @SerializedName("sexDescriptor")
  private String sexDescriptor = null;

  @SerializedName("studentCharacteristics")
  private List<EdFiStudentEducationOrganizationAssociationStudentCharacteristic> studentCharacteristics = new ArrayList<EdFiStudentEducationOrganizationAssociationStudentCharacteristic>();

  @SerializedName("studentIdentificationCodes")
  private List<EdFiStudentEducationOrganizationAssociationStudentIdentificationCode> studentIdentificationCodes = new ArrayList<EdFiStudentEducationOrganizationAssociationStudentIdentificationCode>();

  @SerializedName("studentIndicators")
  private List<EdFiStudentEducationOrganizationAssociationStudentIndicator> studentIndicators = new ArrayList<EdFiStudentEducationOrganizationAssociationStudentIndicator>();

  @SerializedName("telephones")
  private List<EdFiStudentEducationOrganizationAssociationTelephone> telephones = new ArrayList<EdFiStudentEducationOrganizationAssociationTelephone>();

  @SerializedName("tribalAffiliations")
  private List<EdFiStudentEducationOrganizationAssociationTribalAffiliation> tribalAffiliations = new ArrayList<EdFiStudentEducationOrganizationAssociationTribalAffiliation>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStudentEducationOrganizationAssociation id(String id) {
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

  public EdFiStudentEducationOrganizationAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
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

  public EdFiStudentEducationOrganizationAssociation studentReference(EdFiStudentReference studentReference) {
    this.studentReference = studentReference;
    return this;
  }

   /**
   * Get studentReference
   * @return studentReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiStudentReference getStudentReference() {
    return studentReference;
  }

  public void setStudentReference(EdFiStudentReference studentReference) {
    this.studentReference = studentReference;
  }

  public EdFiStudentEducationOrganizationAssociation addresses(List<EdFiStudentEducationOrganizationAssociationAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addAddressesItem(EdFiStudentEducationOrganizationAssociationAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationAddresses. The set of elements that describes an address, including the street address, city, state, and ZIP code.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationAddresses. The set of elements that describes an address, including the street address, city, state, and ZIP code.")
  public List<EdFiStudentEducationOrganizationAssociationAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<EdFiStudentEducationOrganizationAssociationAddress> addresses) {
    this.addresses = addresses;
  }

  public EdFiStudentEducationOrganizationAssociation cohortYears(List<EdFiStudentEducationOrganizationAssociationCohortYear> cohortYears) {
    this.cohortYears = cohortYears;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addCohortYearsItem(EdFiStudentEducationOrganizationAssociationCohortYear cohortYearsItem) {
    this.cohortYears.add(cohortYearsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationCohortYears. The type and year of a cohort (e.g., 9th grade) the student belongs to as determined by the year that student entered a specific grade.
   * @return cohortYears
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationCohortYears. The type and year of a cohort (e.g., 9th grade) the student belongs to as determined by the year that student entered a specific grade.")
  public List<EdFiStudentEducationOrganizationAssociationCohortYear> getCohortYears() {
    return cohortYears;
  }

  public void setCohortYears(List<EdFiStudentEducationOrganizationAssociationCohortYear> cohortYears) {
    this.cohortYears = cohortYears;
  }

  public EdFiStudentEducationOrganizationAssociation disabilities(List<EdFiStudentEducationOrganizationAssociationDisability> disabilities) {
    this.disabilities = disabilities;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addDisabilitiesItem(EdFiStudentEducationOrganizationAssociationDisability disabilitiesItem) {
    this.disabilities.add(disabilitiesItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationDisabilities. The disability condition(s) that best describes an individual's impairment, as determined by evaluation(s) conducted by the education organization.
   * @return disabilities
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationDisabilities. The disability condition(s) that best describes an individual's impairment, as determined by evaluation(s) conducted by the education organization.")
  public List<EdFiStudentEducationOrganizationAssociationDisability> getDisabilities() {
    return disabilities;
  }

  public void setDisabilities(List<EdFiStudentEducationOrganizationAssociationDisability> disabilities) {
    this.disabilities = disabilities;
  }

  public EdFiStudentEducationOrganizationAssociation electronicMails(List<EdFiStudentEducationOrganizationAssociationElectronicMail> electronicMails) {
    this.electronicMails = electronicMails;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addElectronicMailsItem(EdFiStudentEducationOrganizationAssociationElectronicMail electronicMailsItem) {
    this.electronicMails.add(electronicMailsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationElectronicMails. The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the individual or organization belongs.
   * @return electronicMails
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationElectronicMails. The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the individual or organization belongs.")
  public List<EdFiStudentEducationOrganizationAssociationElectronicMail> getElectronicMails() {
    return electronicMails;
  }

  public void setElectronicMails(List<EdFiStudentEducationOrganizationAssociationElectronicMail> electronicMails) {
    this.electronicMails = electronicMails;
  }

  public EdFiStudentEducationOrganizationAssociation hispanicLatinoEthnicity(Boolean hispanicLatinoEthnicity) {
    this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
    return this;
  }

   /**
   * An indication that the individual traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central, and South America, and other Spanish cultures, regardless of race. The term, \"Spanish origin,\" can be used in addition to \"Hispanic or Latino.\"
   * @return hispanicLatinoEthnicity
  **/
  @ApiModelProperty(example = "null", value = "An indication that the individual traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central, and South America, and other Spanish cultures, regardless of race. The term, \"Spanish origin,\" can be used in addition to \"Hispanic or Latino.\"")
  public Boolean getHispanicLatinoEthnicity() {
    return hispanicLatinoEthnicity;
  }

  public void setHispanicLatinoEthnicity(Boolean hispanicLatinoEthnicity) {
    this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
  }

  public EdFiStudentEducationOrganizationAssociation internationalAddresses(List<EdFiStudentEducationOrganizationAssociationInternationalAddress> internationalAddresses) {
    this.internationalAddresses = internationalAddresses;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addInternationalAddressesItem(EdFiStudentEducationOrganizationAssociationInternationalAddress internationalAddressesItem) {
    this.internationalAddresses.add(internationalAddressesItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationInternationalAddresses. The set of elements that describes an international address.
   * @return internationalAddresses
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationInternationalAddresses. The set of elements that describes an international address.")
  public List<EdFiStudentEducationOrganizationAssociationInternationalAddress> getInternationalAddresses() {
    return internationalAddresses;
  }

  public void setInternationalAddresses(List<EdFiStudentEducationOrganizationAssociationInternationalAddress> internationalAddresses) {
    this.internationalAddresses = internationalAddresses;
  }

  public EdFiStudentEducationOrganizationAssociation languages(List<EdFiStudentEducationOrganizationAssociationLanguage> languages) {
    this.languages = languages;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addLanguagesItem(EdFiStudentEducationOrganizationAssociationLanguage languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationLanguages. The language(s) the individual uses to communicate. It is strongly recommended that entries use only ISO 639-3 language codes.
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationLanguages. The language(s) the individual uses to communicate. It is strongly recommended that entries use only ISO 639-3 language codes.")
  public List<EdFiStudentEducationOrganizationAssociationLanguage> getLanguages() {
    return languages;
  }

  public void setLanguages(List<EdFiStudentEducationOrganizationAssociationLanguage> languages) {
    this.languages = languages;
  }

  public EdFiStudentEducationOrganizationAssociation limitedEnglishProficiencyDescriptor(String limitedEnglishProficiencyDescriptor) {
    this.limitedEnglishProficiencyDescriptor = limitedEnglishProficiencyDescriptor;
    return this;
  }

   /**
   * An indication that the student has been identified as limited English proficient by the Language Proficiency Assessment Committee (LPAC), or English proficient.
   * @return limitedEnglishProficiencyDescriptor
  **/
  @ApiModelProperty(example = "null", value = "An indication that the student has been identified as limited English proficient by the Language Proficiency Assessment Committee (LPAC), or English proficient.")
  public String getLimitedEnglishProficiencyDescriptor() {
    return limitedEnglishProficiencyDescriptor;
  }

  public void setLimitedEnglishProficiencyDescriptor(String limitedEnglishProficiencyDescriptor) {
    this.limitedEnglishProficiencyDescriptor = limitedEnglishProficiencyDescriptor;
  }

  public EdFiStudentEducationOrganizationAssociation loginId(String loginId) {
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

  public EdFiStudentEducationOrganizationAssociation oldEthnicityDescriptor(String oldEthnicityDescriptor) {
    this.oldEthnicityDescriptor = oldEthnicityDescriptor;
    return this;
  }

   /**
   * Previous definition of Ethnicity combining Hispanic/Latino and race:          1 - American Indian or Alaskan Native          2 - Asian or Pacific Islander          3 - Black, not of Hispanic origin          4 - Hispanic          5 - White, not of Hispanic origin.
   * @return oldEthnicityDescriptor
  **/
  @ApiModelProperty(example = "null", value = "Previous definition of Ethnicity combining Hispanic/Latino and race:          1 - American Indian or Alaskan Native          2 - Asian or Pacific Islander          3 - Black, not of Hispanic origin          4 - Hispanic          5 - White, not of Hispanic origin.")
  public String getOldEthnicityDescriptor() {
    return oldEthnicityDescriptor;
  }

  public void setOldEthnicityDescriptor(String oldEthnicityDescriptor) {
    this.oldEthnicityDescriptor = oldEthnicityDescriptor;
  }

  public EdFiStudentEducationOrganizationAssociation profileThumbnail(String profileThumbnail) {
    this.profileThumbnail = profileThumbnail;
    return this;
  }

   /**
   * Locator reference for the student photo. The specification for that reference is left to local definition.
   * @return profileThumbnail
  **/
  @ApiModelProperty(example = "null", value = "Locator reference for the student photo. The specification for that reference is left to local definition.")
  public String getProfileThumbnail() {
    return profileThumbnail;
  }

  public void setProfileThumbnail(String profileThumbnail) {
    this.profileThumbnail = profileThumbnail;
  }

  public EdFiStudentEducationOrganizationAssociation programParticipations(List<EdFiStudentEducationOrganizationAssociationProgramParticipation> programParticipations) {
    this.programParticipations = programParticipations;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addProgramParticipationsItem(EdFiStudentEducationOrganizationAssociationProgramParticipation programParticipationsItem) {
    this.programParticipations.add(programParticipationsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationProgramParticipations. Key programs the student is participating in or receives services from.
   * @return programParticipations
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationProgramParticipations. Key programs the student is participating in or receives services from.")
  public List<EdFiStudentEducationOrganizationAssociationProgramParticipation> getProgramParticipations() {
    return programParticipations;
  }

  public void setProgramParticipations(List<EdFiStudentEducationOrganizationAssociationProgramParticipation> programParticipations) {
    this.programParticipations = programParticipations;
  }

  public EdFiStudentEducationOrganizationAssociation races(List<EdFiStudentEducationOrganizationAssociationRace> races) {
    this.races = races;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addRacesItem(EdFiStudentEducationOrganizationAssociationRace racesItem) {
    this.races.add(racesItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationRaces. The general racial category which most clearly reflects the individual's recognition of his or her community or with which the individual most identifies. The data model allows for multiple entries so that each individual can specify all appropriate races.
   * @return races
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationRaces. The general racial category which most clearly reflects the individual's recognition of his or her community or with which the individual most identifies. The data model allows for multiple entries so that each individual can specify all appropriate races.")
  public List<EdFiStudentEducationOrganizationAssociationRace> getRaces() {
    return races;
  }

  public void setRaces(List<EdFiStudentEducationOrganizationAssociationRace> races) {
    this.races = races;
  }

  public EdFiStudentEducationOrganizationAssociation sexDescriptor(String sexDescriptor) {
    this.sexDescriptor = sexDescriptor;
    return this;
  }

   /**
   * A person's gender.
   * @return sexDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "A person's gender.")
  public String getSexDescriptor() {
    return sexDescriptor;
  }

  public void setSexDescriptor(String sexDescriptor) {
    this.sexDescriptor = sexDescriptor;
  }

  public EdFiStudentEducationOrganizationAssociation studentCharacteristics(List<EdFiStudentEducationOrganizationAssociationStudentCharacteristic> studentCharacteristics) {
    this.studentCharacteristics = studentCharacteristics;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addStudentCharacteristicsItem(EdFiStudentEducationOrganizationAssociationStudentCharacteristic studentCharacteristicsItem) {
    this.studentCharacteristics.add(studentCharacteristicsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationStudentCharacteristics. Reflects important characteristics of the student's home situation:          Displaced Homemaker, Immigrant, Migratory, Military Parent, Pregnant Teen, Single Parent, and Unaccompanied Youth.
   * @return studentCharacteristics
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationStudentCharacteristics. Reflects important characteristics of the student's home situation:          Displaced Homemaker, Immigrant, Migratory, Military Parent, Pregnant Teen, Single Parent, and Unaccompanied Youth.")
  public List<EdFiStudentEducationOrganizationAssociationStudentCharacteristic> getStudentCharacteristics() {
    return studentCharacteristics;
  }

  public void setStudentCharacteristics(List<EdFiStudentEducationOrganizationAssociationStudentCharacteristic> studentCharacteristics) {
    this.studentCharacteristics = studentCharacteristics;
  }

  public EdFiStudentEducationOrganizationAssociation studentIdentificationCodes(List<EdFiStudentEducationOrganizationAssociationStudentIdentificationCode> studentIdentificationCodes) {
    this.studentIdentificationCodes = studentIdentificationCodes;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addStudentIdentificationCodesItem(EdFiStudentEducationOrganizationAssociationStudentIdentificationCode studentIdentificationCodesItem) {
    this.studentIdentificationCodes.add(studentIdentificationCodesItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationStudentIdentificationCodes. A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a student.
   * @return studentIdentificationCodes
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationStudentIdentificationCodes. A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a student.")
  public List<EdFiStudentEducationOrganizationAssociationStudentIdentificationCode> getStudentIdentificationCodes() {
    return studentIdentificationCodes;
  }

  public void setStudentIdentificationCodes(List<EdFiStudentEducationOrganizationAssociationStudentIdentificationCode> studentIdentificationCodes) {
    this.studentIdentificationCodes = studentIdentificationCodes;
  }

  public EdFiStudentEducationOrganizationAssociation studentIndicators(List<EdFiStudentEducationOrganizationAssociationStudentIndicator> studentIndicators) {
    this.studentIndicators = studentIndicators;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addStudentIndicatorsItem(EdFiStudentEducationOrganizationAssociationStudentIndicator studentIndicatorsItem) {
    this.studentIndicators.add(studentIndicatorsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationStudentIndicators. Indicator(s) or metric(s) computed for the student (e.g., at risk) to influence more effective education or direct specific interventions.
   * @return studentIndicators
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationStudentIndicators. Indicator(s) or metric(s) computed for the student (e.g., at risk) to influence more effective education or direct specific interventions.")
  public List<EdFiStudentEducationOrganizationAssociationStudentIndicator> getStudentIndicators() {
    return studentIndicators;
  }

  public void setStudentIndicators(List<EdFiStudentEducationOrganizationAssociationStudentIndicator> studentIndicators) {
    this.studentIndicators = studentIndicators;
  }

  public EdFiStudentEducationOrganizationAssociation telephones(List<EdFiStudentEducationOrganizationAssociationTelephone> telephones) {
    this.telephones = telephones;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addTelephonesItem(EdFiStudentEducationOrganizationAssociationTelephone telephonesItem) {
    this.telephones.add(telephonesItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationTelephones. The 10-digit telephone number, including the area code, for the person.
   * @return telephones
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationTelephones. The 10-digit telephone number, including the area code, for the person.")
  public List<EdFiStudentEducationOrganizationAssociationTelephone> getTelephones() {
    return telephones;
  }

  public void setTelephones(List<EdFiStudentEducationOrganizationAssociationTelephone> telephones) {
    this.telephones = telephones;
  }

  public EdFiStudentEducationOrganizationAssociation tribalAffiliations(List<EdFiStudentEducationOrganizationAssociationTribalAffiliation> tribalAffiliations) {
    this.tribalAffiliations = tribalAffiliations;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociation addTribalAffiliationsItem(EdFiStudentEducationOrganizationAssociationTribalAffiliation tribalAffiliationsItem) {
    this.tribalAffiliations.add(tribalAffiliationsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationTribalAffiliations. An American Indian tribe with which the student is affiliated.
   * @return tribalAffiliations
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationTribalAffiliations. An American Indian tribe with which the student is affiliated.")
  public List<EdFiStudentEducationOrganizationAssociationTribalAffiliation> getTribalAffiliations() {
    return tribalAffiliations;
  }

  public void setTribalAffiliations(List<EdFiStudentEducationOrganizationAssociationTribalAffiliation> tribalAffiliations) {
    this.tribalAffiliations = tribalAffiliations;
  }

  public EdFiStudentEducationOrganizationAssociation etag(String etag) {
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
    EdFiStudentEducationOrganizationAssociation edFiStudentEducationOrganizationAssociation = (EdFiStudentEducationOrganizationAssociation) o;
    return Objects.equals(this.id, edFiStudentEducationOrganizationAssociation.id) &&
        Objects.equals(this.educationOrganizationReference, edFiStudentEducationOrganizationAssociation.educationOrganizationReference) &&
        Objects.equals(this.studentReference, edFiStudentEducationOrganizationAssociation.studentReference) &&
        Objects.equals(this.addresses, edFiStudentEducationOrganizationAssociation.addresses) &&
        Objects.equals(this.cohortYears, edFiStudentEducationOrganizationAssociation.cohortYears) &&
        Objects.equals(this.disabilities, edFiStudentEducationOrganizationAssociation.disabilities) &&
        Objects.equals(this.electronicMails, edFiStudentEducationOrganizationAssociation.electronicMails) &&
        Objects.equals(this.hispanicLatinoEthnicity, edFiStudentEducationOrganizationAssociation.hispanicLatinoEthnicity) &&
        Objects.equals(this.internationalAddresses, edFiStudentEducationOrganizationAssociation.internationalAddresses) &&
        Objects.equals(this.languages, edFiStudentEducationOrganizationAssociation.languages) &&
        Objects.equals(this.limitedEnglishProficiencyDescriptor, edFiStudentEducationOrganizationAssociation.limitedEnglishProficiencyDescriptor) &&
        Objects.equals(this.loginId, edFiStudentEducationOrganizationAssociation.loginId) &&
        Objects.equals(this.oldEthnicityDescriptor, edFiStudentEducationOrganizationAssociation.oldEthnicityDescriptor) &&
        Objects.equals(this.profileThumbnail, edFiStudentEducationOrganizationAssociation.profileThumbnail) &&
        Objects.equals(this.programParticipations, edFiStudentEducationOrganizationAssociation.programParticipations) &&
        Objects.equals(this.races, edFiStudentEducationOrganizationAssociation.races) &&
        Objects.equals(this.sexDescriptor, edFiStudentEducationOrganizationAssociation.sexDescriptor) &&
        Objects.equals(this.studentCharacteristics, edFiStudentEducationOrganizationAssociation.studentCharacteristics) &&
        Objects.equals(this.studentIdentificationCodes, edFiStudentEducationOrganizationAssociation.studentIdentificationCodes) &&
        Objects.equals(this.studentIndicators, edFiStudentEducationOrganizationAssociation.studentIndicators) &&
        Objects.equals(this.telephones, edFiStudentEducationOrganizationAssociation.telephones) &&
        Objects.equals(this.tribalAffiliations, edFiStudentEducationOrganizationAssociation.tribalAffiliations) &&
        Objects.equals(this.etag, edFiStudentEducationOrganizationAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, educationOrganizationReference, studentReference, addresses, cohortYears, disabilities, electronicMails, hispanicLatinoEthnicity, internationalAddresses, languages, limitedEnglishProficiencyDescriptor, loginId, oldEthnicityDescriptor, profileThumbnail, programParticipations, races, sexDescriptor, studentCharacteristics, studentIdentificationCodes, studentIndicators, telephones, tribalAffiliations, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    cohortYears: ").append(toIndentedString(cohortYears)).append("\n");
    sb.append("    disabilities: ").append(toIndentedString(disabilities)).append("\n");
    sb.append("    electronicMails: ").append(toIndentedString(electronicMails)).append("\n");
    sb.append("    hispanicLatinoEthnicity: ").append(toIndentedString(hispanicLatinoEthnicity)).append("\n");
    sb.append("    internationalAddresses: ").append(toIndentedString(internationalAddresses)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    limitedEnglishProficiencyDescriptor: ").append(toIndentedString(limitedEnglishProficiencyDescriptor)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    oldEthnicityDescriptor: ").append(toIndentedString(oldEthnicityDescriptor)).append("\n");
    sb.append("    profileThumbnail: ").append(toIndentedString(profileThumbnail)).append("\n");
    sb.append("    programParticipations: ").append(toIndentedString(programParticipations)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    sexDescriptor: ").append(toIndentedString(sexDescriptor)).append("\n");
    sb.append("    studentCharacteristics: ").append(toIndentedString(studentCharacteristics)).append("\n");
    sb.append("    studentIdentificationCodes: ").append(toIndentedString(studentIdentificationCodes)).append("\n");
    sb.append("    studentIndicators: ").append(toIndentedString(studentIndicators)).append("\n");
    sb.append("    telephones: ").append(toIndentedString(telephones)).append("\n");
    sb.append("    tribalAffiliations: ").append(toIndentedString(tribalAffiliations)).append("\n");
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

