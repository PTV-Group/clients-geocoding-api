/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.12
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
import com.ptvgroup.developer.client.geocoding.model.Address;
import com.ptvgroup.developer.client.geocoding.model.LocationType;
import com.ptvgroup.developer.client.geocoding.model.Quality;
import com.ptvgroup.developer.client.geocoding.model.ReferencePosition;
import com.ptvgroup.developer.client.geocoding.model.RoadAccessPosition;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Location
 */
@JsonPropertyOrder({
  Location.JSON_PROPERTY_REFERENCE_POSITION,
  Location.JSON_PROPERTY_ROAD_ACCESS_POSITION,
  Location.JSON_PROPERTY_ADDRESS,
  Location.JSON_PROPERTY_FORMATTED_ADDRESS,
  Location.JSON_PROPERTY_LOCATION_TYPE,
  Location.JSON_PROPERTY_QUALITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T07:41:04.078820292Z[Etc/UTC]")
public class Location {
  public static final String JSON_PROPERTY_REFERENCE_POSITION = "referencePosition";
  private ReferencePosition referencePosition;

  public static final String JSON_PROPERTY_ROAD_ACCESS_POSITION = "roadAccessPosition";
  private RoadAccessPosition roadAccessPosition;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_FORMATTED_ADDRESS = "formattedAddress";
  private String formattedAddress;

  public static final String JSON_PROPERTY_LOCATION_TYPE = "locationType";
  private LocationType locationType;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private Quality quality;

  public Location() { 
  }

  public Location referencePosition(ReferencePosition referencePosition) {
    this.referencePosition = referencePosition;
    return this;
  }

   /**
   * Get referencePosition
   * @return referencePosition
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReferencePosition getReferencePosition() {
    return referencePosition;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferencePosition(ReferencePosition referencePosition) {
    this.referencePosition = referencePosition;
  }


  public Location roadAccessPosition(RoadAccessPosition roadAccessPosition) {
    this.roadAccessPosition = roadAccessPosition;
    return this;
  }

   /**
   * Get roadAccessPosition
   * @return roadAccessPosition
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROAD_ACCESS_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoadAccessPosition getRoadAccessPosition() {
    return roadAccessPosition;
  }


  @JsonProperty(JSON_PROPERTY_ROAD_ACCESS_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoadAccessPosition(RoadAccessPosition roadAccessPosition) {
    this.roadAccessPosition = roadAccessPosition;
  }


  public Location address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public Location formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * A single string representing the address, typically consisting of the street, house number, postal code, city, and country. The precise format may differ based on what is appropriate for the address.
   * @return formattedAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMATTED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormattedAddress() {
    return formattedAddress;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  public Location locationType(LocationType locationType) {
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


  public Location quality(Quality quality) {
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
   * Return true if this Location object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.referencePosition, location.referencePosition) &&
        Objects.equals(this.roadAccessPosition, location.roadAccessPosition) &&
        Objects.equals(this.address, location.address) &&
        Objects.equals(this.formattedAddress, location.formattedAddress) &&
        Objects.equals(this.locationType, location.locationType) &&
        Objects.equals(this.quality, location.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencePosition, roadAccessPosition, address, formattedAddress, locationType, quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    referencePosition: ").append(toIndentedString(referencePosition)).append("\n");
    sb.append("    roadAccessPosition: ").append(toIndentedString(roadAccessPosition)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
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

    // add `referencePosition` to the URL query string
    if (getReferencePosition() != null) {
      joiner.add(getReferencePosition().toUrlQueryString(prefix + "referencePosition" + suffix));
    }

    // add `roadAccessPosition` to the URL query string
    if (getRoadAccessPosition() != null) {
      joiner.add(getRoadAccessPosition().toUrlQueryString(prefix + "roadAccessPosition" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `formattedAddress` to the URL query string
    if (getFormattedAddress() != null) {
      joiner.add(String.format("%sformattedAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormattedAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

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

