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
import org.edfi.model.resource.EdFiCalendarGradeLevel;
import org.edfi.model.resource.EdFiSchoolReference;
import org.edfi.model.resource.EdFiSchoolYearTypeReference;


/**
 * EdFiCalendar
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiCalendar   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("calendarCode")
  private String calendarCode = null;

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("schoolYearTypeReference")
  private EdFiSchoolYearTypeReference schoolYearTypeReference = null;

  @SerializedName("calendarTypeDescriptor")
  private String calendarTypeDescriptor = null;

  @SerializedName("gradeLevels")
  private List<EdFiCalendarGradeLevel> gradeLevels = new ArrayList<EdFiCalendarGradeLevel>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiCalendar id(String id) {
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

  public EdFiCalendar calendarCode(String calendarCode) {
    this.calendarCode = calendarCode;
    return this;
  }

   /**
   * The identifier for the Calendar.
   * @return calendarCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier for the Calendar.")
  public String getCalendarCode() {
    return calendarCode;
  }

  public void setCalendarCode(String calendarCode) {
    this.calendarCode = calendarCode;
  }

  public EdFiCalendar schoolReference(EdFiSchoolReference schoolReference) {
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

  public EdFiCalendar schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
    return this;
  }

   /**
   * Get schoolYearTypeReference
   * @return schoolYearTypeReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiSchoolYearTypeReference getSchoolYearTypeReference() {
    return schoolYearTypeReference;
  }

  public void setSchoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
  }

  public EdFiCalendar calendarTypeDescriptor(String calendarTypeDescriptor) {
    this.calendarTypeDescriptor = calendarTypeDescriptor;
    return this;
  }

   /**
   * Indicates the type of Calendar.
   * @return calendarTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "Indicates the type of Calendar.")
  public String getCalendarTypeDescriptor() {
    return calendarTypeDescriptor;
  }

  public void setCalendarTypeDescriptor(String calendarTypeDescriptor) {
    this.calendarTypeDescriptor = calendarTypeDescriptor;
  }

  public EdFiCalendar gradeLevels(List<EdFiCalendarGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
    return this;
  }

  public EdFiCalendar addGradeLevelsItem(EdFiCalendarGradeLevel gradeLevelsItem) {
    this.gradeLevels.add(gradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of calendarGradeLevels. Indicates the GradeLevel associated with the Calendar.
   * @return gradeLevels
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of calendarGradeLevels. Indicates the GradeLevel associated with the Calendar.")
  public List<EdFiCalendarGradeLevel> getGradeLevels() {
    return gradeLevels;
  }

  public void setGradeLevels(List<EdFiCalendarGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
  }

  public EdFiCalendar etag(String etag) {
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
    EdFiCalendar edFiCalendar = (EdFiCalendar) o;
    return Objects.equals(this.id, edFiCalendar.id) &&
        Objects.equals(this.calendarCode, edFiCalendar.calendarCode) &&
        Objects.equals(this.schoolReference, edFiCalendar.schoolReference) &&
        Objects.equals(this.schoolYearTypeReference, edFiCalendar.schoolYearTypeReference) &&
        Objects.equals(this.calendarTypeDescriptor, edFiCalendar.calendarTypeDescriptor) &&
        Objects.equals(this.gradeLevels, edFiCalendar.gradeLevels) &&
        Objects.equals(this.etag, edFiCalendar.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, calendarCode, schoolReference, schoolYearTypeReference, calendarTypeDescriptor, gradeLevels, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCalendar {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    calendarCode: ").append(toIndentedString(calendarCode)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    calendarTypeDescriptor: ").append(toIndentedString(calendarTypeDescriptor)).append("\n");
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

