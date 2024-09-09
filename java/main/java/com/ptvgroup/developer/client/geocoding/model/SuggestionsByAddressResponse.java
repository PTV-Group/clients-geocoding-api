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
import com.ptvgroup.developer.client.geocoding.model.SuggestedAddress;
import com.ptvgroup.developer.client.geocoding.model.Warning;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The list of suggested addresses.
 */
@JsonPropertyOrder({
  SuggestionsByAddressResponse.JSON_PROPERTY_SUGGESTIONS,
  SuggestionsByAddressResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T07:41:04.078820292Z[Etc/UTC]")
public class SuggestionsByAddressResponse {
  public static final String JSON_PROPERTY_SUGGESTIONS = "suggestions";
  private List<SuggestedAddress> suggestions;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings;

  public SuggestionsByAddressResponse() { 
  }

  public SuggestionsByAddressResponse suggestions(List<SuggestedAddress> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public SuggestionsByAddressResponse addSuggestionsItem(SuggestedAddress suggestionsItem) {
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * The list of suggested addresses.
   * @return suggestions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SuggestedAddress> getSuggestions() {
    return suggestions;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuggestions(List<SuggestedAddress> suggestions) {
    this.suggestions = suggestions;
  }


  public SuggestionsByAddressResponse warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SuggestionsByAddressResponse addWarningsItem(Warning warningsItem) {
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
   * Return true if this SuggestionsByAddressResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionsByAddressResponse suggestionsByAddressResponse = (SuggestionsByAddressResponse) o;
    return Objects.equals(this.suggestions, suggestionsByAddressResponse.suggestions) &&
        Objects.equals(this.warnings, suggestionsByAddressResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestions, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionsByAddressResponse {\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

    // add `suggestions` to the URL query string
    if (getSuggestions() != null) {
      for (int i = 0; i < getSuggestions().size(); i++) {
        if (getSuggestions().get(i) != null) {
          joiner.add(getSuggestions().get(i).toUrlQueryString(String.format("%ssuggestions%s%s", prefix, suffix,
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

