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
import org.edfi.model.resource.TpdmTeacherCandidateFieldworkExperienceCoteaching;
import org.edfi.model.resource.TpdmTeacherCandidateFieldworkExperienceSchool;
import org.edfi.model.resource.TpdmTeacherCandidateReference;
import org.joda.time.LocalDate;


/**
 * TpdmTeacherCandidateFieldworkExperience
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmTeacherCandidateFieldworkExperience   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("beginDate")
  private LocalDate beginDate = null;

  @SerializedName("fieldworkIdentifier")
  private String fieldworkIdentifier = null;

  @SerializedName("schools")
  private List<TpdmTeacherCandidateFieldworkExperienceSchool> schools = new ArrayList<TpdmTeacherCandidateFieldworkExperienceSchool>();

  @SerializedName("teacherCandidateReference")
  private TpdmTeacherCandidateReference teacherCandidateReference = null;

  @SerializedName("coteaching")
  private TpdmTeacherCandidateFieldworkExperienceCoteaching coteaching = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("fieldworkTypeDescriptor")
  private String fieldworkTypeDescriptor = null;

  @SerializedName("hoursCompleted")
  private Double hoursCompleted = null;

  @SerializedName("programGatewayDescriptor")
  private String programGatewayDescriptor = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmTeacherCandidateFieldworkExperience id(String id) {
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

  public TpdmTeacherCandidateFieldworkExperience beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The month, day, and year on which the teacher candidate first starts fieldwork.
   * @return beginDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The month, day, and year on which the teacher candidate first starts fieldwork.")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public TpdmTeacherCandidateFieldworkExperience fieldworkIdentifier(String fieldworkIdentifier) {
    this.fieldworkIdentifier = fieldworkIdentifier;
    return this;
  }

   /**
   * The unique identifier for the fieldwork experience
   * @return fieldworkIdentifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for the fieldwork experience")
  public String getFieldworkIdentifier() {
    return fieldworkIdentifier;
  }

  public void setFieldworkIdentifier(String fieldworkIdentifier) {
    this.fieldworkIdentifier = fieldworkIdentifier;
  }

  public TpdmTeacherCandidateFieldworkExperience schools(List<TpdmTeacherCandidateFieldworkExperienceSchool> schools) {
    this.schools = schools;
    return this;
  }

  public TpdmTeacherCandidateFieldworkExperience addSchoolsItem(TpdmTeacherCandidateFieldworkExperienceSchool schoolsItem) {
    this.schools.add(schoolsItem);
    return this;
  }

   /**
   * An unordered collection of teacherCandidateFieldworkExperienceSchools. The school the teacher candidate is assigned to.
   * @return schools
  **/
  @ApiModelProperty(example = "null", required = true, value = "An unordered collection of teacherCandidateFieldworkExperienceSchools. The school the teacher candidate is assigned to.")
  public List<TpdmTeacherCandidateFieldworkExperienceSchool> getSchools() {
    return schools;
  }

  public void setSchools(List<TpdmTeacherCandidateFieldworkExperienceSchool> schools) {
    this.schools = schools;
  }

  public TpdmTeacherCandidateFieldworkExperience teacherCandidateReference(TpdmTeacherCandidateReference teacherCandidateReference) {
    this.teacherCandidateReference = teacherCandidateReference;
    return this;
  }

   /**
   * Get teacherCandidateReference
   * @return teacherCandidateReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TpdmTeacherCandidateReference getTeacherCandidateReference() {
    return teacherCandidateReference;
  }

  public void setTeacherCandidateReference(TpdmTeacherCandidateReference teacherCandidateReference) {
    this.teacherCandidateReference = teacherCandidateReference;
  }

  public TpdmTeacherCandidateFieldworkExperience coteaching(TpdmTeacherCandidateFieldworkExperienceCoteaching coteaching) {
    this.coteaching = coteaching;
    return this;
  }

   /**
   * Get coteaching
   * @return coteaching
  **/
  @ApiModelProperty(example = "null", value = "")
  public TpdmTeacherCandidateFieldworkExperienceCoteaching getCoteaching() {
    return coteaching;
  }

  public void setCoteaching(TpdmTeacherCandidateFieldworkExperienceCoteaching coteaching) {
    this.coteaching = coteaching;
  }

  public TpdmTeacherCandidateFieldworkExperience endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The month, day, and year on which the teacher candidate ends fieldwork.
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "The month, day, and year on which the teacher candidate ends fieldwork.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public TpdmTeacherCandidateFieldworkExperience fieldworkTypeDescriptor(String fieldworkTypeDescriptor) {
    this.fieldworkTypeDescriptor = fieldworkTypeDescriptor;
    return this;
  }

   /**
   * The type of fieldwork being executed by a teacher candidate.
   * @return fieldworkTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of fieldwork being executed by a teacher candidate.")
  public String getFieldworkTypeDescriptor() {
    return fieldworkTypeDescriptor;
  }

  public void setFieldworkTypeDescriptor(String fieldworkTypeDescriptor) {
    this.fieldworkTypeDescriptor = fieldworkTypeDescriptor;
  }

  public TpdmTeacherCandidateFieldworkExperience hoursCompleted(Double hoursCompleted) {
    this.hoursCompleted = hoursCompleted;
    return this;
  }

   /**
   * The number of hours completed during the fieldwork experience.
   * @return hoursCompleted
  **/
  @ApiModelProperty(example = "null", value = "The number of hours completed during the fieldwork experience.")
  public Double getHoursCompleted() {
    return hoursCompleted;
  }

  public void setHoursCompleted(Double hoursCompleted) {
    this.hoursCompleted = hoursCompleted;
  }

  public TpdmTeacherCandidateFieldworkExperience programGatewayDescriptor(String programGatewayDescriptor) {
    this.programGatewayDescriptor = programGatewayDescriptor;
    return this;
  }

   /**
   * The descriptor holds the program gateway that is associated with continuation in a program.
   * @return programGatewayDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The descriptor holds the program gateway that is associated with continuation in a program.")
  public String getProgramGatewayDescriptor() {
    return programGatewayDescriptor;
  }

  public void setProgramGatewayDescriptor(String programGatewayDescriptor) {
    this.programGatewayDescriptor = programGatewayDescriptor;
  }

  public TpdmTeacherCandidateFieldworkExperience etag(String etag) {
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
    TpdmTeacherCandidateFieldworkExperience tpdmTeacherCandidateFieldworkExperience = (TpdmTeacherCandidateFieldworkExperience) o;
    return Objects.equals(this.id, tpdmTeacherCandidateFieldworkExperience.id) &&
        Objects.equals(this.beginDate, tpdmTeacherCandidateFieldworkExperience.beginDate) &&
        Objects.equals(this.fieldworkIdentifier, tpdmTeacherCandidateFieldworkExperience.fieldworkIdentifier) &&
        Objects.equals(this.schools, tpdmTeacherCandidateFieldworkExperience.schools) &&
        Objects.equals(this.teacherCandidateReference, tpdmTeacherCandidateFieldworkExperience.teacherCandidateReference) &&
        Objects.equals(this.coteaching, tpdmTeacherCandidateFieldworkExperience.coteaching) &&
        Objects.equals(this.endDate, tpdmTeacherCandidateFieldworkExperience.endDate) &&
        Objects.equals(this.fieldworkTypeDescriptor, tpdmTeacherCandidateFieldworkExperience.fieldworkTypeDescriptor) &&
        Objects.equals(this.hoursCompleted, tpdmTeacherCandidateFieldworkExperience.hoursCompleted) &&
        Objects.equals(this.programGatewayDescriptor, tpdmTeacherCandidateFieldworkExperience.programGatewayDescriptor) &&
        Objects.equals(this.etag, tpdmTeacherCandidateFieldworkExperience.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, fieldworkIdentifier, schools, teacherCandidateReference, coteaching, endDate, fieldworkTypeDescriptor, hoursCompleted, programGatewayDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmTeacherCandidateFieldworkExperience {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    fieldworkIdentifier: ").append(toIndentedString(fieldworkIdentifier)).append("\n");
    sb.append("    schools: ").append(toIndentedString(schools)).append("\n");
    sb.append("    teacherCandidateReference: ").append(toIndentedString(teacherCandidateReference)).append("\n");
    sb.append("    coteaching: ").append(toIndentedString(coteaching)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fieldworkTypeDescriptor: ").append(toIndentedString(fieldworkTypeDescriptor)).append("\n");
    sb.append("    hoursCompleted: ").append(toIndentedString(hoursCompleted)).append("\n");
    sb.append("    programGatewayDescriptor: ").append(toIndentedString(programGatewayDescriptor)).append("\n");
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

