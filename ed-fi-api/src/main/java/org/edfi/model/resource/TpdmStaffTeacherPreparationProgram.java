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


/**
 * TpdmStaffTeacherPreparationProgram
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmStaffTeacherPreparationProgram   {
  @SerializedName("teacherPreparationProgramName")
  private String teacherPreparationProgramName = null;

  @SerializedName("levelOfDegreeAwardedDescriptor")
  private String levelOfDegreeAwardedDescriptor = null;

  @SerializedName("teacherPreparationProgramTypeDescriptor")
  private String teacherPreparationProgramTypeDescriptor = null;

  @SerializedName("gpa")
  private Double gpa = null;

  @SerializedName("majorSpecialization")
  private String majorSpecialization = null;

  @SerializedName("nameOfInstitution")
  private String nameOfInstitution = null;

  @SerializedName("teacherPreparationProgramIdentifier")
  private String teacherPreparationProgramIdentifier = null;

  public TpdmStaffTeacherPreparationProgram teacherPreparationProgramName(String teacherPreparationProgramName) {
    this.teacherPreparationProgramName = teacherPreparationProgramName;
    return this;
  }

   /**
   * The name of the Teacher Preparation Program.
   * @return teacherPreparationProgramName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the Teacher Preparation Program.")
  public String getTeacherPreparationProgramName() {
    return teacherPreparationProgramName;
  }

  public void setTeacherPreparationProgramName(String teacherPreparationProgramName) {
    this.teacherPreparationProgramName = teacherPreparationProgramName;
  }

  public TpdmStaffTeacherPreparationProgram levelOfDegreeAwardedDescriptor(String levelOfDegreeAwardedDescriptor) {
    this.levelOfDegreeAwardedDescriptor = levelOfDegreeAwardedDescriptor;
    return this;
  }

   /**
   * The level of degree awarded by the teacher preparation program to the person (e.g., Certificate Only, Bachelor's, Master's, etc.).
   * @return levelOfDegreeAwardedDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The level of degree awarded by the teacher preparation program to the person (e.g., Certificate Only, Bachelor's, Master's, etc.).")
  public String getLevelOfDegreeAwardedDescriptor() {
    return levelOfDegreeAwardedDescriptor;
  }

  public void setLevelOfDegreeAwardedDescriptor(String levelOfDegreeAwardedDescriptor) {
    this.levelOfDegreeAwardedDescriptor = levelOfDegreeAwardedDescriptor;
  }

  public TpdmStaffTeacherPreparationProgram teacherPreparationProgramTypeDescriptor(String teacherPreparationProgramTypeDescriptor) {
    this.teacherPreparationProgramTypeDescriptor = teacherPreparationProgramTypeDescriptor;
    return this;
  }

   /**
   * The type of teacher prep program (e.g., college, alternative, TFA, etc.).
   * @return teacherPreparationProgramTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of teacher prep program (e.g., college, alternative, TFA, etc.).")
  public String getTeacherPreparationProgramTypeDescriptor() {
    return teacherPreparationProgramTypeDescriptor;
  }

  public void setTeacherPreparationProgramTypeDescriptor(String teacherPreparationProgramTypeDescriptor) {
    this.teacherPreparationProgramTypeDescriptor = teacherPreparationProgramTypeDescriptor;
  }

  public TpdmStaffTeacherPreparationProgram gpa(Double gpa) {
    this.gpa = gpa;
    return this;
  }

   /**
   * The final GPA the teacher achieved in the program.
   * @return gpa
  **/
  @ApiModelProperty(example = "null", value = "The final GPA the teacher achieved in the program.")
  public Double getGpa() {
    return gpa;
  }

  public void setGpa(Double gpa) {
    this.gpa = gpa;
  }

  public TpdmStaffTeacherPreparationProgram majorSpecialization(String majorSpecialization) {
    this.majorSpecialization = majorSpecialization;
    return this;
  }

   /**
   * The major area for a degree or area of specialization for a certificate.
   * @return majorSpecialization
  **/
  @ApiModelProperty(example = "null", required = true, value = "The major area for a degree or area of specialization for a certificate.")
  public String getMajorSpecialization() {
    return majorSpecialization;
  }

  public void setMajorSpecialization(String majorSpecialization) {
    this.majorSpecialization = majorSpecialization;
  }

  public TpdmStaffTeacherPreparationProgram nameOfInstitution(String nameOfInstitution) {
    this.nameOfInstitution = nameOfInstitution;
    return this;
  }

   /**
   * The name of the organization providing the teacher preparation program.
   * @return nameOfInstitution
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the organization providing the teacher preparation program.")
  public String getNameOfInstitution() {
    return nameOfInstitution;
  }

  public void setNameOfInstitution(String nameOfInstitution) {
    this.nameOfInstitution = nameOfInstitution;
  }

  public TpdmStaffTeacherPreparationProgram teacherPreparationProgramIdentifier(String teacherPreparationProgramIdentifier) {
    this.teacherPreparationProgramIdentifier = teacherPreparationProgramIdentifier;
    return this;
  }

   /**
   * An identifier assigned to the teacher preparation program.
   * @return teacherPreparationProgramIdentifier
  **/
  @ApiModelProperty(example = "null", value = "An identifier assigned to the teacher preparation program.")
  public String getTeacherPreparationProgramIdentifier() {
    return teacherPreparationProgramIdentifier;
  }

  public void setTeacherPreparationProgramIdentifier(String teacherPreparationProgramIdentifier) {
    this.teacherPreparationProgramIdentifier = teacherPreparationProgramIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmStaffTeacherPreparationProgram tpdmStaffTeacherPreparationProgram = (TpdmStaffTeacherPreparationProgram) o;
    return Objects.equals(this.teacherPreparationProgramName, tpdmStaffTeacherPreparationProgram.teacherPreparationProgramName) &&
        Objects.equals(this.levelOfDegreeAwardedDescriptor, tpdmStaffTeacherPreparationProgram.levelOfDegreeAwardedDescriptor) &&
        Objects.equals(this.teacherPreparationProgramTypeDescriptor, tpdmStaffTeacherPreparationProgram.teacherPreparationProgramTypeDescriptor) &&
        Objects.equals(this.gpa, tpdmStaffTeacherPreparationProgram.gpa) &&
        Objects.equals(this.majorSpecialization, tpdmStaffTeacherPreparationProgram.majorSpecialization) &&
        Objects.equals(this.nameOfInstitution, tpdmStaffTeacherPreparationProgram.nameOfInstitution) &&
        Objects.equals(this.teacherPreparationProgramIdentifier, tpdmStaffTeacherPreparationProgram.teacherPreparationProgramIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teacherPreparationProgramName, levelOfDegreeAwardedDescriptor, teacherPreparationProgramTypeDescriptor, gpa, majorSpecialization, nameOfInstitution, teacherPreparationProgramIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmStaffTeacherPreparationProgram {\n");
    
    sb.append("    teacherPreparationProgramName: ").append(toIndentedString(teacherPreparationProgramName)).append("\n");
    sb.append("    levelOfDegreeAwardedDescriptor: ").append(toIndentedString(levelOfDegreeAwardedDescriptor)).append("\n");
    sb.append("    teacherPreparationProgramTypeDescriptor: ").append(toIndentedString(teacherPreparationProgramTypeDescriptor)).append("\n");
    sb.append("    gpa: ").append(toIndentedString(gpa)).append("\n");
    sb.append("    majorSpecialization: ").append(toIndentedString(majorSpecialization)).append("\n");
    sb.append("    nameOfInstitution: ").append(toIndentedString(nameOfInstitution)).append("\n");
    sb.append("    teacherPreparationProgramIdentifier: ").append(toIndentedString(teacherPreparationProgramIdentifier)).append("\n");
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

