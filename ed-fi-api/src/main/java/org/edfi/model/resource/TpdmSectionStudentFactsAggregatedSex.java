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
 * TpdmSectionStudentFactsAggregatedSex
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmSectionStudentFactsAggregatedSex   {
  @SerializedName("sexDescriptor")
  private String sexDescriptor = null;

  @SerializedName("valueTypeDescriptor")
  private String valueTypeDescriptor = null;

  @SerializedName("sexTypeNumber")
  private Integer sexTypeNumber = null;

  @SerializedName("sexTypePercentage")
  private Double sexTypePercentage = null;

  public TpdmSectionStudentFactsAggregatedSex sexDescriptor(String sexDescriptor) {
    this.sexDescriptor = sexDescriptor;
    return this;
  }

   /**
   * A person's gender.
   * @return sexDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "A person's gender.")
  public String getSexDescriptor() {
    return sexDescriptor;
  }

  public void setSexDescriptor(String sexDescriptor) {
    this.sexDescriptor = sexDescriptor;
  }

  public TpdmSectionStudentFactsAggregatedSex valueTypeDescriptor(String valueTypeDescriptor) {
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

  public TpdmSectionStudentFactsAggregatedSex sexTypeNumber(Integer sexTypeNumber) {
    this.sexTypeNumber = sexTypeNumber;
    return this;
  }

   /**
   * The number of students by each sex type
   * @return sexTypeNumber
  **/
  @ApiModelProperty(example = "null", value = "The number of students by each sex type")
  public Integer getSexTypeNumber() {
    return sexTypeNumber;
  }

  public void setSexTypeNumber(Integer sexTypeNumber) {
    this.sexTypeNumber = sexTypeNumber;
  }

  public TpdmSectionStudentFactsAggregatedSex sexTypePercentage(Double sexTypePercentage) {
    this.sexTypePercentage = sexTypePercentage;
    return this;
  }

   /**
   * The percentage of students by each sex type.
   * @return sexTypePercentage
  **/
  @ApiModelProperty(example = "null", value = "The percentage of students by each sex type.")
  public Double getSexTypePercentage() {
    return sexTypePercentage;
  }

  public void setSexTypePercentage(Double sexTypePercentage) {
    this.sexTypePercentage = sexTypePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmSectionStudentFactsAggregatedSex tpdmSectionStudentFactsAggregatedSex = (TpdmSectionStudentFactsAggregatedSex) o;
    return Objects.equals(this.sexDescriptor, tpdmSectionStudentFactsAggregatedSex.sexDescriptor) &&
        Objects.equals(this.valueTypeDescriptor, tpdmSectionStudentFactsAggregatedSex.valueTypeDescriptor) &&
        Objects.equals(this.sexTypeNumber, tpdmSectionStudentFactsAggregatedSex.sexTypeNumber) &&
        Objects.equals(this.sexTypePercentage, tpdmSectionStudentFactsAggregatedSex.sexTypePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sexDescriptor, valueTypeDescriptor, sexTypeNumber, sexTypePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmSectionStudentFactsAggregatedSex {\n");
    
    sb.append("    sexDescriptor: ").append(toIndentedString(sexDescriptor)).append("\n");
    sb.append("    valueTypeDescriptor: ").append(toIndentedString(valueTypeDescriptor)).append("\n");
    sb.append("    sexTypeNumber: ").append(toIndentedString(sexTypeNumber)).append("\n");
    sb.append("    sexTypePercentage: ").append(toIndentedString(sexTypePercentage)).append("\n");
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

