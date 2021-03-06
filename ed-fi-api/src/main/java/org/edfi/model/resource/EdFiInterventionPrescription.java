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
import org.edfi.model.resource.EdFiEducationOrganizationReference;
import org.edfi.model.resource.EdFiInterventionPrescriptionAppropriateGradeLevel;
import org.edfi.model.resource.EdFiInterventionPrescriptionAppropriateSex;
import org.edfi.model.resource.EdFiInterventionPrescriptionDiagnosis;
import org.edfi.model.resource.EdFiInterventionPrescriptionEducationContent;
import org.edfi.model.resource.EdFiInterventionPrescriptionLearningResourceMetadataURI;
import org.edfi.model.resource.EdFiInterventionPrescriptionPopulationServed;
import org.edfi.model.resource.EdFiInterventionPrescriptionURI;


/**
 * EdFiInterventionPrescription
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiInterventionPrescription   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("interventionPrescriptionIdentificationCode")
  private String interventionPrescriptionIdentificationCode = null;

  @SerializedName("educationOrganizationReference")
  private EdFiEducationOrganizationReference educationOrganizationReference = null;

  @SerializedName("appropriateGradeLevels")
  private List<EdFiInterventionPrescriptionAppropriateGradeLevel> appropriateGradeLevels = new ArrayList<EdFiInterventionPrescriptionAppropriateGradeLevel>();

  @SerializedName("appropriateSexes")
  private List<EdFiInterventionPrescriptionAppropriateSex> appropriateSexes = new ArrayList<EdFiInterventionPrescriptionAppropriateSex>();

  @SerializedName("deliveryMethodDescriptor")
  private String deliveryMethodDescriptor = null;

  @SerializedName("diagnoses")
  private List<EdFiInterventionPrescriptionDiagnosis> diagnoses = new ArrayList<EdFiInterventionPrescriptionDiagnosis>();

  @SerializedName("educationContents")
  private List<EdFiInterventionPrescriptionEducationContent> educationContents = new ArrayList<EdFiInterventionPrescriptionEducationContent>();

  @SerializedName("interventionClassDescriptor")
  private String interventionClassDescriptor = null;

  @SerializedName("learningResourceMetadataURIs")
  private List<EdFiInterventionPrescriptionLearningResourceMetadataURI> learningResourceMetadataURIs = new ArrayList<EdFiInterventionPrescriptionLearningResourceMetadataURI>();

  @SerializedName("maxDosage")
  private Integer maxDosage = null;

  @SerializedName("minDosage")
  private Integer minDosage = null;

  @SerializedName("populationServeds")
  private List<EdFiInterventionPrescriptionPopulationServed> populationServeds = new ArrayList<EdFiInterventionPrescriptionPopulationServed>();

  @SerializedName("uris")
  private List<EdFiInterventionPrescriptionURI> uris = new ArrayList<EdFiInterventionPrescriptionURI>();

  @SerializedName("_etag")
  private String etag = null;

  public EdFiInterventionPrescription id(String id) {
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

  public EdFiInterventionPrescription interventionPrescriptionIdentificationCode(String interventionPrescriptionIdentificationCode) {
    this.interventionPrescriptionIdentificationCode = interventionPrescriptionIdentificationCode;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to an intervention prescription.
   * @return interventionPrescriptionIdentificationCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "A unique number or alphanumeric code assigned to an intervention prescription.")
  public String getInterventionPrescriptionIdentificationCode() {
    return interventionPrescriptionIdentificationCode;
  }

  public void setInterventionPrescriptionIdentificationCode(String interventionPrescriptionIdentificationCode) {
    this.interventionPrescriptionIdentificationCode = interventionPrescriptionIdentificationCode;
  }

  public EdFiInterventionPrescription educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }

  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }

  public EdFiInterventionPrescription appropriateGradeLevels(List<EdFiInterventionPrescriptionAppropriateGradeLevel> appropriateGradeLevels) {
    this.appropriateGradeLevels = appropriateGradeLevels;
    return this;
  }

  public EdFiInterventionPrescription addAppropriateGradeLevelsItem(EdFiInterventionPrescriptionAppropriateGradeLevel appropriateGradeLevelsItem) {
    this.appropriateGradeLevels.add(appropriateGradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of interventionPrescriptionAppropriateGradeLevels. Grade levels for the prescribed intervention. If omitted, considered generally applicable.
   * @return appropriateGradeLevels
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of interventionPrescriptionAppropriateGradeLevels. Grade levels for the prescribed intervention. If omitted, considered generally applicable.")
  public List<EdFiInterventionPrescriptionAppropriateGradeLevel> getAppropriateGradeLevels() {
    return appropriateGradeLevels;
  }

  public void setAppropriateGradeLevels(List<EdFiInterventionPrescriptionAppropriateGradeLevel> appropriateGradeLevels) {
    this.appropriateGradeLevels = appropriateGradeLevels;
  }

  public EdFiInterventionPrescription appropriateSexes(List<EdFiInterventionPrescriptionAppropriateSex> appropriateSexes) {
    this.appropriateSexes = appropriateSexes;
    return this;
  }

  public EdFiInterventionPrescription addAppropriateSexesItem(EdFiInterventionPrescriptionAppropriateSex appropriateSexesItem) {
    this.appropriateSexes.add(appropriateSexesItem);
    return this;
  }

   /**
   * An unordered collection of interventionPrescriptionAppropriateSexes. Sexes for the InterventionPrescription. If omitted, considered generally applicable.
   * @return appropriateSexes
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of interventionPrescriptionAppropriateSexes. Sexes for the InterventionPrescription. If omitted, considered generally applicable.")
  public List<EdFiInterventionPrescriptionAppropriateSex> getAppropriateSexes() {
    return appropriateSexes;
  }

  public void setAppropriateSexes(List<EdFiInterventionPrescriptionAppropriateSex> appropriateSexes) {
    this.appropriateSexes = appropriateSexes;
  }

  public EdFiInterventionPrescription deliveryMethodDescriptor(String deliveryMethodDescriptor) {
    this.deliveryMethodDescriptor = deliveryMethodDescriptor;
    return this;
  }

   /**
   * The way in which an intervention was implemented: individual, small group, whole class, or whole school.
   * @return deliveryMethodDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The way in which an intervention was implemented: individual, small group, whole class, or whole school.")
  public String getDeliveryMethodDescriptor() {
    return deliveryMethodDescriptor;
  }

  public void setDeliveryMethodDescriptor(String deliveryMethodDescriptor) {
    this.deliveryMethodDescriptor = deliveryMethodDescriptor;
  }

  public EdFiInterventionPrescription diagnoses(List<EdFiInterventionPrescriptionDiagnosis> diagnoses) {
    this.diagnoses = diagnoses;
    return this;
  }

  public EdFiInterventionPrescription addDiagnosesItem(EdFiInterventionPrescriptionDiagnosis diagnosesItem) {
    this.diagnoses.add(diagnosesItem);
    return this;
  }

   /**
   * An unordered collection of interventionPrescriptionDiagnoses. Targeted purpose of the InterventionPrescription (e.g., attendance issue, dropout risk).
   * @return diagnoses
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of interventionPrescriptionDiagnoses. Targeted purpose of the InterventionPrescription (e.g., attendance issue, dropout risk).")
  public List<EdFiInterventionPrescriptionDiagnosis> getDiagnoses() {
    return diagnoses;
  }

  public void setDiagnoses(List<EdFiInterventionPrescriptionDiagnosis> diagnoses) {
    this.diagnoses = diagnoses;
  }

  public EdFiInterventionPrescription educationContents(List<EdFiInterventionPrescriptionEducationContent> educationContents) {
    this.educationContents = educationContents;
    return this;
  }

  public EdFiInterventionPrescription addEducationContentsItem(EdFiInterventionPrescriptionEducationContent educationContentsItem) {
    this.educationContents.add(educationContentsItem);
    return this;
  }

   /**
   * An unordered collection of interventionPrescriptionEducationContents. Relates the education content source to the education content.
   * @return educationContents
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of interventionPrescriptionEducationContents. Relates the education content source to the education content.")
  public List<EdFiInterventionPrescriptionEducationContent> getEducationContents() {
    return educationContents;
  }

  public void setEducationContents(List<EdFiInterventionPrescriptionEducationContent> educationContents) {
    this.educationContents = educationContents;
  }

  public EdFiInterventionPrescription interventionClassDescriptor(String interventionClassDescriptor) {
    this.interventionClassDescriptor = interventionClassDescriptor;
    return this;
  }

   /**
   * The way in which an intervention is used: curriculum, supplement, or practice.
   * @return interventionClassDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The way in which an intervention is used: curriculum, supplement, or practice.")
  public String getInterventionClassDescriptor() {
    return interventionClassDescriptor;
  }

  public void setInterventionClassDescriptor(String interventionClassDescriptor) {
    this.interventionClassDescriptor = interventionClassDescriptor;
  }

  public EdFiInterventionPrescription learningResourceMetadataURIs(List<EdFiInterventionPrescriptionLearningResourceMetadataURI> learningResourceMetadataURIs) {
    this.learningResourceMetadataURIs = learningResourceMetadataURIs;
    return this;
  }

  public EdFiInterventionPrescription addLearningResourceMetadataURIsItem(EdFiInterventionPrescriptionLearningResourceMetadataURI learningResourceMetadataURIsItem) {
    this.learningResourceMetadataURIs.add(learningResourceMetadataURIsItem);
    return this;
  }

   /**
   * An unordered collection of interventionPrescriptionLearningResourceMetadataURIs. The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.
   * @return learningResourceMetadataURIs
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of interventionPrescriptionLearningResourceMetadataURIs. The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.")
  public List<EdFiInterventionPrescriptionLearningResourceMetadataURI> getLearningResourceMetadataURIs() {
    return learningResourceMetadataURIs;
  }

  public void setLearningResourceMetadataURIs(List<EdFiInterventionPrescriptionLearningResourceMetadataURI> learningResourceMetadataURIs) {
    this.learningResourceMetadataURIs = learningResourceMetadataURIs;
  }

  public EdFiInterventionPrescription maxDosage(Integer maxDosage) {
    this.maxDosage = maxDosage;
    return this;
  }

   /**
   * The maximum duration of time in minutes that is recommended for the intervention.
   * @return maxDosage
  **/
  @ApiModelProperty(example = "null", value = "The maximum duration of time in minutes that is recommended for the intervention.")
  public Integer getMaxDosage() {
    return maxDosage;
  }

  public void setMaxDosage(Integer maxDosage) {
    this.maxDosage = maxDosage;
  }

  public EdFiInterventionPrescription minDosage(Integer minDosage) {
    this.minDosage = minDosage;
    return this;
  }

   /**
   * The minimum duration of time in minutes that is recommended for the intervention.
   * @return minDosage
  **/
  @ApiModelProperty(example = "null", value = "The minimum duration of time in minutes that is recommended for the intervention.")
  public Integer getMinDosage() {
    return minDosage;
  }

  public void setMinDosage(Integer minDosage) {
    this.minDosage = minDosage;
  }

  public EdFiInterventionPrescription populationServeds(List<EdFiInterventionPrescriptionPopulationServed> populationServeds) {
    this.populationServeds = populationServeds;
    return this;
  }

  public EdFiInterventionPrescription addPopulationServedsItem(EdFiInterventionPrescriptionPopulationServed populationServedsItem) {
    this.populationServeds.add(populationServedsItem);
    return this;
  }

   /**
   * An unordered collection of interventionPrescriptionPopulationServeds. A subset of students that are the focus of the InterventionPrescription.
   * @return populationServeds
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of interventionPrescriptionPopulationServeds. A subset of students that are the focus of the InterventionPrescription.")
  public List<EdFiInterventionPrescriptionPopulationServed> getPopulationServeds() {
    return populationServeds;
  }

  public void setPopulationServeds(List<EdFiInterventionPrescriptionPopulationServed> populationServeds) {
    this.populationServeds = populationServeds;
  }

  public EdFiInterventionPrescription uris(List<EdFiInterventionPrescriptionURI> uris) {
    this.uris = uris;
    return this;
  }

  public EdFiInterventionPrescription addUrisItem(EdFiInterventionPrescriptionURI urisItem) {
    this.uris.add(urisItem);
    return this;
  }

   /**
   * An unordered collection of interventionPrescriptionURIs. The URI (typical a URL) pointing to an education content item.
   * @return uris
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of interventionPrescriptionURIs. The URI (typical a URL) pointing to an education content item.")
  public List<EdFiInterventionPrescriptionURI> getUris() {
    return uris;
  }

  public void setUris(List<EdFiInterventionPrescriptionURI> uris) {
    this.uris = uris;
  }

  public EdFiInterventionPrescription etag(String etag) {
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
    EdFiInterventionPrescription edFiInterventionPrescription = (EdFiInterventionPrescription) o;
    return Objects.equals(this.id, edFiInterventionPrescription.id) &&
        Objects.equals(this.interventionPrescriptionIdentificationCode, edFiInterventionPrescription.interventionPrescriptionIdentificationCode) &&
        Objects.equals(this.educationOrganizationReference, edFiInterventionPrescription.educationOrganizationReference) &&
        Objects.equals(this.appropriateGradeLevels, edFiInterventionPrescription.appropriateGradeLevels) &&
        Objects.equals(this.appropriateSexes, edFiInterventionPrescription.appropriateSexes) &&
        Objects.equals(this.deliveryMethodDescriptor, edFiInterventionPrescription.deliveryMethodDescriptor) &&
        Objects.equals(this.diagnoses, edFiInterventionPrescription.diagnoses) &&
        Objects.equals(this.educationContents, edFiInterventionPrescription.educationContents) &&
        Objects.equals(this.interventionClassDescriptor, edFiInterventionPrescription.interventionClassDescriptor) &&
        Objects.equals(this.learningResourceMetadataURIs, edFiInterventionPrescription.learningResourceMetadataURIs) &&
        Objects.equals(this.maxDosage, edFiInterventionPrescription.maxDosage) &&
        Objects.equals(this.minDosage, edFiInterventionPrescription.minDosage) &&
        Objects.equals(this.populationServeds, edFiInterventionPrescription.populationServeds) &&
        Objects.equals(this.uris, edFiInterventionPrescription.uris) &&
        Objects.equals(this.etag, edFiInterventionPrescription.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, interventionPrescriptionIdentificationCode, educationOrganizationReference, appropriateGradeLevels, appropriateSexes, deliveryMethodDescriptor, diagnoses, educationContents, interventionClassDescriptor, learningResourceMetadataURIs, maxDosage, minDosage, populationServeds, uris, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiInterventionPrescription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interventionPrescriptionIdentificationCode: ").append(toIndentedString(interventionPrescriptionIdentificationCode)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    appropriateGradeLevels: ").append(toIndentedString(appropriateGradeLevels)).append("\n");
    sb.append("    appropriateSexes: ").append(toIndentedString(appropriateSexes)).append("\n");
    sb.append("    deliveryMethodDescriptor: ").append(toIndentedString(deliveryMethodDescriptor)).append("\n");
    sb.append("    diagnoses: ").append(toIndentedString(diagnoses)).append("\n");
    sb.append("    educationContents: ").append(toIndentedString(educationContents)).append("\n");
    sb.append("    interventionClassDescriptor: ").append(toIndentedString(interventionClassDescriptor)).append("\n");
    sb.append("    learningResourceMetadataURIs: ").append(toIndentedString(learningResourceMetadataURIs)).append("\n");
    sb.append("    maxDosage: ").append(toIndentedString(maxDosage)).append("\n");
    sb.append("    minDosage: ").append(toIndentedString(minDosage)).append("\n");
    sb.append("    populationServeds: ").append(toIndentedString(populationServeds)).append("\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
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

