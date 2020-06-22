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
 * TpdmRubricLevelInformation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmRubricLevelInformation   {
  @SerializedName("levelTypeDescriptor")
  private String levelTypeDescriptor = null;

  @SerializedName("levelDescription")
  private String levelDescription = null;

  @SerializedName("levelTitle")
  private String levelTitle = null;

  @SerializedName("maximumScore")
  private String maximumScore = null;

  @SerializedName("minimumScore")
  private String minimumScore = null;

  public TpdmRubricLevelInformation levelTypeDescriptor(String levelTypeDescriptor) {
    this.levelTypeDescriptor = levelTypeDescriptor;
    return this;
  }

   /**
   * The level (e.g., 1, 2, 3, etc.) of the rubric at which the data is captured.
   * @return levelTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The level (e.g., 1, 2, 3, etc.) of the rubric at which the data is captured.")
  public String getLevelTypeDescriptor() {
    return levelTypeDescriptor;
  }

  public void setLevelTypeDescriptor(String levelTypeDescriptor) {
    this.levelTypeDescriptor = levelTypeDescriptor;
  }

  public TpdmRubricLevelInformation levelDescription(String levelDescription) {
    this.levelDescription = levelDescription;
    return this;
  }

   /**
   * The description of the level of the rubric at which the data is captured.
   * @return levelDescription
  **/
  @ApiModelProperty(example = "null", value = "The description of the level of the rubric at which the data is captured.")
  public String getLevelDescription() {
    return levelDescription;
  }

  public void setLevelDescription(String levelDescription) {
    this.levelDescription = levelDescription;
  }

  public TpdmRubricLevelInformation levelTitle(String levelTitle) {
    this.levelTitle = levelTitle;
    return this;
  }

   /**
   * The title of the level of the rubric at which the data is captured.
   * @return levelTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "The title of the level of the rubric at which the data is captured.")
  public String getLevelTitle() {
    return levelTitle;
  }

  public void setLevelTitle(String levelTitle) {
    this.levelTitle = levelTitle;
  }

  public TpdmRubricLevelInformation maximumScore(String maximumScore) {
    this.maximumScore = maximumScore;
    return this;
  }

   /**
   * The maximum score for the level of the rubic.
   * @return maximumScore
  **/
  @ApiModelProperty(example = "null", value = "The maximum score for the level of the rubic.")
  public String getMaximumScore() {
    return maximumScore;
  }

  public void setMaximumScore(String maximumScore) {
    this.maximumScore = maximumScore;
  }

  public TpdmRubricLevelInformation minimumScore(String minimumScore) {
    this.minimumScore = minimumScore;
    return this;
  }

   /**
   * The minimum score for the level of the rubic.
   * @return minimumScore
  **/
  @ApiModelProperty(example = "null", value = "The minimum score for the level of the rubic.")
  public String getMinimumScore() {
    return minimumScore;
  }

  public void setMinimumScore(String minimumScore) {
    this.minimumScore = minimumScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmRubricLevelInformation tpdmRubricLevelInformation = (TpdmRubricLevelInformation) o;
    return Objects.equals(this.levelTypeDescriptor, tpdmRubricLevelInformation.levelTypeDescriptor) &&
        Objects.equals(this.levelDescription, tpdmRubricLevelInformation.levelDescription) &&
        Objects.equals(this.levelTitle, tpdmRubricLevelInformation.levelTitle) &&
        Objects.equals(this.maximumScore, tpdmRubricLevelInformation.maximumScore) &&
        Objects.equals(this.minimumScore, tpdmRubricLevelInformation.minimumScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelTypeDescriptor, levelDescription, levelTitle, maximumScore, minimumScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmRubricLevelInformation {\n");
    
    sb.append("    levelTypeDescriptor: ").append(toIndentedString(levelTypeDescriptor)).append("\n");
    sb.append("    levelDescription: ").append(toIndentedString(levelDescription)).append("\n");
    sb.append("    levelTitle: ").append(toIndentedString(levelTitle)).append("\n");
    sb.append("    maximumScore: ").append(toIndentedString(maximumScore)).append("\n");
    sb.append("    minimumScore: ").append(toIndentedString(minimumScore)).append("\n");
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

