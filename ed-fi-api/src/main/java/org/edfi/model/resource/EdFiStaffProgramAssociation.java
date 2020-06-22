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
import org.edfi.model.resource.EdFiProgramReference;
import org.edfi.model.resource.EdFiStaffReference;
import org.joda.time.LocalDate;


/**
 * EdFiStaffProgramAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStaffProgramAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("beginDate")
  private LocalDate beginDate = null;

  @SerializedName("programReference")
  private EdFiProgramReference programReference = null;

  @SerializedName("staffReference")
  private EdFiStaffReference staffReference = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("studentRecordAccess")
  private Boolean studentRecordAccess = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStaffProgramAssociation id(String id) {
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

  public EdFiStaffProgramAssociation beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Start date for the association of staff to this program.
   * @return beginDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Start date for the association of staff to this program.")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public EdFiStaffProgramAssociation programReference(EdFiProgramReference programReference) {
    this.programReference = programReference;
    return this;
  }

   /**
   * Get programReference
   * @return programReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiProgramReference getProgramReference() {
    return programReference;
  }

  public void setProgramReference(EdFiProgramReference programReference) {
    this.programReference = programReference;
  }

  public EdFiStaffProgramAssociation staffReference(EdFiStaffReference staffReference) {
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

  public EdFiStaffProgramAssociation endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for the association of staff to this program.
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "End date for the association of staff to this program.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public EdFiStaffProgramAssociation studentRecordAccess(Boolean studentRecordAccess) {
    this.studentRecordAccess = studentRecordAccess;
    return this;
  }

   /**
   * Indicator of whether the staff has access to the student records of the program per district interpretation of FERPA and other privacy laws, regulations, and policies.
   * @return studentRecordAccess
  **/
  @ApiModelProperty(example = "null", value = "Indicator of whether the staff has access to the student records of the program per district interpretation of FERPA and other privacy laws, regulations, and policies.")
  public Boolean getStudentRecordAccess() {
    return studentRecordAccess;
  }

  public void setStudentRecordAccess(Boolean studentRecordAccess) {
    this.studentRecordAccess = studentRecordAccess;
  }

  public EdFiStaffProgramAssociation etag(String etag) {
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
    EdFiStaffProgramAssociation edFiStaffProgramAssociation = (EdFiStaffProgramAssociation) o;
    return Objects.equals(this.id, edFiStaffProgramAssociation.id) &&
        Objects.equals(this.beginDate, edFiStaffProgramAssociation.beginDate) &&
        Objects.equals(this.programReference, edFiStaffProgramAssociation.programReference) &&
        Objects.equals(this.staffReference, edFiStaffProgramAssociation.staffReference) &&
        Objects.equals(this.endDate, edFiStaffProgramAssociation.endDate) &&
        Objects.equals(this.studentRecordAccess, edFiStaffProgramAssociation.studentRecordAccess) &&
        Objects.equals(this.etag, edFiStaffProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, programReference, staffReference, endDate, studentRecordAccess, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffProgramAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    programReference: ").append(toIndentedString(programReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    studentRecordAccess: ").append(toIndentedString(studentRecordAccess)).append("\n");
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

