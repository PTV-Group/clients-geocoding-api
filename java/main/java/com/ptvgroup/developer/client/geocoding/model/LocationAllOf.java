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
import com.ptvgroup.developer.client.geocoding.model.LocationType;
import com.ptvgroup.developer.client.geocoding.model.Quality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocationAllOf
 */
@JsonPropertyOrder({
  LocationAllOf.JSON_PROPERTY_LOCATION_TYPE,
  LocationAllOf.JSON_PROPERTY_QUALITY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:16:12.211880Z[Etc/UTC]")
public class LocationAllOf {
  public static final String JSON_PROPERTY_LOCATION_TYPE = "locationType";
  private LocationType locationType;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private Quality quality;

  public LocationAllOf() { 
  }

  public LocationAllOf locationType(LocationType locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocationType getLocationType() {
    return locationType;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocationType(LocationType locationType) {
    this.locationType = locationType;
  }


  public LocationAllOf quality(Quality quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Quality getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuality(Quality quality) {
    this.quality = quality;
  }


  /**
   * Return true if this Location_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAllOf locationAllOf = (LocationAllOf) o;
    return Objects.equals(this.locationType, locationAllOf.locationType) &&
        Objects.equals(this.quality, locationAllOf.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationType, quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAllOf {\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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

