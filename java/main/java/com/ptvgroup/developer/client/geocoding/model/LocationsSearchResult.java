/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.11
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
import com.ptvgroup.developer.client.geocoding.model.Location;
import com.ptvgroup.developer.client.geocoding.model.Warning;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The result of a locations search.
 */
@JsonPropertyOrder({
  LocationsSearchResult.JSON_PROPERTY_LOCATIONS,
  LocationsSearchResult.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T06:56:13.706725Z[Etc/UTC]")
public class LocationsSearchResult {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<Location> locations;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings;

  public LocationsSearchResult() { 
  }

  public LocationsSearchResult locations(List<Location> locations) {
    this.locations = locations;
    return this;
  }

  public LocationsSearchResult addLocationsItem(Location locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The found locations.
   * @return locations
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Location> getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }


  public LocationsSearchResult warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public LocationsSearchResult addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
  **/
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
   * Return true if this LocationsSearchResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationsSearchResult locationsSearchResult = (LocationsSearchResult) o;
    return Objects.equals(this.locations, locationsSearchResult.locations) &&
        Objects.equals(this.warnings, locationsSearchResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationsSearchResult {\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

    // add `locations` to the URL query string
    if (getLocations() != null) {
      for (int i = 0; i < getLocations().size(); i++) {
        if (getLocations().get(i) != null) {
          joiner.add(getLocations().get(i).toUrlQueryString(String.format("%slocations%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
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

