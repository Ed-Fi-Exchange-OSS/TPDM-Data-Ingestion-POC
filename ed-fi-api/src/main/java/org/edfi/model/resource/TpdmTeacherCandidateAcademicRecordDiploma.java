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
 * TpdmTeacherCandidateAcademicRecordDiploma
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmTeacherCandidateAcademicRecordDiploma   {
  @SerializedName("diplomaTypeDescriptor")
  private String diplomaTypeDescriptor = null;

  @SerializedName("diplomaAwardDate")
  private LocalDate diplomaAwardDate = null;

  @SerializedName("achievementCategoryDescriptor")
  private String achievementCategoryDescriptor = null;

  @SerializedName("diplomaLevelDescriptor")
  private String diplomaLevelDescriptor = null;

  @SerializedName("achievementCategorySystem")
  private String achievementCategorySystem = null;

  @SerializedName("achievementTitle")
  private String achievementTitle = null;

  @SerializedName("criteria")
  private String criteria = null;

  @SerializedName("criteriaURL")
  private String criteriaURL = null;

  @SerializedName("cteCompleter")
  private Boolean cteCompleter = null;

  @SerializedName("diplomaAwardExpiresDate")
  private LocalDate diplomaAwardExpiresDate = null;

  @SerializedName("diplomaDescription")
  private String diplomaDescription = null;

  @SerializedName("evidenceStatement")
  private String evidenceStatement = null;

  @SerializedName("imageURL")
  private String imageURL = null;

  @SerializedName("issuerName")
  private String issuerName = null;

  @SerializedName("issuerOriginURL")
  private String issuerOriginURL = null;

  public TpdmTeacherCandidateAcademicRecordDiploma diplomaTypeDescriptor(String diplomaTypeDescriptor) {
    this.diplomaTypeDescriptor = diplomaTypeDescriptor;
    return this;
  }

   /**
   * The type of diploma/credential that is awarded to a student in recognition of his/her completion of the curricular requirements.
   * @return diplomaTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of diploma/credential that is awarded to a student in recognition of his/her completion of the curricular requirements.")
  public String getDiplomaTypeDescriptor() {
    return diplomaTypeDescriptor;
  }

  public void setDiplomaTypeDescriptor(String diplomaTypeDescriptor) {
    this.diplomaTypeDescriptor = diplomaTypeDescriptor;
  }

  public TpdmTeacherCandidateAcademicRecordDiploma diplomaAwardDate(LocalDate diplomaAwardDate) {
    this.diplomaAwardDate = diplomaAwardDate;
    return this;
  }

   /**
   * The month, day, and year on which the student met  graduation requirements and was awarded a diploma.
   * @return diplomaAwardDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The month, day, and year on which the student met  graduation requirements and was awarded a diploma.")
  public LocalDate getDiplomaAwardDate() {
    return diplomaAwardDate;
  }

  public void setDiplomaAwardDate(LocalDate diplomaAwardDate) {
    this.diplomaAwardDate = diplomaAwardDate;
  }

  public TpdmTeacherCandidateAcademicRecordDiploma achievementCategoryDescriptor(String achievementCategoryDescriptor) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma diplomaLevelDescriptor(String diplomaLevelDescriptor) {
    this.diplomaLevelDescriptor = diplomaLevelDescriptor;
    return this;
  }

   /**
   * The level of diploma/credential that is awarded to a student in recognition of his/her completion of the curricular requirements.          Minimum high school program          Recommended high school program          Distinguished Achievement Program.
   * @return diplomaLevelDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The level of diploma/credential that is awarded to a student in recognition of his/her completion of the curricular requirements.          Minimum high school program          Recommended high school program          Distinguished Achievement Program.")
  public String getDiplomaLevelDescriptor() {
    return diplomaLevelDescriptor;
  }

  public void setDiplomaLevelDescriptor(String diplomaLevelDescriptor) {
    this.diplomaLevelDescriptor = diplomaLevelDescriptor;
  }

  public TpdmTeacherCandidateAcademicRecordDiploma achievementCategorySystem(String achievementCategorySystem) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma achievementTitle(String achievementTitle) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma criteria(String criteria) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma criteriaURL(String criteriaURL) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma cteCompleter(Boolean cteCompleter) {
    this.cteCompleter = cteCompleter;
    return this;
  }

   /**
   * Indicated a student who reached a state-defined threshold of vocational education and who attained a high school diploma or its recognized state equivalent or GED.
   * @return cteCompleter
  **/
  @ApiModelProperty(example = "null", value = "Indicated a student who reached a state-defined threshold of vocational education and who attained a high school diploma or its recognized state equivalent or GED.")
  public Boolean getCteCompleter() {
    return cteCompleter;
  }

  public void setCteCompleter(Boolean cteCompleter) {
    this.cteCompleter = cteCompleter;
  }

  public TpdmTeacherCandidateAcademicRecordDiploma diplomaAwardExpiresDate(LocalDate diplomaAwardExpiresDate) {
    this.diplomaAwardExpiresDate = diplomaAwardExpiresDate;
    return this;
  }

   /**
   * Date on which the award expires.
   * @return diplomaAwardExpiresDate
  **/
  @ApiModelProperty(example = "null", value = "Date on which the award expires.")
  public LocalDate getDiplomaAwardExpiresDate() {
    return diplomaAwardExpiresDate;
  }

  public void setDiplomaAwardExpiresDate(LocalDate diplomaAwardExpiresDate) {
    this.diplomaAwardExpiresDate = diplomaAwardExpiresDate;
  }

  public TpdmTeacherCandidateAcademicRecordDiploma diplomaDescription(String diplomaDescription) {
    this.diplomaDescription = diplomaDescription;
    return this;
  }

   /**
   * The description of diploma given to the student for accomplishments.
   * @return diplomaDescription
  **/
  @ApiModelProperty(example = "null", value = "The description of diploma given to the student for accomplishments.")
  public String getDiplomaDescription() {
    return diplomaDescription;
  }

  public void setDiplomaDescription(String diplomaDescription) {
    this.diplomaDescription = diplomaDescription;
  }

  public TpdmTeacherCandidateAcademicRecordDiploma evidenceStatement(String evidenceStatement) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma imageURL(String imageURL) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma issuerName(String issuerName) {
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

  public TpdmTeacherCandidateAcademicRecordDiploma issuerOriginURL(String issuerOriginURL) {
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
    TpdmTeacherCandidateAcademicRecordDiploma tpdmTeacherCandidateAcademicRecordDiploma = (TpdmTeacherCandidateAcademicRecordDiploma) o;
    return Objects.equals(this.diplomaTypeDescriptor, tpdmTeacherCandidateAcademicRecordDiploma.diplomaTypeDescriptor) &&
        Objects.equals(this.diplomaAwardDate, tpdmTeacherCandidateAcademicRecordDiploma.diplomaAwardDate) &&
        Objects.equals(this.achievementCategoryDescriptor, tpdmTeacherCandidateAcademicRecordDiploma.achievementCategoryDescriptor) &&
        Objects.equals(this.diplomaLevelDescriptor, tpdmTeacherCandidateAcademicRecordDiploma.diplomaLevelDescriptor) &&
        Objects.equals(this.achievementCategorySystem, tpdmTeacherCandidateAcademicRecordDiploma.achievementCategorySystem) &&
        Objects.equals(this.achievementTitle, tpdmTeacherCandidateAcademicRecordDiploma.achievementTitle) &&
        Objects.equals(this.criteria, tpdmTeacherCandidateAcademicRecordDiploma.criteria) &&
        Objects.equals(this.criteriaURL, tpdmTeacherCandidateAcademicRecordDiploma.criteriaURL) &&
        Objects.equals(this.cteCompleter, tpdmTeacherCandidateAcademicRecordDiploma.cteCompleter) &&
        Objects.equals(this.diplomaAwardExpiresDate, tpdmTeacherCandidateAcademicRecordDiploma.diplomaAwardExpiresDate) &&
        Objects.equals(this.diplomaDescription, tpdmTeacherCandidateAcademicRecordDiploma.diplomaDescription) &&
        Objects.equals(this.evidenceStatement, tpdmTeacherCandidateAcademicRecordDiploma.evidenceStatement) &&
        Objects.equals(this.imageURL, tpdmTeacherCandidateAcademicRecordDiploma.imageURL) &&
        Objects.equals(this.issuerName, tpdmTeacherCandidateAcademicRecordDiploma.issuerName) &&
        Objects.equals(this.issuerOriginURL, tpdmTeacherCandidateAcademicRecordDiploma.issuerOriginURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diplomaTypeDescriptor, diplomaAwardDate, achievementCategoryDescriptor, diplomaLevelDescriptor, achievementCategorySystem, achievementTitle, criteria, criteriaURL, cteCompleter, diplomaAwardExpiresDate, diplomaDescription, evidenceStatement, imageURL, issuerName, issuerOriginURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmTeacherCandidateAcademicRecordDiploma {\n");
    
    sb.append("    diplomaTypeDescriptor: ").append(toIndentedString(diplomaTypeDescriptor)).append("\n");
    sb.append("    diplomaAwardDate: ").append(toIndentedString(diplomaAwardDate)).append("\n");
    sb.append("    achievementCategoryDescriptor: ").append(toIndentedString(achievementCategoryDescriptor)).append("\n");
    sb.append("    diplomaLevelDescriptor: ").append(toIndentedString(diplomaLevelDescriptor)).append("\n");
    sb.append("    achievementCategorySystem: ").append(toIndentedString(achievementCategorySystem)).append("\n");
    sb.append("    achievementTitle: ").append(toIndentedString(achievementTitle)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    criteriaURL: ").append(toIndentedString(criteriaURL)).append("\n");
    sb.append("    cteCompleter: ").append(toIndentedString(cteCompleter)).append("\n");
    sb.append("    diplomaAwardExpiresDate: ").append(toIndentedString(diplomaAwardExpiresDate)).append("\n");
    sb.append("    diplomaDescription: ").append(toIndentedString(diplomaDescription)).append("\n");
    sb.append("    evidenceStatement: ").append(toIndentedString(evidenceStatement)).append("\n");
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

