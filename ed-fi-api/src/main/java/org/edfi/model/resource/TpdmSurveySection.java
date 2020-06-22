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
import org.edfi.model.resource.TpdmSurveyReference;


/**
 * TpdmSurveySection
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmSurveySection   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("surveySectionTitle")
  private String surveySectionTitle = null;

  @SerializedName("surveyReference")
  private TpdmSurveyReference surveyReference = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmSurveySection id(String id) {
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

  public TpdmSurveySection surveySectionTitle(String surveySectionTitle) {
    this.surveySectionTitle = surveySectionTitle;
    return this;
  }

   /**
   * The title or label for the survey section.
   * @return surveySectionTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "The title or label for the survey section.")
  public String getSurveySectionTitle() {
    return surveySectionTitle;
  }

  public void setSurveySectionTitle(String surveySectionTitle) {
    this.surveySectionTitle = surveySectionTitle;
  }

  public TpdmSurveySection surveyReference(TpdmSurveyReference surveyReference) {
    this.surveyReference = surveyReference;
    return this;
  }

   /**
   * Get surveyReference
   * @return surveyReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TpdmSurveyReference getSurveyReference() {
    return surveyReference;
  }

  public void setSurveyReference(TpdmSurveyReference surveyReference) {
    this.surveyReference = surveyReference;
  }

  public TpdmSurveySection etag(String etag) {
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
    TpdmSurveySection tpdmSurveySection = (TpdmSurveySection) o;
    return Objects.equals(this.id, tpdmSurveySection.id) &&
        Objects.equals(this.surveySectionTitle, tpdmSurveySection.surveySectionTitle) &&
        Objects.equals(this.surveyReference, tpdmSurveySection.surveyReference) &&
        Objects.equals(this.etag, tpdmSurveySection.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, surveySectionTitle, surveyReference, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmSurveySection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    surveySectionTitle: ").append(toIndentedString(surveySectionTitle)).append("\n");
    sb.append("    surveyReference: ").append(toIndentedString(surveyReference)).append("\n");
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

