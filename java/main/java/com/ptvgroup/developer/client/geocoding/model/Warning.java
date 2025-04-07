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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.geocoding.ApiClient;
/**
 * Warning
 */
@JsonPropertyOrder({
  Warning.JSON_PROPERTY_DESCRIPTION,
  Warning.JSON_PROPERTY_WARNING_CODE,
  Warning.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-07T09:53:55.686006534Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Warning {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_WARNING_CODE = "warningCode";
  private String warningCode;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details;

  public Warning() { 
  }

  public Warning description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human readable message that describes the warning.
   * @return description
   */
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


  public Warning warningCode(String warningCode) {
    this.warningCode = warningCode;
    return this;
  }

  /**
   * A constant string that can be used to identify this warning class programmatically.  If additional information is available for a warningCode, it will be provided as key-value pairs with the parameter **details**. The keys available for a specific warningCode are documented directly with the warningCode. Unless stated otherwise, the values are of type string.  As an example, the following warningCode provides four key-value pairs in the **details**.  The keys are called **parameter**, **value**, **relatedParameter** and **relatedValue**. * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.   * &#x60;parameter&#x60; - The ignored parameter.   * &#x60;value&#x60; - The value of the ignored parameter.   * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.   * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value.  Note that additional warningCode as well as the **details** of existing warningCode may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GEOCODING_COUNTRY_FILTER_MODIFIED&#x60; - A given code in **countryFilter** referring to a subdivision of a country was modified to its corresponding country code.     * &#x60;requestedSubdivisionCode&#x60; - The subdivision code that was originally requested.     * &#x60;fallbackCountryCode&#x60; - The country code that was used as a fallback in the search.   * &#x60;GEOCODING_TIMEOUT&#x60; - The search ran into a timeout while trying to find results.   * &#x60;GEOCODING_INPUT_TOO_LONG&#x60; - The input was rejected because it is too long.     * &#x60;maximumSize&#x60; - The maximum allowed size of the single input field.   * &#x60;TOO_MANY_INPUT_WORDS&#x60; - At least one of the input fields exceeded the maximum number of input words.     * &#x60;inputField&#x60; - The input field that had too many input words.   * &#x60;actualNumberOfWords&#x60; - The number of words found in &#x60;inputField&#x60;.   * &#x60;maximumAllowedNumberOfWords&#x60; - The maximum number of words allowed in &#x60;inputField&#x60;. * &#x60;GEOCODING_TOO_MANY_RESULTS&#x60; - Too many results found. Not all of them are provided in the response.  
   * @return warningCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WARNING_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWarningCode() {
    return warningCode;
  }


  @JsonProperty(JSON_PROPERTY_WARNING_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWarningCode(String warningCode) {
    this.warningCode = warningCode;
  }


  public Warning details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public Warning putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * Additional properties specific to this class of warnings.
   * @return details
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  /**
   * Return true if this Warning object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warning warning = (Warning) o;
    return Objects.equals(this.description, warning.description) &&
        Objects.equals(this.warningCode, warning.warningCode) &&
        Objects.equals(this.details, warning.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, warningCode, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
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
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `warningCode` to the URL query string
    if (getWarningCode() != null) {
      joiner.add(String.format("%swarningCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWarningCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      for (String _key : getDetails().keySet()) {
        joiner.add(String.format("%sdetails%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getDetails().get(_key), URLEncoder.encode(ApiClient.valueToString(getDetails().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

