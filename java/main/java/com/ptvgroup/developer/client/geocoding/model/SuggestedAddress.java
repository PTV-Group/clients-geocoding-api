/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.14
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.geocoding.ApiClient;
/**
 * An address suggested for the input of the searchLocationsByAddress endpoint.
 */
@JsonPropertyOrder({
  SuggestedAddress.JSON_PROPERTY_CAPTION,
  SuggestedAddress.JSON_PROPERTY_COUNTRY,
  SuggestedAddress.JSON_PROPERTY_STATE,
  SuggestedAddress.JSON_PROPERTY_POSTAL_CODE,
  SuggestedAddress.JSON_PROPERTY_LOCALITY,
  SuggestedAddress.JSON_PROPERTY_STREET,
  SuggestedAddress.JSON_PROPERTY_HOUSE_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-14T09:53:24.245915307Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SuggestedAddress {
  public static final String JSON_PROPERTY_CAPTION = "caption";
  private String caption;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_HOUSE_NUMBER = "houseNumber";
  private String houseNumber;

  public SuggestedAddress() { 
  }

  public SuggestedAddress caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * A summary of this suggestion that can be displayed on a user interface.
   * @return caption
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCaption() {
    return caption;
  }


  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCaption(String caption) {
    this.caption = caption;
  }


  public SuggestedAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of the suggested address or the provided input.
   * @return country
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public SuggestedAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state/province of the suggested address or the provided input.
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public SuggestedAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The postal code or zip code of the suggested address or the provided input.
   * @return postalCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public SuggestedAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * The locality of the suggested address or the provided input.
   * @return locality
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocality() {
    return locality;
  }


  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocality(String locality) {
    this.locality = locality;
  }


  public SuggestedAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * The street of the suggested address or the provided input.
   * @return street
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }


  public SuggestedAddress houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * The house number of the suggested address or the provided input.
   * @return houseNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHouseNumber() {
    return houseNumber;
  }


  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }


  /**
   * Return true if this SuggestedAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedAddress suggestedAddress = (SuggestedAddress) o;
    return Objects.equals(this.caption, suggestedAddress.caption) &&
        Objects.equals(this.country, suggestedAddress.country) &&
        Objects.equals(this.state, suggestedAddress.state) &&
        Objects.equals(this.postalCode, suggestedAddress.postalCode) &&
        Objects.equals(this.locality, suggestedAddress.locality) &&
        Objects.equals(this.street, suggestedAddress.street) &&
        Objects.equals(this.houseNumber, suggestedAddress.houseNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, country, state, postalCode, locality, street, houseNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedAddress {\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
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

    // add `caption` to the URL query string
    if (getCaption() != null) {
      joiner.add(String.format("%scaption%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCaption()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `postalCode` to the URL query string
    if (getPostalCode() != null) {
      joiner.add(String.format("%spostalCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPostalCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `locality` to the URL query string
    if (getLocality() != null) {
      joiner.add(String.format("%slocality%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLocality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `street` to the URL query string
    if (getStreet() != null) {
      joiner.add(String.format("%sstreet%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStreet()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `houseNumber` to the URL query string
    if (getHouseNumber() != null) {
      joiner.add(String.format("%shouseNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHouseNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

