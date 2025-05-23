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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.geocoding.ApiClient;
/**
 * Quality indicators that help deciding how well a result fits to the search input.
 */
@JsonPropertyOrder({
  AddressScores.JSON_PROPERTY_COUNTRY,
  AddressScores.JSON_PROPERTY_STATE,
  AddressScores.JSON_PROPERTY_PROVINCE,
  AddressScores.JSON_PROPERTY_POSTAL_CODE,
  AddressScores.JSON_PROPERTY_CITY,
  AddressScores.JSON_PROPERTY_DISTRICT,
  AddressScores.JSON_PROPERTY_SUB_DISTRICT,
  AddressScores.JSON_PROPERTY_STREET,
  AddressScores.JSON_PROPERTY_HOUSE_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T08:53:28.343293622Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AddressScores {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  private Integer country;

  public static final String JSON_PROPERTY_STATE = "state";
  private Integer state;

  public static final String JSON_PROPERTY_PROVINCE = "province";
  private Integer province;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private Integer postalCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private Integer city;

  public static final String JSON_PROPERTY_DISTRICT = "district";
  private Integer district;

  public static final String JSON_PROPERTY_SUB_DISTRICT = "subDistrict";
  private Integer subDistrict;

  public static final String JSON_PROPERTY_STREET = "street";
  private Integer street;

  public static final String JSON_PROPERTY_HOUSE_NUMBER = "houseNumber";
  private Integer houseNumber;

  public AddressScores() { 
  }

  public AddressScores country(Integer country) {
    this.country = country;
    return this;
  }

  /**
   * The score for the returned country in \\[%\\].
   * @return country
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(Integer country) {
    this.country = country;
  }


  public AddressScores state(Integer state) {
    this.state = state;
    return this;
  }

  /**
   * The score for the returned state in \\[%\\].
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(Integer state) {
    this.state = state;
  }


  public AddressScores province(Integer province) {
    this.province = province;
    return this;
  }

  /**
   * The score for the returned province in \\[%\\].
   * @return province
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getProvince() {
    return province;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvince(Integer province) {
    this.province = province;
  }


  public AddressScores postalCode(Integer postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The score for the returned postalCode in \\[%\\].
   * @return postalCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(Integer postalCode) {
    this.postalCode = postalCode;
  }


  public AddressScores city(Integer city) {
    this.city = city;
    return this;
  }

  /**
   * The score for the returned city in \\[%\\].
   * @return city
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(Integer city) {
    this.city = city;
  }


  public AddressScores district(Integer district) {
    this.district = district;
    return this;
  }

  /**
   * The score for the returned district in \\[%\\].
   * @return district
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDistrict() {
    return district;
  }


  @JsonProperty(JSON_PROPERTY_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistrict(Integer district) {
    this.district = district;
  }


  public AddressScores subDistrict(Integer subDistrict) {
    this.subDistrict = subDistrict;
    return this;
  }

  /**
   * The score for the returned subdistrict in \\[%\\].
   * @return subDistrict
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSubDistrict() {
    return subDistrict;
  }


  @JsonProperty(JSON_PROPERTY_SUB_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubDistrict(Integer subDistrict) {
    this.subDistrict = subDistrict;
  }


  public AddressScores street(Integer street) {
    this.street = street;
    return this;
  }

  /**
   * The score for the returned street in \\[%\\].
   * @return street
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(Integer street) {
    this.street = street;
  }


  public AddressScores houseNumber(Integer houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * The score for the returned house number in \\[%\\].
   * @return houseNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHouseNumber() {
    return houseNumber;
  }


  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHouseNumber(Integer houseNumber) {
    this.houseNumber = houseNumber;
  }


  /**
   * Return true if this AddressScores object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressScores addressScores = (AddressScores) o;
    return Objects.equals(this.country, addressScores.country) &&
        Objects.equals(this.state, addressScores.state) &&
        Objects.equals(this.province, addressScores.province) &&
        Objects.equals(this.postalCode, addressScores.postalCode) &&
        Objects.equals(this.city, addressScores.city) &&
        Objects.equals(this.district, addressScores.district) &&
        Objects.equals(this.subDistrict, addressScores.subDistrict) &&
        Objects.equals(this.street, addressScores.street) &&
        Objects.equals(this.houseNumber, addressScores.houseNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, state, province, postalCode, city, district, subDistrict, street, houseNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressScores {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    subDistrict: ").append(toIndentedString(subDistrict)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `province` to the URL query string
    if (getProvince() != null) {
      joiner.add(String.format("%sprovince%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProvince()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `postalCode` to the URL query string
    if (getPostalCode() != null) {
      joiner.add(String.format("%spostalCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPostalCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `city` to the URL query string
    if (getCity() != null) {
      joiner.add(String.format("%scity%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `district` to the URL query string
    if (getDistrict() != null) {
      joiner.add(String.format("%sdistrict%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDistrict()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subDistrict` to the URL query string
    if (getSubDistrict() != null) {
      joiner.add(String.format("%ssubDistrict%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSubDistrict()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

