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
import org.edfi.model.resource.EdFiCalendarReference;
import org.edfi.model.resource.EdFiGraduationPlanReference;
import org.edfi.model.resource.EdFiSchoolReference;
import org.edfi.model.resource.EdFiSchoolYearTypeReference;
import org.edfi.model.resource.EdFiStudentReference;
import org.edfi.model.resource.EdFiStudentSchoolAssociationEducationPlan;
import org.joda.time.LocalDate;


/**
 * EdFiStudentSchoolAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentSchoolAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("entryDate")
  private LocalDate entryDate = null;

  @SerializedName("calendarReference")
  private EdFiCalendarReference calendarReference = null;

  @SerializedName("classOfSchoolYearTypeReference")
  private EdFiSchoolYearTypeReference classOfSchoolYearTypeReference = null;

  @SerializedName("graduationPlanReference")
  private EdFiGraduationPlanReference graduationPlanReference = null;

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("schoolYearTypeReference")
  private EdFiSchoolYearTypeReference schoolYearTypeReference = null;

  @SerializedName("studentReference")
  private EdFiStudentReference studentReference = null;

  @SerializedName("educationPlans")
  private List<EdFiStudentSchoolAssociationEducationPlan> educationPlans = new ArrayList<EdFiStudentSchoolAssociationEducationPlan>();

  @SerializedName("employedWhileEnrolled")
  private Boolean employedWhileEnrolled = null;

  @SerializedName("entryGradeLevelDescriptor")
  private String entryGradeLevelDescriptor = null;

  @SerializedName("entryGradeLevelReasonDescriptor")
  private String entryGradeLevelReasonDescriptor = null;

  @SerializedName("entryTypeDescriptor")
  private String entryTypeDescriptor = null;

  @SerializedName("exitWithdrawDate")
  private LocalDate exitWithdrawDate = null;

  @SerializedName("exitWithdrawTypeDescriptor")
  private String exitWithdrawTypeDescriptor = null;

  @SerializedName("primarySchool")
  private Boolean primarySchool = null;

  @SerializedName("repeatGradeIndicator")
  private Boolean repeatGradeIndicator = null;

  @SerializedName("residencyStatusDescriptor")
  private String residencyStatusDescriptor = null;

  @SerializedName("schoolChoiceTransfer")
  private Boolean schoolChoiceTransfer = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStudentSchoolAssociation id(String id) {
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

  public EdFiStudentSchoolAssociation entryDate(LocalDate entryDate) {
    this.entryDate = entryDate;
    return this;
  }

   /**
   * The month, day, and year on which an individual enters and begins to receive instructional services in a school.
   * @return entryDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The month, day, and year on which an individual enters and begins to receive instructional services in a school.")
  public LocalDate getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(LocalDate entryDate) {
    this.entryDate = entryDate;
  }

  public EdFiStudentSchoolAssociation calendarReference(EdFiCalendarReference calendarReference) {
    this.calendarReference = calendarReference;
    return this;
  }

   /**
   * Get calendarReference
   * @return calendarReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiCalendarReference getCalendarReference() {
    return calendarReference;
  }

  public void setCalendarReference(EdFiCalendarReference calendarReference) {
    this.calendarReference = calendarReference;
  }

  public EdFiStudentSchoolAssociation classOfSchoolYearTypeReference(EdFiSchoolYearTypeReference classOfSchoolYearTypeReference) {
    this.classOfSchoolYearTypeReference = classOfSchoolYearTypeReference;
    return this;
  }

   /**
   * Get classOfSchoolYearTypeReference
   * @return classOfSchoolYearTypeReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiSchoolYearTypeReference getClassOfSchoolYearTypeReference() {
    return classOfSchoolYearTypeReference;
  }

  public void setClassOfSchoolYearTypeReference(EdFiSchoolYearTypeReference classOfSchoolYearTypeReference) {
    this.classOfSchoolYearTypeReference = classOfSchoolYearTypeReference;
  }

  public EdFiStudentSchoolAssociation graduationPlanReference(EdFiGraduationPlanReference graduationPlanReference) {
    this.graduationPlanReference = graduationPlanReference;
    return this;
  }

   /**
   * Get graduationPlanReference
   * @return graduationPlanReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiGraduationPlanReference getGraduationPlanReference() {
    return graduationPlanReference;
  }

  public void setGraduationPlanReference(EdFiGraduationPlanReference graduationPlanReference) {
    this.graduationPlanReference = graduationPlanReference;
  }

  public EdFiStudentSchoolAssociation schoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
    return this;
  }

   /**
   * Get schoolReference
   * @return schoolReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiSchoolReference getSchoolReference() {
    return schoolReference;
  }

  public void setSchoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
  }

  public EdFiStudentSchoolAssociation schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
    return this;
  }

   /**
   * Get schoolYearTypeReference
   * @return schoolYearTypeReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiSchoolYearTypeReference getSchoolYearTypeReference() {
    return schoolYearTypeReference;
  }

  public void setSchoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
  }

  public EdFiStudentSchoolAssociation studentReference(EdFiStudentReference studentReference) {
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

  public EdFiStudentSchoolAssociation educationPlans(List<EdFiStudentSchoolAssociationEducationPlan> educationPlans) {
    this.educationPlans = educationPlans;
    return this;
  }

  public EdFiStudentSchoolAssociation addEducationPlansItem(EdFiStudentSchoolAssociationEducationPlan educationPlansItem) {
    this.educationPlans.add(educationPlansItem);
    return this;
  }

   /**
   * An unordered collection of studentSchoolAssociationEducationPlans. The type of education plan(s) the student is following, if appropriate.
   * @return educationPlans
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentSchoolAssociationEducationPlans. The type of education plan(s) the student is following, if appropriate.")
  public List<EdFiStudentSchoolAssociationEducationPlan> getEducationPlans() {
    return educationPlans;
  }

  public void setEducationPlans(List<EdFiStudentSchoolAssociationEducationPlan> educationPlans) {
    this.educationPlans = educationPlans;
  }

  public EdFiStudentSchoolAssociation employedWhileEnrolled(Boolean employedWhileEnrolled) {
    this.employedWhileEnrolled = employedWhileEnrolled;
    return this;
  }

   /**
   * An individual who is a paid employee or works in his or her own business, profession, or farm and at the same time is enrolled in secondary, postsecondary, or adult education.
   * @return employedWhileEnrolled
  **/
  @ApiModelProperty(example = "null", value = "An individual who is a paid employee or works in his or her own business, profession, or farm and at the same time is enrolled in secondary, postsecondary, or adult education.")
  public Boolean getEmployedWhileEnrolled() {
    return employedWhileEnrolled;
  }

  public void setEmployedWhileEnrolled(Boolean employedWhileEnrolled) {
    this.employedWhileEnrolled = employedWhileEnrolled;
  }

  public EdFiStudentSchoolAssociation entryGradeLevelDescriptor(String entryGradeLevelDescriptor) {
    this.entryGradeLevelDescriptor = entryGradeLevelDescriptor;
    return this;
  }

   /**
   * The grade level or primary instructional level at which a student enters and receives services in a school or an educational institution during a given academic session.
   * @return entryGradeLevelDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The grade level or primary instructional level at which a student enters and receives services in a school or an educational institution during a given academic session.")
  public String getEntryGradeLevelDescriptor() {
    return entryGradeLevelDescriptor;
  }

  public void setEntryGradeLevelDescriptor(String entryGradeLevelDescriptor) {
    this.entryGradeLevelDescriptor = entryGradeLevelDescriptor;
  }

  public EdFiStudentSchoolAssociation entryGradeLevelReasonDescriptor(String entryGradeLevelReasonDescriptor) {
    this.entryGradeLevelReasonDescriptor = entryGradeLevelReasonDescriptor;
    return this;
  }

   /**
   * The primary reason as to why a staff member determined that a student should be promoted or not (or be demoted) at the end of a given school term.
   * @return entryGradeLevelReasonDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The primary reason as to why a staff member determined that a student should be promoted or not (or be demoted) at the end of a given school term.")
  public String getEntryGradeLevelReasonDescriptor() {
    return entryGradeLevelReasonDescriptor;
  }

  public void setEntryGradeLevelReasonDescriptor(String entryGradeLevelReasonDescriptor) {
    this.entryGradeLevelReasonDescriptor = entryGradeLevelReasonDescriptor;
  }

  public EdFiStudentSchoolAssociation entryTypeDescriptor(String entryTypeDescriptor) {
    this.entryTypeDescriptor = entryTypeDescriptor;
    return this;
  }

   /**
   * The process by which a student enters a school during a given academic session.
   * @return entryTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The process by which a student enters a school during a given academic session.")
  public String getEntryTypeDescriptor() {
    return entryTypeDescriptor;
  }

  public void setEntryTypeDescriptor(String entryTypeDescriptor) {
    this.entryTypeDescriptor = entryTypeDescriptor;
  }

  public EdFiStudentSchoolAssociation exitWithdrawDate(LocalDate exitWithdrawDate) {
    this.exitWithdrawDate = exitWithdrawDate;
    return this;
  }

   /**
   * The month, day, and year of the first day after the date of an individual's last attendance at a school (if known), the day on which an individual graduated, or the date on which it becomes known officially that an individual left school.
   * @return exitWithdrawDate
  **/
  @ApiModelProperty(example = "null", value = "The month, day, and year of the first day after the date of an individual's last attendance at a school (if known), the day on which an individual graduated, or the date on which it becomes known officially that an individual left school.")
  public LocalDate getExitWithdrawDate() {
    return exitWithdrawDate;
  }

  public void setExitWithdrawDate(LocalDate exitWithdrawDate) {
    this.exitWithdrawDate = exitWithdrawDate;
  }

  public EdFiStudentSchoolAssociation exitWithdrawTypeDescriptor(String exitWithdrawTypeDescriptor) {
    this.exitWithdrawTypeDescriptor = exitWithdrawTypeDescriptor;
    return this;
  }

   /**
   * The circumstances under which the student exited from membership in an educational institution.
   * @return exitWithdrawTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The circumstances under which the student exited from membership in an educational institution.")
  public String getExitWithdrawTypeDescriptor() {
    return exitWithdrawTypeDescriptor;
  }

  public void setExitWithdrawTypeDescriptor(String exitWithdrawTypeDescriptor) {
    this.exitWithdrawTypeDescriptor = exitWithdrawTypeDescriptor;
  }

  public EdFiStudentSchoolAssociation primarySchool(Boolean primarySchool) {
    this.primarySchool = primarySchool;
    return this;
  }

   /**
   * Indicates if a given enrollment record should be considered the primary record for a student.
   * @return primarySchool
  **/
  @ApiModelProperty(example = "null", value = "Indicates if a given enrollment record should be considered the primary record for a student.")
  public Boolean getPrimarySchool() {
    return primarySchool;
  }

  public void setPrimarySchool(Boolean primarySchool) {
    this.primarySchool = primarySchool;
  }

  public EdFiStudentSchoolAssociation repeatGradeIndicator(Boolean repeatGradeIndicator) {
    this.repeatGradeIndicator = repeatGradeIndicator;
    return this;
  }

   /**
   * An indicator of whether the student is enrolling to repeat a grade level, either by failure or an agreement to hold the student back.
   * @return repeatGradeIndicator
  **/
  @ApiModelProperty(example = "null", value = "An indicator of whether the student is enrolling to repeat a grade level, either by failure or an agreement to hold the student back.")
  public Boolean getRepeatGradeIndicator() {
    return repeatGradeIndicator;
  }

  public void setRepeatGradeIndicator(Boolean repeatGradeIndicator) {
    this.repeatGradeIndicator = repeatGradeIndicator;
  }

  public EdFiStudentSchoolAssociation residencyStatusDescriptor(String residencyStatusDescriptor) {
    this.residencyStatusDescriptor = residencyStatusDescriptor;
    return this;
  }

   /**
   * An indication of the location of a persons legal residence relative to (within or outside of) the boundaries of the public school attended and its administrative unit.
   * @return residencyStatusDescriptor
  **/
  @ApiModelProperty(example = "null", value = "An indication of the location of a persons legal residence relative to (within or outside of) the boundaries of the public school attended and its administrative unit.")
  public String getResidencyStatusDescriptor() {
    return residencyStatusDescriptor;
  }

  public void setResidencyStatusDescriptor(String residencyStatusDescriptor) {
    this.residencyStatusDescriptor = residencyStatusDescriptor;
  }

  public EdFiStudentSchoolAssociation schoolChoiceTransfer(Boolean schoolChoiceTransfer) {
    this.schoolChoiceTransfer = schoolChoiceTransfer;
    return this;
  }

   /**
   * An indication of whether students transferred in or out of the school did so during the school year under the provisions for public school choice in accordance with Title I, Part A, Section 1116.
   * @return schoolChoiceTransfer
  **/
  @ApiModelProperty(example = "null", value = "An indication of whether students transferred in or out of the school did so during the school year under the provisions for public school choice in accordance with Title I, Part A, Section 1116.")
  public Boolean getSchoolChoiceTransfer() {
    return schoolChoiceTransfer;
  }

  public void setSchoolChoiceTransfer(Boolean schoolChoiceTransfer) {
    this.schoolChoiceTransfer = schoolChoiceTransfer;
  }

  public EdFiStudentSchoolAssociation etag(String etag) {
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
    EdFiStudentSchoolAssociation edFiStudentSchoolAssociation = (EdFiStudentSchoolAssociation) o;
    return Objects.equals(this.id, edFiStudentSchoolAssociation.id) &&
        Objects.equals(this.entryDate, edFiStudentSchoolAssociation.entryDate) &&
        Objects.equals(this.calendarReference, edFiStudentSchoolAssociation.calendarReference) &&
        Objects.equals(this.classOfSchoolYearTypeReference, edFiStudentSchoolAssociation.classOfSchoolYearTypeReference) &&
        Objects.equals(this.graduationPlanReference, edFiStudentSchoolAssociation.graduationPlanReference) &&
        Objects.equals(this.schoolReference, edFiStudentSchoolAssociation.schoolReference) &&
        Objects.equals(this.schoolYearTypeReference, edFiStudentSchoolAssociation.schoolYearTypeReference) &&
        Objects.equals(this.studentReference, edFiStudentSchoolAssociation.studentReference) &&
        Objects.equals(this.educationPlans, edFiStudentSchoolAssociation.educationPlans) &&
        Objects.equals(this.employedWhileEnrolled, edFiStudentSchoolAssociation.employedWhileEnrolled) &&
        Objects.equals(this.entryGradeLevelDescriptor, edFiStudentSchoolAssociation.entryGradeLevelDescriptor) &&
        Objects.equals(this.entryGradeLevelReasonDescriptor, edFiStudentSchoolAssociation.entryGradeLevelReasonDescriptor) &&
        Objects.equals(this.entryTypeDescriptor, edFiStudentSchoolAssociation.entryTypeDescriptor) &&
        Objects.equals(this.exitWithdrawDate, edFiStudentSchoolAssociation.exitWithdrawDate) &&
        Objects.equals(this.exitWithdrawTypeDescriptor, edFiStudentSchoolAssociation.exitWithdrawTypeDescriptor) &&
        Objects.equals(this.primarySchool, edFiStudentSchoolAssociation.primarySchool) &&
        Objects.equals(this.repeatGradeIndicator, edFiStudentSchoolAssociation.repeatGradeIndicator) &&
        Objects.equals(this.residencyStatusDescriptor, edFiStudentSchoolAssociation.residencyStatusDescriptor) &&
        Objects.equals(this.schoolChoiceTransfer, edFiStudentSchoolAssociation.schoolChoiceTransfer) &&
        Objects.equals(this.etag, edFiStudentSchoolAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entryDate, calendarReference, classOfSchoolYearTypeReference, graduationPlanReference, schoolReference, schoolYearTypeReference, studentReference, educationPlans, employedWhileEnrolled, entryGradeLevelDescriptor, entryGradeLevelReasonDescriptor, entryTypeDescriptor, exitWithdrawDate, exitWithdrawTypeDescriptor, primarySchool, repeatGradeIndicator, residencyStatusDescriptor, schoolChoiceTransfer, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentSchoolAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    calendarReference: ").append(toIndentedString(calendarReference)).append("\n");
    sb.append("    classOfSchoolYearTypeReference: ").append(toIndentedString(classOfSchoolYearTypeReference)).append("\n");
    sb.append("    graduationPlanReference: ").append(toIndentedString(graduationPlanReference)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    educationPlans: ").append(toIndentedString(educationPlans)).append("\n");
    sb.append("    employedWhileEnrolled: ").append(toIndentedString(employedWhileEnrolled)).append("\n");
    sb.append("    entryGradeLevelDescriptor: ").append(toIndentedString(entryGradeLevelDescriptor)).append("\n");
    sb.append("    entryGradeLevelReasonDescriptor: ").append(toIndentedString(entryGradeLevelReasonDescriptor)).append("\n");
    sb.append("    entryTypeDescriptor: ").append(toIndentedString(entryTypeDescriptor)).append("\n");
    sb.append("    exitWithdrawDate: ").append(toIndentedString(exitWithdrawDate)).append("\n");
    sb.append("    exitWithdrawTypeDescriptor: ").append(toIndentedString(exitWithdrawTypeDescriptor)).append("\n");
    sb.append("    primarySchool: ").append(toIndentedString(primarySchool)).append("\n");
    sb.append("    repeatGradeIndicator: ").append(toIndentedString(repeatGradeIndicator)).append("\n");
    sb.append("    residencyStatusDescriptor: ").append(toIndentedString(residencyStatusDescriptor)).append("\n");
    sb.append("    schoolChoiceTransfer: ").append(toIndentedString(schoolChoiceTransfer)).append("\n");
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

