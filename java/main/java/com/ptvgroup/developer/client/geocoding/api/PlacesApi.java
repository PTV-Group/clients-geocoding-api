/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ptvgroup.developer.client.geocoding.api;

import com.ptvgroup.developer.client.geocoding.ApiClient;
import com.ptvgroup.developer.client.geocoding.ApiException;
import com.ptvgroup.developer.client.geocoding.ApiResponse;
import com.ptvgroup.developer.client.geocoding.Pair;

import com.ptvgroup.developer.client.geocoding.model.ErrorResponse;
import com.ptvgroup.developer.client.geocoding.model.PlacesByAreaRequest;
import com.ptvgroup.developer.client.geocoding.model.PlacesSearchResult;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T09:12:53.258674256Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PlacesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public PlacesApi() {
    this(new ApiClient());
  }

  public PlacesApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Searches for places within a requested area.
   * @param placesByAreaRequest  (required)
   * @param categoryFilter A comma-separated list of place category IDs. Only results having one of these categories will be returned. If no filter is specified, all categories will be returned. However, empty values are not allowed. (optional)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @return PlacesSearchResult
   * @throws ApiException if fails to make API call
   */
  public PlacesSearchResult searchPlacesByArea(PlacesByAreaRequest placesByAreaRequest, List<String> categoryFilter, String language) throws ApiException {
    ApiResponse<PlacesSearchResult> localVarResponse = searchPlacesByAreaWithHttpInfo(placesByAreaRequest, categoryFilter, language);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for places within a requested area.
   * @param placesByAreaRequest  (required)
   * @param categoryFilter A comma-separated list of place category IDs. Only results having one of these categories will be returned. If no filter is specified, all categories will be returned. However, empty values are not allowed. (optional)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @return ApiResponse&lt;PlacesSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PlacesSearchResult> searchPlacesByAreaWithHttpInfo(PlacesByAreaRequest placesByAreaRequest, List<String> categoryFilter, String language) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchPlacesByAreaRequestBuilder(placesByAreaRequest, categoryFilter, language);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchPlacesByArea", localVarResponse);
        }
        return new ApiResponse<PlacesSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PlacesSearchResult>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder searchPlacesByAreaRequestBuilder(PlacesByAreaRequest placesByAreaRequest, List<String> categoryFilter, String language) throws ApiException {
    // verify the required parameter 'placesByAreaRequest' is set
    if (placesByAreaRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'placesByAreaRequest' when calling searchPlacesByArea");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/places/by-area";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "categoryFilter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "categoryFilter", categoryFilter));
    localVarQueryParameterBaseName = "language";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("language", language));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(placesByAreaRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Searches for places near a given geographical position.
   * @param latitude  (required)
   * @param longitude  (required)
   * @param radius The search radius [m] around the given position. (optional, default to 1000)
   * @param categoryFilter A comma-separated list of place category IDs. Only results having one of these categories will be returned. If no filter is specified, all categories will be returned. However, empty values are not allowed. (optional)
   * @param limit Limits the number of results that are returned. (optional, default to 5)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @return PlacesSearchResult
   * @throws ApiException if fails to make API call
   */
  public PlacesSearchResult searchPlacesByPosition(Double latitude, Double longitude, Integer radius, List<String> categoryFilter, Integer limit, String language) throws ApiException {
    ApiResponse<PlacesSearchResult> localVarResponse = searchPlacesByPositionWithHttpInfo(latitude, longitude, radius, categoryFilter, limit, language);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for places near a given geographical position.
   * @param latitude  (required)
   * @param longitude  (required)
   * @param radius The search radius [m] around the given position. (optional, default to 1000)
   * @param categoryFilter A comma-separated list of place category IDs. Only results having one of these categories will be returned. If no filter is specified, all categories will be returned. However, empty values are not allowed. (optional)
   * @param limit Limits the number of results that are returned. (optional, default to 5)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @return ApiResponse&lt;PlacesSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PlacesSearchResult> searchPlacesByPositionWithHttpInfo(Double latitude, Double longitude, Integer radius, List<String> categoryFilter, Integer limit, String language) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchPlacesByPositionRequestBuilder(latitude, longitude, radius, categoryFilter, limit, language);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchPlacesByPosition", localVarResponse);
        }
        return new ApiResponse<PlacesSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PlacesSearchResult>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder searchPlacesByPositionRequestBuilder(Double latitude, Double longitude, Integer radius, List<String> categoryFilter, Integer limit, String language) throws ApiException {
    // verify the required parameter 'latitude' is set
    if (latitude == null) {
      throw new ApiException(400, "Missing the required parameter 'latitude' when calling searchPlacesByPosition");
    }
    // verify the required parameter 'longitude' is set
    if (longitude == null) {
      throw new ApiException(400, "Missing the required parameter 'longitude' when calling searchPlacesByPosition");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/places/by-position/{latitude}/{longitude}"
        .replace("{latitude}", ApiClient.urlEncode(latitude.toString()))
        .replace("{longitude}", ApiClient.urlEncode(longitude.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "radius";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("radius", radius));
    localVarQueryParameterBaseName = "categoryFilter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "categoryFilter", categoryFilter));
    localVarQueryParameterBaseName = "limit";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));
    localVarQueryParameterBaseName = "language";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("language", language));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Searches for places based on a single-field text input.
   * @param searchText Free-form text input that describes a place. (required)
   * @param categoryFilter A comma-separated list of place category IDs. Only results having one of these categories will be returned. If no filter is specified, all categories will be returned. However, empty values are not allowed. (optional)
   * @param countryFilter A comma-separated list of country codes according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. The search will only consider data from countries with these codes. If no filter is specified, all countries are taken into account. However, empty values are not allowed.     If a given subdivision code is not supported, only the first two digits referring to the country are considered in the search and a **warningCode** &#x60;GEOCODING_COUNTRY_FILTER_MODIFIED&#x60; is returned with the response. (optional)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @param center Defines a circular search context. The format of the &#x60;center&#x60; parameter is a comma-separated pair of double values setting the latitude and longitude, i. e. &#x60;&lt;lat&gt;,&lt;lon&gt;&#x60;. The values for the latitude from south to north between -90 and 90 and for the longitude between -180 and 180 from west to east are in degrees (WGS84/EPSG:4326). A certain radius around the center is considered and this can be adapted by setting the parameter &#x60;radius&#x60; in addition. Note: The parameters &#x60;center&#x60; respectively &#x60;radius&#x60; and &#x60;boundingBox&#x60; (if available) are mutually exclusive. (optional)
   * @param radius The search radius [m] around the given position. (optional, default to 1000)
   * @param boundingBox Defines a rectangular search context. The format of the &#x60;boundingBox&#x60; parameter is a comma-separated list of double values setting the maximum latitude _top_, the minimum longitude _left_, the minimum latitude _bottom_ and the maximum longitude _right_, i. e. &#x60;&lt;top&gt;,&lt;left&gt;,&lt;bottom&gt;,&lt;right&gt;&#x60;. The values for _top_ and _bottom_ from south to north between -90 and 90 as well as for _left_ and _right_ between -180 and 180 from west to east are in degrees (WGS84/EPSG:4326). Note: The parameters &#x60;boundingBox&#x60; and &#x60;center&#x60; respectively &#x60;radius&#x60; are mutually exclusive. (optional)
   * @return PlacesSearchResult
   * @throws ApiException if fails to make API call
   */
  public PlacesSearchResult searchPlacesByText(String searchText, List<String> categoryFilter, List<String> countryFilter, String language, List<Double> center, Integer radius, List<Double> boundingBox) throws ApiException {
    ApiResponse<PlacesSearchResult> localVarResponse = searchPlacesByTextWithHttpInfo(searchText, categoryFilter, countryFilter, language, center, radius, boundingBox);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for places based on a single-field text input.
   * @param searchText Free-form text input that describes a place. (required)
   * @param categoryFilter A comma-separated list of place category IDs. Only results having one of these categories will be returned. If no filter is specified, all categories will be returned. However, empty values are not allowed. (optional)
   * @param countryFilter A comma-separated list of country codes according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. The search will only consider data from countries with these codes. If no filter is specified, all countries are taken into account. However, empty values are not allowed.     If a given subdivision code is not supported, only the first two digits referring to the country are considered in the search and a **warningCode** &#x60;GEOCODING_COUNTRY_FILTER_MODIFIED&#x60; is returned with the response. (optional)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @param center Defines a circular search context. The format of the &#x60;center&#x60; parameter is a comma-separated pair of double values setting the latitude and longitude, i. e. &#x60;&lt;lat&gt;,&lt;lon&gt;&#x60;. The values for the latitude from south to north between -90 and 90 and for the longitude between -180 and 180 from west to east are in degrees (WGS84/EPSG:4326). A certain radius around the center is considered and this can be adapted by setting the parameter &#x60;radius&#x60; in addition. Note: The parameters &#x60;center&#x60; respectively &#x60;radius&#x60; and &#x60;boundingBox&#x60; (if available) are mutually exclusive. (optional)
   * @param radius The search radius [m] around the given position. (optional, default to 1000)
   * @param boundingBox Defines a rectangular search context. The format of the &#x60;boundingBox&#x60; parameter is a comma-separated list of double values setting the maximum latitude _top_, the minimum longitude _left_, the minimum latitude _bottom_ and the maximum longitude _right_, i. e. &#x60;&lt;top&gt;,&lt;left&gt;,&lt;bottom&gt;,&lt;right&gt;&#x60;. The values for _top_ and _bottom_ from south to north between -90 and 90 as well as for _left_ and _right_ between -180 and 180 from west to east are in degrees (WGS84/EPSG:4326). Note: The parameters &#x60;boundingBox&#x60; and &#x60;center&#x60; respectively &#x60;radius&#x60; are mutually exclusive. (optional)
   * @return ApiResponse&lt;PlacesSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PlacesSearchResult> searchPlacesByTextWithHttpInfo(String searchText, List<String> categoryFilter, List<String> countryFilter, String language, List<Double> center, Integer radius, List<Double> boundingBox) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchPlacesByTextRequestBuilder(searchText, categoryFilter, countryFilter, language, center, radius, boundingBox);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchPlacesByText", localVarResponse);
        }
        return new ApiResponse<PlacesSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PlacesSearchResult>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder searchPlacesByTextRequestBuilder(String searchText, List<String> categoryFilter, List<String> countryFilter, String language, List<Double> center, Integer radius, List<Double> boundingBox) throws ApiException {
    // verify the required parameter 'searchText' is set
    if (searchText == null) {
      throw new ApiException(400, "Missing the required parameter 'searchText' when calling searchPlacesByText");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/places/by-text";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "searchText";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("searchText", searchText));
    localVarQueryParameterBaseName = "categoryFilter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "categoryFilter", categoryFilter));
    localVarQueryParameterBaseName = "countryFilter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "countryFilter", countryFilter));
    localVarQueryParameterBaseName = "language";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("language", language));
    localVarQueryParameterBaseName = "center";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "center", center));
    localVarQueryParameterBaseName = "radius";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("radius", radius));
    localVarQueryParameterBaseName = "boundingBox";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "boundingBox", boundingBox));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
