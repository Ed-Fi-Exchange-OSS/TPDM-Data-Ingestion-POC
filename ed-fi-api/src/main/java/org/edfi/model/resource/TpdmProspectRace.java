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
 * TpdmProspectRace
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmProspectRace   {
  @SerializedName("raceDescriptor")
  private String raceDescriptor = null;

  public TpdmProspectRace raceDescriptor(String raceDescriptor) {
    this.raceDescriptor = raceDescriptor;
    return this;
  }

   /**
   * The general racial category which most clearly reflects the individual's recognition of his or her community or with which the individual most identifies. The way this data element is listed, it must allow for multiple entries so that each individual can specify all appropriate races.
   * @return raceDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The general racial category which most clearly reflects the individual's recognition of his or her community or with which the individual most identifies. The way this data element is listed, it must allow for multiple entries so that each individual can specify all appropriate races.")
  public String getRaceDescriptor() {
    return raceDescriptor;
  }

  public void setRaceDescriptor(String raceDescriptor) {
    this.raceDescriptor = raceDescriptor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmProspectRace tpdmProspectRace = (TpdmProspectRace) o;
    return Objects.equals(this.raceDescriptor, tpdmProspectRace.raceDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raceDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmProspectRace {\n");
    
    sb.append("    raceDescriptor: ").append(toIndentedString(raceDescriptor)).append("\n");
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

