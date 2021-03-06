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
import org.edfi.model.resource.EdFiSchoolReference;
import org.edfi.model.resource.EdFiSchoolYearTypeReference;
import org.joda.time.LocalDate;


/**
 * EdFiGradingPeriod
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiGradingPeriod   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("gradingPeriodDescriptor")
  private String gradingPeriodDescriptor = null;

  @SerializedName("periodSequence")
  private Integer periodSequence = null;

  @SerializedName("schoolReference")
  private EdFiSchoolReference schoolReference = null;

  @SerializedName("schoolYearTypeReference")
  private EdFiSchoolYearTypeReference schoolYearTypeReference = null;

  @SerializedName("beginDate")
  private LocalDate beginDate = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("totalInstructionalDays")
  private Integer totalInstructionalDays = null;

  @SerializedName("_etag")
  private String etag = null;

  public EdFiGradingPeriod id(String id) {
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

  public EdFiGradingPeriod gradingPeriodDescriptor(String gradingPeriodDescriptor) {
    this.gradingPeriodDescriptor = gradingPeriodDescriptor;
    return this;
  }

   /**
   * The name of the period for which grades are reported.
   * @return gradingPeriodDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the period for which grades are reported.")
  public String getGradingPeriodDescriptor() {
    return gradingPeriodDescriptor;
  }

  public void setGradingPeriodDescriptor(String gradingPeriodDescriptor) {
    this.gradingPeriodDescriptor = gradingPeriodDescriptor;
  }

  public EdFiGradingPeriod periodSequence(Integer periodSequence) {
    this.periodSequence = periodSequence;
    return this;
  }

   /**
   * The sequential order of this period relative to other periods.
   * @return periodSequence
  **/
  @ApiModelProperty(example = "null", required = true, value = "The sequential order of this period relative to other periods.")
  public Integer getPeriodSequence() {
    return periodSequence;
  }

  public void setPeriodSequence(Integer periodSequence) {
    this.periodSequence = periodSequence;
  }

  public EdFiGradingPeriod schoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
    return this;
  }

   /**
   * Get schoolReference
   * @return schoolReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiSchoolReference getSchoolReference() {
    return schoolReference;
  }

  public void setSchoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
  }

  public EdFiGradingPeriod schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
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

  public EdFiGradingPeriod beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Month, day, and year of the first day of the GradingPeriod.
   * @return beginDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Month, day, and year of the first day of the GradingPeriod.")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public EdFiGradingPeriod endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Month, day, and year of the last day of the GradingPeriod.
   * @return endDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Month, day, and year of the last day of the GradingPeriod.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public EdFiGradingPeriod totalInstructionalDays(Integer totalInstructionalDays) {
    this.totalInstructionalDays = totalInstructionalDays;
    return this;
  }

   /**
   * Total days available for educational instruction during the GradingPeriod.
   * @return totalInstructionalDays
  **/
  @ApiModelProperty(example = "null", required = true, value = "Total days available for educational instruction during the GradingPeriod.")
  public Integer getTotalInstructionalDays() {
    return totalInstructionalDays;
  }

  public void setTotalInstructionalDays(Integer totalInstructionalDays) {
    this.totalInstructionalDays = totalInstructionalDays;
  }

  public EdFiGradingPeriod etag(String etag) {
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
    EdFiGradingPeriod edFiGradingPeriod = (EdFiGradingPeriod) o;
    return Objects.equals(this.id, edFiGradingPeriod.id) &&
        Objects.equals(this.gradingPeriodDescriptor, edFiGradingPeriod.gradingPeriodDescriptor) &&
        Objects.equals(this.periodSequence, edFiGradingPeriod.periodSequence) &&
        Objects.equals(this.schoolReference, edFiGradingPeriod.schoolReference) &&
        Objects.equals(this.schoolYearTypeReference, edFiGradingPeriod.schoolYearTypeReference) &&
        Objects.equals(this.beginDate, edFiGradingPeriod.beginDate) &&
        Objects.equals(this.endDate, edFiGradingPeriod.endDate) &&
        Objects.equals(this.totalInstructionalDays, edFiGradingPeriod.totalInstructionalDays) &&
        Objects.equals(this.etag, edFiGradingPeriod.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gradingPeriodDescriptor, periodSequence, schoolReference, schoolYearTypeReference, beginDate, endDate, totalInstructionalDays, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiGradingPeriod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gradingPeriodDescriptor: ").append(toIndentedString(gradingPeriodDescriptor)).append("\n");
    sb.append("    periodSequence: ").append(toIndentedString(periodSequence)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    totalInstructionalDays: ").append(toIndentedString(totalInstructionalDays)).append("\n");
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

