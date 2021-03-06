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


/**
 * EdFiInterventionStudyInterventionEffectiveness
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiInterventionStudyInterventionEffectiveness   {
  @SerializedName("diagnosisDescriptor")
  private String diagnosisDescriptor = null;

  @SerializedName("gradeLevelDescriptor")
  private String gradeLevelDescriptor = null;

  @SerializedName("populationServedDescriptor")
  private String populationServedDescriptor = null;

  @SerializedName("interventionEffectivenessRatingDescriptor")
  private String interventionEffectivenessRatingDescriptor = null;

  @SerializedName("improvementIndex")
  private Integer improvementIndex = null;

  public EdFiInterventionStudyInterventionEffectiveness diagnosisDescriptor(String diagnosisDescriptor) {
    this.diagnosisDescriptor = diagnosisDescriptor;
    return this;
  }

   /**
   * Targeted purpose of the intervention (e.g., attendance issue, dropout risk) for which the effectiveness is measured.
   * @return diagnosisDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "Targeted purpose of the intervention (e.g., attendance issue, dropout risk) for which the effectiveness is measured.")
  public String getDiagnosisDescriptor() {
    return diagnosisDescriptor;
  }

  public void setDiagnosisDescriptor(String diagnosisDescriptor) {
    this.diagnosisDescriptor = diagnosisDescriptor;
  }

  public EdFiInterventionStudyInterventionEffectiveness gradeLevelDescriptor(String gradeLevelDescriptor) {
    this.gradeLevelDescriptor = gradeLevelDescriptor;
    return this;
  }

   /**
   * Grade level for which effectiveness is measured.
   * @return gradeLevelDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "Grade level for which effectiveness is measured.")
  public String getGradeLevelDescriptor() {
    return gradeLevelDescriptor;
  }

  public void setGradeLevelDescriptor(String gradeLevelDescriptor) {
    this.gradeLevelDescriptor = gradeLevelDescriptor;
  }

  public EdFiInterventionStudyInterventionEffectiveness populationServedDescriptor(String populationServedDescriptor) {
    this.populationServedDescriptor = populationServedDescriptor;
    return this;
  }

   /**
   * Population for which effectiveness is measured.
   * @return populationServedDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "Population for which effectiveness is measured.")
  public String getPopulationServedDescriptor() {
    return populationServedDescriptor;
  }

  public void setPopulationServedDescriptor(String populationServedDescriptor) {
    this.populationServedDescriptor = populationServedDescriptor;
  }

  public EdFiInterventionStudyInterventionEffectiveness interventionEffectivenessRatingDescriptor(String interventionEffectivenessRatingDescriptor) {
    this.interventionEffectivenessRatingDescriptor = interventionEffectivenessRatingDescriptor;
    return this;
  }

   /**
   * An intervention demonstrates effectiveness if the research has shown that the program caused an improvement in outcomes. Values: positive effects, potentially positive effects, mixed effects, potentially negative effects, negative effects, and no discernible effects.
   * @return interventionEffectivenessRatingDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "An intervention demonstrates effectiveness if the research has shown that the program caused an improvement in outcomes. Values: positive effects, potentially positive effects, mixed effects, potentially negative effects, negative effects, and no discernible effects.")
  public String getInterventionEffectivenessRatingDescriptor() {
    return interventionEffectivenessRatingDescriptor;
  }

  public void setInterventionEffectivenessRatingDescriptor(String interventionEffectivenessRatingDescriptor) {
    this.interventionEffectivenessRatingDescriptor = interventionEffectivenessRatingDescriptor;
  }

  public EdFiInterventionStudyInterventionEffectiveness improvementIndex(Integer improvementIndex) {
    this.improvementIndex = improvementIndex;
    return this;
  }

   /**
   * Along a percentile distribution of students, the improvement index represents the change in an average student's percentile rank that is considered to be due to the intervention.
   * @return improvementIndex
  **/
  @ApiModelProperty(example = "null", value = "Along a percentile distribution of students, the improvement index represents the change in an average student's percentile rank that is considered to be due to the intervention.")
  public Integer getImprovementIndex() {
    return improvementIndex;
  }

  public void setImprovementIndex(Integer improvementIndex) {
    this.improvementIndex = improvementIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiInterventionStudyInterventionEffectiveness edFiInterventionStudyInterventionEffectiveness = (EdFiInterventionStudyInterventionEffectiveness) o;
    return Objects.equals(this.diagnosisDescriptor, edFiInterventionStudyInterventionEffectiveness.diagnosisDescriptor) &&
        Objects.equals(this.gradeLevelDescriptor, edFiInterventionStudyInterventionEffectiveness.gradeLevelDescriptor) &&
        Objects.equals(this.populationServedDescriptor, edFiInterventionStudyInterventionEffectiveness.populationServedDescriptor) &&
        Objects.equals(this.interventionEffectivenessRatingDescriptor, edFiInterventionStudyInterventionEffectiveness.interventionEffectivenessRatingDescriptor) &&
        Objects.equals(this.improvementIndex, edFiInterventionStudyInterventionEffectiveness.improvementIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosisDescriptor, gradeLevelDescriptor, populationServedDescriptor, interventionEffectivenessRatingDescriptor, improvementIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiInterventionStudyInterventionEffectiveness {\n");
    
    sb.append("    diagnosisDescriptor: ").append(toIndentedString(diagnosisDescriptor)).append("\n");
    sb.append("    gradeLevelDescriptor: ").append(toIndentedString(gradeLevelDescriptor)).append("\n");
    sb.append("    populationServedDescriptor: ").append(toIndentedString(populationServedDescriptor)).append("\n");
    sb.append("    interventionEffectivenessRatingDescriptor: ").append(toIndentedString(interventionEffectivenessRatingDescriptor)).append("\n");
    sb.append("    improvementIndex: ").append(toIndentedString(improvementIndex)).append("\n");
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

