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
 * EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult   {
  @SerializedName("assessmentReportingMethodDescriptor")
  private String assessmentReportingMethodDescriptor = null;

  @SerializedName("resultDatatypeTypeDescriptor")
  private String resultDatatypeTypeDescriptor = null;

  @SerializedName("result")
  private String result = null;

  public EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult assessmentReportingMethodDescriptor(String assessmentReportingMethodDescriptor) {
    this.assessmentReportingMethodDescriptor = assessmentReportingMethodDescriptor;
    return this;
  }

   /**
   * The method that the administrator of the assessment uses to report the performance and achievement of all students. It may be a qualitative method such as performance level descriptors or a quantitative method such as a numerical grade or cut score. More than one type of reporting method may be used.
   * @return assessmentReportingMethodDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The method that the administrator of the assessment uses to report the performance and achievement of all students. It may be a qualitative method such as performance level descriptors or a quantitative method such as a numerical grade or cut score. More than one type of reporting method may be used.")
  public String getAssessmentReportingMethodDescriptor() {
    return assessmentReportingMethodDescriptor;
  }

  public void setAssessmentReportingMethodDescriptor(String assessmentReportingMethodDescriptor) {
    this.assessmentReportingMethodDescriptor = assessmentReportingMethodDescriptor;
  }

  public EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult resultDatatypeTypeDescriptor(String resultDatatypeTypeDescriptor) {
    this.resultDatatypeTypeDescriptor = resultDatatypeTypeDescriptor;
    return this;
  }

   /**
   * The datatype of the result. The results can be expressed as a number, percentile, range, level, etc.
   * @return resultDatatypeTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The datatype of the result. The results can be expressed as a number, percentile, range, level, etc.")
  public String getResultDatatypeTypeDescriptor() {
    return resultDatatypeTypeDescriptor;
  }

  public void setResultDatatypeTypeDescriptor(String resultDatatypeTypeDescriptor) {
    this.resultDatatypeTypeDescriptor = resultDatatypeTypeDescriptor;
  }

  public EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult result(String result) {
    this.result = result;
    return this;
  }

   /**
   * The value of a meaningful raw score or statistical expression of the performance of an individual. The results can be expressed as a number, percentile, range, level, etc.
   * @return result
  **/
  @ApiModelProperty(example = "null", required = true, value = "The value of a meaningful raw score or statistical expression of the performance of an individual. The results can be expressed as a number, percentile, range, level, etc.")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult edFiStudentAssessmentStudentObjectiveAssessmentScoreResult = (EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult) o;
    return Objects.equals(this.assessmentReportingMethodDescriptor, edFiStudentAssessmentStudentObjectiveAssessmentScoreResult.assessmentReportingMethodDescriptor) &&
        Objects.equals(this.resultDatatypeTypeDescriptor, edFiStudentAssessmentStudentObjectiveAssessmentScoreResult.resultDatatypeTypeDescriptor) &&
        Objects.equals(this.result, edFiStudentAssessmentStudentObjectiveAssessmentScoreResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentReportingMethodDescriptor, resultDatatypeTypeDescriptor, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentAssessmentStudentObjectiveAssessmentScoreResult {\n");
    
    sb.append("    assessmentReportingMethodDescriptor: ").append(toIndentedString(assessmentReportingMethodDescriptor)).append("\n");
    sb.append("    resultDatatypeTypeDescriptor: ").append(toIndentedString(resultDatatypeTypeDescriptor)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

