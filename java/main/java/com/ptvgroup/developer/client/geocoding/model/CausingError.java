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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CausingError
 */
@JsonPropertyOrder({
  CausingError.JSON_PROPERTY_DESCRIPTION,
  CausingError.JSON_PROPERTY_ERROR_CODE,
  CausingError.JSON_PROPERTY_PARAMETER,
  CausingError.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T07:41:04.078820292Z[Etc/UTC]")
public class CausingError {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, String> details;

  public CausingError() { 
  }

  public CausingError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable message that describes the error.
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CausingError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.   Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.    **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60; * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.     * &#x60;value&#x60; - The invalid value.    * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown.   * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing.   * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated.   * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.     * &#x60;minimumValue&#x60; - The minimum value (integer or double).   * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.     * &#x60;maximumValue&#x60; - The maximum value (integer or double).   * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.     * &#x60;minimumLength&#x60; - The minimum length (integer).   * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.     * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GEOCODING_PARAMETER_CONFLICT&#x60; - Conflicting parameters found. Only one of them is allowed.     * &#x60;conflictingParameter&#x60; - The name of the conflicting parameter. * &#x60;GEOCODING_PARAMETER_DEPENDENCY_VIOLATED&#x60; - A parameter depends on another parameter which is missing.     * &#x60;missingParameter&#x60; - The name of the missing parameter.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CausingError parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public CausingError details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  public CausingError putDetailsItem(String key, String detailsItem) {
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Additional properties specific to this error class.
   * @return details
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(Map<String, String> details) {
    this.details = details;
  }


  /**
   * Return true if this CausingError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CausingError causingError = (CausingError) o;
    return Objects.equals(this.description, causingError.description) &&
        Objects.equals(this.errorCode, causingError.errorCode) &&
        Objects.equals(this.parameter, causingError.parameter) &&
        Objects.equals(this.details, causingError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorCode, parameter, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CausingError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `errorCode` to the URL query string
    if (getErrorCode() != null) {
      joiner.add(String.format("%serrorCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `parameter` to the URL query string
    if (getParameter() != null) {
      joiner.add(String.format("%sparameter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParameter()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      for (String _key : getDetails().keySet()) {
        joiner.add(String.format("%sdetails%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getDetails().get(_key), URLEncoder.encode(String.valueOf(getDetails().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

