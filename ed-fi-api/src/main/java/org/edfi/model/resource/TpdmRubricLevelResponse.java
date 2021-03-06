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
import org.edfi.model.resource.TpdmPerformanceMeasureReference;
import org.edfi.model.resource.TpdmRubricLevelReference;


/**
 * TpdmRubricLevelResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmRubricLevelResponse   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("performanceMeasureReference")
  private TpdmPerformanceMeasureReference performanceMeasureReference = null;

  @SerializedName("rubricLevelReference")
  private TpdmRubricLevelReference rubricLevelReference = null;

  @SerializedName("areaOfRefinement")
  private Boolean areaOfRefinement = null;

  @SerializedName("areaOfReinforcement")
  private Boolean areaOfReinforcement = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("numericResponse")
  private Integer numericResponse = null;

  @SerializedName("textResponse")
  private String textResponse = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmRubricLevelResponse id(String id) {
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

  public TpdmRubricLevelResponse performanceMeasureReference(TpdmPerformanceMeasureReference performanceMeasureReference) {
    this.performanceMeasureReference = performanceMeasureReference;
    return this;
  }

   /**
   * Get performanceMeasureReference
   * @return performanceMeasureReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TpdmPerformanceMeasureReference getPerformanceMeasureReference() {
    return performanceMeasureReference;
  }

  public void setPerformanceMeasureReference(TpdmPerformanceMeasureReference performanceMeasureReference) {
    this.performanceMeasureReference = performanceMeasureReference;
  }

  public TpdmRubricLevelResponse rubricLevelReference(TpdmRubricLevelReference rubricLevelReference) {
    this.rubricLevelReference = rubricLevelReference;
    return this;
  }

   /**
   * Get rubricLevelReference
   * @return rubricLevelReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TpdmRubricLevelReference getRubricLevelReference() {
    return rubricLevelReference;
  }

  public void setRubricLevelReference(TpdmRubricLevelReference rubricLevelReference) {
    this.rubricLevelReference = rubricLevelReference;
  }

  public TpdmRubricLevelResponse areaOfRefinement(Boolean areaOfRefinement) {
    this.areaOfRefinement = areaOfRefinement;
    return this;
  }

   /**
   * Indicator that the rubric component is an area of refinement.
   * @return areaOfRefinement
  **/
  @ApiModelProperty(example = "null", value = "Indicator that the rubric component is an area of refinement.")
  public Boolean getAreaOfRefinement() {
    return areaOfRefinement;
  }

  public void setAreaOfRefinement(Boolean areaOfRefinement) {
    this.areaOfRefinement = areaOfRefinement;
  }

  public TpdmRubricLevelResponse areaOfReinforcement(Boolean areaOfReinforcement) {
    this.areaOfReinforcement = areaOfReinforcement;
    return this;
  }

   /**
   * Indicator that the rubric component is an area of reinforcement.
   * @return areaOfReinforcement
  **/
  @ApiModelProperty(example = "null", value = "Indicator that the rubric component is an area of reinforcement.")
  public Boolean getAreaOfReinforcement() {
    return areaOfReinforcement;
  }

  public void setAreaOfReinforcement(Boolean areaOfReinforcement) {
    this.areaOfReinforcement = areaOfReinforcement;
  }

  public TpdmRubricLevelResponse comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Any comments about the response provided at the rubric level.
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "Any comments about the response provided at the rubric level.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public TpdmRubricLevelResponse numericResponse(Integer numericResponse) {
    this.numericResponse = numericResponse;
    return this;
  }

   /**
   * The score for the specified level of the rubric.
   * @return numericResponse
  **/
  @ApiModelProperty(example = "null", required = true, value = "The score for the specified level of the rubric.")
  public Integer getNumericResponse() {
    return numericResponse;
  }

  public void setNumericResponse(Integer numericResponse) {
    this.numericResponse = numericResponse;
  }

  public TpdmRubricLevelResponse textResponse(String textResponse) {
    this.textResponse = textResponse;
    return this;
  }

   /**
   * The text response(s) for the question.
   * @return textResponse
  **/
  @ApiModelProperty(example = "null", value = "The text response(s) for the question.")
  public String getTextResponse() {
    return textResponse;
  }

  public void setTextResponse(String textResponse) {
    this.textResponse = textResponse;
  }

  public TpdmRubricLevelResponse etag(String etag) {
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
    TpdmRubricLevelResponse tpdmRubricLevelResponse = (TpdmRubricLevelResponse) o;
    return Objects.equals(this.id, tpdmRubricLevelResponse.id) &&
        Objects.equals(this.performanceMeasureReference, tpdmRubricLevelResponse.performanceMeasureReference) &&
        Objects.equals(this.rubricLevelReference, tpdmRubricLevelResponse.rubricLevelReference) &&
        Objects.equals(this.areaOfRefinement, tpdmRubricLevelResponse.areaOfRefinement) &&
        Objects.equals(this.areaOfReinforcement, tpdmRubricLevelResponse.areaOfReinforcement) &&
        Objects.equals(this.comments, tpdmRubricLevelResponse.comments) &&
        Objects.equals(this.numericResponse, tpdmRubricLevelResponse.numericResponse) &&
        Objects.equals(this.textResponse, tpdmRubricLevelResponse.textResponse) &&
        Objects.equals(this.etag, tpdmRubricLevelResponse.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, performanceMeasureReference, rubricLevelReference, areaOfRefinement, areaOfReinforcement, comments, numericResponse, textResponse, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmRubricLevelResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    performanceMeasureReference: ").append(toIndentedString(performanceMeasureReference)).append("\n");
    sb.append("    rubricLevelReference: ").append(toIndentedString(rubricLevelReference)).append("\n");
    sb.append("    areaOfRefinement: ").append(toIndentedString(areaOfRefinement)).append("\n");
    sb.append("    areaOfReinforcement: ").append(toIndentedString(areaOfReinforcement)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    numericResponse: ").append(toIndentedString(numericResponse)).append("\n");
    sb.append("    textResponse: ").append(toIndentedString(textResponse)).append("\n");
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

