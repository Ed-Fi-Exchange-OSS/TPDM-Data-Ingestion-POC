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
 * TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned   {
  @SerializedName("averageFinalNumericGradeEarned")
  private Double averageFinalNumericGradeEarned = null;

  @SerializedName("numericGradeNCount")
  private Integer numericGradeNCount = null;

  @SerializedName("numericGradeStandardDeviation")
  private Integer numericGradeStandardDeviation = null;

  public TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned averageFinalNumericGradeEarned(Double averageFinalNumericGradeEarned) {
    this.averageFinalNumericGradeEarned = averageFinalNumericGradeEarned;
    return this;
  }

   /**
   * The average final numeric grade for the group
   * @return averageFinalNumericGradeEarned
  **/
  @ApiModelProperty(example = "null", required = true, value = "The average final numeric grade for the group")
  public Double getAverageFinalNumericGradeEarned() {
    return averageFinalNumericGradeEarned;
  }

  public void setAverageFinalNumericGradeEarned(Double averageFinalNumericGradeEarned) {
    this.averageFinalNumericGradeEarned = averageFinalNumericGradeEarned;
  }

  public TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned numericGradeNCount(Integer numericGradeNCount) {
    this.numericGradeNCount = numericGradeNCount;
    return this;
  }

   /**
   * The total number of data values in set of data that makes up the average numeric grade for a group
   * @return numericGradeNCount
  **/
  @ApiModelProperty(example = "null", value = "The total number of data values in set of data that makes up the average numeric grade for a group")
  public Integer getNumericGradeNCount() {
    return numericGradeNCount;
  }

  public void setNumericGradeNCount(Integer numericGradeNCount) {
    this.numericGradeNCount = numericGradeNCount;
  }

  public TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned numericGradeStandardDeviation(Integer numericGradeStandardDeviation) {
    this.numericGradeStandardDeviation = numericGradeStandardDeviation;
    return this;
  }

   /**
   * A measure used to quantify the amount of variation or dispersion of a set of data values, in this case specific to the average numeric grade for a group of students
   * @return numericGradeStandardDeviation
  **/
  @ApiModelProperty(example = "null", value = "A measure used to quantify the amount of variation or dispersion of a set of data values, in this case specific to the average numeric grade for a group of students")
  public Integer getNumericGradeStandardDeviation() {
    return numericGradeStandardDeviation;
  }

  public void setNumericGradeStandardDeviation(Integer numericGradeStandardDeviation) {
    this.numericGradeStandardDeviation = numericGradeStandardDeviation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned tpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned = (TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned) o;
    return Objects.equals(this.averageFinalNumericGradeEarned, tpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned.averageFinalNumericGradeEarned) &&
        Objects.equals(this.numericGradeNCount, tpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned.numericGradeNCount) &&
        Objects.equals(this.numericGradeStandardDeviation, tpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned.numericGradeStandardDeviation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageFinalNumericGradeEarned, numericGradeNCount, numericGradeStandardDeviation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmEducationOrganizationCourseTranscriptFactsAggregatedNumericGradeEarned {\n");
    
    sb.append("    averageFinalNumericGradeEarned: ").append(toIndentedString(averageFinalNumericGradeEarned)).append("\n");
    sb.append("    numericGradeNCount: ").append(toIndentedString(numericGradeNCount)).append("\n");
    sb.append("    numericGradeStandardDeviation: ").append(toIndentedString(numericGradeStandardDeviation)).append("\n");
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

