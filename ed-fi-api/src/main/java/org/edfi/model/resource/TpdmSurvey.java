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
import org.edfi.model.resource.EdFiEducationOrganizationReference;
import org.edfi.model.resource.EdFiSchoolYearTypeReference;


/**
 * TpdmSurvey
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmSurvey   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("surveyIdentifier")
  private String surveyIdentifier = null;

  @SerializedName("educationOrganizationReference")
  private EdFiEducationOrganizationReference educationOrganizationReference = null;

  @SerializedName("schoolYearTypeReference")
  private EdFiSchoolYearTypeReference schoolYearTypeReference = null;

  @SerializedName("numberAdministered")
  private Integer numberAdministered = null;

  @SerializedName("surveyCategoryDescriptor")
  private String surveyCategoryDescriptor = null;

  @SerializedName("surveyTitle")
  private String surveyTitle = null;

  @SerializedName("termDescriptor")
  private String termDescriptor = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmSurvey id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TpdmSurvey surveyIdentifier(String surveyIdentifier) {
    this.surveyIdentifier = surveyIdentifier;
    return this;
  }

   /**
   * The unique survey identifier from the survey tool.
   * @return surveyIdentifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique survey identifier from the survey tool.")
  public String getSurveyIdentifier() {
    return surveyIdentifier;
  }

  public void setSurveyIdentifier(String surveyIdentifier) {
    this.surveyIdentifier = surveyIdentifier;
  }

  public TpdmSurvey educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }

  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }

  public TpdmSurvey schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
    return this;
  }

   /**
   * Get schoolYearTypeReference
   * @return schoolYearTypeReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiSchoolYearTypeReference getSchoolYearTypeReference() {
    return schoolYearTypeReference;
  }

  public void setSchoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
  }

  public TpdmSurvey numberAdministered(Integer numberAdministered) {
    this.numberAdministered = numberAdministered;
    return this;
  }

   /**
   * Number of persons to whom this survey was administered.
   * @return numberAdministered
  **/
  @ApiModelProperty(example = "null", value = "Number of persons to whom this survey was administered.")
  public Integer getNumberAdministered() {
    return numberAdministered;
  }

  public void setNumberAdministered(Integer numberAdministered) {
    this.numberAdministered = numberAdministered;
  }

  public TpdmSurvey surveyCategoryDescriptor(String surveyCategoryDescriptor) {
    this.surveyCategoryDescriptor = surveyCategoryDescriptor;
    return this;
  }

   /**
   * The Category or Type of Survey.
   * @return surveyCategoryDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The Category or Type of Survey.")
  public String getSurveyCategoryDescriptor() {
    return surveyCategoryDescriptor;
  }

  public void setSurveyCategoryDescriptor(String surveyCategoryDescriptor) {
    this.surveyCategoryDescriptor = surveyCategoryDescriptor;
  }

  public TpdmSurvey surveyTitle(String surveyTitle) {
    this.surveyTitle = surveyTitle;
    return this;
  }

   /**
   * The title of the survey.
   * @return surveyTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "The title of the survey.")
  public String getSurveyTitle() {
    return surveyTitle;
  }

  public void setSurveyTitle(String surveyTitle) {
    this.surveyTitle = surveyTitle;
  }

  public TpdmSurvey termDescriptor(String termDescriptor) {
    this.termDescriptor = termDescriptor;
    return this;
  }

   /**
   * The Term the survey was given.
   * @return termDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The Term the survey was given.")
  public String getTermDescriptor() {
    return termDescriptor;
  }

  public void setTermDescriptor(String termDescriptor) {
    this.termDescriptor = termDescriptor;
  }

  public TpdmSurvey etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * A unique system-generated value that identifies the version of the resource.
   * @return etag
  **/
  @ApiModelProperty(example = "null", value = "A unique system-generated value that identifies the version of the resource.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmSurvey tpdmSurvey = (TpdmSurvey) o;
    return Objects.equals(this.id, tpdmSurvey.id) &&
        Objects.equals(this.surveyIdentifier, tpdmSurvey.surveyIdentifier) &&
        Objects.equals(this.educationOrganizationReference, tpdmSurvey.educationOrganizationReference) &&
        Objects.equals(this.schoolYearTypeReference, tpdmSurvey.schoolYearTypeReference) &&
        Objects.equals(this.numberAdministered, tpdmSurvey.numberAdministered) &&
        Objects.equals(this.surveyCategoryDescriptor, tpdmSurvey.surveyCategoryDescriptor) &&
        Objects.equals(this.surveyTitle, tpdmSurvey.surveyTitle) &&
        Objects.equals(this.termDescriptor, tpdmSurvey.termDescriptor) &&
        Objects.equals(this.etag, tpdmSurvey.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, surveyIdentifier, educationOrganizationReference, schoolYearTypeReference, numberAdministered, surveyCategoryDescriptor, surveyTitle, termDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmSurvey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    surveyIdentifier: ").append(toIndentedString(surveyIdentifier)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    numberAdministered: ").append(toIndentedString(numberAdministered)).append("\n");
    sb.append("    surveyCategoryDescriptor: ").append(toIndentedString(surveyCategoryDescriptor)).append("\n");
    sb.append("    surveyTitle: ").append(toIndentedString(surveyTitle)).append("\n");
    sb.append("    termDescriptor: ").append(toIndentedString(termDescriptor)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

