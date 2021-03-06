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
import java.util.ArrayList;
import java.util.List;
import org.edfi.model.resource.TpdmStaffEvaluationComponentReference;
import org.edfi.model.resource.TpdmStaffEvaluationElementStaffRatingLevel;


/**
 * TpdmStaffEvaluationElement
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmStaffEvaluationElement   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("evaluationElement")
  private String evaluationElement = null;

  @SerializedName("staffEvaluationComponentReference")
  private TpdmStaffEvaluationComponentReference staffEvaluationComponentReference = null;

  @SerializedName("maxRating")
  private Double maxRating = null;

  @SerializedName("minRating")
  private Double minRating = null;

  @SerializedName("rubricReference")
  private String rubricReference = null;

  @SerializedName("staffRatingLevels")
  private List<TpdmStaffEvaluationElementStaffRatingLevel> staffRatingLevels = new ArrayList<TpdmStaffEvaluationElementStaffRatingLevel>();

  @SerializedName("_etag")
  private String etag = null;

  public TpdmStaffEvaluationElement id(String id) {
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

  public TpdmStaffEvaluationElement evaluationElement(String evaluationElement) {
    this.evaluationElement = evaluationElement;
    return this;
  }

   /**
   * The Evaluation Element name or title (e.g., Preparation, classroom control, delivery of instruction, etc.).
   * @return evaluationElement
  **/
  @ApiModelProperty(example = "null", required = true, value = "The Evaluation Element name or title (e.g., Preparation, classroom control, delivery of instruction, etc.).")
  public String getEvaluationElement() {
    return evaluationElement;
  }

  public void setEvaluationElement(String evaluationElement) {
    this.evaluationElement = evaluationElement;
  }

  public TpdmStaffEvaluationElement staffEvaluationComponentReference(TpdmStaffEvaluationComponentReference staffEvaluationComponentReference) {
    this.staffEvaluationComponentReference = staffEvaluationComponentReference;
    return this;
  }

   /**
   * Get staffEvaluationComponentReference
   * @return staffEvaluationComponentReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TpdmStaffEvaluationComponentReference getStaffEvaluationComponentReference() {
    return staffEvaluationComponentReference;
  }

  public void setStaffEvaluationComponentReference(TpdmStaffEvaluationComponentReference staffEvaluationComponentReference) {
    this.staffEvaluationComponentReference = staffEvaluationComponentReference;
  }

  public TpdmStaffEvaluationElement maxRating(Double maxRating) {
    this.maxRating = maxRating;
    return this;
  }

   /**
   * The max rating for the scale used for the Evaluation Component, if different from the overall staff evaluation.
   * @return maxRating
  **/
  @ApiModelProperty(example = "null", required = true, value = "The max rating for the scale used for the Evaluation Component, if different from the overall staff evaluation.")
  public Double getMaxRating() {
    return maxRating;
  }

  public void setMaxRating(Double maxRating) {
    this.maxRating = maxRating;
  }

  public TpdmStaffEvaluationElement minRating(Double minRating) {
    this.minRating = minRating;
    return this;
  }

   /**
   * The minimum rating for the scale used for the Evaluation Component, if different from the overall staff evaluation.
   * @return minRating
  **/
  @ApiModelProperty(example = "null", value = "The minimum rating for the scale used for the Evaluation Component, if different from the overall staff evaluation.")
  public Double getMinRating() {
    return minRating;
  }

  public void setMinRating(Double minRating) {
    this.minRating = minRating;
  }

  public TpdmStaffEvaluationElement rubricReference(String rubricReference) {
    this.rubricReference = rubricReference;
    return this;
  }

   /**
   * The reference to rubric title or identifier.
   * @return rubricReference
  **/
  @ApiModelProperty(example = "null", value = "The reference to rubric title or identifier.")
  public String getRubricReference() {
    return rubricReference;
  }

  public void setRubricReference(String rubricReference) {
    this.rubricReference = rubricReference;
  }

  public TpdmStaffEvaluationElement staffRatingLevels(List<TpdmStaffEvaluationElementStaffRatingLevel> staffRatingLevels) {
    this.staffRatingLevels = staffRatingLevels;
    return this;
  }

  public TpdmStaffEvaluationElement addStaffRatingLevelsItem(TpdmStaffEvaluationElementStaffRatingLevel staffRatingLevelsItem) {
    this.staffRatingLevels.add(staffRatingLevelsItem);
    return this;
  }

   /**
   * An unordered collection of staffEvaluationElementStaffRatingLevels. The descriptive level(s) of ratings (cut scores) for staff evaluation.
   * @return staffRatingLevels
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of staffEvaluationElementStaffRatingLevels. The descriptive level(s) of ratings (cut scores) for staff evaluation.")
  public List<TpdmStaffEvaluationElementStaffRatingLevel> getStaffRatingLevels() {
    return staffRatingLevels;
  }

  public void setStaffRatingLevels(List<TpdmStaffEvaluationElementStaffRatingLevel> staffRatingLevels) {
    this.staffRatingLevels = staffRatingLevels;
  }

  public TpdmStaffEvaluationElement etag(String etag) {
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
    TpdmStaffEvaluationElement tpdmStaffEvaluationElement = (TpdmStaffEvaluationElement) o;
    return Objects.equals(this.id, tpdmStaffEvaluationElement.id) &&
        Objects.equals(this.evaluationElement, tpdmStaffEvaluationElement.evaluationElement) &&
        Objects.equals(this.staffEvaluationComponentReference, tpdmStaffEvaluationElement.staffEvaluationComponentReference) &&
        Objects.equals(this.maxRating, tpdmStaffEvaluationElement.maxRating) &&
        Objects.equals(this.minRating, tpdmStaffEvaluationElement.minRating) &&
        Objects.equals(this.rubricReference, tpdmStaffEvaluationElement.rubricReference) &&
        Objects.equals(this.staffRatingLevels, tpdmStaffEvaluationElement.staffRatingLevels) &&
        Objects.equals(this.etag, tpdmStaffEvaluationElement.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, evaluationElement, staffEvaluationComponentReference, maxRating, minRating, rubricReference, staffRatingLevels, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmStaffEvaluationElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    evaluationElement: ").append(toIndentedString(evaluationElement)).append("\n");
    sb.append("    staffEvaluationComponentReference: ").append(toIndentedString(staffEvaluationComponentReference)).append("\n");
    sb.append("    maxRating: ").append(toIndentedString(maxRating)).append("\n");
    sb.append("    minRating: ").append(toIndentedString(minRating)).append("\n");
    sb.append("    rubricReference: ").append(toIndentedString(rubricReference)).append("\n");
    sb.append("    staffRatingLevels: ").append(toIndentedString(staffRatingLevels)).append("\n");
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

