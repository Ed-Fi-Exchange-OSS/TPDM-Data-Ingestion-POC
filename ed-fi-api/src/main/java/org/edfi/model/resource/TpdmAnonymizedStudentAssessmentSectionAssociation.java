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
import org.edfi.model.resource.EdFiSectionReference;
import org.edfi.model.resource.TpdmAnonymizedStudentAssessmentReference;


/**
 * TpdmAnonymizedStudentAssessmentSectionAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmAnonymizedStudentAssessmentSectionAssociation   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("anonymizedStudentAssessmentReference")
  private TpdmAnonymizedStudentAssessmentReference anonymizedStudentAssessmentReference = null;

  @SerializedName("sectionReference")
  private EdFiSectionReference sectionReference = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmAnonymizedStudentAssessmentSectionAssociation id(String id) {
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

  public TpdmAnonymizedStudentAssessmentSectionAssociation anonymizedStudentAssessmentReference(TpdmAnonymizedStudentAssessmentReference anonymizedStudentAssessmentReference) {
    this.anonymizedStudentAssessmentReference = anonymizedStudentAssessmentReference;
    return this;
  }

   /**
   * Get anonymizedStudentAssessmentReference
   * @return anonymizedStudentAssessmentReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TpdmAnonymizedStudentAssessmentReference getAnonymizedStudentAssessmentReference() {
    return anonymizedStudentAssessmentReference;
  }

  public void setAnonymizedStudentAssessmentReference(TpdmAnonymizedStudentAssessmentReference anonymizedStudentAssessmentReference) {
    this.anonymizedStudentAssessmentReference = anonymizedStudentAssessmentReference;
  }

  public TpdmAnonymizedStudentAssessmentSectionAssociation sectionReference(EdFiSectionReference sectionReference) {
    this.sectionReference = sectionReference;
    return this;
  }

   /**
   * Get sectionReference
   * @return sectionReference
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EdFiSectionReference getSectionReference() {
    return sectionReference;
  }

  public void setSectionReference(EdFiSectionReference sectionReference) {
    this.sectionReference = sectionReference;
  }

  public TpdmAnonymizedStudentAssessmentSectionAssociation etag(String etag) {
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
    TpdmAnonymizedStudentAssessmentSectionAssociation tpdmAnonymizedStudentAssessmentSectionAssociation = (TpdmAnonymizedStudentAssessmentSectionAssociation) o;
    return Objects.equals(this.id, tpdmAnonymizedStudentAssessmentSectionAssociation.id) &&
        Objects.equals(this.anonymizedStudentAssessmentReference, tpdmAnonymizedStudentAssessmentSectionAssociation.anonymizedStudentAssessmentReference) &&
        Objects.equals(this.sectionReference, tpdmAnonymizedStudentAssessmentSectionAssociation.sectionReference) &&
        Objects.equals(this.etag, tpdmAnonymizedStudentAssessmentSectionAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, anonymizedStudentAssessmentReference, sectionReference, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmAnonymizedStudentAssessmentSectionAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    anonymizedStudentAssessmentReference: ").append(toIndentedString(anonymizedStudentAssessmentReference)).append("\n");
    sb.append("    sectionReference: ").append(toIndentedString(sectionReference)).append("\n");
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

