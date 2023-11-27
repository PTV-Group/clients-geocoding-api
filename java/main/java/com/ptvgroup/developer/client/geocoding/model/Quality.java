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
import com.ptvgroup.developer.client.geocoding.model.AddressScores;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Quality indicators that help deciding how well a result fits to the search input.
 */
@JsonPropertyOrder({
  Quality.JSON_PROPERTY_DISTANCE,
  Quality.JSON_PROPERTY_TOTAL_SCORE,
  Quality.JSON_PROPERTY_ADDRESS_SCORES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T06:56:13.706725Z[Etc/UTC]")
public class Quality {
  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private JsonNullable<Integer> distance = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TOTAL_SCORE = "totalScore";
  private JsonNullable<Integer> totalScore = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ADDRESS_SCORES = "addressScores";
  private AddressScores addressScores;

  public Quality() { 
  }

  public Quality distance(Integer distance) {
    this.distance = JsonNullable.<Integer>of(distance);
    return this;
  }

   /**
   * The spatial distance in \\[m\\] between the location or the place and the input of a position search.    This is only available for **searchLocationsByPosition** and **searchPlacesByPosition**.
   * @return distance
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getDistance() {
        return distance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDistance_JsonNullable() {
    return distance;
  }
  
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  public void setDistance_JsonNullable(JsonNullable<Integer> distance) {
    this.distance = distance;
  }

  public void setDistance(Integer distance) {
    this.distance = JsonNullable.<Integer>of(distance);
  }


  public Quality totalScore(Integer totalScore) {
    this.totalScore = JsonNullable.<Integer>of(totalScore);
    return this;
  }

   /**
   * An overall score in \\[%\\] for address searches. 100 percent represents a perfect match between the input and the result.    This is only available for **searchLocationsByText** and **searchLocationsByAddress** results.
   * @return totalScore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getTotalScore() {
        return totalScore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTotalScore_JsonNullable() {
    return totalScore;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_SCORE)
  public void setTotalScore_JsonNullable(JsonNullable<Integer> totalScore) {
    this.totalScore = totalScore;
  }

  public void setTotalScore(Integer totalScore) {
    this.totalScore = JsonNullable.<Integer>of(totalScore);
  }


  public Quality addressScores(AddressScores addressScores) {
    this.addressScores = addressScores;
    return this;
  }

   /**
   * Get addressScores
   * @return addressScores
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressScores getAddressScores() {
    return addressScores;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressScores(AddressScores addressScores) {
    this.addressScores = addressScores;
  }


  /**
   * Return true if this Quality object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quality quality = (Quality) o;
    return equalsNullable(this.distance, quality.distance) &&
        equalsNullable(this.totalScore, quality.totalScore) &&
        Objects.equals(this.addressScores, quality.addressScores);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(distance), hashCodeNullable(totalScore), addressScores);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quality {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    addressScores: ").append(toIndentedString(addressScores)).append("\n");
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

    // add `distance` to the URL query string
    if (getDistance() != null) {
      joiner.add(String.format("%sdistance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDistance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `totalScore` to the URL query string
    if (getTotalScore() != null) {
      joiner.add(String.format("%stotalScore%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalScore()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addressScores` to the URL query string
    if (getAddressScores() != null) {
      joiner.add(getAddressScores().toUrlQueryString(prefix + "addressScores" + suffix));
    }

    return joiner.toString();
  }
}

