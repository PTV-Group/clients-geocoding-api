/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.geocoding.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.geocoding.model.Area;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PlacesByAreaRequest
 */
@JsonPropertyOrder({
  PlacesByAreaRequest.JSON_PROPERTY_AREA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:16:12.211880Z[Etc/UTC]")
public class PlacesByAreaRequest {
  public static final String JSON_PROPERTY_AREA = "area";
  private Area area;

  public PlacesByAreaRequest() { 
  }

  public PlacesByAreaRequest area(Area area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Area getArea() {
    return area;
  }


  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArea(Area area) {
    this.area = area;
  }


  /**
   * Return true if this PlacesByAreaRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacesByAreaRequest placesByAreaRequest = (PlacesByAreaRequest) o;
    return Objects.equals(this.area, placesByAreaRequest.area);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacesByAreaRequest {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

