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
 * TpdmCourseStudentFactsAggregatedLanguage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmCourseStudentFactsAggregatedLanguage   {
  @SerializedName("languageDescriptor")
  private String languageDescriptor = null;

  @SerializedName("valueTypeDescriptor")
  private String valueTypeDescriptor = null;

  @SerializedName("languageTypeNumber")
  private Integer languageTypeNumber = null;

  @SerializedName("languageTypePercentage")
  private Double languageTypePercentage = null;

  public TpdmCourseStudentFactsAggregatedLanguage languageDescriptor(String languageDescriptor) {
    this.languageDescriptor = languageDescriptor;
    return this;
  }

   /**
   * Data about the language of the group
   * @return languageDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "Data about the language of the group")
  public String getLanguageDescriptor() {
    return languageDescriptor;
  }

  public void setLanguageDescriptor(String languageDescriptor) {
    this.languageDescriptor = languageDescriptor;
  }

  public TpdmCourseStudentFactsAggregatedLanguage valueTypeDescriptor(String valueTypeDescriptor) {
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

  public TpdmCourseStudentFactsAggregatedLanguage languageTypeNumber(Integer languageTypeNumber) {
    this.languageTypeNumber = languageTypeNumber;
    return this;
  }

   /**
   * The number of students by each language type.
   * @return languageTypeNumber
  **/
  @ApiModelProperty(example = "null", value = "The number of students by each language type.")
  public Integer getLanguageTypeNumber() {
    return languageTypeNumber;
  }

  public void setLanguageTypeNumber(Integer languageTypeNumber) {
    this.languageTypeNumber = languageTypeNumber;
  }

  public TpdmCourseStudentFactsAggregatedLanguage languageTypePercentage(Double languageTypePercentage) {
    this.languageTypePercentage = languageTypePercentage;
    return this;
  }

   /**
   * The percentage of students by language type.
   * @return languageTypePercentage
  **/
  @ApiModelProperty(example = "null", value = "The percentage of students by language type.")
  public Double getLanguageTypePercentage() {
    return languageTypePercentage;
  }

  public void setLanguageTypePercentage(Double languageTypePercentage) {
    this.languageTypePercentage = languageTypePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmCourseStudentFactsAggregatedLanguage tpdmCourseStudentFactsAggregatedLanguage = (TpdmCourseStudentFactsAggregatedLanguage) o;
    return Objects.equals(this.languageDescriptor, tpdmCourseStudentFactsAggregatedLanguage.languageDescriptor) &&
        Objects.equals(this.valueTypeDescriptor, tpdmCourseStudentFactsAggregatedLanguage.valueTypeDescriptor) &&
        Objects.equals(this.languageTypeNumber, tpdmCourseStudentFactsAggregatedLanguage.languageTypeNumber) &&
        Objects.equals(this.languageTypePercentage, tpdmCourseStudentFactsAggregatedLanguage.languageTypePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageDescriptor, valueTypeDescriptor, languageTypeNumber, languageTypePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCourseStudentFactsAggregatedLanguage {\n");
    
    sb.append("    languageDescriptor: ").append(toIndentedString(languageDescriptor)).append("\n");
    sb.append("    valueTypeDescriptor: ").append(toIndentedString(valueTypeDescriptor)).append("\n");
    sb.append("    languageTypeNumber: ").append(toIndentedString(languageTypeNumber)).append("\n");
    sb.append("    languageTypePercentage: ").append(toIndentedString(languageTypePercentage)).append("\n");
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

