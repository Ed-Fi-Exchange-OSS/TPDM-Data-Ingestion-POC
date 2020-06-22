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
 * EdFiStudentLearningObjectiveReference
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentLearningObjectiveReference   {
  @SerializedName("gradingPeriodDescriptor")
  private String gradingPeriodDescriptor = null;

  @SerializedName("gradingPeriodSchoolId")
  private Integer gradingPeriodSchoolId = null;

  @SerializedName("gradingPeriodSchoolYear")
  private Integer gradingPeriodSchoolYear = null;

  @SerializedName("gradingPeriodSequence")
  private Integer gradingPeriodSequence = null;

  @SerializedName("learningObjectiveId")
  private String learningObjectiveId = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("studentUniqueId")
  private String studentUniqueId = null;

  @SerializedName("link")
  private Link link = null;

  public EdFiStudentLearningObjectiveReference gradingPeriodDescriptor(String gradingPeriodDescriptor) {
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

  public EdFiStudentLearningObjectiveReference gradingPeriodSchoolId(Integer gradingPeriodSchoolId) {
    this.gradingPeriodSchoolId = gradingPeriodSchoolId;
    return this;
  }

   /**
   * The identifier assigned to a school.
   * @return gradingPeriodSchoolId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier assigned to a school.")
  public Integer getGradingPeriodSchoolId() {
    return gradingPeriodSchoolId;
  }

  public void setGradingPeriodSchoolId(Integer gradingPeriodSchoolId) {
    this.gradingPeriodSchoolId = gradingPeriodSchoolId;
  }

  public EdFiStudentLearningObjectiveReference gradingPeriodSchoolYear(Integer gradingPeriodSchoolYear) {
    this.gradingPeriodSchoolYear = gradingPeriodSchoolYear;
    return this;
  }

   /**
   * The identifier for the grading period school year.
   * @return gradingPeriodSchoolYear
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier for the grading period school year.")
  public Integer getGradingPeriodSchoolYear() {
    return gradingPeriodSchoolYear;
  }

  public void setGradingPeriodSchoolYear(Integer gradingPeriodSchoolYear) {
    this.gradingPeriodSchoolYear = gradingPeriodSchoolYear;
  }

  public EdFiStudentLearningObjectiveReference gradingPeriodSequence(Integer gradingPeriodSequence) {
    this.gradingPeriodSequence = gradingPeriodSequence;
    return this;
  }

   /**
   * The sequential order of this period relative to other periods.
   * @return gradingPeriodSequence
  **/
  @ApiModelProperty(example = "null", required = true, value = "The sequential order of this period relative to other periods.")
  public Integer getGradingPeriodSequence() {
    return gradingPeriodSequence;
  }

  public void setGradingPeriodSequence(Integer gradingPeriodSequence) {
    this.gradingPeriodSequence = gradingPeriodSequence;
  }

  public EdFiStudentLearningObjectiveReference learningObjectiveId(String learningObjectiveId) {
    this.learningObjectiveId = learningObjectiveId;
    return this;
  }

   /**
   * The identifier for the specific learning objective in the context of a standard (e.g., 111.15.3.1.A).
   * @return learningObjectiveId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier for the specific learning objective in the context of a standard (e.g., 111.15.3.1.A).")
  public String getLearningObjectiveId() {
    return learningObjectiveId;
  }

  public void setLearningObjectiveId(String learningObjectiveId) {
    this.learningObjectiveId = learningObjectiveId;
  }

  public EdFiStudentLearningObjectiveReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the LearningObjective.
   * @return namespace
  **/
  @ApiModelProperty(example = "null", required = true, value = "Namespace for the LearningObjective.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public EdFiStudentLearningObjectiveReference studentUniqueId(String studentUniqueId) {
    this.studentUniqueId = studentUniqueId;
    return this;
  }

   /**
   * A unique alphanumeric code assigned to a student.
   * @return studentUniqueId
  **/
  @ApiModelProperty(example = "null", required = true, value = "A unique alphanumeric code assigned to a student.")
  public String getStudentUniqueId() {
    return studentUniqueId;
  }

  public void setStudentUniqueId(String studentUniqueId) {
    this.studentUniqueId = studentUniqueId;
  }

  public EdFiStudentLearningObjectiveReference link(Link link) {
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
    EdFiStudentLearningObjectiveReference edFiStudentLearningObjectiveReference = (EdFiStudentLearningObjectiveReference) o;
    return Objects.equals(this.gradingPeriodDescriptor, edFiStudentLearningObjectiveReference.gradingPeriodDescriptor) &&
        Objects.equals(this.gradingPeriodSchoolId, edFiStudentLearningObjectiveReference.gradingPeriodSchoolId) &&
        Objects.equals(this.gradingPeriodSchoolYear, edFiStudentLearningObjectiveReference.gradingPeriodSchoolYear) &&
        Objects.equals(this.gradingPeriodSequence, edFiStudentLearningObjectiveReference.gradingPeriodSequence) &&
        Objects.equals(this.learningObjectiveId, edFiStudentLearningObjectiveReference.learningObjectiveId) &&
        Objects.equals(this.namespace, edFiStudentLearningObjectiveReference.namespace) &&
        Objects.equals(this.studentUniqueId, edFiStudentLearningObjectiveReference.studentUniqueId) &&
        Objects.equals(this.link, edFiStudentLearningObjectiveReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gradingPeriodDescriptor, gradingPeriodSchoolId, gradingPeriodSchoolYear, gradingPeriodSequence, learningObjectiveId, namespace, studentUniqueId, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentLearningObjectiveReference {\n");
    
    sb.append("    gradingPeriodDescriptor: ").append(toIndentedString(gradingPeriodDescriptor)).append("\n");
    sb.append("    gradingPeriodSchoolId: ").append(toIndentedString(gradingPeriodSchoolId)).append("\n");
    sb.append("    gradingPeriodSchoolYear: ").append(toIndentedString(gradingPeriodSchoolYear)).append("\n");
    sb.append("    gradingPeriodSequence: ").append(toIndentedString(gradingPeriodSequence)).append("\n");
    sb.append("    learningObjectiveId: ").append(toIndentedString(learningObjectiveId)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    studentUniqueId: ").append(toIndentedString(studentUniqueId)).append("\n");
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

