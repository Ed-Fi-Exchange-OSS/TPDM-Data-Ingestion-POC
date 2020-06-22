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
import org.edfi.model.resource.EdFiAssessmentReference;
import org.edfi.model.resource.EdFiObjectiveAssessmentAssessmentItem;
import org.edfi.model.resource.EdFiObjectiveAssessmentLearningObjective;
import org.edfi.model.resource.EdFiObjectiveAssessmentLearningStandard;
import org.edfi.model.resource.EdFiObjectiveAssessmentPerformanceLevel;
import org.edfi.model.resource.EdFiObjectiveAssessmentReference;
import org.edfi.model.resource.EdFiObjectiveAssessmentScore;


/**
 * EdFiObjectiveAssessment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiObjectiveAssessment   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("identificationCode")
  private String identificationCode = null;

  @SerializedName("assessmentReference")
  private EdFiAssessmentReference assessmentReference = null;

  @SerializedName("parentObjectiveAssessmentReference")
  private EdFiObjectiveAssessmentReference parentObjectiveAssessmentReference = null;

  @SerializedName("assessmentItems")
  private List<EdFiObjectiveAssessmentAssessmentItem> assessmentItems = new ArrayList<EdFiObjectiveAssessmentAssessmentItem>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("learningObjectives")
  private List<EdFiObjectiveAssessmentLearningObjective> learningObjectives = new ArrayList<EdFiObjectiveAssessmentLearningObjective>();

  @SerializedName("learningStandards")
  private List<EdFiObjectiveAssessmentLearningStandard> learningStandards = new ArrayList<EdFiObjectiveAssessmentLearningStandard>();

  @SerializedName("maxRawScore")
  private Integer maxRawScore = null;

  @SerializedName("nomenclature")
  private String nomenclature = null;

  @SerializedName("percentOfAssessment")
  private Double percentOfAssessment = null;

  @SerializedName("performanceLevels")
  private List<EdFiObjectiveAssessmentPerformanceLevel> performanceLevels = new ArrayList<EdFiObjectiveAssessmentPerformanceLevel>();

  @SerializedName("scores")
  private List<EdFiObjectiveAssessmentScore> scores = new ArrayList<EdFiObjectiveAssessmentScore>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiObjectiveAssessment id(String id) {
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

  public EdFiObjectiveAssessment identificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to a space, room, site, building, individual, organization, program, or institution by a school, school system, a state, or other agency or entity.
   * @return identificationCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "A unique number or alphanumeric code assigned to a space, room, site, building, individual, organization, program, or institution by a school, school system, a state, or other agency or entity.")
  public String getIdentificationCode() {
    return identificationCode;
  }

  public void setIdentificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
  }

  public EdFiObjectiveAssessment assessmentReference(EdFiAssessmentReference assessmentReference) {
    this.assessmentReference = assessmentReference;
    return this;
  }

   /**
   * Get assessmentReference
   * @return assessmentReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiAssessmentReference getAssessmentReference() {
    return assessmentReference;
  }

  public void setAssessmentReference(EdFiAssessmentReference assessmentReference) {
    this.assessmentReference = assessmentReference;
  }

  public EdFiObjectiveAssessment parentObjectiveAssessmentReference(EdFiObjectiveAssessmentReference parentObjectiveAssessmentReference) {
    this.parentObjectiveAssessmentReference = parentObjectiveAssessmentReference;
    return this;
  }

   /**
   * Get parentObjectiveAssessmentReference
   * @return parentObjectiveAssessmentReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiObjectiveAssessmentReference getParentObjectiveAssessmentReference() {
    return parentObjectiveAssessmentReference;
  }

  public void setParentObjectiveAssessmentReference(EdFiObjectiveAssessmentReference parentObjectiveAssessmentReference) {
    this.parentObjectiveAssessmentReference = parentObjectiveAssessmentReference;
  }

  public EdFiObjectiveAssessment assessmentItems(List<EdFiObjectiveAssessmentAssessmentItem> assessmentItems) {
    this.assessmentItems = assessmentItems;
    return this;
  }

  public EdFiObjectiveAssessment addAssessmentItemsItem(EdFiObjectiveAssessmentAssessmentItem assessmentItemsItem) {
    this.assessmentItems.add(assessmentItemsItem);
    return this;
  }

   /**
   * An unordered collection of objectiveAssessmentAssessmentItems. References individual test items, if appropriate.
   * @return assessmentItems
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of objectiveAssessmentAssessmentItems. References individual test items, if appropriate.")
  public List<EdFiObjectiveAssessmentAssessmentItem> getAssessmentItems() {
    return assessmentItems;
  }

  public void setAssessmentItems(List<EdFiObjectiveAssessmentAssessmentItem> assessmentItems) {
    this.assessmentItems = assessmentItems;
  }

  public EdFiObjectiveAssessment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the ObjectiveAssessment (e.g., vocabulary, measurement, or geometry).
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the ObjectiveAssessment (e.g., vocabulary, measurement, or geometry).")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EdFiObjectiveAssessment learningObjectives(List<EdFiObjectiveAssessmentLearningObjective> learningObjectives) {
    this.learningObjectives = learningObjectives;
    return this;
  }

  public EdFiObjectiveAssessment addLearningObjectivesItem(EdFiObjectiveAssessmentLearningObjective learningObjectivesItem) {
    this.learningObjectives.add(learningObjectivesItem);
    return this;
  }

   /**
   * An unordered collection of objectiveAssessmentLearningObjectives. References the LearningObjective(s) the ObjectiveAssessment tests.
   * @return learningObjectives
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of objectiveAssessmentLearningObjectives. References the LearningObjective(s) the ObjectiveAssessment tests.")
  public List<EdFiObjectiveAssessmentLearningObjective> getLearningObjectives() {
    return learningObjectives;
  }

  public void setLearningObjectives(List<EdFiObjectiveAssessmentLearningObjective> learningObjectives) {
    this.learningObjectives = learningObjectives;
  }

  public EdFiObjectiveAssessment learningStandards(List<EdFiObjectiveAssessmentLearningStandard> learningStandards) {
    this.learningStandards = learningStandards;
    return this;
  }

  public EdFiObjectiveAssessment addLearningStandardsItem(EdFiObjectiveAssessmentLearningStandard learningStandardsItem) {
    this.learningStandards.add(learningStandardsItem);
    return this;
  }

   /**
   * An unordered collection of objectiveAssessmentLearningStandards. LearningStandard tested by this ObjectiveAssessment.
   * @return learningStandards
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of objectiveAssessmentLearningStandards. LearningStandard tested by this ObjectiveAssessment.")
  public List<EdFiObjectiveAssessmentLearningStandard> getLearningStandards() {
    return learningStandards;
  }

  public void setLearningStandards(List<EdFiObjectiveAssessmentLearningStandard> learningStandards) {
    this.learningStandards = learningStandards;
  }

  public EdFiObjectiveAssessment maxRawScore(Integer maxRawScore) {
    this.maxRawScore = maxRawScore;
    return this;
  }

   /**
   * The maximum raw score achievable across all assessment items that are correct and scored at the maximum.
   * @return maxRawScore
  **/
  @ApiModelProperty(example = "null", value = "The maximum raw score achievable across all assessment items that are correct and scored at the maximum.")
  public Integer getMaxRawScore() {
    return maxRawScore;
  }

  public void setMaxRawScore(Integer maxRawScore) {
    this.maxRawScore = maxRawScore;
  }

  public EdFiObjectiveAssessment nomenclature(String nomenclature) {
    this.nomenclature = nomenclature;
    return this;
  }

   /**
   * Reflects the specific nomenclature used for this level of ObjectiveAssessment.
   * @return nomenclature
  **/
  @ApiModelProperty(example = "null", value = "Reflects the specific nomenclature used for this level of ObjectiveAssessment.")
  public String getNomenclature() {
    return nomenclature;
  }

  public void setNomenclature(String nomenclature) {
    this.nomenclature = nomenclature;
  }

  public EdFiObjectiveAssessment percentOfAssessment(Double percentOfAssessment) {
    this.percentOfAssessment = percentOfAssessment;
    return this;
  }

   /**
   * The percentage of the Assessment that tests this objective.
   * @return percentOfAssessment
  **/
  @ApiModelProperty(example = "null", value = "The percentage of the Assessment that tests this objective.")
  public Double getPercentOfAssessment() {
    return percentOfAssessment;
  }

  public void setPercentOfAssessment(Double percentOfAssessment) {
    this.percentOfAssessment = percentOfAssessment;
  }

  public EdFiObjectiveAssessment performanceLevels(List<EdFiObjectiveAssessmentPerformanceLevel> performanceLevels) {
    this.performanceLevels = performanceLevels;
    return this;
  }

  public EdFiObjectiveAssessment addPerformanceLevelsItem(EdFiObjectiveAssessmentPerformanceLevel performanceLevelsItem) {
    this.performanceLevels.add(performanceLevelsItem);
    return this;
  }

   /**
   * An unordered collection of objectiveAssessmentPerformanceLevels. Definition of the performance levels and the associated cut scores. Three styles are supported:          1. Specification of performance level by minimum and maximum score          2. Specification of performance level by cut score, using only minimum score          3. Specification of performance level without any mapping to scores
   * @return performanceLevels
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of objectiveAssessmentPerformanceLevels. Definition of the performance levels and the associated cut scores. Three styles are supported:          1. Specification of performance level by minimum and maximum score          2. Specification of performance level by cut score, using only minimum score          3. Specification of performance level without any mapping to scores")
  public List<EdFiObjectiveAssessmentPerformanceLevel> getPerformanceLevels() {
    return performanceLevels;
  }

  public void setPerformanceLevels(List<EdFiObjectiveAssessmentPerformanceLevel> performanceLevels) {
    this.performanceLevels = performanceLevels;
  }

  public EdFiObjectiveAssessment scores(List<EdFiObjectiveAssessmentScore> scores) {
    this.scores = scores;
    return this;
  }

  public EdFiObjectiveAssessment addScoresItem(EdFiObjectiveAssessmentScore scoresItem) {
    this.scores.add(scoresItem);
    return this;
  }

   /**
   * An unordered collection of objectiveAssessmentScores. Definition of the scores to be expected from this objective assessment.
   * @return scores
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of objectiveAssessmentScores. Definition of the scores to be expected from this objective assessment.")
  public List<EdFiObjectiveAssessmentScore> getScores() {
    return scores;
  }

  public void setScores(List<EdFiObjectiveAssessmentScore> scores) {
    this.scores = scores;
  }

  public EdFiObjectiveAssessment etag(String etag) {
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
    EdFiObjectiveAssessment edFiObjectiveAssessment = (EdFiObjectiveAssessment) o;
    return Objects.equals(this.id, edFiObjectiveAssessment.id) &&
        Objects.equals(this.identificationCode, edFiObjectiveAssessment.identificationCode) &&
        Objects.equals(this.assessmentReference, edFiObjectiveAssessment.assessmentReference) &&
        Objects.equals(this.parentObjectiveAssessmentReference, edFiObjectiveAssessment.parentObjectiveAssessmentReference) &&
        Objects.equals(this.assessmentItems, edFiObjectiveAssessment.assessmentItems) &&
        Objects.equals(this.description, edFiObjectiveAssessment.description) &&
        Objects.equals(this.learningObjectives, edFiObjectiveAssessment.learningObjectives) &&
        Objects.equals(this.learningStandards, edFiObjectiveAssessment.learningStandards) &&
        Objects.equals(this.maxRawScore, edFiObjectiveAssessment.maxRawScore) &&
        Objects.equals(this.nomenclature, edFiObjectiveAssessment.nomenclature) &&
        Objects.equals(this.percentOfAssessment, edFiObjectiveAssessment.percentOfAssessment) &&
        Objects.equals(this.performanceLevels, edFiObjectiveAssessment.performanceLevels) &&
        Objects.equals(this.scores, edFiObjectiveAssessment.scores) &&
        Objects.equals(this.etag, edFiObjectiveAssessment.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identificationCode, assessmentReference, parentObjectiveAssessmentReference, assessmentItems, description, learningObjectives, learningStandards, maxRawScore, nomenclature, percentOfAssessment, performanceLevels, scores, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiObjectiveAssessment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identificationCode: ").append(toIndentedString(identificationCode)).append("\n");
    sb.append("    assessmentReference: ").append(toIndentedString(assessmentReference)).append("\n");
    sb.append("    parentObjectiveAssessmentReference: ").append(toIndentedString(parentObjectiveAssessmentReference)).append("\n");
    sb.append("    assessmentItems: ").append(toIndentedString(assessmentItems)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    learningObjectives: ").append(toIndentedString(learningObjectives)).append("\n");
    sb.append("    learningStandards: ").append(toIndentedString(learningStandards)).append("\n");
    sb.append("    maxRawScore: ").append(toIndentedString(maxRawScore)).append("\n");
    sb.append("    nomenclature: ").append(toIndentedString(nomenclature)).append("\n");
    sb.append("    percentOfAssessment: ").append(toIndentedString(percentOfAssessment)).append("\n");
    sb.append("    performanceLevels: ").append(toIndentedString(performanceLevels)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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

