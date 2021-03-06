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
import org.edfi.model.resource.EdFiSchoolReference;
import org.edfi.model.resource.EdFiSchoolYearTypeReference;
import org.edfi.model.resource.EdFiStaffReference;
import org.edfi.model.resource.EdFiStaffSchoolAssociationAcademicSubject;
import org.edfi.model.resource.EdFiStaffSchoolAssociationGradeLevel;


/**
 * EdFiStaffSchoolAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStaffSchoolAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("programAssignmentDescriptor")
  private String programAssignmentDescriptor = null;

  @SerializedName("calendarReference")
  private EdFiCalendarReference calendarReference = null;

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("schoolYearTypeReference")
  private EdFiSchoolYearTypeReference schoolYearTypeReference = null;

  @SerializedName("staffReference")
  private EdFiStaffReference staffReference = null;

  @SerializedName("academicSubjects")
  private List<EdFiStaffSchoolAssociationAcademicSubject> academicSubjects = new ArrayList<EdFiStaffSchoolAssociationAcademicSubject>();

  @SerializedName("gradeLevels")
  private List<EdFiStaffSchoolAssociationGradeLevel> gradeLevels = new ArrayList<EdFiStaffSchoolAssociationGradeLevel>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStaffSchoolAssociation id(String id) {
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

  public EdFiStaffSchoolAssociation programAssignmentDescriptor(String programAssignmentDescriptor) {
    this.programAssignmentDescriptor = programAssignmentDescriptor;
    return this;
  }

   /**
   * The name of the program for which the individual is assigned; for example:          Regular education          Title I-Academic          Title I-Non-Academic          Special Education          Bilingual/English as a Second Language.
   * @return programAssignmentDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the program for which the individual is assigned; for example:          Regular education          Title I-Academic          Title I-Non-Academic          Special Education          Bilingual/English as a Second Language.")
  public String getProgramAssignmentDescriptor() {
    return programAssignmentDescriptor;
  }

  public void setProgramAssignmentDescriptor(String programAssignmentDescriptor) {
    this.programAssignmentDescriptor = programAssignmentDescriptor;
  }

  public EdFiStaffSchoolAssociation calendarReference(EdFiCalendarReference calendarReference) {
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

  public EdFiStaffSchoolAssociation schoolReference(EdFiSchoolReference schoolReference) {
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

  public EdFiStaffSchoolAssociation schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
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

  public EdFiStaffSchoolAssociation staffReference(EdFiStaffReference staffReference) {
    this.staffReference = staffReference;
    return this;
  }

   /**
   * Get staffReference
   * @return staffReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiStaffReference getStaffReference() {
    return staffReference;
  }

  public void setStaffReference(EdFiStaffReference staffReference) {
    this.staffReference = staffReference;
  }

  public EdFiStaffSchoolAssociation academicSubjects(List<EdFiStaffSchoolAssociationAcademicSubject> academicSubjects) {
    this.academicSubjects = academicSubjects;
    return this;
  }

  public EdFiStaffSchoolAssociation addAcademicSubjectsItem(EdFiStaffSchoolAssociationAcademicSubject academicSubjectsItem) {
    this.academicSubjects.add(academicSubjectsItem);
    return this;
  }

   /**
   * An unordered collection of staffSchoolAssociationAcademicSubjects. The teaching field taught by an individual, for example English/Language Arts, Reading, Mathematics, Science, Social Sciences, etc.
   * @return academicSubjects
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of staffSchoolAssociationAcademicSubjects. The teaching field taught by an individual, for example English/Language Arts, Reading, Mathematics, Science, Social Sciences, etc.")
  public List<EdFiStaffSchoolAssociationAcademicSubject> getAcademicSubjects() {
    return academicSubjects;
  }

  public void setAcademicSubjects(List<EdFiStaffSchoolAssociationAcademicSubject> academicSubjects) {
    this.academicSubjects = academicSubjects;
  }

  public EdFiStaffSchoolAssociation gradeLevels(List<EdFiStaffSchoolAssociationGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
    return this;
  }

  public EdFiStaffSchoolAssociation addGradeLevelsItem(EdFiStaffSchoolAssociationGradeLevel gradeLevelsItem) {
    this.gradeLevels.add(gradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of staffSchoolAssociationGradeLevels. The set of grade levels for which the individual's assignment is responsible.
   * @return gradeLevels
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of staffSchoolAssociationGradeLevels. The set of grade levels for which the individual's assignment is responsible.")
  public List<EdFiStaffSchoolAssociationGradeLevel> getGradeLevels() {
    return gradeLevels;
  }

  public void setGradeLevels(List<EdFiStaffSchoolAssociationGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
  }

  public EdFiStaffSchoolAssociation etag(String etag) {
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
    EdFiStaffSchoolAssociation edFiStaffSchoolAssociation = (EdFiStaffSchoolAssociation) o;
    return Objects.equals(this.id, edFiStaffSchoolAssociation.id) &&
        Objects.equals(this.programAssignmentDescriptor, edFiStaffSchoolAssociation.programAssignmentDescriptor) &&
        Objects.equals(this.calendarReference, edFiStaffSchoolAssociation.calendarReference) &&
        Objects.equals(this.schoolReference, edFiStaffSchoolAssociation.schoolReference) &&
        Objects.equals(this.schoolYearTypeReference, edFiStaffSchoolAssociation.schoolYearTypeReference) &&
        Objects.equals(this.staffReference, edFiStaffSchoolAssociation.staffReference) &&
        Objects.equals(this.academicSubjects, edFiStaffSchoolAssociation.academicSubjects) &&
        Objects.equals(this.gradeLevels, edFiStaffSchoolAssociation.gradeLevels) &&
        Objects.equals(this.etag, edFiStaffSchoolAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, programAssignmentDescriptor, calendarReference, schoolReference, schoolYearTypeReference, staffReference, academicSubjects, gradeLevels, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffSchoolAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    programAssignmentDescriptor: ").append(toIndentedString(programAssignmentDescriptor)).append("\n");
    sb.append("    calendarReference: ").append(toIndentedString(calendarReference)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    academicSubjects: ").append(toIndentedString(academicSubjects)).append("\n");
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

