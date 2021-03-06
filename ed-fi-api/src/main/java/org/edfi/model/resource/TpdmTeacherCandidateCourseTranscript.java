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
import org.edfi.model.resource.EdFiCourseReference;
import org.edfi.model.resource.EdFiSchoolReference;
import org.edfi.model.resource.TpdmTeacherCandidateAcademicRecordReference;
import org.edfi.model.resource.TpdmTeacherCandidateCourseTranscriptEarnedAdditionalCredits;


/**
 * TpdmTeacherCandidateCourseTranscript
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmTeacherCandidateCourseTranscript   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("courseAttemptResultDescriptor")
  private String courseAttemptResultDescriptor = null;

  @SerializedName("courseReference")
  private EdFiCourseReference courseReference = null;

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("teacherCandidateAcademicRecordReference")
  private TpdmTeacherCandidateAcademicRecordReference teacherCandidateAcademicRecordReference = null;

  @SerializedName("alternativeCourseCode")
  private String alternativeCourseCode = null;

  @SerializedName("alternativeCourseTitle")
  private String alternativeCourseTitle = null;

  @SerializedName("attemptedCreditConversion")
  private Double attemptedCreditConversion = null;

  @SerializedName("attemptedCredits")
  private Double attemptedCredits = null;

  @SerializedName("attemptedCreditTypeDescriptor")
  private String attemptedCreditTypeDescriptor = null;

  @SerializedName("courseRepeatCodeDescriptor")
  private String courseRepeatCodeDescriptor = null;

  @SerializedName("courseTitle")
  private String courseTitle = null;

  @SerializedName("earnedAdditionalCredits")
  private List<TpdmTeacherCandidateCourseTranscriptEarnedAdditionalCredits> earnedAdditionalCredits = new ArrayList<TpdmTeacherCandidateCourseTranscriptEarnedAdditionalCredits>();

  @SerializedName("earnedCreditConversion")
  private Double earnedCreditConversion = null;

  @SerializedName("earnedCredits")
  private Double earnedCredits = null;

  @SerializedName("earnedCreditTypeDescriptor")
  private String earnedCreditTypeDescriptor = null;

  @SerializedName("finalLetterGradeEarned")
  private String finalLetterGradeEarned = null;

  @SerializedName("finalNumericGradeEarned")
  private Double finalNumericGradeEarned = null;

  @SerializedName("methodCreditEarnedDescriptor")
  private String methodCreditEarnedDescriptor = null;

  @SerializedName("whenTakenGradeLevelDescriptor")
  private String whenTakenGradeLevelDescriptor = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmTeacherCandidateCourseTranscript id(String id) {
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

  public TpdmTeacherCandidateCourseTranscript courseAttemptResultDescriptor(String courseAttemptResultDescriptor) {
    this.courseAttemptResultDescriptor = courseAttemptResultDescriptor;
    return this;
  }

   /**
   * The result from the student's attempt to take the course, for example:          Pass          Fail          Incomplete          Withdrawn.
   * @return courseAttemptResultDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The result from the student's attempt to take the course, for example:          Pass          Fail          Incomplete          Withdrawn.")
  public String getCourseAttemptResultDescriptor() {
    return courseAttemptResultDescriptor;
  }

  public void setCourseAttemptResultDescriptor(String courseAttemptResultDescriptor) {
    this.courseAttemptResultDescriptor = courseAttemptResultDescriptor;
  }

  public TpdmTeacherCandidateCourseTranscript courseReference(EdFiCourseReference courseReference) {
    this.courseReference = courseReference;
    return this;
  }

   /**
   * Get courseReference
   * @return courseReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiCourseReference getCourseReference() {
    return courseReference;
  }

  public void setCourseReference(EdFiCourseReference courseReference) {
    this.courseReference = courseReference;
  }

  public TpdmTeacherCandidateCourseTranscript schoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
    return this;
  }

   /**
   * Get schoolReference
   * @return schoolReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiSchoolReference getSchoolReference() {
    return schoolReference;
  }

  public void setSchoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
  }

  public TpdmTeacherCandidateCourseTranscript teacherCandidateAcademicRecordReference(TpdmTeacherCandidateAcademicRecordReference teacherCandidateAcademicRecordReference) {
    this.teacherCandidateAcademicRecordReference = teacherCandidateAcademicRecordReference;
    return this;
  }

   /**
   * Get teacherCandidateAcademicRecordReference
   * @return teacherCandidateAcademicRecordReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TpdmTeacherCandidateAcademicRecordReference getTeacherCandidateAcademicRecordReference() {
    return teacherCandidateAcademicRecordReference;
  }

  public void setTeacherCandidateAcademicRecordReference(TpdmTeacherCandidateAcademicRecordReference teacherCandidateAcademicRecordReference) {
    this.teacherCandidateAcademicRecordReference = teacherCandidateAcademicRecordReference;
  }

  public TpdmTeacherCandidateCourseTranscript alternativeCourseCode(String alternativeCourseCode) {
    this.alternativeCourseCode = alternativeCourseCode;
    return this;
  }

   /**
   * The local code assigned by the school that identifies the course offering, the code from an external educational organization, or other alternate course code.
   * @return alternativeCourseCode
  **/
  @ApiModelProperty(example = "null", value = "The local code assigned by the school that identifies the course offering, the code from an external educational organization, or other alternate course code.")
  public String getAlternativeCourseCode() {
    return alternativeCourseCode;
  }

  public void setAlternativeCourseCode(String alternativeCourseCode) {
    this.alternativeCourseCode = alternativeCourseCode;
  }

  public TpdmTeacherCandidateCourseTranscript alternativeCourseTitle(String alternativeCourseTitle) {
    this.alternativeCourseTitle = alternativeCourseTitle;
    return this;
  }

   /**
   * The descriptive name given to a course of study offered in the school, if different from the CourseTitle.
   * @return alternativeCourseTitle
  **/
  @ApiModelProperty(example = "null", value = "The descriptive name given to a course of study offered in the school, if different from the CourseTitle.")
  public String getAlternativeCourseTitle() {
    return alternativeCourseTitle;
  }

  public void setAlternativeCourseTitle(String alternativeCourseTitle) {
    this.alternativeCourseTitle = alternativeCourseTitle;
  }

  public TpdmTeacherCandidateCourseTranscript attemptedCreditConversion(Double attemptedCreditConversion) {
    this.attemptedCreditConversion = attemptedCreditConversion;
    return this;
  }

   /**
   * Conversion factor that when multiplied by the number of credits is equivalent to Carnegie units.
   * @return attemptedCreditConversion
  **/
  @ApiModelProperty(example = "null", value = "Conversion factor that when multiplied by the number of credits is equivalent to Carnegie units.")
  public Double getAttemptedCreditConversion() {
    return attemptedCreditConversion;
  }

  public void setAttemptedCreditConversion(Double attemptedCreditConversion) {
    this.attemptedCreditConversion = attemptedCreditConversion;
  }

  public TpdmTeacherCandidateCourseTranscript attemptedCredits(Double attemptedCredits) {
    this.attemptedCredits = attemptedCredits;
    return this;
  }

   /**
   * The value of credits or units of value awarded for the completion of a course.
   * @return attemptedCredits
  **/
  @ApiModelProperty(example = "null", value = "The value of credits or units of value awarded for the completion of a course.")
  public Double getAttemptedCredits() {
    return attemptedCredits;
  }

  public void setAttemptedCredits(Double attemptedCredits) {
    this.attemptedCredits = attemptedCredits;
  }

  public TpdmTeacherCandidateCourseTranscript attemptedCreditTypeDescriptor(String attemptedCreditTypeDescriptor) {
    this.attemptedCreditTypeDescriptor = attemptedCreditTypeDescriptor;
    return this;
  }

   /**
   * The type of credits or units of value awarded for the completion of a course.
   * @return attemptedCreditTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The type of credits or units of value awarded for the completion of a course.")
  public String getAttemptedCreditTypeDescriptor() {
    return attemptedCreditTypeDescriptor;
  }

  public void setAttemptedCreditTypeDescriptor(String attemptedCreditTypeDescriptor) {
    this.attemptedCreditTypeDescriptor = attemptedCreditTypeDescriptor;
  }

  public TpdmTeacherCandidateCourseTranscript courseRepeatCodeDescriptor(String courseRepeatCodeDescriptor) {
    this.courseRepeatCodeDescriptor = courseRepeatCodeDescriptor;
    return this;
  }

   /**
   * Indicates that an academic course has been repeated by a student and how that repeat is to be computed in the student's academic grade average.
   * @return courseRepeatCodeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "Indicates that an academic course has been repeated by a student and how that repeat is to be computed in the student's academic grade average.")
  public String getCourseRepeatCodeDescriptor() {
    return courseRepeatCodeDescriptor;
  }

  public void setCourseRepeatCodeDescriptor(String courseRepeatCodeDescriptor) {
    this.courseRepeatCodeDescriptor = courseRepeatCodeDescriptor;
  }

  public TpdmTeacherCandidateCourseTranscript courseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
    return this;
  }

   /**
   * The descriptive name given to a course of study offered in a school or other institution or organization. In departmentalized classes at the elementary, secondary, and postsecondary levels (and for staff development activities), this refers to the name by which a course is identified (e.g., American History, English III). For elementary and other non-departmentalized classes, it refers to any portion of the instruction for which a grade or report is assigned (e.g., reading, composition, spelling, language arts).
   * @return courseTitle
  **/
  @ApiModelProperty(example = "null", value = "The descriptive name given to a course of study offered in a school or other institution or organization. In departmentalized classes at the elementary, secondary, and postsecondary levels (and for staff development activities), this refers to the name by which a course is identified (e.g., American History, English III). For elementary and other non-departmentalized classes, it refers to any portion of the instruction for which a grade or report is assigned (e.g., reading, composition, spelling, language arts).")
  public String getCourseTitle() {
    return courseTitle;
  }

  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }

  public TpdmTeacherCandidateCourseTranscript earnedAdditionalCredits(List<TpdmTeacherCandidateCourseTranscriptEarnedAdditionalCredits> earnedAdditionalCredits) {
    this.earnedAdditionalCredits = earnedAdditionalCredits;
    return this;
  }

  public TpdmTeacherCandidateCourseTranscript addEarnedAdditionalCreditsItem(TpdmTeacherCandidateCourseTranscriptEarnedAdditionalCredits earnedAdditionalCreditsItem) {
    this.earnedAdditionalCredits.add(earnedAdditionalCreditsItem);
    return this;
  }

   /**
   * An unordered collection of teacherCandidateCourseTranscriptEarnedAdditionalCredits. The number of additional credits a student attempted and could earn for successfully completing a given course (e.g., dual credit, AP, IB).
   * @return earnedAdditionalCredits
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of teacherCandidateCourseTranscriptEarnedAdditionalCredits. The number of additional credits a student attempted and could earn for successfully completing a given course (e.g., dual credit, AP, IB).")
  public List<TpdmTeacherCandidateCourseTranscriptEarnedAdditionalCredits> getEarnedAdditionalCredits() {
    return earnedAdditionalCredits;
  }

  public void setEarnedAdditionalCredits(List<TpdmTeacherCandidateCourseTranscriptEarnedAdditionalCredits> earnedAdditionalCredits) {
    this.earnedAdditionalCredits = earnedAdditionalCredits;
  }

  public TpdmTeacherCandidateCourseTranscript earnedCreditConversion(Double earnedCreditConversion) {
    this.earnedCreditConversion = earnedCreditConversion;
    return this;
  }

   /**
   * Conversion factor that when multiplied by the number of credits is equivalent to Carnegie units.
   * @return earnedCreditConversion
  **/
  @ApiModelProperty(example = "null", value = "Conversion factor that when multiplied by the number of credits is equivalent to Carnegie units.")
  public Double getEarnedCreditConversion() {
    return earnedCreditConversion;
  }

  public void setEarnedCreditConversion(Double earnedCreditConversion) {
    this.earnedCreditConversion = earnedCreditConversion;
  }

  public TpdmTeacherCandidateCourseTranscript earnedCredits(Double earnedCredits) {
    this.earnedCredits = earnedCredits;
    return this;
  }

   /**
   * The value of credits or units of value awarded for the completion of a course.
   * @return earnedCredits
  **/
  @ApiModelProperty(example = "null", required = true, value = "The value of credits or units of value awarded for the completion of a course.")
  public Double getEarnedCredits() {
    return earnedCredits;
  }

  public void setEarnedCredits(Double earnedCredits) {
    this.earnedCredits = earnedCredits;
  }

  public TpdmTeacherCandidateCourseTranscript earnedCreditTypeDescriptor(String earnedCreditTypeDescriptor) {
    this.earnedCreditTypeDescriptor = earnedCreditTypeDescriptor;
    return this;
  }

   /**
   * The type of credits or units of value awarded for the completion of a course.
   * @return earnedCreditTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The type of credits or units of value awarded for the completion of a course.")
  public String getEarnedCreditTypeDescriptor() {
    return earnedCreditTypeDescriptor;
  }

  public void setEarnedCreditTypeDescriptor(String earnedCreditTypeDescriptor) {
    this.earnedCreditTypeDescriptor = earnedCreditTypeDescriptor;
  }

  public TpdmTeacherCandidateCourseTranscript finalLetterGradeEarned(String finalLetterGradeEarned) {
    this.finalLetterGradeEarned = finalLetterGradeEarned;
    return this;
  }

   /**
   * The final indicator of student performance in a class as submitted by the instructor.
   * @return finalLetterGradeEarned
  **/
  @ApiModelProperty(example = "null", value = "The final indicator of student performance in a class as submitted by the instructor.")
  public String getFinalLetterGradeEarned() {
    return finalLetterGradeEarned;
  }

  public void setFinalLetterGradeEarned(String finalLetterGradeEarned) {
    this.finalLetterGradeEarned = finalLetterGradeEarned;
  }

  public TpdmTeacherCandidateCourseTranscript finalNumericGradeEarned(Double finalNumericGradeEarned) {
    this.finalNumericGradeEarned = finalNumericGradeEarned;
    return this;
  }

   /**
   * The final indicator of student performance in a class as submitted by the instructor.
   * @return finalNumericGradeEarned
  **/
  @ApiModelProperty(example = "null", value = "The final indicator of student performance in a class as submitted by the instructor.")
  public Double getFinalNumericGradeEarned() {
    return finalNumericGradeEarned;
  }

  public void setFinalNumericGradeEarned(Double finalNumericGradeEarned) {
    this.finalNumericGradeEarned = finalNumericGradeEarned;
  }

  public TpdmTeacherCandidateCourseTranscript methodCreditEarnedDescriptor(String methodCreditEarnedDescriptor) {
    this.methodCreditEarnedDescriptor = methodCreditEarnedDescriptor;
    return this;
  }

   /**
   * The method the credits were earned (e.g., Classroom, Examination, Transfer).
   * @return methodCreditEarnedDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The method the credits were earned (e.g., Classroom, Examination, Transfer).")
  public String getMethodCreditEarnedDescriptor() {
    return methodCreditEarnedDescriptor;
  }

  public void setMethodCreditEarnedDescriptor(String methodCreditEarnedDescriptor) {
    this.methodCreditEarnedDescriptor = methodCreditEarnedDescriptor;
  }

  public TpdmTeacherCandidateCourseTranscript whenTakenGradeLevelDescriptor(String whenTakenGradeLevelDescriptor) {
    this.whenTakenGradeLevelDescriptor = whenTakenGradeLevelDescriptor;
    return this;
  }

   /**
   * Student's grade level at time of course.
   * @return whenTakenGradeLevelDescriptor
  **/
  @ApiModelProperty(example = "null", value = "Student's grade level at time of course.")
  public String getWhenTakenGradeLevelDescriptor() {
    return whenTakenGradeLevelDescriptor;
  }

  public void setWhenTakenGradeLevelDescriptor(String whenTakenGradeLevelDescriptor) {
    this.whenTakenGradeLevelDescriptor = whenTakenGradeLevelDescriptor;
  }

  public TpdmTeacherCandidateCourseTranscript etag(String etag) {
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
    TpdmTeacherCandidateCourseTranscript tpdmTeacherCandidateCourseTranscript = (TpdmTeacherCandidateCourseTranscript) o;
    return Objects.equals(this.id, tpdmTeacherCandidateCourseTranscript.id) &&
        Objects.equals(this.courseAttemptResultDescriptor, tpdmTeacherCandidateCourseTranscript.courseAttemptResultDescriptor) &&
        Objects.equals(this.courseReference, tpdmTeacherCandidateCourseTranscript.courseReference) &&
        Objects.equals(this.schoolReference, tpdmTeacherCandidateCourseTranscript.schoolReference) &&
        Objects.equals(this.teacherCandidateAcademicRecordReference, tpdmTeacherCandidateCourseTranscript.teacherCandidateAcademicRecordReference) &&
        Objects.equals(this.alternativeCourseCode, tpdmTeacherCandidateCourseTranscript.alternativeCourseCode) &&
        Objects.equals(this.alternativeCourseTitle, tpdmTeacherCandidateCourseTranscript.alternativeCourseTitle) &&
        Objects.equals(this.attemptedCreditConversion, tpdmTeacherCandidateCourseTranscript.attemptedCreditConversion) &&
        Objects.equals(this.attemptedCredits, tpdmTeacherCandidateCourseTranscript.attemptedCredits) &&
        Objects.equals(this.attemptedCreditTypeDescriptor, tpdmTeacherCandidateCourseTranscript.attemptedCreditTypeDescriptor) &&
        Objects.equals(this.courseRepeatCodeDescriptor, tpdmTeacherCandidateCourseTranscript.courseRepeatCodeDescriptor) &&
        Objects.equals(this.courseTitle, tpdmTeacherCandidateCourseTranscript.courseTitle) &&
        Objects.equals(this.earnedAdditionalCredits, tpdmTeacherCandidateCourseTranscript.earnedAdditionalCredits) &&
        Objects.equals(this.earnedCreditConversion, tpdmTeacherCandidateCourseTranscript.earnedCreditConversion) &&
        Objects.equals(this.earnedCredits, tpdmTeacherCandidateCourseTranscript.earnedCredits) &&
        Objects.equals(this.earnedCreditTypeDescriptor, tpdmTeacherCandidateCourseTranscript.earnedCreditTypeDescriptor) &&
        Objects.equals(this.finalLetterGradeEarned, tpdmTeacherCandidateCourseTranscript.finalLetterGradeEarned) &&
        Objects.equals(this.finalNumericGradeEarned, tpdmTeacherCandidateCourseTranscript.finalNumericGradeEarned) &&
        Objects.equals(this.methodCreditEarnedDescriptor, tpdmTeacherCandidateCourseTranscript.methodCreditEarnedDescriptor) &&
        Objects.equals(this.whenTakenGradeLevelDescriptor, tpdmTeacherCandidateCourseTranscript.whenTakenGradeLevelDescriptor) &&
        Objects.equals(this.etag, tpdmTeacherCandidateCourseTranscript.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, courseAttemptResultDescriptor, courseReference, schoolReference, teacherCandidateAcademicRecordReference, alternativeCourseCode, alternativeCourseTitle, attemptedCreditConversion, attemptedCredits, attemptedCreditTypeDescriptor, courseRepeatCodeDescriptor, courseTitle, earnedAdditionalCredits, earnedCreditConversion, earnedCredits, earnedCreditTypeDescriptor, finalLetterGradeEarned, finalNumericGradeEarned, methodCreditEarnedDescriptor, whenTakenGradeLevelDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmTeacherCandidateCourseTranscript {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    courseAttemptResultDescriptor: ").append(toIndentedString(courseAttemptResultDescriptor)).append("\n");
    sb.append("    courseReference: ").append(toIndentedString(courseReference)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    teacherCandidateAcademicRecordReference: ").append(toIndentedString(teacherCandidateAcademicRecordReference)).append("\n");
    sb.append("    alternativeCourseCode: ").append(toIndentedString(alternativeCourseCode)).append("\n");
    sb.append("    alternativeCourseTitle: ").append(toIndentedString(alternativeCourseTitle)).append("\n");
    sb.append("    attemptedCreditConversion: ").append(toIndentedString(attemptedCreditConversion)).append("\n");
    sb.append("    attemptedCredits: ").append(toIndentedString(attemptedCredits)).append("\n");
    sb.append("    attemptedCreditTypeDescriptor: ").append(toIndentedString(attemptedCreditTypeDescriptor)).append("\n");
    sb.append("    courseRepeatCodeDescriptor: ").append(toIndentedString(courseRepeatCodeDescriptor)).append("\n");
    sb.append("    courseTitle: ").append(toIndentedString(courseTitle)).append("\n");
    sb.append("    earnedAdditionalCredits: ").append(toIndentedString(earnedAdditionalCredits)).append("\n");
    sb.append("    earnedCreditConversion: ").append(toIndentedString(earnedCreditConversion)).append("\n");
    sb.append("    earnedCredits: ").append(toIndentedString(earnedCredits)).append("\n");
    sb.append("    earnedCreditTypeDescriptor: ").append(toIndentedString(earnedCreditTypeDescriptor)).append("\n");
    sb.append("    finalLetterGradeEarned: ").append(toIndentedString(finalLetterGradeEarned)).append("\n");
    sb.append("    finalNumericGradeEarned: ").append(toIndentedString(finalNumericGradeEarned)).append("\n");
    sb.append("    methodCreditEarnedDescriptor: ").append(toIndentedString(methodCreditEarnedDescriptor)).append("\n");
    sb.append("    whenTakenGradeLevelDescriptor: ").append(toIndentedString(whenTakenGradeLevelDescriptor)).append("\n");
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

