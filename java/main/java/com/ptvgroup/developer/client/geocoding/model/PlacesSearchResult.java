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
import com.ptvgroup.developer.client.geocoding.model.Place;
import com.ptvgroup.developer.client.geocoding.model.Warning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.geocoding.ApiClient;
/**
 * The result of a places search.
 */
@JsonPropertyOrder({
  PlacesSearchResult.JSON_PROPERTY_PLACES,
  PlacesSearchResult.JSON_PROPERTY_NO_MATCH_FEEDBACK_ID,
  PlacesSearchResult.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-11T09:26:27.479574509Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PlacesSearchResult {
  public static final String JSON_PROPERTY_PLACES = "places";
  private List<Place> places;

  public static final String JSON_PROPERTY_NO_MATCH_FEEDBACK_ID = "noMatchFeedbackId";
  private UUID noMatchFeedbackId;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings;

  public PlacesSearchResult() { 
  }

  public PlacesSearchResult places(List<Place> places) {
    this.places = places;
    return this;
  }

  public PlacesSearchResult addPlacesItem(Place placesItem) {
    if (this.places == null) {
      this.places = new ArrayList<>();
    }
    this.places.add(placesItem);
    return this;
  }

  /**
   * The places which where found.
   * @return places
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Place> getPlaces() {
    return places;
  }


  @JsonProperty(JSON_PROPERTY_PLACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaces(List<Place> places) {
    this.places = places;
  }


  public PlacesSearchResult noMatchFeedbackId(UUID noMatchFeedbackId) {
    this.noMatchFeedbackId = noMatchFeedbackId;
    return this;
  }

  /**
   * A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future.
   * @return noMatchFeedbackId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_MATCH_FEEDBACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getNoMatchFeedbackId() {
    return noMatchFeedbackId;
  }


  @JsonProperty(JSON_PROPERTY_NO_MATCH_FEEDBACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoMatchFeedbackId(UUID noMatchFeedbackId) {
    this.noMatchFeedbackId = noMatchFeedbackId;
  }


  public PlacesSearchResult warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public PlacesSearchResult addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Warning> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this PlacesSearchResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacesSearchResult placesSearchResult = (PlacesSearchResult) o;
    return Objects.equals(this.places, placesSearchResult.places) &&
        Objects.equals(this.noMatchFeedbackId, placesSearchResult.noMatchFeedbackId) &&
        Objects.equals(this.warnings, placesSearchResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(places, noMatchFeedbackId, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacesSearchResult {\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
    sb.append("    noMatchFeedbackId: ").append(toIndentedString(noMatchFeedbackId)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

    // add `places` to the URL query string
    if (getPlaces() != null) {
      for (int i = 0; i < getPlaces().size(); i++) {
        if (getPlaces().get(i) != null) {
          joiner.add(getPlaces().get(i).toUrlQueryString(String.format("%splaces%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `noMatchFeedbackId` to the URL query string
    if (getNoMatchFeedbackId() != null) {
      joiner.add(String.format("%snoMatchFeedbackId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNoMatchFeedbackId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `warnings` to the URL query string
    if (getWarnings() != null) {
      for (int i = 0; i < getWarnings().size(); i++) {
        if (getWarnings().get(i) != null) {
          joiner.add(getWarnings().get(i).toUrlQueryString(String.format("%swarnings%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

