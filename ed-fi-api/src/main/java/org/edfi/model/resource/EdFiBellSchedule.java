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
import org.edfi.model.resource.EdFiBellScheduleClassPeriod;
import org.edfi.model.resource.EdFiBellScheduleDate;
import org.edfi.model.resource.EdFiBellScheduleGradeLevel;
import org.edfi.model.resource.EdFiSchoolReference;


/**
 * EdFiBellSchedule
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiBellSchedule   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("bellScheduleName")
  private String bellScheduleName = null;

  @SerializedName("classPeriods")
  private List<EdFiBellScheduleClassPeriod> classPeriods = new ArrayList<EdFiBellScheduleClassPeriod>();

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("alternateDayName")
  private String alternateDayName = null;

  @SerializedName("dates")
  private List<EdFiBellScheduleDate> dates = new ArrayList<EdFiBellScheduleDate>();

  @SerializedName("gradeLevels")
  private List<EdFiBellScheduleGradeLevel> gradeLevels = new ArrayList<EdFiBellScheduleGradeLevel>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiBellSchedule id(String id) {
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

  public EdFiBellSchedule bellScheduleName(String bellScheduleName) {
    this.bellScheduleName = bellScheduleName;
    return this;
  }

   /**
   * Name or title of the BellSchedule.
   * @return bellScheduleName
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name or title of the BellSchedule.")
  public String getBellScheduleName() {
    return bellScheduleName;
  }

  public void setBellScheduleName(String bellScheduleName) {
    this.bellScheduleName = bellScheduleName;
  }

  public EdFiBellSchedule classPeriods(List<EdFiBellScheduleClassPeriod> classPeriods) {
    this.classPeriods = classPeriods;
    return this;
  }

  public EdFiBellSchedule addClassPeriodsItem(EdFiBellScheduleClassPeriod classPeriodsItem) {
    this.classPeriods.add(classPeriodsItem);
    return this;
  }

   /**
   * An unordered collection of bellScheduleClassPeriods. The class periods that compose this BellSchedule.
   * @return classPeriods
  **/
  @ApiModelProperty(example = "null", required = true, value = "An unordered collection of bellScheduleClassPeriods. The class periods that compose this BellSchedule.")
  public List<EdFiBellScheduleClassPeriod> getClassPeriods() {
    return classPeriods;
  }

  public void setClassPeriods(List<EdFiBellScheduleClassPeriod> classPeriods) {
    this.classPeriods = classPeriods;
  }

  public EdFiBellSchedule schoolReference(EdFiSchoolReference schoolReference) {
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

  public EdFiBellSchedule alternateDayName(String alternateDayName) {
    this.alternateDayName = alternateDayName;
    return this;
  }

   /**
   * An alternate name for the day (e.g., Red, Blue).
   * @return alternateDayName
  **/
  @ApiModelProperty(example = "null", value = "An alternate name for the day (e.g., Red, Blue).")
  public String getAlternateDayName() {
    return alternateDayName;
  }

  public void setAlternateDayName(String alternateDayName) {
    this.alternateDayName = alternateDayName;
  }

  public EdFiBellSchedule dates(List<EdFiBellScheduleDate> dates) {
    this.dates = dates;
    return this;
  }

  public EdFiBellSchedule addDatesItem(EdFiBellScheduleDate datesItem) {
    this.dates.add(datesItem);
    return this;
  }

   /**
   * An unordered collection of bellScheduleDates. The dates for which the BellSchedule applies.
   * @return dates
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of bellScheduleDates. The dates for which the BellSchedule applies.")
  public List<EdFiBellScheduleDate> getDates() {
    return dates;
  }

  public void setDates(List<EdFiBellScheduleDate> dates) {
    this.dates = dates;
  }

  public EdFiBellSchedule gradeLevels(List<EdFiBellScheduleGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
    return this;
  }

  public EdFiBellSchedule addGradeLevelsItem(EdFiBellScheduleGradeLevel gradeLevelsItem) {
    this.gradeLevels.add(gradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of bellScheduleGradeLevels. The grade levels the particular BellSchedule applies to.
   * @return gradeLevels
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of bellScheduleGradeLevels. The grade levels the particular BellSchedule applies to.")
  public List<EdFiBellScheduleGradeLevel> getGradeLevels() {
    return gradeLevels;
  }

  public void setGradeLevels(List<EdFiBellScheduleGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
  }

  public EdFiBellSchedule etag(String etag) {
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
    EdFiBellSchedule edFiBellSchedule = (EdFiBellSchedule) o;
    return Objects.equals(this.id, edFiBellSchedule.id) &&
        Objects.equals(this.bellScheduleName, edFiBellSchedule.bellScheduleName) &&
        Objects.equals(this.classPeriods, edFiBellSchedule.classPeriods) &&
        Objects.equals(this.schoolReference, edFiBellSchedule.schoolReference) &&
        Objects.equals(this.alternateDayName, edFiBellSchedule.alternateDayName) &&
        Objects.equals(this.dates, edFiBellSchedule.dates) &&
        Objects.equals(this.gradeLevels, edFiBellSchedule.gradeLevels) &&
        Objects.equals(this.etag, edFiBellSchedule.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bellScheduleName, classPeriods, schoolReference, alternateDayName, dates, gradeLevels, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiBellSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bellScheduleName: ").append(toIndentedString(bellScheduleName)).append("\n");
    sb.append("    classPeriods: ").append(toIndentedString(classPeriods)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    alternateDayName: ").append(toIndentedString(alternateDayName)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    gradeLevels: ").append(toIndentedString(gradeLevels)).append("\n");
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

