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
import org.edfi.model.resource.EdFiCompetencyObjectiveReference;
import org.edfi.model.resource.EdFiGradingPeriodReference;
import org.edfi.model.resource.EdFiStudentCompetencyObjectiveGeneralStudentProgramAssociation;
import org.edfi.model.resource.EdFiStudentCompetencyObjectiveStudentSectionAssociation;
import org.edfi.model.resource.EdFiStudentReference;


/**
 * EdFiStudentCompetencyObjective
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentCompetencyObjective   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("gradingPeriodReference")
  private EdFiGradingPeriodReference gradingPeriodReference = null;

  @SerializedName("objectiveCompetencyObjectiveReference")
  private EdFiCompetencyObjectiveReference objectiveCompetencyObjectiveReference = null;

  @SerializedName("studentReference")
  private EdFiStudentReference studentReference = null;

  @SerializedName("competencyLevelDescriptor")
  private String competencyLevelDescriptor = null;

  @SerializedName("diagnosticStatement")
  private String diagnosticStatement = null;

  @SerializedName("generalStudentProgramAssociations")
  private List<EdFiStudentCompetencyObjectiveGeneralStudentProgramAssociation> generalStudentProgramAssociations = new ArrayList<EdFiStudentCompetencyObjectiveGeneralStudentProgramAssociation>();

  @SerializedName("studentSectionAssociations")
  private List<EdFiStudentCompetencyObjectiveStudentSectionAssociation> studentSectionAssociations = new ArrayList<EdFiStudentCompetencyObjectiveStudentSectionAssociation>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiStudentCompetencyObjective id(String id) {
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

  public EdFiStudentCompetencyObjective gradingPeriodReference(EdFiGradingPeriodReference gradingPeriodReference) {
    this.gradingPeriodReference = gradingPeriodReference;
    return this;
  }

   /**
   * Get gradingPeriodReference
   * @return gradingPeriodReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiGradingPeriodReference getGradingPeriodReference() {
    return gradingPeriodReference;
  }

  public void setGradingPeriodReference(EdFiGradingPeriodReference gradingPeriodReference) {
    this.gradingPeriodReference = gradingPeriodReference;
  }

  public EdFiStudentCompetencyObjective objectiveCompetencyObjectiveReference(EdFiCompetencyObjectiveReference objectiveCompetencyObjectiveReference) {
    this.objectiveCompetencyObjectiveReference = objectiveCompetencyObjectiveReference;
    return this;
  }

   /**
   * Get objectiveCompetencyObjectiveReference
   * @return objectiveCompetencyObjectiveReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiCompetencyObjectiveReference getObjectiveCompetencyObjectiveReference() {
    return objectiveCompetencyObjectiveReference;
  }

  public void setObjectiveCompetencyObjectiveReference(EdFiCompetencyObjectiveReference objectiveCompetencyObjectiveReference) {
    this.objectiveCompetencyObjectiveReference = objectiveCompetencyObjectiveReference;
  }

  public EdFiStudentCompetencyObjective studentReference(EdFiStudentReference studentReference) {
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

  public EdFiStudentCompetencyObjective competencyLevelDescriptor(String competencyLevelDescriptor) {
    this.competencyLevelDescriptor = competencyLevelDescriptor;
    return this;
  }

   /**
   * The CompetencyLevel assessed for the student for the referenced LearningObjective.
   * @return competencyLevelDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The CompetencyLevel assessed for the student for the referenced LearningObjective.")
  public String getCompetencyLevelDescriptor() {
    return competencyLevelDescriptor;
  }

  public void setCompetencyLevelDescriptor(String competencyLevelDescriptor) {
    this.competencyLevelDescriptor = competencyLevelDescriptor;
  }

  public EdFiStudentCompetencyObjective diagnosticStatement(String diagnosticStatement) {
    this.diagnosticStatement = diagnosticStatement;
    return this;
  }

   /**
   * A statement provided by the teacher that provides information in addition to the grade or assessment score.
   * @return diagnosticStatement
  **/
  @ApiModelProperty(example = "null", value = "A statement provided by the teacher that provides information in addition to the grade or assessment score.")
  public String getDiagnosticStatement() {
    return diagnosticStatement;
  }

  public void setDiagnosticStatement(String diagnosticStatement) {
    this.diagnosticStatement = diagnosticStatement;
  }

  public EdFiStudentCompetencyObjective generalStudentProgramAssociations(List<EdFiStudentCompetencyObjectiveGeneralStudentProgramAssociation> generalStudentProgramAssociations) {
    this.generalStudentProgramAssociations = generalStudentProgramAssociations;
    return this;
  }

  public EdFiStudentCompetencyObjective addGeneralStudentProgramAssociationsItem(EdFiStudentCompetencyObjectiveGeneralStudentProgramAssociation generalStudentProgramAssociationsItem) {
    this.generalStudentProgramAssociations.add(generalStudentProgramAssociationsItem);
    return this;
  }

   /**
   * An unordered collection of studentCompetencyObjectiveGeneralStudentProgramAssociations. Relates the Student and Program associated with the CompetencyObjective.
   * @return generalStudentProgramAssociations
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentCompetencyObjectiveGeneralStudentProgramAssociations. Relates the Student and Program associated with the CompetencyObjective.")
  public List<EdFiStudentCompetencyObjectiveGeneralStudentProgramAssociation> getGeneralStudentProgramAssociations() {
    return generalStudentProgramAssociations;
  }

  public void setGeneralStudentProgramAssociations(List<EdFiStudentCompetencyObjectiveGeneralStudentProgramAssociation> generalStudentProgramAssociations) {
    this.generalStudentProgramAssociations = generalStudentProgramAssociations;
  }

  public EdFiStudentCompetencyObjective studentSectionAssociations(List<EdFiStudentCompetencyObjectiveStudentSectionAssociation> studentSectionAssociations) {
    this.studentSectionAssociations = studentSectionAssociations;
    return this;
  }

  public EdFiStudentCompetencyObjective addStudentSectionAssociationsItem(EdFiStudentCompetencyObjectiveStudentSectionAssociation studentSectionAssociationsItem) {
    this.studentSectionAssociations.add(studentSectionAssociationsItem);
    return this;
  }

   /**
   * An unordered collection of studentCompetencyObjectiveStudentSectionAssociations. Relates the Student and Section associated with the CompetencyObjective.
   * @return studentSectionAssociations
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentCompetencyObjectiveStudentSectionAssociations. Relates the Student and Section associated with the CompetencyObjective.")
  public List<EdFiStudentCompetencyObjectiveStudentSectionAssociation> getStudentSectionAssociations() {
    return studentSectionAssociations;
  }

  public void setStudentSectionAssociations(List<EdFiStudentCompetencyObjectiveStudentSectionAssociation> studentSectionAssociations) {
    this.studentSectionAssociations = studentSectionAssociations;
  }

  public EdFiStudentCompetencyObjective etag(String etag) {
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
    EdFiStudentCompetencyObjective edFiStudentCompetencyObjective = (EdFiStudentCompetencyObjective) o;
    return Objects.equals(this.id, edFiStudentCompetencyObjective.id) &&
        Objects.equals(this.gradingPeriodReference, edFiStudentCompetencyObjective.gradingPeriodReference) &&
        Objects.equals(this.objectiveCompetencyObjectiveReference, edFiStudentCompetencyObjective.objectiveCompetencyObjectiveReference) &&
        Objects.equals(this.studentReference, edFiStudentCompetencyObjective.studentReference) &&
        Objects.equals(this.competencyLevelDescriptor, edFiStudentCompetencyObjective.competencyLevelDescriptor) &&
        Objects.equals(this.diagnosticStatement, edFiStudentCompetencyObjective.diagnosticStatement) &&
        Objects.equals(this.generalStudentProgramAssociations, edFiStudentCompetencyObjective.generalStudentProgramAssociations) &&
        Objects.equals(this.studentSectionAssociations, edFiStudentCompetencyObjective.studentSectionAssociations) &&
        Objects.equals(this.etag, edFiStudentCompetencyObjective.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gradingPeriodReference, objectiveCompetencyObjectiveReference, studentReference, competencyLevelDescriptor, diagnosticStatement, generalStudentProgramAssociations, studentSectionAssociations, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentCompetencyObjective {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gradingPeriodReference: ").append(toIndentedString(gradingPeriodReference)).append("\n");
    sb.append("    objectiveCompetencyObjectiveReference: ").append(toIndentedString(objectiveCompetencyObjectiveReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    competencyLevelDescriptor: ").append(toIndentedString(competencyLevelDescriptor)).append("\n");
    sb.append("    diagnosticStatement: ").append(toIndentedString(diagnosticStatement)).append("\n");
    sb.append("    generalStudentProgramAssociations: ").append(toIndentedString(generalStudentProgramAssociations)).append("\n");
    sb.append("    studentSectionAssociations: ").append(toIndentedString(studentSectionAssociations)).append("\n");
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

