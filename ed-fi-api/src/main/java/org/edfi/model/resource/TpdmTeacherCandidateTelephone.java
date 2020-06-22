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
 * TpdmTeacherCandidateTelephone
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmTeacherCandidateTelephone   {
  @SerializedName("telephoneNumberTypeDescriptor")
  private String telephoneNumberTypeDescriptor = null;

  @SerializedName("doNotPublishIndicator")
  private Boolean doNotPublishIndicator = null;

  @SerializedName("orderOfPriority")
  private Integer orderOfPriority = null;

  @SerializedName("telephoneNumber")
  private String telephoneNumber = null;

  @SerializedName("textMessageCapabilityIndicator")
  private Boolean textMessageCapabilityIndicator = null;

  public TpdmTeacherCandidateTelephone telephoneNumberTypeDescriptor(String telephoneNumberTypeDescriptor) {
    this.telephoneNumberTypeDescriptor = telephoneNumberTypeDescriptor;
    return this;
  }

   /**
   * The type of communication number listed for an individual or organization.
   * @return telephoneNumberTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of communication number listed for an individual or organization.")
  public String getTelephoneNumberTypeDescriptor() {
    return telephoneNumberTypeDescriptor;
  }

  public void setTelephoneNumberTypeDescriptor(String telephoneNumberTypeDescriptor) {
    this.telephoneNumberTypeDescriptor = telephoneNumberTypeDescriptor;
  }

  public TpdmTeacherCandidateTelephone doNotPublishIndicator(Boolean doNotPublishIndicator) {
    this.doNotPublishIndicator = doNotPublishIndicator;
    return this;
  }

   /**
   * An indication that the telephone number should not be published.
   * @return doNotPublishIndicator
  **/
  @ApiModelProperty(example = "null", value = "An indication that the telephone number should not be published.")
  public Boolean getDoNotPublishIndicator() {
    return doNotPublishIndicator;
  }

  public void setDoNotPublishIndicator(Boolean doNotPublishIndicator) {
    this.doNotPublishIndicator = doNotPublishIndicator;
  }

  public TpdmTeacherCandidateTelephone orderOfPriority(Integer orderOfPriority) {
    this.orderOfPriority = orderOfPriority;
    return this;
  }

   /**
   * The order of priority assigned to telephone numbers to define which number to attempt first, second, etc.
   * @return orderOfPriority
  **/
  @ApiModelProperty(example = "null", value = "The order of priority assigned to telephone numbers to define which number to attempt first, second, etc.")
  public Integer getOrderOfPriority() {
    return orderOfPriority;
  }

  public void setOrderOfPriority(Integer orderOfPriority) {
    this.orderOfPriority = orderOfPriority;
  }

  public TpdmTeacherCandidateTelephone telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The telephone number including the area code, and extension, if applicable.
   * @return telephoneNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "The telephone number including the area code, and extension, if applicable.")
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public TpdmTeacherCandidateTelephone textMessageCapabilityIndicator(Boolean textMessageCapabilityIndicator) {
    this.textMessageCapabilityIndicator = textMessageCapabilityIndicator;
    return this;
  }

   /**
   * An indication that the telephone number is technically capable of sending and receiving Short Message Service (SMS) text messages.
   * @return textMessageCapabilityIndicator
  **/
  @ApiModelProperty(example = "null", value = "An indication that the telephone number is technically capable of sending and receiving Short Message Service (SMS) text messages.")
  public Boolean getTextMessageCapabilityIndicator() {
    return textMessageCapabilityIndicator;
  }

  public void setTextMessageCapabilityIndicator(Boolean textMessageCapabilityIndicator) {
    this.textMessageCapabilityIndicator = textMessageCapabilityIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmTeacherCandidateTelephone tpdmTeacherCandidateTelephone = (TpdmTeacherCandidateTelephone) o;
    return Objects.equals(this.telephoneNumberTypeDescriptor, tpdmTeacherCandidateTelephone.telephoneNumberTypeDescriptor) &&
        Objects.equals(this.doNotPublishIndicator, tpdmTeacherCandidateTelephone.doNotPublishIndicator) &&
        Objects.equals(this.orderOfPriority, tpdmTeacherCandidateTelephone.orderOfPriority) &&
        Objects.equals(this.telephoneNumber, tpdmTeacherCandidateTelephone.telephoneNumber) &&
        Objects.equals(this.textMessageCapabilityIndicator, tpdmTeacherCandidateTelephone.textMessageCapabilityIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telephoneNumberTypeDescriptor, doNotPublishIndicator, orderOfPriority, telephoneNumber, textMessageCapabilityIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmTeacherCandidateTelephone {\n");
    
    sb.append("    telephoneNumberTypeDescriptor: ").append(toIndentedString(telephoneNumberTypeDescriptor)).append("\n");
    sb.append("    doNotPublishIndicator: ").append(toIndentedString(doNotPublishIndicator)).append("\n");
    sb.append("    orderOfPriority: ").append(toIndentedString(orderOfPriority)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    textMessageCapabilityIndicator: ").append(toIndentedString(textMessageCapabilityIndicator)).append("\n");
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

