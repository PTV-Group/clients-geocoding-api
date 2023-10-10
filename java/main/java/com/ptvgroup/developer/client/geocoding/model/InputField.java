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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumeration to specify a parameter of a suggestions/by-address request.    * &#x60;COUNTRY&#x60; - Specifies the country parameter.    * &#x60;STATE&#x60; - Specifies the state parameter.    * &#x60;POSTAL_CODE&#x60; - Specifies the postalCode parameter.    * &#x60;LOCALITY&#x60; - Specifies the locality parameter.    * &#x60;STREET&#x60; - Specifies the street parameter.    * &#x60;HOUSE_NUMBER&#x60; - Specifies the houseNumber parameter.
 */
public enum InputField {
  
  COUNTRY("COUNTRY"),
  
  STATE("STATE"),
  
  POSTAL_CODE("POSTAL_CODE"),
  
  LOCALITY("LOCALITY"),
  
  STREET("STREET"),
  
  HOUSE_NUMBER("HOUSE_NUMBER");

  private String value;

  InputField(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InputField fromValue(String value) {
    for (InputField b : InputField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

