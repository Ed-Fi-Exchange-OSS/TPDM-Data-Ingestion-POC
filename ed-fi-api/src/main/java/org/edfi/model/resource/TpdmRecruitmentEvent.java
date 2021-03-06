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
import org.joda.time.LocalDate;


/**
 * TpdmRecruitmentEvent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-09T12:36:29.493-07:00")
public class TpdmRecruitmentEvent   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("eventDate")
  private LocalDate eventDate = null;

  @SerializedName("eventTitle")
  private String eventTitle = null;

  @SerializedName("eventDescription")
  private String eventDescription = null;

  @SerializedName("eventLocation")
  private String eventLocation = null;

  @SerializedName("recruitmentEventTypeDescriptor")
  private String recruitmentEventTypeDescriptor = null;

  @SerializedName("_etag")
  private String etag = null;

  public TpdmRecruitmentEvent id(String id) {
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

  public TpdmRecruitmentEvent eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The date of the event.
   * @return eventDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The date of the event.")
  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public TpdmRecruitmentEvent eventTitle(String eventTitle) {
    this.eventTitle = eventTitle;
    return this;
  }

   /**
   * The title of the event.
   * @return eventTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "The title of the event.")
  public String getEventTitle() {
    return eventTitle;
  }

  public void setEventTitle(String eventTitle) {
    this.eventTitle = eventTitle;
  }

  public TpdmRecruitmentEvent eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

   /**
   * The long description of the event.
   * @return eventDescription
  **/
  @ApiModelProperty(example = "null", value = "The long description of the event.")
  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public TpdmRecruitmentEvent eventLocation(String eventLocation) {
    this.eventLocation = eventLocation;
    return this;
  }

   /**
   * The location of the event.
   * @return eventLocation
  **/
  @ApiModelProperty(example = "null", value = "The location of the event.")
  public String getEventLocation() {
    return eventLocation;
  }

  public void setEventLocation(String eventLocation) {
    this.eventLocation = eventLocation;
  }

  public TpdmRecruitmentEvent recruitmentEventTypeDescriptor(String recruitmentEventTypeDescriptor) {
    this.recruitmentEventTypeDescriptor = recruitmentEventTypeDescriptor;
    return this;
  }

   /**
   * The type of event.
   * @return recruitmentEventTypeDescriptor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of event.")
  public String getRecruitmentEventTypeDescriptor() {
    return recruitmentEventTypeDescriptor;
  }

  public void setRecruitmentEventTypeDescriptor(String recruitmentEventTypeDescriptor) {
    this.recruitmentEventTypeDescriptor = recruitmentEventTypeDescriptor;
  }

  public TpdmRecruitmentEvent etag(String etag) {
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
    TpdmRecruitmentEvent tpdmRecruitmentEvent = (TpdmRecruitmentEvent) o;
    return Objects.equals(this.id, tpdmRecruitmentEvent.id) &&
        Objects.equals(this.eventDate, tpdmRecruitmentEvent.eventDate) &&
        Objects.equals(this.eventTitle, tpdmRecruitmentEvent.eventTitle) &&
        Objects.equals(this.eventDescription, tpdmRecruitmentEvent.eventDescription) &&
        Objects.equals(this.eventLocation, tpdmRecruitmentEvent.eventLocation) &&
        Objects.equals(this.recruitmentEventTypeDescriptor, tpdmRecruitmentEvent.recruitmentEventTypeDescriptor) &&
        Objects.equals(this.etag, tpdmRecruitmentEvent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventDate, eventTitle, eventDescription, eventLocation, recruitmentEventTypeDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmRecruitmentEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventTitle: ").append(toIndentedString(eventTitle)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    eventLocation: ").append(toIndentedString(eventLocation)).append("\n");
    sb.append("    recruitmentEventTypeDescriptor: ").append(toIndentedString(recruitmentEventTypeDescriptor)).append("\n");
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

