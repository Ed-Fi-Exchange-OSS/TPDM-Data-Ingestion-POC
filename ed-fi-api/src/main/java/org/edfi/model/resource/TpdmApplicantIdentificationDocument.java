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
 * TpdmApplicantIdentificationDocument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmApplicantIdentificationDocument   {
  @SerializedName("identificationDocumentUseDescriptor")
  private String identificationDocumentUseDescriptor = null;

  @SerializedName("personalInformationVerificationDescriptor")
  private String personalInformationVerificationDescriptor = null;

  @SerializedName("issuerCountryDescriptor")
  private String issuerCountryDescriptor = null;

  @SerializedName("documentExpirationDate")
  private LocalDate documentExpirationDate = null;

  @SerializedName("documentTitle")
  private String documentTitle = null;

  @SerializedName("issuerDocumentIdentificationCode")
  private String issuerDocumentIdentificationCode = null;

  @SerializedName("issuerName")
  private String issuerName = null;

  public TpdmApplicantIdentificationDocument identificationDocumentUseDescriptor(String identificationDocumentUseDescriptor) {
    this.identificationDocumentUseDescriptor = identificationDocumentUseDescriptor;
    return this;
  }

   /**
   * The primary function of the document used for establishing identity.
   * @return identificationDocumentUseDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The primary function of the document used for establishing identity.")
  public String getIdentificationDocumentUseDescriptor() {
    return identificationDocumentUseDescriptor;
  }

  public void setIdentificationDocumentUseDescriptor(String identificationDocumentUseDescriptor) {
    this.identificationDocumentUseDescriptor = identificationDocumentUseDescriptor;
  }

  public TpdmApplicantIdentificationDocument personalInformationVerificationDescriptor(String personalInformationVerificationDescriptor) {
    this.personalInformationVerificationDescriptor = personalInformationVerificationDescriptor;
    return this;
  }

   /**
   * The category of the document relative to its purpose.
   * @return personalInformationVerificationDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The category of the document relative to its purpose.")
  public String getPersonalInformationVerificationDescriptor() {
    return personalInformationVerificationDescriptor;
  }

  public void setPersonalInformationVerificationDescriptor(String personalInformationVerificationDescriptor) {
    this.personalInformationVerificationDescriptor = personalInformationVerificationDescriptor;
  }

  public TpdmApplicantIdentificationDocument issuerCountryDescriptor(String issuerCountryDescriptor) {
    this.issuerCountryDescriptor = issuerCountryDescriptor;
    return this;
  }

   /**
   * Country of origin of the document. It is strongly recommended that entries use only ISO 3166 2-letter country codes.
   * @return issuerCountryDescriptor
  **/
  @ApiModelProperty(example = "null", value = "Country of origin of the document. It is strongly recommended that entries use only ISO 3166 2-letter country codes.")
  public String getIssuerCountryDescriptor() {
    return issuerCountryDescriptor;
  }

  public void setIssuerCountryDescriptor(String issuerCountryDescriptor) {
    this.issuerCountryDescriptor = issuerCountryDescriptor;
  }

  public TpdmApplicantIdentificationDocument documentExpirationDate(LocalDate documentExpirationDate) {
    this.documentExpirationDate = documentExpirationDate;
    return this;
  }

   /**
   * The day when the document  expires, if null then never expires.
   * @return documentExpirationDate
  **/
  @ApiModelProperty(example = "null", value = "The day when the document  expires, if null then never expires.")
  public LocalDate getDocumentExpirationDate() {
    return documentExpirationDate;
  }

  public void setDocumentExpirationDate(LocalDate documentExpirationDate) {
    this.documentExpirationDate = documentExpirationDate;
  }

  public TpdmApplicantIdentificationDocument documentTitle(String documentTitle) {
    this.documentTitle = documentTitle;
    return this;
  }

   /**
   * The title of the document given by the issuer.
   * @return documentTitle
  **/
  @ApiModelProperty(example = "null", value = "The title of the document given by the issuer.")
  public String getDocumentTitle() {
    return documentTitle;
  }

  public void setDocumentTitle(String documentTitle) {
    this.documentTitle = documentTitle;
  }

  public TpdmApplicantIdentificationDocument issuerDocumentIdentificationCode(String issuerDocumentIdentificationCode) {
    this.issuerDocumentIdentificationCode = issuerDocumentIdentificationCode;
    return this;
  }

   /**
   * The unique identifier on the issuer's identification system.
   * @return issuerDocumentIdentificationCode
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier on the issuer's identification system.")
  public String getIssuerDocumentIdentificationCode() {
    return issuerDocumentIdentificationCode;
  }

  public void setIssuerDocumentIdentificationCode(String issuerDocumentIdentificationCode) {
    this.issuerDocumentIdentificationCode = issuerDocumentIdentificationCode;
  }

  public TpdmApplicantIdentificationDocument issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Name of the entity or institution that issued the document.
   * @return issuerName
  **/
  @ApiModelProperty(example = "null", value = "Name of the entity or institution that issued the document.")
  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmApplicantIdentificationDocument tpdmApplicantIdentificationDocument = (TpdmApplicantIdentificationDocument) o;
    return Objects.equals(this.identificationDocumentUseDescriptor, tpdmApplicantIdentificationDocument.identificationDocumentUseDescriptor) &&
        Objects.equals(this.personalInformationVerificationDescriptor, tpdmApplicantIdentificationDocument.personalInformationVerificationDescriptor) &&
        Objects.equals(this.issuerCountryDescriptor, tpdmApplicantIdentificationDocument.issuerCountryDescriptor) &&
        Objects.equals(this.documentExpirationDate, tpdmApplicantIdentificationDocument.documentExpirationDate) &&
        Objects.equals(this.documentTitle, tpdmApplicantIdentificationDocument.documentTitle) &&
        Objects.equals(this.issuerDocumentIdentificationCode, tpdmApplicantIdentificationDocument.issuerDocumentIdentificationCode) &&
        Objects.equals(this.issuerName, tpdmApplicantIdentificationDocument.issuerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationDocumentUseDescriptor, personalInformationVerificationDescriptor, issuerCountryDescriptor, documentExpirationDate, documentTitle, issuerDocumentIdentificationCode, issuerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmApplicantIdentificationDocument {\n");
    
    sb.append("    identificationDocumentUseDescriptor: ").append(toIndentedString(identificationDocumentUseDescriptor)).append("\n");
    sb.append("    personalInformationVerificationDescriptor: ").append(toIndentedString(personalInformationVerificationDescriptor)).append("\n");
    sb.append("    issuerCountryDescriptor: ").append(toIndentedString(issuerCountryDescriptor)).append("\n");
    sb.append("    documentExpirationDate: ").append(toIndentedString(documentExpirationDate)).append("\n");
    sb.append("    documentTitle: ").append(toIndentedString(documentTitle)).append("\n");
    sb.append("    issuerDocumentIdentificationCode: ").append(toIndentedString(issuerDocumentIdentificationCode)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
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

