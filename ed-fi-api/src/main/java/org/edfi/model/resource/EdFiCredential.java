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
import org.edfi.model.resource.CredentialExtensions;
import org.edfi.model.resource.EdFiCredentialAcademicSubject;
import org.edfi.model.resource.EdFiCredentialEndorsement;
import org.edfi.model.resource.EdFiCredentialGradeLevel;
import org.joda.time.LocalDate;


/**
 * EdFiCredential
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class EdFiCredential   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("credentialIdentifier")
  private String credentialIdentifier = null;

  @SerializedName("gradeLevels")
  private List<EdFiCredentialGradeLevel> gradeLevels = new ArrayList<EdFiCredentialGradeLevel>();

  @SerializedName("stateOfIssueStateAbbreviationDescriptor")
  private String stateOfIssueStateAbbreviationDescriptor = null;

  @SerializedName("academicSubjects")
  private List<EdFiCredentialAcademicSubject> academicSubjects = new ArrayList<EdFiCredentialAcademicSubject>();

  @SerializedName("credentialFieldDescriptor")
  private String credentialFieldDescriptor = null;

  @SerializedName("credentialTypeDescriptor")
  private String credentialTypeDescriptor = null;

  @SerializedName("effectiveDate")
  private LocalDate effectiveDate = null;

  @SerializedName("endorsements")
  private List<EdFiCredentialEndorsement> endorsements = new ArrayList<EdFiCredentialEndorsement>();

  @SerializedName("expirationDate")
  private LocalDate expirationDate = null;

  @SerializedName("issuanceDate")
  private LocalDate issuanceDate = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("teachingCredentialBasisDescriptor")
  private String teachingCredentialBasisDescriptor = null;

  @SerializedName("teachingCredentialDescriptor")
  private String teachingCredentialDescriptor = null;

  @SerializedName("_etag")
  private String etag = null;

  @SerializedName("_ext")
  private CredentialExtensions ext = null;

  public EdFiCredential id(String id) {
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

  public EdFiCredential credentialIdentifier(String credentialIdentifier) {
    this.credentialIdentifier = credentialIdentifier;
    return this;
  }

   /**
   * Identifier or serial number assigned to the credential.
   * @return credentialIdentifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "Identifier or serial number assigned to the credential.")
  public String getCredentialIdentifier() {
    return credentialIdentifier;
  }

  public void setCredentialIdentifier(String credentialIdentifier) {
    this.credentialIdentifier = credentialIdentifier;
  }

  public EdFiCredential gradeLevels(List<EdFiCredentialGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
    return this;
  }

  public EdFiCredential addGradeLevelsItem(EdFiCredentialGradeLevel gradeLevelsItem) {
    this.gradeLevels.add(gradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of credentialGradeLevels. The grade level(s) certified for teaching.
   * @return gradeLevels
  **/
  @ApiModelProperty(example = "null", required = true, value = "An unordered collection of credentialGradeLevels. The grade level(s) certified for teaching.")
  public List<EdFiCredentialGradeLevel> getGradeLevels() {
    return gradeLevels;
  }

  public void setGradeLevels(List<EdFiCredentialGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
  }

  public EdFiCredential stateOfIssueStateAbbreviationDescriptor(String stateOfIssueStateAbbreviationDescriptor) {
    this.stateOfIssueStateAbbreviationDescriptor = stateOfIssueStateAbbreviationDescriptor;
    return this;
  }

   /**
   * The abbreviation for the name of the state (within the United States) or extra-state jurisdiction in which a license/credential was issued.
   * @return stateOfIssueStateAbbreviationDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The abbreviation for the name of the state (within the United States) or extra-state jurisdiction in which a license/credential was issued.")
  public String getStateOfIssueStateAbbreviationDescriptor() {
    return stateOfIssueStateAbbreviationDescriptor;
  }

  public void setStateOfIssueStateAbbreviationDescriptor(String stateOfIssueStateAbbreviationDescriptor) {
    this.stateOfIssueStateAbbreviationDescriptor = stateOfIssueStateAbbreviationDescriptor;
  }

  public EdFiCredential academicSubjects(List<EdFiCredentialAcademicSubject> academicSubjects) {
    this.academicSubjects = academicSubjects;
    return this;
  }

  public EdFiCredential addAcademicSubjectsItem(EdFiCredentialAcademicSubject academicSubjectsItem) {
    this.academicSubjects.add(academicSubjectsItem);
    return this;
  }

   /**
   * An unordered collection of credentialAcademicSubjects. The academic subjects to which the credential pertains.
   * @return academicSubjects
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of credentialAcademicSubjects. The academic subjects to which the credential pertains.")
  public List<EdFiCredentialAcademicSubject> getAcademicSubjects() {
    return academicSubjects;
  }

  public void setAcademicSubjects(List<EdFiCredentialAcademicSubject> academicSubjects) {
    this.academicSubjects = academicSubjects;
  }

  public EdFiCredential credentialFieldDescriptor(String credentialFieldDescriptor) {
    this.credentialFieldDescriptor = credentialFieldDescriptor;
    return this;
  }

   /**
   * The field of certification for the certificate (e.g., Mathematics, Music).
   * @return credentialFieldDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The field of certification for the certificate (e.g., Mathematics, Music).")
  public String getCredentialFieldDescriptor() {
    return credentialFieldDescriptor;
  }

  public void setCredentialFieldDescriptor(String credentialFieldDescriptor) {
    this.credentialFieldDescriptor = credentialFieldDescriptor;
  }

  public EdFiCredential credentialTypeDescriptor(String credentialTypeDescriptor) {
    this.credentialTypeDescriptor = credentialTypeDescriptor;
    return this;
  }

   /**
   * An indication of the category of credential an individual holds.
   * @return credentialTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "An indication of the category of credential an individual holds.")
  public String getCredentialTypeDescriptor() {
    return credentialTypeDescriptor;
  }

  public void setCredentialTypeDescriptor(String credentialTypeDescriptor) {
    this.credentialTypeDescriptor = credentialTypeDescriptor;
  }

  public EdFiCredential effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The year, month and day on which an active credential held by an individual was issued.
   * @return effectiveDate
  **/
  @ApiModelProperty(example = "null", value = "The year, month and day on which an active credential held by an individual was issued.")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public EdFiCredential endorsements(List<EdFiCredentialEndorsement> endorsements) {
    this.endorsements = endorsements;
    return this;
  }

  public EdFiCredential addEndorsementsItem(EdFiCredentialEndorsement endorsementsItem) {
    this.endorsements.add(endorsementsItem);
    return this;
  }

   /**
   * An unordered collection of credentialEndorsements. Endorsements are attachments to teaching certificates and indicate areas of specialization.
   * @return endorsements
  **/
  @ApiModelProperty(example = "null", value = "An unordered collection of credentialEndorsements. Endorsements are attachments to teaching certificates and indicate areas of specialization.")
  public List<EdFiCredentialEndorsement> getEndorsements() {
    return endorsements;
  }

  public void setEndorsements(List<EdFiCredentialEndorsement> endorsements) {
    this.endorsements = endorsements;
  }

  public EdFiCredential expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The month, day, and year on which an active credential held by an individual will expire.
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "The month, day, and year on which an active credential held by an individual will expire.")
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public EdFiCredential issuanceDate(LocalDate issuanceDate) {
    this.issuanceDate = issuanceDate;
    return this;
  }

   /**
   * The month, day, and year on which an active credential was issued to an individual.
   * @return issuanceDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The month, day, and year on which an active credential was issued to an individual.")
  public LocalDate getIssuanceDate() {
    return issuanceDate;
  }

  public void setIssuanceDate(LocalDate issuanceDate) {
    this.issuanceDate = issuanceDate;
  }

  public EdFiCredential namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the Credential.
   * @return namespace
  **/
  @ApiModelProperty(example = "null", required = true, value = "Namespace for the Credential.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public EdFiCredential teachingCredentialBasisDescriptor(String teachingCredentialBasisDescriptor) {
    this.teachingCredentialBasisDescriptor = teachingCredentialBasisDescriptor;
    return this;
  }

   /**
   * An indication of the pre-determined criteria for granting the teaching credential that an individual holds.
   * @return teachingCredentialBasisDescriptor
  **/
  @ApiModelProperty(example = "null", value = "An indication of the pre-determined criteria for granting the teaching credential that an individual holds.")
  public String getTeachingCredentialBasisDescriptor() {
    return teachingCredentialBasisDescriptor;
  }

  public void setTeachingCredentialBasisDescriptor(String teachingCredentialBasisDescriptor) {
    this.teachingCredentialBasisDescriptor = teachingCredentialBasisDescriptor;
  }

  public EdFiCredential teachingCredentialDescriptor(String teachingCredentialDescriptor) {
    this.teachingCredentialDescriptor = teachingCredentialDescriptor;
    return this;
  }

   /**
   * An indication of the category of a legal document giving authorization to perform teaching assignment services.
   * @return teachingCredentialDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "An indication of the category of a legal document giving authorization to perform teaching assignment services.")
  public String getTeachingCredentialDescriptor() {
    return teachingCredentialDescriptor;
  }

  public void setTeachingCredentialDescriptor(String teachingCredentialDescriptor) {
    this.teachingCredentialDescriptor = teachingCredentialDescriptor;
  }

  public EdFiCredential etag(String etag) {
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

  public EdFiCredential ext(CredentialExtensions ext) {
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @ApiModelProperty(example = "null", value = "")
  public CredentialExtensions getExt() {
    return ext;
  }

  public void setExt(CredentialExtensions ext) {
    this.ext = ext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiCredential edFiCredential = (EdFiCredential) o;
    return Objects.equals(this.id, edFiCredential.id) &&
        Objects.equals(this.credentialIdentifier, edFiCredential.credentialIdentifier) &&
        Objects.equals(this.gradeLevels, edFiCredential.gradeLevels) &&
        Objects.equals(this.stateOfIssueStateAbbreviationDescriptor, edFiCredential.stateOfIssueStateAbbreviationDescriptor) &&
        Objects.equals(this.academicSubjects, edFiCredential.academicSubjects) &&
        Objects.equals(this.credentialFieldDescriptor, edFiCredential.credentialFieldDescriptor) &&
        Objects.equals(this.credentialTypeDescriptor, edFiCredential.credentialTypeDescriptor) &&
        Objects.equals(this.effectiveDate, edFiCredential.effectiveDate) &&
        Objects.equals(this.endorsements, edFiCredential.endorsements) &&
        Objects.equals(this.expirationDate, edFiCredential.expirationDate) &&
        Objects.equals(this.issuanceDate, edFiCredential.issuanceDate) &&
        Objects.equals(this.namespace, edFiCredential.namespace) &&
        Objects.equals(this.teachingCredentialBasisDescriptor, edFiCredential.teachingCredentialBasisDescriptor) &&
        Objects.equals(this.teachingCredentialDescriptor, edFiCredential.teachingCredentialDescriptor) &&
        Objects.equals(this.etag, edFiCredential.etag) &&
        Objects.equals(this.ext, edFiCredential.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, credentialIdentifier, gradeLevels, stateOfIssueStateAbbreviationDescriptor, academicSubjects, credentialFieldDescriptor, credentialTypeDescriptor, effectiveDate, endorsements, expirationDate, issuanceDate, namespace, teachingCredentialBasisDescriptor, teachingCredentialDescriptor, etag, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCredential {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    credentialIdentifier: ").append(toIndentedString(credentialIdentifier)).append("\n");
    sb.append("    gradeLevels: ").append(toIndentedString(gradeLevels)).append("\n");
    sb.append("    stateOfIssueStateAbbreviationDescriptor: ").append(toIndentedString(stateOfIssueStateAbbreviationDescriptor)).append("\n");
    sb.append("    academicSubjects: ").append(toIndentedString(academicSubjects)).append("\n");
    sb.append("    credentialFieldDescriptor: ").append(toIndentedString(credentialFieldDescriptor)).append("\n");
    sb.append("    credentialTypeDescriptor: ").append(toIndentedString(credentialTypeDescriptor)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    endorsements: ").append(toIndentedString(endorsements)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issuanceDate: ").append(toIndentedString(issuanceDate)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    teachingCredentialBasisDescriptor: ").append(toIndentedString(teachingCredentialBasisDescriptor)).append("\n");
    sb.append("    teachingCredentialDescriptor: ").append(toIndentedString(teachingCredentialDescriptor)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
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

