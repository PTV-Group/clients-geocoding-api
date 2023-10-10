/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.geocoding.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocationAllOf
 */
@JsonPropertyOrder({
  LocationAllOf.JSON_PROPERTY_LOCATION_TYPE,
  LocationAllOf.JSON_PROPERTY_QUALITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-10T11:53:42.371705Z[Etc/UTC]")
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `locationType` to the URL query string
    if (getLocationType() != null) {
      joiner.add(String.format("%slocationType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocationType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `quality` to the URL query string
    if (getQuality() != null) {
      joiner.add(getQuality().toUrlQueryString(prefix + "quality" + suffix));
    }

    return joiner.toString();
  }
}

