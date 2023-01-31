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
import com.ptvgroup.developer.client.geocoding.model.Place;
import com.ptvgroup.developer.client.geocoding.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The result of a places search.
 */
@ApiModel(description = "The result of a places search.")
@JsonPropertyOrder({
  PlacesSearchResult.JSON_PROPERTY_PLACES,
  PlacesSearchResult.JSON_PROPERTY_WARNINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:16:12.211880Z[Etc/UTC]")
public class PlacesSearchResult {
  public static final String JSON_PROPERTY_PLACES = "places";
  private List<Place> places = null;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings = null;

  public PlacesSearchResult() { 
  }

  public PlacesSearchResult places(List<Place> places) {
    this.places = places;
    return this;
  }

  public PlacesSearchResult addPlacesItem(Place placesItem) {
    if (this.places == null) {
      this.places = new ArrayList<>();
    }
    this.places.add(placesItem);
    return this;
  }

   /**
   * The found places.
   * @return places
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The found places.")
  @JsonProperty(JSON_PROPERTY_PLACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Place> getPlaces() {
    return places;
  }


  @JsonProperty(JSON_PROPERTY_PLACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaces(List<Place> places) {
    this.places = places;
  }


  public PlacesSearchResult warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public PlacesSearchResult addWarningsItem(Warning warningsItem) {
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
  @ApiModelProperty(value = "A list of warnings concerning the validity of the result.")
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
   * Return true if this PlacesSearchResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacesSearchResult placesSearchResult = (PlacesSearchResult) o;
    return Objects.equals(this.places, placesSearchResult.places) &&
        Objects.equals(this.warnings, placesSearchResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(places, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacesSearchResult {\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
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

}

