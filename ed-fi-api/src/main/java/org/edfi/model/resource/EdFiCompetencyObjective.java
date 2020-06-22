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
import org.edfi.model.resource.EdFiEducationOrganizationReference;


/**
 * EdFiCompetencyObjective
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiCompetencyObjective   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("objective")
  private String objective = null;

  @SerializedName("objectiveGradeLevelDescriptor")
  private String objectiveGradeLevelDescriptor = null;

  @SerializedName("educationOrganizationReference")
  private EdFiEducationOrganizationReference educationOrganizationReference = null;

  @SerializedName("competencyObjectiveId")
  private String competencyObjectiveId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("successCriteria")
  private String successCriteria = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiCompetencyObjective id(String id) {
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

  public EdFiCompetencyObjective objective(String objective) {
    this.objective = objective;
    return this;
  }

   /**
   * The designated title of the CompetencyObjective.
   * @return objective
  **/
  @ApiModelProperty(example = "null", required = true, value = "The designated title of the CompetencyObjective.")
  public String getObjective() {
    return objective;
  }

  public void setObjective(String objective) {
    this.objective = objective;
  }

  public EdFiCompetencyObjective objectiveGradeLevelDescriptor(String objectiveGradeLevelDescriptor) {
    this.objectiveGradeLevelDescriptor = objectiveGradeLevelDescriptor;
    return this;
  }

   /**
   * The grade level for which the CompetencyObjective is targeted.
   * @return objectiveGradeLevelDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The grade level for which the CompetencyObjective is targeted.")
  public String getObjectiveGradeLevelDescriptor() {
    return objectiveGradeLevelDescriptor;
  }

  public void setObjectiveGradeLevelDescriptor(String objectiveGradeLevelDescriptor) {
    this.objectiveGradeLevelDescriptor = objectiveGradeLevelDescriptor;
  }

  public EdFiCompetencyObjective educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
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

  public EdFiCompetencyObjective competencyObjectiveId(String competencyObjectiveId) {
    this.competencyObjectiveId = competencyObjectiveId;
    return this;
  }

   /**
   * The Identifier for the CompetencyObjective.
   * @return competencyObjectiveId
  **/
  @ApiModelProperty(example = "null", value = "The Identifier for the CompetencyObjective.")
  public String getCompetencyObjectiveId() {
    return competencyObjectiveId;
  }

  public void setCompetencyObjectiveId(String competencyObjectiveId) {
    this.competencyObjectiveId = competencyObjectiveId;
  }

  public EdFiCompetencyObjective description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the student competency objective.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the student competency objective.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EdFiCompetencyObjective successCriteria(String successCriteria) {
    this.successCriteria = successCriteria;
    return this;
  }

   /**
   * One or more statements that describes the criteria used by teachers and students to check for attainment of a competency objective. This criteria gives clear indications as to the degree to which learning is moving through the Zone or Proximal Development toward independent achievement of the CompetencyObjective.
   * @return successCriteria
  **/
  @ApiModelProperty(example = "null", value = "One or more statements that describes the criteria used by teachers and students to check for attainment of a competency objective. This criteria gives clear indications as to the degree to which learning is moving through the Zone or Proximal Development toward independent achievement of the CompetencyObjective.")
  public String getSuccessCriteria() {
    return successCriteria;
  }

  public void setSuccessCriteria(String successCriteria) {
    this.successCriteria = successCriteria;
  }

  public EdFiCompetencyObjective etag(String etag) {
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
    EdFiCompetencyObjective edFiCompetencyObjective = (EdFiCompetencyObjective) o;
    return Objects.equals(this.id, edFiCompetencyObjective.id) &&
        Objects.equals(this.objective, edFiCompetencyObjective.objective) &&
        Objects.equals(this.objectiveGradeLevelDescriptor, edFiCompetencyObjective.objectiveGradeLevelDescriptor) &&
        Objects.equals(this.educationOrganizationReference, edFiCompetencyObjective.educationOrganizationReference) &&
        Objects.equals(this.competencyObjectiveId, edFiCompetencyObjective.competencyObjectiveId) &&
        Objects.equals(this.description, edFiCompetencyObjective.description) &&
        Objects.equals(this.successCriteria, edFiCompetencyObjective.successCriteria) &&
        Objects.equals(this.etag, edFiCompetencyObjective.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, objective, objectiveGradeLevelDescriptor, educationOrganizationReference, competencyObjectiveId, description, successCriteria, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCompetencyObjective {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    objectiveGradeLevelDescriptor: ").append(toIndentedString(objectiveGradeLevelDescriptor)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    competencyObjectiveId: ").append(toIndentedString(competencyObjectiveId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    successCriteria: ").append(toIndentedString(successCriteria)).append("\n");
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

