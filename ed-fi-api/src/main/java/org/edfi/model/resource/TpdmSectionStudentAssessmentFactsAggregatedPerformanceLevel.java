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
 * TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel   {
  @SerializedName("performanceLevelDescriptor")
  private String performanceLevelDescriptor = null;

  @SerializedName("performanceLevelMetNumber")
  private Integer performanceLevelMetNumber = null;

  @SerializedName("performanceLevelMetPercentage")
  private Double performanceLevelMetPercentage = null;

  @SerializedName("performanceLevelTypeNumber")
  private Integer performanceLevelTypeNumber = null;

  @SerializedName("performanceLevelTypePercentage")
  private Double performanceLevelTypePercentage = null;

  public TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel performanceLevelDescriptor(String performanceLevelDescriptor) {
    this.performanceLevelDescriptor = performanceLevelDescriptor;
    return this;
  }

   /**
   * A specification of which performance level value describes the Student proficiency.
   * @return performanceLevelDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "A specification of which performance level value describes the Student proficiency.")
  public String getPerformanceLevelDescriptor() {
    return performanceLevelDescriptor;
  }

  public void setPerformanceLevelDescriptor(String performanceLevelDescriptor) {
    this.performanceLevelDescriptor = performanceLevelDescriptor;
  }

  public TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel performanceLevelMetNumber(Integer performanceLevelMetNumber) {
    this.performanceLevelMetNumber = performanceLevelMetNumber;
    return this;
  }

   /**
   * The number of students who met the performance level
   * @return performanceLevelMetNumber
  **/
  @ApiModelProperty(example = "null", value = "The number of students who met the performance level")
  public Integer getPerformanceLevelMetNumber() {
    return performanceLevelMetNumber;
  }

  public void setPerformanceLevelMetNumber(Integer performanceLevelMetNumber) {
    this.performanceLevelMetNumber = performanceLevelMetNumber;
  }

  public TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel performanceLevelMetPercentage(Double performanceLevelMetPercentage) {
    this.performanceLevelMetPercentage = performanceLevelMetPercentage;
    return this;
  }

   /**
   * The percentage of students who met the performance level.
   * @return performanceLevelMetPercentage
  **/
  @ApiModelProperty(example = "null", value = "The percentage of students who met the performance level.")
  public Double getPerformanceLevelMetPercentage() {
    return performanceLevelMetPercentage;
  }

  public void setPerformanceLevelMetPercentage(Double performanceLevelMetPercentage) {
    this.performanceLevelMetPercentage = performanceLevelMetPercentage;
  }

  public TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel performanceLevelTypeNumber(Integer performanceLevelTypeNumber) {
    this.performanceLevelTypeNumber = performanceLevelTypeNumber;
    return this;
  }

   /**
   * The number of students who achieved each performance level by performance level type
   * @return performanceLevelTypeNumber
  **/
  @ApiModelProperty(example = "null", value = "The number of students who achieved each performance level by performance level type")
  public Integer getPerformanceLevelTypeNumber() {
    return performanceLevelTypeNumber;
  }

  public void setPerformanceLevelTypeNumber(Integer performanceLevelTypeNumber) {
    this.performanceLevelTypeNumber = performanceLevelTypeNumber;
  }

  public TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel performanceLevelTypePercentage(Double performanceLevelTypePercentage) {
    this.performanceLevelTypePercentage = performanceLevelTypePercentage;
    return this;
  }

   /**
   * The percentage of students who achieved performance level by each performance level type.
   * @return performanceLevelTypePercentage
  **/
  @ApiModelProperty(example = "null", value = "The percentage of students who achieved performance level by each performance level type.")
  public Double getPerformanceLevelTypePercentage() {
    return performanceLevelTypePercentage;
  }

  public void setPerformanceLevelTypePercentage(Double performanceLevelTypePercentage) {
    this.performanceLevelTypePercentage = performanceLevelTypePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel tpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel = (TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel) o;
    return Objects.equals(this.performanceLevelDescriptor, tpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel.performanceLevelDescriptor) &&
        Objects.equals(this.performanceLevelMetNumber, tpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel.performanceLevelMetNumber) &&
        Objects.equals(this.performanceLevelMetPercentage, tpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel.performanceLevelMetPercentage) &&
        Objects.equals(this.performanceLevelTypeNumber, tpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel.performanceLevelTypeNumber) &&
        Objects.equals(this.performanceLevelTypePercentage, tpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel.performanceLevelTypePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceLevelDescriptor, performanceLevelMetNumber, performanceLevelMetPercentage, performanceLevelTypeNumber, performanceLevelTypePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmSectionStudentAssessmentFactsAggregatedPerformanceLevel {\n");
    
    sb.append("    performanceLevelDescriptor: ").append(toIndentedString(performanceLevelDescriptor)).append("\n");
    sb.append("    performanceLevelMetNumber: ").append(toIndentedString(performanceLevelMetNumber)).append("\n");
    sb.append("    performanceLevelMetPercentage: ").append(toIndentedString(performanceLevelMetPercentage)).append("\n");
    sb.append("    performanceLevelTypeNumber: ").append(toIndentedString(performanceLevelTypeNumber)).append("\n");
    sb.append("    performanceLevelTypePercentage: ").append(toIndentedString(performanceLevelTypePercentage)).append("\n");
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

