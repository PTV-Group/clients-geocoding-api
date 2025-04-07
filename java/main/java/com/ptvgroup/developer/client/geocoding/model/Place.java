/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.16
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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.geocoding.model.Address;
import com.ptvgroup.developer.client.geocoding.model.Quality;
import com.ptvgroup.developer.client.geocoding.model.ReferencePosition;
import com.ptvgroup.developer.client.geocoding.model.RoadAccessPosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.geocoding.ApiClient;
/**
 * Place
 */
@JsonPropertyOrder({
  Place.JSON_PROPERTY_REFERENCE_POSITION,
  Place.JSON_PROPERTY_ROAD_ACCESS_POSITION,
  Place.JSON_PROPERTY_ADDRESS,
  Place.JSON_PROPERTY_FORMATTED_ADDRESS,
  Place.JSON_PROPERTY_FEEDBACK_ID,
  Place.JSON_PROPERTY_NAME,
  Place.JSON_PROPERTY_CATEGORY_IDS,
  Place.JSON_PROPERTY_QUALITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-07T09:53:55.686006534Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Place {
  public static final String JSON_PROPERTY_REFERENCE_POSITION = "referencePosition";
  private ReferencePosition referencePosition;

  public static final String JSON_PROPERTY_ROAD_ACCESS_POSITION = "roadAccessPosition";
  private RoadAccessPosition roadAccessPosition;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_FORMATTED_ADDRESS = "formattedAddress";
  private String formattedAddress;

  public static final String JSON_PROPERTY_FEEDBACK_ID = "feedbackId";
  private UUID feedbackId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CATEGORY_IDS = "categoryIds";
  private List<String> categoryIds;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private Quality quality;

  public Place() { 
  }

  public Place referencePosition(ReferencePosition referencePosition) {
    this.referencePosition = referencePosition;
    return this;
  }

  /**
   * Get referencePosition
   * @return referencePosition
   */
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


  public Place roadAccessPosition(RoadAccessPosition roadAccessPosition) {
    this.roadAccessPosition = roadAccessPosition;
    return this;
  }

  /**
   * Get roadAccessPosition
   * @return roadAccessPosition
   */
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


  public Place address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
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


  public Place formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * A single string representing the address, typically consisting of the street, house number, postal code, city, and country. The precise format may differ based on what is appropriate for the address.
   * @return formattedAddress
   */
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


  public Place feedbackId(UUID feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future.
   * @return feedbackId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getFeedbackId() {
    return feedbackId;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackId(UUID feedbackId) {
    this.feedbackId = feedbackId;
  }


  public Place name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the place.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Place categoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public Place addCategoryIdsItem(String categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  /**
   * An array of place category IDs representing the categories this place is assigned to.
   * @return categoryIds
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATEGORY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getCategoryIds() {
    return categoryIds;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public Place quality(Quality quality) {
    this.quality = quality;
    return this;
  }

  /**
   * Get quality
   * @return quality
   */
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
   * Return true if this Place object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Place place = (Place) o;
    return Objects.equals(this.referencePosition, place.referencePosition) &&
        Objects.equals(this.roadAccessPosition, place.roadAccessPosition) &&
        Objects.equals(this.address, place.address) &&
        Objects.equals(this.formattedAddress, place.formattedAddress) &&
        Objects.equals(this.feedbackId, place.feedbackId) &&
        Objects.equals(this.name, place.name) &&
        Objects.equals(this.categoryIds, place.categoryIds) &&
        Objects.equals(this.quality, place.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencePosition, roadAccessPosition, address, formattedAddress, feedbackId, name, categoryIds, quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    sb.append("    referencePosition: ").append(toIndentedString(referencePosition)).append("\n");
    sb.append("    roadAccessPosition: ").append(toIndentedString(roadAccessPosition)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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
      joiner.add(String.format("%sformattedAddress%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFormattedAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `feedbackId` to the URL query string
    if (getFeedbackId() != null) {
      joiner.add(String.format("%sfeedbackId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFeedbackId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `categoryIds` to the URL query string
    if (getCategoryIds() != null) {
      for (int i = 0; i < getCategoryIds().size(); i++) {
        joiner.add(String.format("%scategoryIds%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getCategoryIds().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `quality` to the URL query string
    if (getQuality() != null) {
      joiner.add(getQuality().toUrlQueryString(prefix + "quality" + suffix));
    }

    return joiner.toString();
  }
}

