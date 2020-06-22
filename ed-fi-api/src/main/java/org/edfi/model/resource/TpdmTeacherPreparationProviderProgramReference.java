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
 * TpdmTeacherPreparationProviderProgramReference
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmTeacherPreparationProviderProgramReference   {
  @SerializedName("educationOrganizationId")
  private Integer educationOrganizationId = null;

  @SerializedName("programName")
  private String programName = null;

  @SerializedName("programTypeDescriptor")
  private String programTypeDescriptor = null;

  @SerializedName("link")
  private Link link = null;

  public TpdmTeacherPreparationProviderProgramReference educationOrganizationId(Integer educationOrganizationId) {
    this.educationOrganizationId = educationOrganizationId;
    return this;
  }

   /**
   * The identifier assigned to an education organization.
   * @return educationOrganizationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier assigned to an education organization.")
  public Integer getEducationOrganizationId() {
    return educationOrganizationId;
  }

  public void setEducationOrganizationId(Integer educationOrganizationId) {
    this.educationOrganizationId = educationOrganizationId;
  }

  public TpdmTeacherPreparationProviderProgramReference programName(String programName) {
    this.programName = programName;
    return this;
  }

   /**
   * The name of the Teacher Preparation Program.
   * @return programName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the Teacher Preparation Program.")
  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public TpdmTeacherPreparationProviderProgramReference programTypeDescriptor(String programTypeDescriptor) {
    this.programTypeDescriptor = programTypeDescriptor;
    return this;
  }

   /**
   * The type of program.
   * @return programTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of program.")
  public String getProgramTypeDescriptor() {
    return programTypeDescriptor;
  }

  public void setProgramTypeDescriptor(String programTypeDescriptor) {
    this.programTypeDescriptor = programTypeDescriptor;
  }

  public TpdmTeacherPreparationProviderProgramReference link(Link link) {
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
    TpdmTeacherPreparationProviderProgramReference tpdmTeacherPreparationProviderProgramReference = (TpdmTeacherPreparationProviderProgramReference) o;
    return Objects.equals(this.educationOrganizationId, tpdmTeacherPreparationProviderProgramReference.educationOrganizationId) &&
        Objects.equals(this.programName, tpdmTeacherPreparationProviderProgramReference.programName) &&
        Objects.equals(this.programTypeDescriptor, tpdmTeacherPreparationProviderProgramReference.programTypeDescriptor) &&
        Objects.equals(this.link, tpdmTeacherPreparationProviderProgramReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(educationOrganizationId, programName, programTypeDescriptor, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmTeacherPreparationProviderProgramReference {\n");
    
    sb.append("    educationOrganizationId: ").append(toIndentedString(educationOrganizationId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    programTypeDescriptor: ").append(toIndentedString(programTypeDescriptor)).append("\n");
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

