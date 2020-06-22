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
 * EdFiStudentAcademicRecordAcademicHonor
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentAcademicRecordAcademicHonor   {
  @SerializedName("academicHonorCategoryDescriptor")
  private String academicHonorCategoryDescriptor = null;

  @SerializedName("honorDescription")
  private String honorDescription = null;

  @SerializedName("achievementCategoryDescriptor")
  private String achievementCategoryDescriptor = null;

  @SerializedName("achievementCategorySystem")
  private String achievementCategorySystem = null;

  @SerializedName("achievementTitle")
  private String achievementTitle = null;

  @SerializedName("criteria")
  private String criteria = null;

  @SerializedName("criteriaURL")
  private String criteriaURL = null;

  @SerializedName("evidenceStatement")
  private String evidenceStatement = null;

  @SerializedName("honorAwardDate")
  private LocalDate honorAwardDate = null;

  @SerializedName("honorAwardExpiresDate")
  private LocalDate honorAwardExpiresDate = null;

  @SerializedName("imageURL")
  private String imageURL = null;

  @SerializedName("issuerName")
  private String issuerName = null;

  @SerializedName("issuerOriginURL")
  private String issuerOriginURL = null;

  public EdFiStudentAcademicRecordAcademicHonor academicHonorCategoryDescriptor(String academicHonorCategoryDescriptor) {
    this.academicHonorCategoryDescriptor = academicHonorCategoryDescriptor;
    return this;
  }

   /**
   * A designation of the type of academic distinctions earned by or awarded to the student.
   * @return academicHonorCategoryDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "A designation of the type of academic distinctions earned by or awarded to the student.")
  public String getAcademicHonorCategoryDescriptor() {
    return academicHonorCategoryDescriptor;
  }

  public void setAcademicHonorCategoryDescriptor(String academicHonorCategoryDescriptor) {
    this.academicHonorCategoryDescriptor = academicHonorCategoryDescriptor;
  }

  public EdFiStudentAcademicRecordAcademicHonor honorDescription(String honorDescription) {
    this.honorDescription = honorDescription;
    return this;
  }

   /**
   * A description of the type of academic distinctions earned by or awarded to the individual.
   * @return honorDescription
  **/
  @ApiModelProperty(example = "null", required = true, value = "A description of the type of academic distinctions earned by or awarded to the individual.")
  public String getHonorDescription() {
    return honorDescription;
  }

  public void setHonorDescription(String honorDescription) {
    this.honorDescription = honorDescription;
  }

  public EdFiStudentAcademicRecordAcademicHonor achievementCategoryDescriptor(String achievementCategoryDescriptor) {
    this.achievementCategoryDescriptor = achievementCategoryDescriptor;
    return this;
  }

   /**
   * The category of achievement attributed to the learner.
   * @return achievementCategoryDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The category of achievement attributed to the learner.")
  public String getAchievementCategoryDescriptor() {
    return achievementCategoryDescriptor;
  }

  public void setAchievementCategoryDescriptor(String achievementCategoryDescriptor) {
    this.achievementCategoryDescriptor = achievementCategoryDescriptor;
  }

  public EdFiStudentAcademicRecordAcademicHonor achievementCategorySystem(String achievementCategorySystem) {
    this.achievementCategorySystem = achievementCategorySystem;
    return this;
  }

   /**
   * The system that defines the categories by which an achievement is attributed to the learner.
   * @return achievementCategorySystem
  **/
  @ApiModelProperty(example = "null", value = "The system that defines the categories by which an achievement is attributed to the learner.")
  public String getAchievementCategorySystem() {
    return achievementCategorySystem;
  }

  public void setAchievementCategorySystem(String achievementCategorySystem) {
    this.achievementCategorySystem = achievementCategorySystem;
  }

  public EdFiStudentAcademicRecordAcademicHonor achievementTitle(String achievementTitle) {
    this.achievementTitle = achievementTitle;
    return this;
  }

   /**
   * The title assigned to the achievement.
   * @return achievementTitle
  **/
  @ApiModelProperty(example = "null", value = "The title assigned to the achievement.")
  public String getAchievementTitle() {
    return achievementTitle;
  }

  public void setAchievementTitle(String achievementTitle) {
    this.achievementTitle = achievementTitle;
  }

  public EdFiStudentAcademicRecordAcademicHonor criteria(String criteria) {
    this.criteria = criteria;
    return this;
  }

   /**
   * The criteria for competency-based completion of the achievement/award.
   * @return criteria
  **/
  @ApiModelProperty(example = "null", value = "The criteria for competency-based completion of the achievement/award.")
  public String getCriteria() {
    return criteria;
  }

  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  public EdFiStudentAcademicRecordAcademicHonor criteriaURL(String criteriaURL) {
    this.criteriaURL = criteriaURL;
    return this;
  }

   /**
   * The Uniform Resource Locator (URL) for the unique address of a web page describing the competency-based completion criteria for the achievement/award.
   * @return criteriaURL
  **/
  @ApiModelProperty(example = "null", value = "The Uniform Resource Locator (URL) for the unique address of a web page describing the competency-based completion criteria for the achievement/award.")
  public String getCriteriaURL() {
    return criteriaURL;
  }

  public void setCriteriaURL(String criteriaURL) {
    this.criteriaURL = criteriaURL;
  }

  public EdFiStudentAcademicRecordAcademicHonor evidenceStatement(String evidenceStatement) {
    this.evidenceStatement = evidenceStatement;
    return this;
  }

   /**
   * A statement or reference describing the evidence that the learner met the criteria for attainment of the Achievement.
   * @return evidenceStatement
  **/
  @ApiModelProperty(example = "null", value = "A statement or reference describing the evidence that the learner met the criteria for attainment of the Achievement.")
  public String getEvidenceStatement() {
    return evidenceStatement;
  }

  public void setEvidenceStatement(String evidenceStatement) {
    this.evidenceStatement = evidenceStatement;
  }

  public EdFiStudentAcademicRecordAcademicHonor honorAwardDate(LocalDate honorAwardDate) {
    this.honorAwardDate = honorAwardDate;
    return this;
  }

   /**
   * The date the honor was awarded or earned.
   * @return honorAwardDate
  **/
  @ApiModelProperty(example = "null", value = "The date the honor was awarded or earned.")
  public LocalDate getHonorAwardDate() {
    return honorAwardDate;
  }

  public void setHonorAwardDate(LocalDate honorAwardDate) {
    this.honorAwardDate = honorAwardDate;
  }

  public EdFiStudentAcademicRecordAcademicHonor honorAwardExpiresDate(LocalDate honorAwardExpiresDate) {
    this.honorAwardExpiresDate = honorAwardExpiresDate;
    return this;
  }

   /**
   * Date on which the award expires.
   * @return honorAwardExpiresDate
  **/
  @ApiModelProperty(example = "null", value = "Date on which the award expires.")
  public LocalDate getHonorAwardExpiresDate() {
    return honorAwardExpiresDate;
  }

  public void setHonorAwardExpiresDate(LocalDate honorAwardExpiresDate) {
    this.honorAwardExpiresDate = honorAwardExpiresDate;
  }

  public EdFiStudentAcademicRecordAcademicHonor imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

   /**
   * The Uniform Resource Locator (URL) for the unique address of an image representing an award or badge associated with the Achievement.
   * @return imageURL
  **/
  @ApiModelProperty(example = "null", value = "The Uniform Resource Locator (URL) for the unique address of an image representing an award or badge associated with the Achievement.")
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public EdFiStudentAcademicRecordAcademicHonor issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * The name of the agent, entity, or institution issuing the element.
   * @return issuerName
  **/
  @ApiModelProperty(example = "null", value = "The name of the agent, entity, or institution issuing the element.")
  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }

  public EdFiStudentAcademicRecordAcademicHonor issuerOriginURL(String issuerOriginURL) {
    this.issuerOriginURL = issuerOriginURL;
    return this;
  }

   /**
   * The Uniform Resource Locator (URL) from which the award was issued.
   * @return issuerOriginURL
  **/
  @ApiModelProperty(example = "null", value = "The Uniform Resource Locator (URL) from which the award was issued.")
  public String getIssuerOriginURL() {
    return issuerOriginURL;
  }

  public void setIssuerOriginURL(String issuerOriginURL) {
    this.issuerOriginURL = issuerOriginURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentAcademicRecordAcademicHonor edFiStudentAcademicRecordAcademicHonor = (EdFiStudentAcademicRecordAcademicHonor) o;
    return Objects.equals(this.academicHonorCategoryDescriptor, edFiStudentAcademicRecordAcademicHonor.academicHonorCategoryDescriptor) &&
        Objects.equals(this.honorDescription, edFiStudentAcademicRecordAcademicHonor.honorDescription) &&
        Objects.equals(this.achievementCategoryDescriptor, edFiStudentAcademicRecordAcademicHonor.achievementCategoryDescriptor) &&
        Objects.equals(this.achievementCategorySystem, edFiStudentAcademicRecordAcademicHonor.achievementCategorySystem) &&
        Objects.equals(this.achievementTitle, edFiStudentAcademicRecordAcademicHonor.achievementTitle) &&
        Objects.equals(this.criteria, edFiStudentAcademicRecordAcademicHonor.criteria) &&
        Objects.equals(this.criteriaURL, edFiStudentAcademicRecordAcademicHonor.criteriaURL) &&
        Objects.equals(this.evidenceStatement, edFiStudentAcademicRecordAcademicHonor.evidenceStatement) &&
        Objects.equals(this.honorAwardDate, edFiStudentAcademicRecordAcademicHonor.honorAwardDate) &&
        Objects.equals(this.honorAwardExpiresDate, edFiStudentAcademicRecordAcademicHonor.honorAwardExpiresDate) &&
        Objects.equals(this.imageURL, edFiStudentAcademicRecordAcademicHonor.imageURL) &&
        Objects.equals(this.issuerName, edFiStudentAcademicRecordAcademicHonor.issuerName) &&
        Objects.equals(this.issuerOriginURL, edFiStudentAcademicRecordAcademicHonor.issuerOriginURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicHonorCategoryDescriptor, honorDescription, achievementCategoryDescriptor, achievementCategorySystem, achievementTitle, criteria, criteriaURL, evidenceStatement, honorAwardDate, honorAwardExpiresDate, imageURL, issuerName, issuerOriginURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentAcademicRecordAcademicHonor {\n");
    
    sb.append("    academicHonorCategoryDescriptor: ").append(toIndentedString(academicHonorCategoryDescriptor)).append("\n");
    sb.append("    honorDescription: ").append(toIndentedString(honorDescription)).append("\n");
    sb.append("    achievementCategoryDescriptor: ").append(toIndentedString(achievementCategoryDescriptor)).append("\n");
    sb.append("    achievementCategorySystem: ").append(toIndentedString(achievementCategorySystem)).append("\n");
    sb.append("    achievementTitle: ").append(toIndentedString(achievementTitle)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    criteriaURL: ").append(toIndentedString(criteriaURL)).append("\n");
    sb.append("    evidenceStatement: ").append(toIndentedString(evidenceStatement)).append("\n");
    sb.append("    honorAwardDate: ").append(toIndentedString(honorAwardDate)).append("\n");
    sb.append("    honorAwardExpiresDate: ").append(toIndentedString(honorAwardExpiresDate)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    issuerOriginURL: ").append(toIndentedString(issuerOriginURL)).append("\n");
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

