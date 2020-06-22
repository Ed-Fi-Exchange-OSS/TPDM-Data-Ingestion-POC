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
import org.edfi.model.resource.EdFiCohortReference;
import org.edfi.model.resource.EdFiStaffReference;
import org.joda.time.LocalDate;


/**
 * EdFiStaffCohortAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStaffCohortAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("beginDate")
  private LocalDate beginDate = null;

  @SerializedName("cohortReference")
  private EdFiCohortReference cohortReference = null;

  @SerializedName("staffReference")
  private EdFiStaffReference staffReference = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("studentRecordAccess")
  private Boolean studentRecordAccess = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStaffCohortAssociation id(String id) {
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

  public EdFiStaffCohortAssociation beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Start date for the association of staff to this cohort.
   * @return beginDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Start date for the association of staff to this cohort.")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public EdFiStaffCohortAssociation cohortReference(EdFiCohortReference cohortReference) {
    this.cohortReference = cohortReference;
    return this;
  }

   /**
   * Get cohortReference
   * @return cohortReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiCohortReference getCohortReference() {
    return cohortReference;
  }

  public void setCohortReference(EdFiCohortReference cohortReference) {
    this.cohortReference = cohortReference;
  }

  public EdFiStaffCohortAssociation staffReference(EdFiStaffReference staffReference) {
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

  public EdFiStaffCohortAssociation endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for the association of staff to this cohort.
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "End date for the association of staff to this cohort.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public EdFiStaffCohortAssociation studentRecordAccess(Boolean studentRecordAccess) {
    this.studentRecordAccess = studentRecordAccess;
    return this;
  }

   /**
   * Indicator of whether the staff has access to the student records of the cohort per district interpretation of FERPA and other privacy laws, regulations, and policies.
   * @return studentRecordAccess
  **/
  @ApiModelProperty(example = "null", value = "Indicator of whether the staff has access to the student records of the cohort per district interpretation of FERPA and other privacy laws, regulations, and policies.")
  public Boolean getStudentRecordAccess() {
    return studentRecordAccess;
  }

  public void setStudentRecordAccess(Boolean studentRecordAccess) {
    this.studentRecordAccess = studentRecordAccess;
  }

  public EdFiStaffCohortAssociation etag(String etag) {
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
    EdFiStaffCohortAssociation edFiStaffCohortAssociation = (EdFiStaffCohortAssociation) o;
    return Objects.equals(this.id, edFiStaffCohortAssociation.id) &&
        Objects.equals(this.beginDate, edFiStaffCohortAssociation.beginDate) &&
        Objects.equals(this.cohortReference, edFiStaffCohortAssociation.cohortReference) &&
        Objects.equals(this.staffReference, edFiStaffCohortAssociation.staffReference) &&
        Objects.equals(this.endDate, edFiStaffCohortAssociation.endDate) &&
        Objects.equals(this.studentRecordAccess, edFiStaffCohortAssociation.studentRecordAccess) &&
        Objects.equals(this.etag, edFiStaffCohortAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, cohortReference, staffReference, endDate, studentRecordAccess, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffCohortAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    cohortReference: ").append(toIndentedString(cohortReference)).append("\n");
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

