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
import org.joda.time.LocalDate;


/**
 * TpdmTeacherCandidateAid
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmTeacherCandidateAid   {
  @SerializedName("aidTypeDescriptor")
  private String aidTypeDescriptor = null;

  @SerializedName("beginDate")
  private LocalDate beginDate = null;

  @SerializedName("aidAmount")
  private Double aidAmount = null;

  @SerializedName("aidConditionDescription")
  private String aidConditionDescription = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("pellGrantRecipient")
  private Boolean pellGrantRecipient = null;

  public TpdmTeacherCandidateAid aidTypeDescriptor(String aidTypeDescriptor) {
    this.aidTypeDescriptor = aidTypeDescriptor;
    return this;
  }

   /**
   * The classification of financial aid awarded to a person for the academic term/year.
   * @return aidTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The classification of financial aid awarded to a person for the academic term/year.")
  public String getAidTypeDescriptor() {
    return aidTypeDescriptor;
  }

  public void setAidTypeDescriptor(String aidTypeDescriptor) {
    this.aidTypeDescriptor = aidTypeDescriptor;
  }

  public TpdmTeacherCandidateAid beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The date the award was designated.
   * @return beginDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The date the award was designated.")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public TpdmTeacherCandidateAid aidAmount(Double aidAmount) {
    this.aidAmount = aidAmount;
    return this;
  }

   /**
   * The amount of financial aid awarded to a person for the term/year.
   * @return aidAmount
  **/
  @ApiModelProperty(example = "null", value = "The amount of financial aid awarded to a person for the term/year.")
  public Double getAidAmount() {
    return aidAmount;
  }

  public void setAidAmount(Double aidAmount) {
    this.aidAmount = aidAmount;
  }

  public TpdmTeacherCandidateAid aidConditionDescription(String aidConditionDescription) {
    this.aidConditionDescription = aidConditionDescription;
    return this;
  }

   /**
   * The description of the condition (e.g., placement in a high need school) under which the aid was given.
   * @return aidConditionDescription
  **/
  @ApiModelProperty(example = "null", value = "The description of the condition (e.g., placement in a high need school) under which the aid was given.")
  public String getAidConditionDescription() {
    return aidConditionDescription;
  }

  public void setAidConditionDescription(String aidConditionDescription) {
    this.aidConditionDescription = aidConditionDescription;
  }

  public TpdmTeacherCandidateAid endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date the award was removed.
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "The date the award was removed.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public TpdmTeacherCandidateAid pellGrantRecipient(Boolean pellGrantRecipient) {
    this.pellGrantRecipient = pellGrantRecipient;
    return this;
  }

   /**
   * Indicates a person who receives Pell Grant aid.
   * @return pellGrantRecipient
  **/
  @ApiModelProperty(example = "null", value = "Indicates a person who receives Pell Grant aid.")
  public Boolean getPellGrantRecipient() {
    return pellGrantRecipient;
  }

  public void setPellGrantRecipient(Boolean pellGrantRecipient) {
    this.pellGrantRecipient = pellGrantRecipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmTeacherCandidateAid tpdmTeacherCandidateAid = (TpdmTeacherCandidateAid) o;
    return Objects.equals(this.aidTypeDescriptor, tpdmTeacherCandidateAid.aidTypeDescriptor) &&
        Objects.equals(this.beginDate, tpdmTeacherCandidateAid.beginDate) &&
        Objects.equals(this.aidAmount, tpdmTeacherCandidateAid.aidAmount) &&
        Objects.equals(this.aidConditionDescription, tpdmTeacherCandidateAid.aidConditionDescription) &&
        Objects.equals(this.endDate, tpdmTeacherCandidateAid.endDate) &&
        Objects.equals(this.pellGrantRecipient, tpdmTeacherCandidateAid.pellGrantRecipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aidTypeDescriptor, beginDate, aidAmount, aidConditionDescription, endDate, pellGrantRecipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmTeacherCandidateAid {\n");
    
    sb.append("    aidTypeDescriptor: ").append(toIndentedString(aidTypeDescriptor)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    aidAmount: ").append(toIndentedString(aidAmount)).append("\n");
    sb.append("    aidConditionDescription: ").append(toIndentedString(aidConditionDescription)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    pellGrantRecipient: ").append(toIndentedString(pellGrantRecipient)).append("\n");
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

