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
import org.edfi.model.resource.EdFiClassPeriodMeetingTime;
import org.edfi.model.resource.EdFiSchoolReference;


/**
 * EdFiClassPeriod
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiClassPeriod   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("classPeriodName")
  private String classPeriodName = null;

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("meetingTimes")
  private List<EdFiClassPeriodMeetingTime> meetingTimes = new ArrayList<EdFiClassPeriodMeetingTime>();

  @SerializedName("officialAttendancePeriod")
  private Boolean officialAttendancePeriod = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiClassPeriod id(String id) {
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

  public EdFiClassPeriod classPeriodName(String classPeriodName) {
    this.classPeriodName = classPeriodName;
    return this;
  }

   /**
   * An indication of the portion of a typical daily session in which students receive instruction in a specified subject (e.g., morning, sixth period, block period, or AB schedules).
   * @return classPeriodName
  **/
  @ApiModelProperty(example = "null", required = true, value = "An indication of the portion of a typical daily session in which students receive instruction in a specified subject (e.g., morning, sixth period, block period, or AB schedules).")
  public String getClassPeriodName() {
    return classPeriodName;
  }

  public void setClassPeriodName(String classPeriodName) {
    this.classPeriodName = classPeriodName;
  }

  public EdFiClassPeriod schoolReference(EdFiSchoolReference schoolReference) {
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

  public EdFiClassPeriod meetingTimes(List<EdFiClassPeriodMeetingTime> meetingTimes) {
    this.meetingTimes = meetingTimes;
    return this;
  }

  public EdFiClassPeriod addMeetingTimesItem(EdFiClassPeriodMeetingTime meetingTimesItem) {
    this.meetingTimes.add(meetingTimesItem);
    return this;
  }

   /**
   * An unordered collection of classPeriodMeetingTimes. The meeting time(s) for a class period.
   * @return meetingTimes
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of classPeriodMeetingTimes. The meeting time(s) for a class period.")
  public List<EdFiClassPeriodMeetingTime> getMeetingTimes() {
    return meetingTimes;
  }

  public void setMeetingTimes(List<EdFiClassPeriodMeetingTime> meetingTimes) {
    this.meetingTimes = meetingTimes;
  }

  public EdFiClassPeriod officialAttendancePeriod(Boolean officialAttendancePeriod) {
    this.officialAttendancePeriod = officialAttendancePeriod;
    return this;
  }

   /**
   * Indicator of whether this class period is used for official daily attendance.
   * @return officialAttendancePeriod
  **/
  @ApiModelProperty(example = "null", value = "Indicator of whether this class period is used for official daily attendance.")
  public Boolean getOfficialAttendancePeriod() {
    return officialAttendancePeriod;
  }

  public void setOfficialAttendancePeriod(Boolean officialAttendancePeriod) {
    this.officialAttendancePeriod = officialAttendancePeriod;
  }

  public EdFiClassPeriod etag(String etag) {
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
    EdFiClassPeriod edFiClassPeriod = (EdFiClassPeriod) o;
    return Objects.equals(this.id, edFiClassPeriod.id) &&
        Objects.equals(this.classPeriodName, edFiClassPeriod.classPeriodName) &&
        Objects.equals(this.schoolReference, edFiClassPeriod.schoolReference) &&
        Objects.equals(this.meetingTimes, edFiClassPeriod.meetingTimes) &&
        Objects.equals(this.officialAttendancePeriod, edFiClassPeriod.officialAttendancePeriod) &&
        Objects.equals(this.etag, edFiClassPeriod.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, classPeriodName, schoolReference, meetingTimes, officialAttendancePeriod, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiClassPeriod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classPeriodName: ").append(toIndentedString(classPeriodName)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    meetingTimes: ").append(toIndentedString(meetingTimes)).append("\n");
    sb.append("    officialAttendancePeriod: ").append(toIndentedString(officialAttendancePeriod)).append("\n");
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

