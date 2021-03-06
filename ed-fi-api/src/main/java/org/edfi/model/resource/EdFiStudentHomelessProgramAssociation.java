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
import org.edfi.model.resource.EdFiEducationOrganizationReference;
import org.edfi.model.resource.EdFiProgramReference;
import org.edfi.model.resource.EdFiStudentHomelessProgramAssociationHomelessProgramService;
import org.edfi.model.resource.EdFiStudentReference;
import org.joda.time.LocalDate;


/**
 * EdFiStudentHomelessProgramAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentHomelessProgramAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("beginDate")
  private LocalDate beginDate = null;

  @SerializedName("educationOrganizationReference")
  private EdFiEducationOrganizationReference educationOrganizationReference = null;

  @SerializedName("programReference")
  private EdFiProgramReference programReference = null;

  @SerializedName("studentReference")
  private EdFiStudentReference studentReference = null;

  @SerializedName("awaitingFosterCare")
  private Boolean awaitingFosterCare = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("homelessPrimaryNighttimeResidenceDescriptor")
  private String homelessPrimaryNighttimeResidenceDescriptor = null;

  @SerializedName("homelessProgramServices")
  private List<EdFiStudentHomelessProgramAssociationHomelessProgramService> homelessProgramServices = new ArrayList<EdFiStudentHomelessProgramAssociationHomelessProgramService>();

  @SerializedName("homelessUnaccompaniedYouth")
  private Boolean homelessUnaccompaniedYouth = null;

  @SerializedName("reasonExitedDescriptor")
  private String reasonExitedDescriptor = null;

  @SerializedName("servedOutsideOfRegularSession")
  private Boolean servedOutsideOfRegularSession = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStudentHomelessProgramAssociation id(String id) {
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

  public EdFiStudentHomelessProgramAssociation beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The month, day, and year on which the Student first received services.
   * @return beginDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The month, day, and year on which the Student first received services.")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public EdFiStudentHomelessProgramAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }

  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }

  public EdFiStudentHomelessProgramAssociation programReference(EdFiProgramReference programReference) {
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

  public EdFiStudentHomelessProgramAssociation studentReference(EdFiStudentReference studentReference) {
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

  public EdFiStudentHomelessProgramAssociation awaitingFosterCare(Boolean awaitingFosterCare) {
    this.awaitingFosterCare = awaitingFosterCare;
    return this;
  }

   /**
   * State defined definition for awaiting foster care.
   * @return awaitingFosterCare
  **/
  @ApiModelProperty(example = "null", value = "State defined definition for awaiting foster care.")
  public Boolean getAwaitingFosterCare() {
    return awaitingFosterCare;
  }

  public void setAwaitingFosterCare(Boolean awaitingFosterCare) {
    this.awaitingFosterCare = awaitingFosterCare;
  }

  public EdFiStudentHomelessProgramAssociation endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The month, day, and year on which the Student exited the Program or stopped receiving services.
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "The month, day, and year on which the Student exited the Program or stopped receiving services.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public EdFiStudentHomelessProgramAssociation homelessPrimaryNighttimeResidenceDescriptor(String homelessPrimaryNighttimeResidenceDescriptor) {
    this.homelessPrimaryNighttimeResidenceDescriptor = homelessPrimaryNighttimeResidenceDescriptor;
    return this;
  }

   /**
   * The primary nighttime residence of the student at the time the student is identified as homeless.
   * @return homelessPrimaryNighttimeResidenceDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The primary nighttime residence of the student at the time the student is identified as homeless.")
  public String getHomelessPrimaryNighttimeResidenceDescriptor() {
    return homelessPrimaryNighttimeResidenceDescriptor;
  }

  public void setHomelessPrimaryNighttimeResidenceDescriptor(String homelessPrimaryNighttimeResidenceDescriptor) {
    this.homelessPrimaryNighttimeResidenceDescriptor = homelessPrimaryNighttimeResidenceDescriptor;
  }

  public EdFiStudentHomelessProgramAssociation homelessProgramServices(List<EdFiStudentHomelessProgramAssociationHomelessProgramService> homelessProgramServices) {
    this.homelessProgramServices = homelessProgramServices;
    return this;
  }

  public EdFiStudentHomelessProgramAssociation addHomelessProgramServicesItem(EdFiStudentHomelessProgramAssociationHomelessProgramService homelessProgramServicesItem) {
    this.homelessProgramServices.add(homelessProgramServicesItem);
    return this;
  }

   /**
   * An unordered collection of studentHomelessProgramAssociationHomelessProgramServices. Indicates the service(s) being provided to the Student by the Homeless Program.
   * @return homelessProgramServices
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentHomelessProgramAssociationHomelessProgramServices. Indicates the service(s) being provided to the Student by the Homeless Program.")
  public List<EdFiStudentHomelessProgramAssociationHomelessProgramService> getHomelessProgramServices() {
    return homelessProgramServices;
  }

  public void setHomelessProgramServices(List<EdFiStudentHomelessProgramAssociationHomelessProgramService> homelessProgramServices) {
    this.homelessProgramServices = homelessProgramServices;
  }

  public EdFiStudentHomelessProgramAssociation homelessUnaccompaniedYouth(Boolean homelessUnaccompaniedYouth) {
    this.homelessUnaccompaniedYouth = homelessUnaccompaniedYouth;
    return this;
  }

   /**
   * A homeless unaccompanied youth is a youth who is not in the physical custody of a parent or guardian and who fits the McKinney-Vento definition of homeless. Students must be both unaccompanied and homeless to be included as an unaccompanied homeless youth.
   * @return homelessUnaccompaniedYouth
  **/
  @ApiModelProperty(example = "null", value = "A homeless unaccompanied youth is a youth who is not in the physical custody of a parent or guardian and who fits the McKinney-Vento definition of homeless. Students must be both unaccompanied and homeless to be included as an unaccompanied homeless youth.")
  public Boolean getHomelessUnaccompaniedYouth() {
    return homelessUnaccompaniedYouth;
  }

  public void setHomelessUnaccompaniedYouth(Boolean homelessUnaccompaniedYouth) {
    this.homelessUnaccompaniedYouth = homelessUnaccompaniedYouth;
  }

  public EdFiStudentHomelessProgramAssociation reasonExitedDescriptor(String reasonExitedDescriptor) {
    this.reasonExitedDescriptor = reasonExitedDescriptor;
    return this;
  }

   /**
   * The reason the child left the Program within a school or district.
   * @return reasonExitedDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The reason the child left the Program within a school or district.")
  public String getReasonExitedDescriptor() {
    return reasonExitedDescriptor;
  }

  public void setReasonExitedDescriptor(String reasonExitedDescriptor) {
    this.reasonExitedDescriptor = reasonExitedDescriptor;
  }

  public EdFiStudentHomelessProgramAssociation servedOutsideOfRegularSession(Boolean servedOutsideOfRegularSession) {
    this.servedOutsideOfRegularSession = servedOutsideOfRegularSession;
    return this;
  }

   /**
   * Indicates whether the Student received services during the summer session or between sessions.
   * @return servedOutsideOfRegularSession
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the Student received services during the summer session or between sessions.")
  public Boolean getServedOutsideOfRegularSession() {
    return servedOutsideOfRegularSession;
  }

  public void setServedOutsideOfRegularSession(Boolean servedOutsideOfRegularSession) {
    this.servedOutsideOfRegularSession = servedOutsideOfRegularSession;
  }

  public EdFiStudentHomelessProgramAssociation etag(String etag) {
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
    EdFiStudentHomelessProgramAssociation edFiStudentHomelessProgramAssociation = (EdFiStudentHomelessProgramAssociation) o;
    return Objects.equals(this.id, edFiStudentHomelessProgramAssociation.id) &&
        Objects.equals(this.beginDate, edFiStudentHomelessProgramAssociation.beginDate) &&
        Objects.equals(this.educationOrganizationReference, edFiStudentHomelessProgramAssociation.educationOrganizationReference) &&
        Objects.equals(this.programReference, edFiStudentHomelessProgramAssociation.programReference) &&
        Objects.equals(this.studentReference, edFiStudentHomelessProgramAssociation.studentReference) &&
        Objects.equals(this.awaitingFosterCare, edFiStudentHomelessProgramAssociation.awaitingFosterCare) &&
        Objects.equals(this.endDate, edFiStudentHomelessProgramAssociation.endDate) &&
        Objects.equals(this.homelessPrimaryNighttimeResidenceDescriptor, edFiStudentHomelessProgramAssociation.homelessPrimaryNighttimeResidenceDescriptor) &&
        Objects.equals(this.homelessProgramServices, edFiStudentHomelessProgramAssociation.homelessProgramServices) &&
        Objects.equals(this.homelessUnaccompaniedYouth, edFiStudentHomelessProgramAssociation.homelessUnaccompaniedYouth) &&
        Objects.equals(this.reasonExitedDescriptor, edFiStudentHomelessProgramAssociation.reasonExitedDescriptor) &&
        Objects.equals(this.servedOutsideOfRegularSession, edFiStudentHomelessProgramAssociation.servedOutsideOfRegularSession) &&
        Objects.equals(this.etag, edFiStudentHomelessProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, educationOrganizationReference, programReference, studentReference, awaitingFosterCare, endDate, homelessPrimaryNighttimeResidenceDescriptor, homelessProgramServices, homelessUnaccompaniedYouth, reasonExitedDescriptor, servedOutsideOfRegularSession, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentHomelessProgramAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    programReference: ").append(toIndentedString(programReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    awaitingFosterCare: ").append(toIndentedString(awaitingFosterCare)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    homelessPrimaryNighttimeResidenceDescriptor: ").append(toIndentedString(homelessPrimaryNighttimeResidenceDescriptor)).append("\n");
    sb.append("    homelessProgramServices: ").append(toIndentedString(homelessProgramServices)).append("\n");
    sb.append("    homelessUnaccompaniedYouth: ").append(toIndentedString(homelessUnaccompaniedYouth)).append("\n");
    sb.append("    reasonExitedDescriptor: ").append(toIndentedString(reasonExitedDescriptor)).append("\n");
    sb.append("    servedOutsideOfRegularSession: ").append(toIndentedString(servedOutsideOfRegularSession)).append("\n");
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

