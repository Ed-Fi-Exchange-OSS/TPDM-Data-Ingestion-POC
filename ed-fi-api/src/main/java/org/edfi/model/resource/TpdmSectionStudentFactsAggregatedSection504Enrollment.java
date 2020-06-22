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
 * TpdmSectionStudentFactsAggregatedSection504Enrollment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmSectionStudentFactsAggregatedSection504Enrollment   {
  @SerializedName("valueTypeDescriptor")
  private String valueTypeDescriptor = null;

  @SerializedName("number504Enrolled")
  private Integer number504Enrolled = null;

  @SerializedName("percentage504Enrolled")
  private Double percentage504Enrolled = null;

  public TpdmSectionStudentFactsAggregatedSection504Enrollment valueTypeDescriptor(String valueTypeDescriptor) {
    this.valueTypeDescriptor = valueTypeDescriptor;
    return this;
  }

   /**
   * The value of the data, i.e., is the data projected, actual or other
   * @return valueTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The value of the data, i.e., is the data projected, actual or other")
  public String getValueTypeDescriptor() {
    return valueTypeDescriptor;
  }

  public void setValueTypeDescriptor(String valueTypeDescriptor) {
    this.valueTypeDescriptor = valueTypeDescriptor;
  }

  public TpdmSectionStudentFactsAggregatedSection504Enrollment number504Enrolled(Integer number504Enrolled) {
    this.number504Enrolled = number504Enrolled;
    return this;
  }

   /**
   * The number of students who are enrolled in a 504 program
   * @return number504Enrolled
  **/
  @ApiModelProperty(example = "null", value = "The number of students who are enrolled in a 504 program")
  public Integer getNumber504Enrolled() {
    return number504Enrolled;
  }

  public void setNumber504Enrolled(Integer number504Enrolled) {
    this.number504Enrolled = number504Enrolled;
  }

  public TpdmSectionStudentFactsAggregatedSection504Enrollment percentage504Enrolled(Double percentage504Enrolled) {
    this.percentage504Enrolled = percentage504Enrolled;
    return this;
  }

   /**
   * The percentage of students who are enrolled in a 504 program
   * @return percentage504Enrolled
  **/
  @ApiModelProperty(example = "null", value = "The percentage of students who are enrolled in a 504 program")
  public Double getPercentage504Enrolled() {
    return percentage504Enrolled;
  }

  public void setPercentage504Enrolled(Double percentage504Enrolled) {
    this.percentage504Enrolled = percentage504Enrolled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmSectionStudentFactsAggregatedSection504Enrollment tpdmSectionStudentFactsAggregatedSection504Enrollment = (TpdmSectionStudentFactsAggregatedSection504Enrollment) o;
    return Objects.equals(this.valueTypeDescriptor, tpdmSectionStudentFactsAggregatedSection504Enrollment.valueTypeDescriptor) &&
        Objects.equals(this.number504Enrolled, tpdmSectionStudentFactsAggregatedSection504Enrollment.number504Enrolled) &&
        Objects.equals(this.percentage504Enrolled, tpdmSectionStudentFactsAggregatedSection504Enrollment.percentage504Enrolled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueTypeDescriptor, number504Enrolled, percentage504Enrolled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmSectionStudentFactsAggregatedSection504Enrollment {\n");
    
    sb.append("    valueTypeDescriptor: ").append(toIndentedString(valueTypeDescriptor)).append("\n");
    sb.append("    number504Enrolled: ").append(toIndentedString(number504Enrolled)).append("\n");
    sb.append("    percentage504Enrolled: ").append(toIndentedString(percentage504Enrolled)).append("\n");
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

