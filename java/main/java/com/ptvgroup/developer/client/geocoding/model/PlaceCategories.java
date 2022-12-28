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
import com.ptvgroup.developer.client.geocoding.model.PlaceCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Response type for place category requests.
 */
@ApiModel(description = "Response type for place category requests.")
@JsonPropertyOrder({
  PlaceCategories.JSON_PROPERTY_PLACE_CATEGORIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T10:52:10.377251Z[Etc/UTC]")
public class PlaceCategories {
  public static final String JSON_PROPERTY_PLACE_CATEGORIES = "placeCategories";
  private List<PlaceCategory> placeCategories = null;

  public PlaceCategories() { 
  }

  public PlaceCategories placeCategories(List<PlaceCategory> placeCategories) {
    this.placeCategories = placeCategories;
    return this;
  }

  public PlaceCategories addPlaceCategoriesItem(PlaceCategory placeCategoriesItem) {
    if (this.placeCategories == null) {
      this.placeCategories = new ArrayList<>();
    }
    this.placeCategories.add(placeCategoriesItem);
    return this;
  }

   /**
   * The individual place categories.
   * @return placeCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The individual place categories.")
  @JsonProperty(JSON_PROPERTY_PLACE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceCategory> getPlaceCategories() {
    return placeCategories;
  }


  @JsonProperty(JSON_PROPERTY_PLACE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceCategories(List<PlaceCategory> placeCategories) {
    this.placeCategories = placeCategories;
  }


  /**
   * Return true if this PlaceCategories object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceCategories placeCategories = (PlaceCategories) o;
    return Objects.equals(this.placeCategories, placeCategories.placeCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceCategories {\n");
    sb.append("    placeCategories: ").append(toIndentedString(placeCategories)).append("\n");
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

