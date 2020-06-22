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
import org.edfi.model.resource.Link;


/**
 * TpdmSurveyResponseReference
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmSurveyResponseReference   {
  @SerializedName("surveyIdentifier")
  private String surveyIdentifier = null;

  @SerializedName("surveyResponseIdentifier")
  private String surveyResponseIdentifier = null;

  @SerializedName("link")
  private Link link = null;

  public TpdmSurveyResponseReference surveyIdentifier(String surveyIdentifier) {
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

  public TpdmSurveyResponseReference surveyResponseIdentifier(String surveyResponseIdentifier) {
    this.surveyResponseIdentifier = surveyResponseIdentifier;
    return this;
  }

   /**
   * The identifier of the survey typically from the survey application.
   * @return surveyResponseIdentifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the survey typically from the survey application.")
  public String getSurveyResponseIdentifier() {
    return surveyResponseIdentifier;
  }

  public void setSurveyResponseIdentifier(String surveyResponseIdentifier) {
    this.surveyResponseIdentifier = surveyResponseIdentifier;
  }

  public TpdmSurveyResponseReference link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmSurveyResponseReference tpdmSurveyResponseReference = (TpdmSurveyResponseReference) o;
    return Objects.equals(this.surveyIdentifier, tpdmSurveyResponseReference.surveyIdentifier) &&
        Objects.equals(this.surveyResponseIdentifier, tpdmSurveyResponseReference.surveyResponseIdentifier) &&
        Objects.equals(this.link, tpdmSurveyResponseReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyIdentifier, surveyResponseIdentifier, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmSurveyResponseReference {\n");
    
    sb.append("    surveyIdentifier: ").append(toIndentedString(surveyIdentifier)).append("\n");
    sb.append("    surveyResponseIdentifier: ").append(toIndentedString(surveyResponseIdentifier)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

