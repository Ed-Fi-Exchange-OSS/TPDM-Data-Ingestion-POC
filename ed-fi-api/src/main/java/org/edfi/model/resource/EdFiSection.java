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
import org.edfi.model.resource.EdFiCourseOfferingReference;
import org.edfi.model.resource.EdFiLocationReference;
import org.edfi.model.resource.EdFiSchoolReference;
import org.edfi.model.resource.EdFiSectionCharacteristic;
import org.edfi.model.resource.EdFiSectionClassPeriod;
import org.edfi.model.resource.EdFiSectionCourseLevelCharacteristic;
import org.edfi.model.resource.EdFiSectionOfferedGradeLevel;
import org.edfi.model.resource.EdFiSectionProgram;


/**
 * EdFiSection
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiSection   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("sectionIdentifier")
  private String sectionIdentifier = null;

  @SerializedName("courseOfferingReference")
  private EdFiCourseOfferingReference courseOfferingReference = null;

  @SerializedName("locationReference")
  private EdFiLocationReference locationReference = null;

  @SerializedName("locationSchoolReference")
  private EdFiSchoolReference locationSchoolReference = null;

  @SerializedName("availableCreditConversion")
  private Double availableCreditConversion = null;

  @SerializedName("availableCredits")
  private Double availableCredits = null;

  @SerializedName("availableCreditTypeDescriptor")
  private String availableCreditTypeDescriptor = null;

  @SerializedName("characteristics")
  private List<EdFiSectionCharacteristic> characteristics = new ArrayList<EdFiSectionCharacteristic>();

  @SerializedName("classPeriods")
  private List<EdFiSectionClassPeriod> classPeriods = new ArrayList<EdFiSectionClassPeriod>();

  @SerializedName("courseLevelCharacteristics")
  private List<EdFiSectionCourseLevelCharacteristic> courseLevelCharacteristics = new ArrayList<EdFiSectionCourseLevelCharacteristic>();

  @SerializedName("educationalEnvironmentDescriptor")
  private String educationalEnvironmentDescriptor = null;

  @SerializedName("instructionLanguageDescriptor")
  private String instructionLanguageDescriptor = null;

  @SerializedName("mediumOfInstructionDescriptor")
  private String mediumOfInstructionDescriptor = null;

  @SerializedName("offeredGradeLevels")
  private List<EdFiSectionOfferedGradeLevel> offeredGradeLevels = new ArrayList<EdFiSectionOfferedGradeLevel>();

  @SerializedName("populationServedDescriptor")
  private String populationServedDescriptor = null;

  @SerializedName("programs")
  private List<EdFiSectionProgram> programs = new ArrayList<EdFiSectionProgram>();

  @SerializedName("sequenceOfCourse")
  private Integer sequenceOfCourse = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiSection id(String id) {
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

  public EdFiSection sectionIdentifier(String sectionIdentifier) {
    this.sectionIdentifier = sectionIdentifier;
    return this;
  }

   /**
   * The local identifier assigned to a section.
   * @return sectionIdentifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "The local identifier assigned to a section.")
  public String getSectionIdentifier() {
    return sectionIdentifier;
  }

  public void setSectionIdentifier(String sectionIdentifier) {
    this.sectionIdentifier = sectionIdentifier;
  }

  public EdFiSection courseOfferingReference(EdFiCourseOfferingReference courseOfferingReference) {
    this.courseOfferingReference = courseOfferingReference;
    return this;
  }

   /**
   * Get courseOfferingReference
   * @return courseOfferingReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiCourseOfferingReference getCourseOfferingReference() {
    return courseOfferingReference;
  }

  public void setCourseOfferingReference(EdFiCourseOfferingReference courseOfferingReference) {
    this.courseOfferingReference = courseOfferingReference;
  }

  public EdFiSection locationReference(EdFiLocationReference locationReference) {
    this.locationReference = locationReference;
    return this;
  }

   /**
   * Get locationReference
   * @return locationReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiLocationReference getLocationReference() {
    return locationReference;
  }

  public void setLocationReference(EdFiLocationReference locationReference) {
    this.locationReference = locationReference;
  }

  public EdFiSection locationSchoolReference(EdFiSchoolReference locationSchoolReference) {
    this.locationSchoolReference = locationSchoolReference;
    return this;
  }

   /**
   * Get locationSchoolReference
   * @return locationSchoolReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiSchoolReference getLocationSchoolReference() {
    return locationSchoolReference;
  }

  public void setLocationSchoolReference(EdFiSchoolReference locationSchoolReference) {
    this.locationSchoolReference = locationSchoolReference;
  }

  public EdFiSection availableCreditConversion(Double availableCreditConversion) {
    this.availableCreditConversion = availableCreditConversion;
    return this;
  }

   /**
   * Conversion factor that when multiplied by the number of credits is equivalent to Carnegie units.
   * @return availableCreditConversion
  **/
  @ApiModelProperty(example = "null", value = "Conversion factor that when multiplied by the number of credits is equivalent to Carnegie units.")
  public Double getAvailableCreditConversion() {
    return availableCreditConversion;
  }

  public void setAvailableCreditConversion(Double availableCreditConversion) {
    this.availableCreditConversion = availableCreditConversion;
  }

  public EdFiSection availableCredits(Double availableCredits) {
    this.availableCredits = availableCredits;
    return this;
  }

   /**
   * The value of credits or units of value awarded for the completion of a course.
   * @return availableCredits
  **/
  @ApiModelProperty(example = "null", value = "The value of credits or units of value awarded for the completion of a course.")
  public Double getAvailableCredits() {
    return availableCredits;
  }

  public void setAvailableCredits(Double availableCredits) {
    this.availableCredits = availableCredits;
  }

  public EdFiSection availableCreditTypeDescriptor(String availableCreditTypeDescriptor) {
    this.availableCreditTypeDescriptor = availableCreditTypeDescriptor;
    return this;
  }

   /**
   * The type of credits or units of value awarded for the completion of a course.
   * @return availableCreditTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The type of credits or units of value awarded for the completion of a course.")
  public String getAvailableCreditTypeDescriptor() {
    return availableCreditTypeDescriptor;
  }

  public void setAvailableCreditTypeDescriptor(String availableCreditTypeDescriptor) {
    this.availableCreditTypeDescriptor = availableCreditTypeDescriptor;
  }

  public EdFiSection characteristics(List<EdFiSectionCharacteristic> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public EdFiSection addCharacteristicsItem(EdFiSectionCharacteristic characteristicsItem) {
    this.characteristics.add(characteristicsItem);
    return this;
  }

   /**
   * An unordered collection of sectionCharacteristics. Reflects important characteristics of the Section, such as whether or not attendance is taken and the Section is graded.
   * @return characteristics
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of sectionCharacteristics. Reflects important characteristics of the Section, such as whether or not attendance is taken and the Section is graded.")
  public List<EdFiSectionCharacteristic> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<EdFiSectionCharacteristic> characteristics) {
    this.characteristics = characteristics;
  }

  public EdFiSection classPeriods(List<EdFiSectionClassPeriod> classPeriods) {
    this.classPeriods = classPeriods;
    return this;
  }

  public EdFiSection addClassPeriodsItem(EdFiSectionClassPeriod classPeriodsItem) {
    this.classPeriods.add(classPeriodsItem);
    return this;
  }

   /**
   * An unordered collection of sectionClassPeriods. The class period during which the Section meets.
   * @return classPeriods
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of sectionClassPeriods. The class period during which the Section meets.")
  public List<EdFiSectionClassPeriod> getClassPeriods() {
    return classPeriods;
  }

  public void setClassPeriods(List<EdFiSectionClassPeriod> classPeriods) {
    this.classPeriods = classPeriods;
  }

  public EdFiSection courseLevelCharacteristics(List<EdFiSectionCourseLevelCharacteristic> courseLevelCharacteristics) {
    this.courseLevelCharacteristics = courseLevelCharacteristics;
    return this;
  }

  public EdFiSection addCourseLevelCharacteristicsItem(EdFiSectionCourseLevelCharacteristic courseLevelCharacteristicsItem) {
    this.courseLevelCharacteristics.add(courseLevelCharacteristicsItem);
    return this;
  }

   /**
   * An unordered collection of sectionCourseLevelCharacteristics. The type of specific program or designation with which the section is associated (e.g., AP, IB, Dual Credit, CTE). This collection should only be populated if it differs from the Course Level Characteristics identified at the Course Offering level.
   * @return courseLevelCharacteristics
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of sectionCourseLevelCharacteristics. The type of specific program or designation with which the section is associated (e.g., AP, IB, Dual Credit, CTE). This collection should only be populated if it differs from the Course Level Characteristics identified at the Course Offering level.")
  public List<EdFiSectionCourseLevelCharacteristic> getCourseLevelCharacteristics() {
    return courseLevelCharacteristics;
  }

  public void setCourseLevelCharacteristics(List<EdFiSectionCourseLevelCharacteristic> courseLevelCharacteristics) {
    this.courseLevelCharacteristics = courseLevelCharacteristics;
  }

  public EdFiSection educationalEnvironmentDescriptor(String educationalEnvironmentDescriptor) {
    this.educationalEnvironmentDescriptor = educationalEnvironmentDescriptor;
    return this;
  }

   /**
   * The setting in which a child receives education and related services; for example:          Center-based instruction          Home-based instruction          Hospital class          Mainstream          Residential care and treatment facility          ...
   * @return educationalEnvironmentDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The setting in which a child receives education and related services; for example:          Center-based instruction          Home-based instruction          Hospital class          Mainstream          Residential care and treatment facility          ...")
  public String getEducationalEnvironmentDescriptor() {
    return educationalEnvironmentDescriptor;
  }

  public void setEducationalEnvironmentDescriptor(String educationalEnvironmentDescriptor) {
    this.educationalEnvironmentDescriptor = educationalEnvironmentDescriptor;
  }

  public EdFiSection instructionLanguageDescriptor(String instructionLanguageDescriptor) {
    this.instructionLanguageDescriptor = instructionLanguageDescriptor;
    return this;
  }

   /**
   * The primary language of instruction, if omitted English is assumed.
   * @return instructionLanguageDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The primary language of instruction, if omitted English is assumed.")
  public String getInstructionLanguageDescriptor() {
    return instructionLanguageDescriptor;
  }

  public void setInstructionLanguageDescriptor(String instructionLanguageDescriptor) {
    this.instructionLanguageDescriptor = instructionLanguageDescriptor;
  }

  public EdFiSection mediumOfInstructionDescriptor(String mediumOfInstructionDescriptor) {
    this.mediumOfInstructionDescriptor = mediumOfInstructionDescriptor;
    return this;
  }

   /**
   * The media through which teachers provide instruction to students and students and teachers communicate about instructional matters; for example:          Technology-based instruction in classroom          Correspondence instruction          Face-to-face instruction          Virtual/On-line Distance learning          Center-based instruction          ...
   * @return mediumOfInstructionDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The media through which teachers provide instruction to students and students and teachers communicate about instructional matters; for example:          Technology-based instruction in classroom          Correspondence instruction          Face-to-face instruction          Virtual/On-line Distance learning          Center-based instruction          ...")
  public String getMediumOfInstructionDescriptor() {
    return mediumOfInstructionDescriptor;
  }

  public void setMediumOfInstructionDescriptor(String mediumOfInstructionDescriptor) {
    this.mediumOfInstructionDescriptor = mediumOfInstructionDescriptor;
  }

  public EdFiSection offeredGradeLevels(List<EdFiSectionOfferedGradeLevel> offeredGradeLevels) {
    this.offeredGradeLevels = offeredGradeLevels;
    return this;
  }

  public EdFiSection addOfferedGradeLevelsItem(EdFiSectionOfferedGradeLevel offeredGradeLevelsItem) {
    this.offeredGradeLevels.add(offeredGradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of sectionOfferedGradeLevels. The grade levels in which the section is offered. This collection should only be populated if it differs from the Offered Grade Levels identified at the Course Offering level.
   * @return offeredGradeLevels
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of sectionOfferedGradeLevels. The grade levels in which the section is offered. This collection should only be populated if it differs from the Offered Grade Levels identified at the Course Offering level.")
  public List<EdFiSectionOfferedGradeLevel> getOfferedGradeLevels() {
    return offeredGradeLevels;
  }

  public void setOfferedGradeLevels(List<EdFiSectionOfferedGradeLevel> offeredGradeLevels) {
    this.offeredGradeLevels = offeredGradeLevels;
  }

  public EdFiSection populationServedDescriptor(String populationServedDescriptor) {
    this.populationServedDescriptor = populationServedDescriptor;
    return this;
  }

   /**
   * The type of students the Section is offered and tailored to; for example:          Bilingual students          Remedial education students          Gifted and talented students          Career and Technical Education students          Special education students          ...
   * @return populationServedDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The type of students the Section is offered and tailored to; for example:          Bilingual students          Remedial education students          Gifted and talented students          Career and Technical Education students          Special education students          ...")
  public String getPopulationServedDescriptor() {
    return populationServedDescriptor;
  }

  public void setPopulationServedDescriptor(String populationServedDescriptor) {
    this.populationServedDescriptor = populationServedDescriptor;
  }

  public EdFiSection programs(List<EdFiSectionProgram> programs) {
    this.programs = programs;
    return this;
  }

  public EdFiSection addProgramsItem(EdFiSectionProgram programsItem) {
    this.programs.add(programsItem);
    return this;
  }

   /**
   * An unordered collection of sectionPrograms. Optional reference to program (e.g., CTE) to which the Section is associated.
   * @return programs
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of sectionPrograms. Optional reference to program (e.g., CTE) to which the Section is associated.")
  public List<EdFiSectionProgram> getPrograms() {
    return programs;
  }

  public void setPrograms(List<EdFiSectionProgram> programs) {
    this.programs = programs;
  }

  public EdFiSection sequenceOfCourse(Integer sequenceOfCourse) {
    this.sequenceOfCourse = sequenceOfCourse;
    return this;
  }

   /**
   * When a section is part of a sequence of parts for a course, the number of the sequence. If the course has only one part, the value of this section attribute should be 1.
   * @return sequenceOfCourse
  **/
  @ApiModelProperty(example = "null", value = "When a section is part of a sequence of parts for a course, the number of the sequence. If the course has only one part, the value of this section attribute should be 1.")
  public Integer getSequenceOfCourse() {
    return sequenceOfCourse;
  }

  public void setSequenceOfCourse(Integer sequenceOfCourse) {
    this.sequenceOfCourse = sequenceOfCourse;
  }

  public EdFiSection etag(String etag) {
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
    EdFiSection edFiSection = (EdFiSection) o;
    return Objects.equals(this.id, edFiSection.id) &&
        Objects.equals(this.sectionIdentifier, edFiSection.sectionIdentifier) &&
        Objects.equals(this.courseOfferingReference, edFiSection.courseOfferingReference) &&
        Objects.equals(this.locationReference, edFiSection.locationReference) &&
        Objects.equals(this.locationSchoolReference, edFiSection.locationSchoolReference) &&
        Objects.equals(this.availableCreditConversion, edFiSection.availableCreditConversion) &&
        Objects.equals(this.availableCredits, edFiSection.availableCredits) &&
        Objects.equals(this.availableCreditTypeDescriptor, edFiSection.availableCreditTypeDescriptor) &&
        Objects.equals(this.characteristics, edFiSection.characteristics) &&
        Objects.equals(this.classPeriods, edFiSection.classPeriods) &&
        Objects.equals(this.courseLevelCharacteristics, edFiSection.courseLevelCharacteristics) &&
        Objects.equals(this.educationalEnvironmentDescriptor, edFiSection.educationalEnvironmentDescriptor) &&
        Objects.equals(this.instructionLanguageDescriptor, edFiSection.instructionLanguageDescriptor) &&
        Objects.equals(this.mediumOfInstructionDescriptor, edFiSection.mediumOfInstructionDescriptor) &&
        Objects.equals(this.offeredGradeLevels, edFiSection.offeredGradeLevels) &&
        Objects.equals(this.populationServedDescriptor, edFiSection.populationServedDescriptor) &&
        Objects.equals(this.programs, edFiSection.programs) &&
        Objects.equals(this.sequenceOfCourse, edFiSection.sequenceOfCourse) &&
        Objects.equals(this.etag, edFiSection.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sectionIdentifier, courseOfferingReference, locationReference, locationSchoolReference, availableCreditConversion, availableCredits, availableCreditTypeDescriptor, characteristics, classPeriods, courseLevelCharacteristics, educationalEnvironmentDescriptor, instructionLanguageDescriptor, mediumOfInstructionDescriptor, offeredGradeLevels, populationServedDescriptor, programs, sequenceOfCourse, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiSection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sectionIdentifier: ").append(toIndentedString(sectionIdentifier)).append("\n");
    sb.append("    courseOfferingReference: ").append(toIndentedString(courseOfferingReference)).append("\n");
    sb.append("    locationReference: ").append(toIndentedString(locationReference)).append("\n");
    sb.append("    locationSchoolReference: ").append(toIndentedString(locationSchoolReference)).append("\n");
    sb.append("    availableCreditConversion: ").append(toIndentedString(availableCreditConversion)).append("\n");
    sb.append("    availableCredits: ").append(toIndentedString(availableCredits)).append("\n");
    sb.append("    availableCreditTypeDescriptor: ").append(toIndentedString(availableCreditTypeDescriptor)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    classPeriods: ").append(toIndentedString(classPeriods)).append("\n");
    sb.append("    courseLevelCharacteristics: ").append(toIndentedString(courseLevelCharacteristics)).append("\n");
    sb.append("    educationalEnvironmentDescriptor: ").append(toIndentedString(educationalEnvironmentDescriptor)).append("\n");
    sb.append("    instructionLanguageDescriptor: ").append(toIndentedString(instructionLanguageDescriptor)).append("\n");
    sb.append("    mediumOfInstructionDescriptor: ").append(toIndentedString(mediumOfInstructionDescriptor)).append("\n");
    sb.append("    offeredGradeLevels: ").append(toIndentedString(offeredGradeLevels)).append("\n");
    sb.append("    populationServedDescriptor: ").append(toIndentedString(populationServedDescriptor)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    sequenceOfCourse: ").append(toIndentedString(sequenceOfCourse)).append("\n");
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

