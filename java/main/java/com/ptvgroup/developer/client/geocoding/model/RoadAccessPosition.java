/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.6
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A position on or very close to a road that marks the entry to the object. Available only for objects which represent buildings with a complete address and only if present in the data.    The road from which the object can be accessed is not necessarily the road which is closest to the object.
 */
@ApiModel(description = "A position on or very close to a road that marks the entry to the object. Available only for objects which represent buildings with a complete address and only if present in the data.    The road from which the object can be accessed is not necessarily the road which is closest to the object.")
@JsonPropertyOrder({
  RoadAccessPosition.JSON_PROPERTY_LATITUDE,
  RoadAccessPosition.JSON_PROPERTY_LONGITUDE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T13:00:09.396357Z[Etc/UTC]")
public class RoadAccessPosition {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public RoadAccessPosition() { 
  }

  public RoadAccessPosition latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The latitude value in degrees (WGS84/EPSG:4326) from south to north.")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public RoadAccessPosition longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The longitude value in degrees (WGS84/EPSG:4326) from west to east.")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  /**
   * Return true if this RoadAccessPosition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadAccessPosition roadAccessPosition = (RoadAccessPosition) o;
    return Objects.equals(this.latitude, roadAccessPosition.latitude) &&
        Objects.equals(this.longitude, roadAccessPosition.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadAccessPosition {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

