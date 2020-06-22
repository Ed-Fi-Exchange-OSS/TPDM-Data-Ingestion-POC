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
import org.edfi.model.resource.EdFiStudentEducationOrganizationAssociationDisabilityDesignation;


/**
 * EdFiStudentEducationOrganizationAssociationDisability
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiStudentEducationOrganizationAssociationDisability   {
  @SerializedName("disabilityDescriptor")
  private String disabilityDescriptor = null;

  @SerializedName("disabilityDeterminationSourceTypeDescriptor")
  private String disabilityDeterminationSourceTypeDescriptor = null;

  @SerializedName("disabilityDiagnosis")
  private String disabilityDiagnosis = null;

  @SerializedName("orderOfDisability")
  private Integer orderOfDisability = null;

  @SerializedName("designations")
  private List<EdFiStudentEducationOrganizationAssociationDisabilityDesignation> designations = new ArrayList<EdFiStudentEducationOrganizationAssociationDisabilityDesignation>();

  public EdFiStudentEducationOrganizationAssociationDisability disabilityDescriptor(String disabilityDescriptor) {
    this.disabilityDescriptor = disabilityDescriptor;
    return this;
  }

   /**
   * A disability category that describes a child's impairment.
   * @return disabilityDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "A disability category that describes a child's impairment.")
  public String getDisabilityDescriptor() {
    return disabilityDescriptor;
  }

  public void setDisabilityDescriptor(String disabilityDescriptor) {
    this.disabilityDescriptor = disabilityDescriptor;
  }

  public EdFiStudentEducationOrganizationAssociationDisability disabilityDeterminationSourceTypeDescriptor(String disabilityDeterminationSourceTypeDescriptor) {
    this.disabilityDeterminationSourceTypeDescriptor = disabilityDeterminationSourceTypeDescriptor;
    return this;
  }

   /**
   * The source that provided the disability determination.
   * @return disabilityDeterminationSourceTypeDescriptor
  **/
  @ApiModelProperty(example = "null", value = "The source that provided the disability determination.")
  public String getDisabilityDeterminationSourceTypeDescriptor() {
    return disabilityDeterminationSourceTypeDescriptor;
  }

  public void setDisabilityDeterminationSourceTypeDescriptor(String disabilityDeterminationSourceTypeDescriptor) {
    this.disabilityDeterminationSourceTypeDescriptor = disabilityDeterminationSourceTypeDescriptor;
  }

  public EdFiStudentEducationOrganizationAssociationDisability disabilityDiagnosis(String disabilityDiagnosis) {
    this.disabilityDiagnosis = disabilityDiagnosis;
    return this;
  }

   /**
   * A description of the disability diagnosis.
   * @return disabilityDiagnosis
  **/
  @ApiModelProperty(example = "null", value = "A description of the disability diagnosis.")
  public String getDisabilityDiagnosis() {
    return disabilityDiagnosis;
  }

  public void setDisabilityDiagnosis(String disabilityDiagnosis) {
    this.disabilityDiagnosis = disabilityDiagnosis;
  }

  public EdFiStudentEducationOrganizationAssociationDisability orderOfDisability(Integer orderOfDisability) {
    this.orderOfDisability = orderOfDisability;
    return this;
  }

   /**
   * The order by severity of student's disabilities: 1- Primary, 2 -  Secondary, 3 - Tertiary, etc.
   * @return orderOfDisability
  **/
  @ApiModelProperty(example = "null", value = "The order by severity of student's disabilities: 1- Primary, 2 -  Secondary, 3 - Tertiary, etc.")
  public Integer getOrderOfDisability() {
    return orderOfDisability;
  }

  public void setOrderOfDisability(Integer orderOfDisability) {
    this.orderOfDisability = orderOfDisability;
  }

  public EdFiStudentEducationOrganizationAssociationDisability designations(List<EdFiStudentEducationOrganizationAssociationDisabilityDesignation> designations) {
    this.designations = designations;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociationDisability addDesignationsItem(EdFiStudentEducationOrganizationAssociationDisabilityDesignation designationsItem) {
    this.designations.add(designationsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationDisabilityDesignations. Whether the disability is IDEA, Section 504, or other disability designation.
   * @return designations
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of studentEducationOrganizationAssociationDisabilityDesignations. Whether the disability is IDEA, Section 504, or other disability designation.")
  public List<EdFiStudentEducationOrganizationAssociationDisabilityDesignation> getDesignations() {
    return designations;
  }

  public void setDesignations(List<EdFiStudentEducationOrganizationAssociationDisabilityDesignation> designations) {
    this.designations = designations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentEducationOrganizationAssociationDisability edFiStudentEducationOrganizationAssociationDisability = (EdFiStudentEducationOrganizationAssociationDisability) o;
    return Objects.equals(this.disabilityDescriptor, edFiStudentEducationOrganizationAssociationDisability.disabilityDescriptor) &&
        Objects.equals(this.disabilityDeterminationSourceTypeDescriptor, edFiStudentEducationOrganizationAssociationDisability.disabilityDeterminationSourceTypeDescriptor) &&
        Objects.equals(this.disabilityDiagnosis, edFiStudentEducationOrganizationAssociationDisability.disabilityDiagnosis) &&
        Objects.equals(this.orderOfDisability, edFiStudentEducationOrganizationAssociationDisability.orderOfDisability) &&
        Objects.equals(this.designations, edFiStudentEducationOrganizationAssociationDisability.designations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabilityDescriptor, disabilityDeterminationSourceTypeDescriptor, disabilityDiagnosis, orderOfDisability, designations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociationDisability {\n");
    
    sb.append("    disabilityDescriptor: ").append(toIndentedString(disabilityDescriptor)).append("\n");
    sb.append("    disabilityDeterminationSourceTypeDescriptor: ").append(toIndentedString(disabilityDeterminationSourceTypeDescriptor)).append("\n");
    sb.append("    disabilityDiagnosis: ").append(toIndentedString(disabilityDiagnosis)).append("\n");
    sb.append("    orderOfDisability: ").append(toIndentedString(orderOfDisability)).append("\n");
    sb.append("    designations: ").append(toIndentedString(designations)).append("\n");
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

