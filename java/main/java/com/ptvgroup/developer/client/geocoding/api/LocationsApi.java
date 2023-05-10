/*
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.7
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
import com.ptvgroup.developer.client.geocoding.model.InputField;
import com.ptvgroup.developer.client.geocoding.model.LocationsSearchResult;
import com.ptvgroup.developer.client.geocoding.model.Results;
import com.ptvgroup.developer.client.geocoding.model.SuggestionsByAddressResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-10T09:35:50.309031Z[Etc/UTC]")
public class LocationsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public LocationsApi() {
    this(new ApiClient());
  }

  public LocationsApi(ApiClient apiClient) {
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
   * Gets suggestions for the address input of the searchLocationsByAddress endpoint.
   * @param inputField Used to specify for which parameter of the suggestions/by-address request a suggestion is desired. (required)
   * @param country The country or its initial characters to which the suggestion search is limited. A country may be defined by name, ISO code (ISO 3166-1 alpha-2 or alpha-3) or country code plate. (optional)
   * @param state The state or its initial characters to which the suggestion search is limited. A state is a subdivision of a country, for example a real state, a region or a province. (optional)
   * @param locality The locality or its initial characters to which the suggestion search is limited. The locality may be a city, a district or subdistrict. (optional)
   * @param postalCode The postal code or zip-code or its initial characters to which the suggestion search is limited. (optional)
   * @param street The name of the road or its initial characters to which the suggestion search is limited. It must not contain additional information like building names, floor numbers or apartment numbers. (optional)
   * @param houseNumber The exact house number to which the suggestion search is limited. (optional)
   * @return SuggestionsByAddressResponse
   * @throws ApiException if fails to make API call
   */
  public SuggestionsByAddressResponse getSuggestionsByAddress(InputField inputField, String country, String state, String locality, String postalCode, String street, String houseNumber) throws ApiException {
    ApiResponse<SuggestionsByAddressResponse> localVarResponse = getSuggestionsByAddressWithHttpInfo(inputField, country, state, locality, postalCode, street, houseNumber);
    return localVarResponse.getData();
  }

  /**
   * 
   * Gets suggestions for the address input of the searchLocationsByAddress endpoint.
   * @param inputField Used to specify for which parameter of the suggestions/by-address request a suggestion is desired. (required)
   * @param country The country or its initial characters to which the suggestion search is limited. A country may be defined by name, ISO code (ISO 3166-1 alpha-2 or alpha-3) or country code plate. (optional)
   * @param state The state or its initial characters to which the suggestion search is limited. A state is a subdivision of a country, for example a real state, a region or a province. (optional)
   * @param locality The locality or its initial characters to which the suggestion search is limited. The locality may be a city, a district or subdistrict. (optional)
   * @param postalCode The postal code or zip-code or its initial characters to which the suggestion search is limited. (optional)
   * @param street The name of the road or its initial characters to which the suggestion search is limited. It must not contain additional information like building names, floor numbers or apartment numbers. (optional)
   * @param houseNumber The exact house number to which the suggestion search is limited. (optional)
   * @return ApiResponse&lt;SuggestionsByAddressResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SuggestionsByAddressResponse> getSuggestionsByAddressWithHttpInfo(InputField inputField, String country, String state, String locality, String postalCode, String street, String houseNumber) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSuggestionsByAddressRequestBuilder(inputField, country, state, locality, postalCode, street, houseNumber);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSuggestionsByAddress", localVarResponse);
        }
        return new ApiResponse<SuggestionsByAddressResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SuggestionsByAddressResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder getSuggestionsByAddressRequestBuilder(InputField inputField, String country, String state, String locality, String postalCode, String street, String houseNumber) throws ApiException {
    // verify the required parameter 'inputField' is set
    if (inputField == null) {
      throw new ApiException(400, "Missing the required parameter 'inputField' when calling getSuggestionsByAddress");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/suggestions/by-address";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "state";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("state", state));
    localVarQueryParameterBaseName = "locality";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("locality", locality));
    localVarQueryParameterBaseName = "postalCode";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("postalCode", postalCode));
    localVarQueryParameterBaseName = "street";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("street", street));
    localVarQueryParameterBaseName = "houseNumber";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("houseNumber", houseNumber));
    localVarQueryParameterBaseName = "inputField";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("inputField", inputField));

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
   * Searches for locations based on a multi-field address input.
   * @param country The country in which the locations should be searched. A country may be defined by name, ISO code (ISO 3166-1 alpha-2 or alpha-3) or country code plate. (optional)
   * @param state A subdivision of a country, for example a state, a region or a province. Using this field narrows down the search and reduces the number of possible results. (optional)
   * @param locality The locality of the address, which may be a city, a district or subdistrict. (optional)
   * @param postalCode The postal code, or zip-code, which is used by a postal authority of a country to identify where the address is located. (optional)
   * @param street The name of the road where the address is located. It must not contain additional information like building names, floor numbers or apartment numbers. It may contain a house number, but using the **houseNumber** field instead will lead to better results. (optional)
   * @param houseNumber The house number of the address. (optional)
   * @param countryFilter A comma-separated list of country codes according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. The search will only consider data from countries with these codes. If no filter is specified, all countries are taken into account. However, empty values are not allowed.     If a given subdivision code is not supported, only the first two digits referring to the country are considered in the search and a **warningCode** &#x60;GEOCODING_COUNTRY_FILTER_MODIFIED&#x60; is returned with the response. (optional
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @param results Comma-separated list that defines which results will be returned.  * _ADDRESS_SCORES_  Populate Location.quality.addressScores. (optional
   * @return LocationsSearchResult
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResult searchLocationsByAddress(String country, String state, String locality, String postalCode, String street, String houseNumber, List<String> countryFilter, String language, List<Results> results) throws ApiException {
    ApiResponse<LocationsSearchResult> localVarResponse = searchLocationsByAddressWithHttpInfo(country, state, locality, postalCode, street, houseNumber, countryFilter, language, results);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for locations based on a multi-field address input.
   * @param country The country in which the locations should be searched. A country may be defined by name, ISO code (ISO 3166-1 alpha-2 or alpha-3) or country code plate. (optional)
   * @param state A subdivision of a country, for example a state, a region or a province. Using this field narrows down the search and reduces the number of possible results. (optional)
   * @param locality The locality of the address, which may be a city, a district or subdistrict. (optional)
   * @param postalCode The postal code, or zip-code, which is used by a postal authority of a country to identify where the address is located. (optional)
   * @param street The name of the road where the address is located. It must not contain additional information like building names, floor numbers or apartment numbers. It may contain a house number, but using the **houseNumber** field instead will lead to better results. (optional)
   * @param houseNumber The house number of the address. (optional)
   * @param countryFilter A comma-separated list of country codes according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. The search will only consider data from countries with these codes. If no filter is specified, all countries are taken into account. However, empty values are not allowed.     If a given subdivision code is not supported, only the first two digits referring to the country are considered in the search and a **warningCode** &#x60;GEOCODING_COUNTRY_FILTER_MODIFIED&#x60; is returned with the response. (optional
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @param results Comma-separated list that defines which results will be returned.  * _ADDRESS_SCORES_  Populate Location.quality.addressScores. (optional
   * @return ApiResponse&lt;LocationsSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResult> searchLocationsByAddressWithHttpInfo(String country, String state, String locality, String postalCode, String street, String houseNumber, List<String> countryFilter, String language, List<Results> results) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchLocationsByAddressRequestBuilder(country, state, locality, postalCode, street, houseNumber, countryFilter, language, results);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchLocationsByAddress", localVarResponse);
        }
        return new ApiResponse<LocationsSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<LocationsSearchResult>() {}) // closes the InputStream
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

  private HttpRequest.Builder searchLocationsByAddressRequestBuilder(String country, String state, String locality, String postalCode, String street, String houseNumber, List<String> countryFilter, String language, List<Results> results) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/locations/by-address";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "state";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("state", state));
    localVarQueryParameterBaseName = "locality";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("locality", locality));
    localVarQueryParameterBaseName = "postalCode";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("postalCode", postalCode));
    localVarQueryParameterBaseName = "street";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("street", street));
    localVarQueryParameterBaseName = "houseNumber";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("houseNumber", houseNumber));
    localVarQueryParameterBaseName = "countryFilter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "countryFilter", countryFilter));
    localVarQueryParameterBaseName = "language";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("language", language));
    localVarQueryParameterBaseName = "results";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "results", results));

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
   * Searches for locations near a given geographical position.
   * @param latitude  (required)
   * @param longitude  (required)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @return LocationsSearchResult
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResult searchLocationsByPosition(Double latitude, Double longitude, String language) throws ApiException {
    ApiResponse<LocationsSearchResult> localVarResponse = searchLocationsByPositionWithHttpInfo(latitude, longitude, language);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for locations near a given geographical position.
   * @param latitude  (required)
   * @param longitude  (required)
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @return ApiResponse&lt;LocationsSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResult> searchLocationsByPositionWithHttpInfo(Double latitude, Double longitude, String language) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchLocationsByPositionRequestBuilder(latitude, longitude, language);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchLocationsByPosition", localVarResponse);
        }
        return new ApiResponse<LocationsSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<LocationsSearchResult>() {}) // closes the InputStream
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

  private HttpRequest.Builder searchLocationsByPositionRequestBuilder(Double latitude, Double longitude, String language) throws ApiException {
    // verify the required parameter 'latitude' is set
    if (latitude == null) {
      throw new ApiException(400, "Missing the required parameter 'latitude' when calling searchLocationsByPosition");
    }
    // verify the required parameter 'longitude' is set
    if (longitude == null) {
      throw new ApiException(400, "Missing the required parameter 'longitude' when calling searchLocationsByPosition");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/locations/by-position/{latitude}/{longitude}"
        .replace("{latitude}", ApiClient.urlEncode(latitude.toString()))
        .replace("{longitude}", ApiClient.urlEncode(longitude.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
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
   * Searches for locations based on a single-field text input.
   * @param searchText Free-form text input that describes a location. (required)
   * @param countryFilter A comma-separated list of country codes according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. The search will only consider data from countries with these codes. If no filter is specified, all countries are taken into account. However, empty values are not allowed.     If a given subdivision code is not supported, only the first two digits referring to the country are considered in the search and a **warningCode** &#x60;GEOCODING_COUNTRY_FILTER_MODIFIED&#x60; is returned with the response. (optional
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @param results Comma-separated list that defines which results will be returned.  * _ADDRESS_SCORES_  Populate Location.quality.addressScores. (optional
   * @return LocationsSearchResult
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResult searchLocationsByText(String searchText, List<String> countryFilter, String language, List<Results> results) throws ApiException {
    ApiResponse<LocationsSearchResult> localVarResponse = searchLocationsByTextWithHttpInfo(searchText, countryFilter, language, results);
    return localVarResponse.getData();
  }

  /**
   * 
   * Searches for locations based on a single-field text input.
   * @param searchText Free-form text input that describes a location. (required)
   * @param countryFilter A comma-separated list of country codes according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. The search will only consider data from countries with these codes. If no filter is specified, all countries are taken into account. However, empty values are not allowed.     If a given subdivision code is not supported, only the first two digits referring to the country are considered in the search and a **warningCode** &#x60;GEOCODING_COUNTRY_FILTER_MODIFIED&#x60; is returned with the response. (optional
   * @param language The preferred language for the response formatted according to [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) for languages or [BCP47](https://tools.ietf.org/html/bcp47) for language variants. By default the service uses the language spoken in the country or region of the result. In case the given preferred language is not available in the data, the default language is used. (optional)
   * @param results Comma-separated list that defines which results will be returned.  * _ADDRESS_SCORES_  Populate Location.quality.addressScores. (optional
   * @return ApiResponse&lt;LocationsSearchResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResult> searchLocationsByTextWithHttpInfo(String searchText, List<String> countryFilter, String language, List<Results> results) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchLocationsByTextRequestBuilder(searchText, countryFilter, language, results);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchLocationsByText", localVarResponse);
        }
        return new ApiResponse<LocationsSearchResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<LocationsSearchResult>() {}) // closes the InputStream
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

  private HttpRequest.Builder searchLocationsByTextRequestBuilder(String searchText, List<String> countryFilter, String language, List<Results> results) throws ApiException {
    // verify the required parameter 'searchText' is set
    if (searchText == null) {
      throw new ApiException(400, "Missing the required parameter 'searchText' when calling searchLocationsByText");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/locations/by-text";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "searchText";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("searchText", searchText));
    localVarQueryParameterBaseName = "countryFilter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "countryFilter", countryFilter));
    localVarQueryParameterBaseName = "language";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("language", language));
    localVarQueryParameterBaseName = "results";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "results", results));

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
