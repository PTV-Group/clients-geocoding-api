/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.17
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
import com.ptvgroup.developer.client.geocoding.model.Area;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.geocoding.ApiClient;
/**
 * PlacesByAreaRequest
 */
@JsonPropertyOrder({
  PlacesByAreaRequest.JSON_PROPERTY_AREA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T08:53:28.343293622Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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
   */
  @javax.annotation.Nonnull
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

    // add `area` to the URL query string
    if (getArea() != null) {
      joiner.add(getArea().toUrlQueryString(prefix + "area" + suffix));
    }

    return joiner.toString();
  }
}

