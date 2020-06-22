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
import org.edfi.model.resource.EdFiSchoolReference;
import org.edfi.model.resource.EdFiSessionReference;
import org.edfi.model.resource.EdFiStudentReference;
import org.joda.time.LocalDate;


/**
 * EdFiStudentSchoolAttendanceEvent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentSchoolAttendanceEvent   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("attendanceEventCategoryDescriptor")
  private String attendanceEventCategoryDescriptor = null;

  @SerializedName("eventDate")
  private LocalDate eventDate = null;

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("sessionReference")
  private EdFiSessionReference sessionReference = null;

  @SerializedName("studentReference")
  private EdFiStudentReference studentReference = null;

  @SerializedName("attendanceEventReason")
  private String attendanceEventReason = null;

  @SerializedName("educationalEnvironmentDescriptor")
  private String educationalEnvironmentDescriptor = null;

  @SerializedName("eventDuration")
  private Double eventDuration = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStudentSchoolAttendanceEvent id(String id) {
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

  public EdFiStudentSchoolAttendanceEvent attendanceEventCategoryDescriptor(String attendanceEventCategoryDescriptor) {
    this.attendanceEventCategoryDescriptor = attendanceEventCategoryDescriptor;
    return this;
  }

   /**
   * A code describing the attendance event, for example:          Present          Unexcused absence          Excused absence          Tardy.
   * @return attendanceEventCategoryDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "A code describing the attendance event, for example:          Present          Unexcused absence          Excused absence          Tardy.")
  public String getAttendanceEventCategoryDescriptor() {
    return attendanceEventCategoryDescriptor;
  }

  public void setAttendanceEventCategoryDescriptor(String attendanceEventCategoryDescriptor) {
    this.attendanceEventCategoryDescriptor = attendanceEventCategoryDescriptor;
  }

  public EdFiStudentSchoolAttendanceEvent eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Date for this attendance event.
   * @return eventDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Date for this attendance event.")
  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public EdFiStudentSchoolAttendanceEvent schoolReference(EdFiSchoolReference schoolReference) {
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

  public EdFiStudentSchoolAttendanceEvent sessionReference(EdFiSessionReference sessionReference) {
    this.sessionReference = sessionReference;
    return this;
  }

   /**
   * Get sessionReference
   * @return sessionReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiSessionReference getSessionReference() {
    return sessionReference;
  }

  public void setSessionReference(EdFiSessionReference sessionReference) {
    this.sessionReference = sessionReference;
  }

  public EdFiStudentSchoolAttendanceEvent studentReference(EdFiStudentReference studentReference) {
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

  public EdFiStudentSchoolAttendanceEvent attendanceEventReason(String attendanceEventReason) {
    this.attendanceEventReason = attendanceEventReason;
    return this;
  }

   /**
   * The reported reason for a student's absence.
   * @return attendanceEventReason
  **/
  @ApiModelProperty(example = "null", value = "The reported reason for a student's absence.")
  public String getAttendanceEventReason() {
    return attendanceEventReason;
  }

  public void setAttendanceEventReason(String attendanceEventReason) {
    this.attendanceEventReason = attendanceEventReason;
  }

  public EdFiStudentSchoolAttendanceEvent educationalEnvironmentDescriptor(String educationalEnvironmentDescriptor) {
    this.educationalEnvironmentDescriptor = educationalEnvironmentDescriptor;
    return this;
  }

   /**
   * The setting in which a child receives education and related services. This attribute is only used if it differs from the EducationalEnvironment of the Section. This is only used in the AttendanceEvent if different from the associated Section.
   * @return educationalEnvironmentDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The setting in which a child receives education and related services. This attribute is only used if it differs from the EducationalEnvironment of the Section. This is only used in the AttendanceEvent if different from the associated Section.")
  public String getEducationalEnvironmentDescriptor() {
    return educationalEnvironmentDescriptor;
  }

  public void setEducationalEnvironmentDescriptor(String educationalEnvironmentDescriptor) {
    this.educationalEnvironmentDescriptor = educationalEnvironmentDescriptor;
  }

  public EdFiStudentSchoolAttendanceEvent eventDuration(Double eventDuration) {
    this.eventDuration = eventDuration;
    return this;
  }

   /**
   * The amount of time for the event as recognized by the school: 1 day = 1, 1/2 day = 0.5, 1/3 day = 0.33.
   * @return eventDuration
  **/
  @ApiModelProperty(example = "null", value = "The amount of time for the event as recognized by the school: 1 day = 1, 1/2 day = 0.5, 1/3 day = 0.33.")
  public Double getEventDuration() {
    return eventDuration;
  }

  public void setEventDuration(Double eventDuration) {
    this.eventDuration = eventDuration;
  }

  public EdFiStudentSchoolAttendanceEvent etag(String etag) {
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
    EdFiStudentSchoolAttendanceEvent edFiStudentSchoolAttendanceEvent = (EdFiStudentSchoolAttendanceEvent) o;
    return Objects.equals(this.id, edFiStudentSchoolAttendanceEvent.id) &&
        Objects.equals(this.attendanceEventCategoryDescriptor, edFiStudentSchoolAttendanceEvent.attendanceEventCategoryDescriptor) &&
        Objects.equals(this.eventDate, edFiStudentSchoolAttendanceEvent.eventDate) &&
        Objects.equals(this.schoolReference, edFiStudentSchoolAttendanceEvent.schoolReference) &&
        Objects.equals(this.sessionReference, edFiStudentSchoolAttendanceEvent.sessionReference) &&
        Objects.equals(this.studentReference, edFiStudentSchoolAttendanceEvent.studentReference) &&
        Objects.equals(this.attendanceEventReason, edFiStudentSchoolAttendanceEvent.attendanceEventReason) &&
        Objects.equals(this.educationalEnvironmentDescriptor, edFiStudentSchoolAttendanceEvent.educationalEnvironmentDescriptor) &&
        Objects.equals(this.eventDuration, edFiStudentSchoolAttendanceEvent.eventDuration) &&
        Objects.equals(this.etag, edFiStudentSchoolAttendanceEvent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attendanceEventCategoryDescriptor, eventDate, schoolReference, sessionReference, studentReference, attendanceEventReason, educationalEnvironmentDescriptor, eventDuration, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentSchoolAttendanceEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attendanceEventCategoryDescriptor: ").append(toIndentedString(attendanceEventCategoryDescriptor)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    sessionReference: ").append(toIndentedString(sessionReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    attendanceEventReason: ").append(toIndentedString(attendanceEventReason)).append("\n");
    sb.append("    educationalEnvironmentDescriptor: ").append(toIndentedString(educationalEnvironmentDescriptor)).append("\n");
    sb.append("    eventDuration: ").append(toIndentedString(eventDuration)).append("\n");
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

