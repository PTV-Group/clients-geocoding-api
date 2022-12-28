/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.geocoding.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the address of a geographical object. Whenever a string, such as a city or street name, is available in multiple languages, it is returned in the default language specified by the country in which an object is located. Most of the fields are optional, because addressing schemes vary strongly between countries.
 */
@ApiModel(description = "Represents the address of a geographical object. Whenever a string, such as a city or street name, is available in multiple languages, it is returned in the default language specified by the country in which an object is located. Most of the fields are optional, because addressing schemes vary strongly between countries.")
@JsonPropertyOrder({
  Address.JSON_PROPERTY_COUNTRY_NAME,
  Address.JSON_PROPERTY_STATE,
  Address.JSON_PROPERTY_PROVINCE,
  Address.JSON_PROPERTY_POSTAL_CODE,
  Address.JSON_PROPERTY_CITY,
  Address.JSON_PROPERTY_DISTRICT,
  Address.JSON_PROPERTY_SUBDISTRICT,
  Address.JSON_PROPERTY_STREET,
  Address.JSON_PROPERTY_HOUSE_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T10:52:10.377251Z[Etc/UTC]")
public class Address {
  public static final String JSON_PROPERTY_COUNTRY_NAME = "countryName";
  private String countryName;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_PROVINCE = "province";
  private String province;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_DISTRICT = "district";
  private String district;

  public static final String JSON_PROPERTY_SUBDISTRICT = "subdistrict";
  private String subdistrict;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_HOUSE_NUMBER = "houseNumber";
  private String houseNumber;

  public Address() { 
  }

  public Address countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * The country. In a response, it is represented by its full name (not abbreviated or encoded).
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country. In a response, it is represented by its full name (not abbreviated or encoded).")
  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryName() {
    return countryName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The name of the principal country subdivision which the address belongs to (for example, a state in the USA, or a canton in Switzerland).
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the principal country subdivision which the address belongs to (for example, a state in the USA, or a canton in Switzerland).")
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


  public Address province(String province) {
    this.province = province;
    return this;
  }

   /**
   * The name of the second-level country subdivision which the address belongs to (for example, a county in the UK, or a province in Italy).
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the second-level country subdivision which the address belongs to (for example, a county in the UK, or a province in Italy).")
  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvince() {
    return province;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvince(String province) {
    this.province = province;
  }


  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code of the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code of the address.")
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


  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the address, i.e. the highest entity at the communal level which the address belongs to.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city of the address, i.e. the highest entity at the communal level which the address belongs to.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public Address district(String district) {
    this.district = district;
    return this;
  }

   /**
   * The district of the address, i.e. the entity below city.
   * @return district
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The district of the address, i.e. the entity below city.")
  @JsonProperty(JSON_PROPERTY_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDistrict() {
    return district;
  }


  @JsonProperty(JSON_PROPERTY_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistrict(String district) {
    this.district = district;
  }


  public Address subdistrict(String subdistrict) {
    this.subdistrict = subdistrict;
    return this;
  }

   /**
   * The subdistrict of the address, i.e. the entity below district.
   * @return subdistrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subdistrict of the address, i.e. the entity below district.")
  @JsonProperty(JSON_PROPERTY_SUBDISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubdistrict() {
    return subdistrict;
  }


  @JsonProperty(JSON_PROPERTY_SUBDISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubdistrict(String subdistrict) {
    this.subdistrict = subdistrict;
  }


  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The street of the address.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street of the address.")
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


  public Address houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * The house number of the address.
   * @return houseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The house number of the address.")
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
   * Return true if this Address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.countryName, address.countryName) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.province, address.province) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.district, address.district) &&
        Objects.equals(this.subdistrict, address.subdistrict) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.houseNumber, address.houseNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryName, state, province, postalCode, city, district, subdistrict, street, houseNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    subdistrict: ").append(toIndentedString(subdistrict)).append("\n");
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

}
