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
import org.edfi.model.resource.EdFiSchoolYearTypeReference;
import org.edfi.model.resource.TpdmTalentManagementGoalEducationOrganization;


/**
 * TpdmTalentManagementGoal
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmTalentManagementGoal   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("educationOrganizations")
  private List<TpdmTalentManagementGoalEducationOrganization> educationOrganizations = new ArrayList<TpdmTalentManagementGoalEducationOrganization>();

  @SerializedName("goalTitle")
  private String goalTitle = null;

  @SerializedName("schoolYearTypeReference")
  private EdFiSchoolYearTypeReference schoolYearTypeReference = null;

  @SerializedName("goalValue")
  private Double goalValue = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmTalentManagementGoal id(String id) {
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

  public TpdmTalentManagementGoal educationOrganizations(List<TpdmTalentManagementGoalEducationOrganization> educationOrganizations) {
    this.educationOrganizations = educationOrganizations;
    return this;
  }

  public TpdmTalentManagementGoal addEducationOrganizationsItem(TpdmTalentManagementGoalEducationOrganization educationOrganizationsItem) {
    this.educationOrganizations.add(educationOrganizationsItem);
    return this;
  }

   /**
   * An unordered collection of talentManagementGoalEducationOrganizations. The Education Organization(s) associated with the talent management goals.
   * @return educationOrganizations
  **/
  @ApiModelProperty(example = "null", required = true, value = "An unordered collection of talentManagementGoalEducationOrganizations. The Education Organization(s) associated with the talent management goals.")
  public List<TpdmTalentManagementGoalEducationOrganization> getEducationOrganizations() {
    return educationOrganizations;
  }

  public void setEducationOrganizations(List<TpdmTalentManagementGoalEducationOrganization> educationOrganizations) {
    this.educationOrganizations = educationOrganizations;
  }

  public TpdmTalentManagementGoal goalTitle(String goalTitle) {
    this.goalTitle = goalTitle;
    return this;
  }

   /**
   * The title or description of the goal.
   * @return goalTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "The title or description of the goal.")
  public String getGoalTitle() {
    return goalTitle;
  }

  public void setGoalTitle(String goalTitle) {
    this.goalTitle = goalTitle;
  }

  public TpdmTalentManagementGoal schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
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

  public TpdmTalentManagementGoal goalValue(Double goalValue) {
    this.goalValue = goalValue;
    return this;
  }

   /**
   * The target value for the goal.
   * @return goalValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "The target value for the goal.")
  public Double getGoalValue() {
    return goalValue;
  }

  public void setGoalValue(Double goalValue) {
    this.goalValue = goalValue;
  }

  public TpdmTalentManagementGoal etag(String etag) {
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
    TpdmTalentManagementGoal tpdmTalentManagementGoal = (TpdmTalentManagementGoal) o;
    return Objects.equals(this.id, tpdmTalentManagementGoal.id) &&
        Objects.equals(this.educationOrganizations, tpdmTalentManagementGoal.educationOrganizations) &&
        Objects.equals(this.goalTitle, tpdmTalentManagementGoal.goalTitle) &&
        Objects.equals(this.schoolYearTypeReference, tpdmTalentManagementGoal.schoolYearTypeReference) &&
        Objects.equals(this.goalValue, tpdmTalentManagementGoal.goalValue) &&
        Objects.equals(this.etag, tpdmTalentManagementGoal.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, educationOrganizations, goalTitle, schoolYearTypeReference, goalValue, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmTalentManagementGoal {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    educationOrganizations: ").append(toIndentedString(educationOrganizations)).append("\n");
    sb.append("    goalTitle: ").append(toIndentedString(goalTitle)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    goalValue: ").append(toIndentedString(goalValue)).append("\n");
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

