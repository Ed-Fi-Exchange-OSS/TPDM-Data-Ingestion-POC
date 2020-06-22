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
 * TpdmCredentialCertificationExam
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmCredentialCertificationExam   {
  @SerializedName("certificationExamTitle")
  private String certificationExamTitle = null;

  @SerializedName("certificationExamStatusDescriptor")
  private String certificationExamStatusDescriptor = null;

  @SerializedName("certificationExamTypeDescriptor")
  private String certificationExamTypeDescriptor = null;

  @SerializedName("attemptNumber")
  private Integer attemptNumber = null;

  @SerializedName("certificationExamDate")
  private LocalDate certificationExamDate = null;

  @SerializedName("certificationExamOverallScore")
  private Integer certificationExamOverallScore = null;

  @SerializedName("certificationExamPassFail")
  private Boolean certificationExamPassFail = null;

  public TpdmCredentialCertificationExam certificationExamTitle(String certificationExamTitle) {
    this.certificationExamTitle = certificationExamTitle;
    return this;
  }

   /**
   * The title or name of the certification.
   * @return certificationExamTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "The title or name of the certification.")
  public String getCertificationExamTitle() {
    return certificationExamTitle;
  }

  public void setCertificationExamTitle(String certificationExamTitle) {
    this.certificationExamTitle = certificationExamTitle;
  }

  public TpdmCredentialCertificationExam certificationExamStatusDescriptor(String certificationExamStatusDescriptor) {
    this.certificationExamStatusDescriptor = certificationExamStatusDescriptor;
    return this;
  }

   /**
   * The status of the exam.
   * @return certificationExamStatusDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The status of the exam.")
  public String getCertificationExamStatusDescriptor() {
    return certificationExamStatusDescriptor;
  }

  public void setCertificationExamStatusDescriptor(String certificationExamStatusDescriptor) {
    this.certificationExamStatusDescriptor = certificationExamStatusDescriptor;
  }

  public TpdmCredentialCertificationExam certificationExamTypeDescriptor(String certificationExamTypeDescriptor) {
    this.certificationExamTypeDescriptor = certificationExamTypeDescriptor;
    return this;
  }

   /**
   * The type of certification exam that was taken.
   * @return certificationExamTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The type of certification exam that was taken.")
  public String getCertificationExamTypeDescriptor() {
    return certificationExamTypeDescriptor;
  }

  public void setCertificationExamTypeDescriptor(String certificationExamTypeDescriptor) {
    this.certificationExamTypeDescriptor = certificationExamTypeDescriptor;
  }

  public TpdmCredentialCertificationExam attemptNumber(Integer attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

   /**
   * The attempt number for this exam.
   * @return attemptNumber
  **/
  @ApiModelProperty(example = "null", value = "The attempt number for this exam.")
  public Integer getAttemptNumber() {
    return attemptNumber;
  }

  public void setAttemptNumber(Integer attemptNumber) {
    this.attemptNumber = attemptNumber;
  }

  public TpdmCredentialCertificationExam certificationExamDate(LocalDate certificationExamDate) {
    this.certificationExamDate = certificationExamDate;
    return this;
  }

   /**
   * The date the certification exam was administered.
   * @return certificationExamDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The date the certification exam was administered.")
  public LocalDate getCertificationExamDate() {
    return certificationExamDate;
  }

  public void setCertificationExamDate(LocalDate certificationExamDate) {
    this.certificationExamDate = certificationExamDate;
  }

  public TpdmCredentialCertificationExam certificationExamOverallScore(Integer certificationExamOverallScore) {
    this.certificationExamOverallScore = certificationExamOverallScore;
    return this;
  }

   /**
   * The overall score that was received on the certification exam.
   * @return certificationExamOverallScore
  **/
  @ApiModelProperty(example = "null", value = "The overall score that was received on the certification exam.")
  public Integer getCertificationExamOverallScore() {
    return certificationExamOverallScore;
  }

  public void setCertificationExamOverallScore(Integer certificationExamOverallScore) {
    this.certificationExamOverallScore = certificationExamOverallScore;
  }

  public TpdmCredentialCertificationExam certificationExamPassFail(Boolean certificationExamPassFail) {
    this.certificationExamPassFail = certificationExamPassFail;
    return this;
  }

   /**
   * Indicates if the certification exam was passed by the teacher candidate.
   * @return certificationExamPassFail
  **/
  @ApiModelProperty(example = "null", value = "Indicates if the certification exam was passed by the teacher candidate.")
  public Boolean getCertificationExamPassFail() {
    return certificationExamPassFail;
  }

  public void setCertificationExamPassFail(Boolean certificationExamPassFail) {
    this.certificationExamPassFail = certificationExamPassFail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmCredentialCertificationExam tpdmCredentialCertificationExam = (TpdmCredentialCertificationExam) o;
    return Objects.equals(this.certificationExamTitle, tpdmCredentialCertificationExam.certificationExamTitle) &&
        Objects.equals(this.certificationExamStatusDescriptor, tpdmCredentialCertificationExam.certificationExamStatusDescriptor) &&
        Objects.equals(this.certificationExamTypeDescriptor, tpdmCredentialCertificationExam.certificationExamTypeDescriptor) &&
        Objects.equals(this.attemptNumber, tpdmCredentialCertificationExam.attemptNumber) &&
        Objects.equals(this.certificationExamDate, tpdmCredentialCertificationExam.certificationExamDate) &&
        Objects.equals(this.certificationExamOverallScore, tpdmCredentialCertificationExam.certificationExamOverallScore) &&
        Objects.equals(this.certificationExamPassFail, tpdmCredentialCertificationExam.certificationExamPassFail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificationExamTitle, certificationExamStatusDescriptor, certificationExamTypeDescriptor, attemptNumber, certificationExamDate, certificationExamOverallScore, certificationExamPassFail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCredentialCertificationExam {\n");
    
    sb.append("    certificationExamTitle: ").append(toIndentedString(certificationExamTitle)).append("\n");
    sb.append("    certificationExamStatusDescriptor: ").append(toIndentedString(certificationExamStatusDescriptor)).append("\n");
    sb.append("    certificationExamTypeDescriptor: ").append(toIndentedString(certificationExamTypeDescriptor)).append("\n");
    sb.append("    attemptNumber: ").append(toIndentedString(attemptNumber)).append("\n");
    sb.append("    certificationExamDate: ").append(toIndentedString(certificationExamDate)).append("\n");
    sb.append("    certificationExamOverallScore: ").append(toIndentedString(certificationExamOverallScore)).append("\n");
    sb.append("    certificationExamPassFail: ").append(toIndentedString(certificationExamPassFail)).append("\n");
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

