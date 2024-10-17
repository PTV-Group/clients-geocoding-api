/* tslint:disable */
/* eslint-disable */
/**
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


import * as runtime from '../runtime';
import type {
  ErrorResponse,
  PlacesByAreaRequest,
  PlacesSearchResult,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    PlacesByAreaRequestFromJSON,
    PlacesByAreaRequestToJSON,
    PlacesSearchResultFromJSON,
    PlacesSearchResultToJSON,
} from '../models/index';

export interface SearchPlacesByAreaRequest {
    placesByAreaRequest: PlacesByAreaRequest;
    categoryFilter?: Array<string>;
    language?: string;
}

export interface SearchPlacesByPositionRequest {
    latitude: number;
    longitude: number;
    radius?: number;
    categoryFilter?: Array<string>;
    limit?: number;
    language?: string;
}

export interface SearchPlacesByTextRequest {
    searchText: string;
    categoryFilter?: Array<string>;
    countryFilter?: Array<string>;
    language?: string;
    center?: Array<number>;
    radius?: number;
    boundingBox?: Array<number>;
}

/**
 * 
 */
export class PlacesApi extends runtime.BaseAPI {

    /**
     * Searches for places within a requested area.
     */
    async searchPlacesByAreaRaw(requestParameters: SearchPlacesByAreaRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PlacesSearchResult>> {
        if (requestParameters['placesByAreaRequest'] == null) {
            throw new runtime.RequiredError(
                'placesByAreaRequest',
                'Required parameter "placesByAreaRequest" was null or undefined when calling searchPlacesByArea().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['categoryFilter'] != null) {
            queryParameters['categoryFilter'] = requestParameters['categoryFilter']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['language'] != null) {
            queryParameters['language'] = requestParameters['language'];
        }

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/places/by-area`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: PlacesByAreaRequestToJSON(requestParameters['placesByAreaRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlacesSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for places within a requested area.
     */
    async searchPlacesByArea(requestParameters: SearchPlacesByAreaRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PlacesSearchResult> {
        const response = await this.searchPlacesByAreaRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Searches for places near a given geographical position.
     */
    async searchPlacesByPositionRaw(requestParameters: SearchPlacesByPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PlacesSearchResult>> {
        if (requestParameters['latitude'] == null) {
            throw new runtime.RequiredError(
                'latitude',
                'Required parameter "latitude" was null or undefined when calling searchPlacesByPosition().'
            );
        }

        if (requestParameters['longitude'] == null) {
            throw new runtime.RequiredError(
                'longitude',
                'Required parameter "longitude" was null or undefined when calling searchPlacesByPosition().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['radius'] != null) {
            queryParameters['radius'] = requestParameters['radius'];
        }

        if (requestParameters['categoryFilter'] != null) {
            queryParameters['categoryFilter'] = requestParameters['categoryFilter']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['limit'] != null) {
            queryParameters['limit'] = requestParameters['limit'];
        }

        if (requestParameters['language'] != null) {
            queryParameters['language'] = requestParameters['language'];
        }

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/places/by-position/{latitude}/{longitude}`.replace(`{${"latitude"}}`, encodeURIComponent(String(requestParameters['latitude']))).replace(`{${"longitude"}}`, encodeURIComponent(String(requestParameters['longitude']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlacesSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for places near a given geographical position.
     */
    async searchPlacesByPosition(requestParameters: SearchPlacesByPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PlacesSearchResult> {
        const response = await this.searchPlacesByPositionRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Searches for places based on a single-field text input.
     */
    async searchPlacesByTextRaw(requestParameters: SearchPlacesByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PlacesSearchResult>> {
        if (requestParameters['searchText'] == null) {
            throw new runtime.RequiredError(
                'searchText',
                'Required parameter "searchText" was null or undefined when calling searchPlacesByText().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['searchText'] != null) {
            queryParameters['searchText'] = requestParameters['searchText'];
        }

        if (requestParameters['categoryFilter'] != null) {
            queryParameters['categoryFilter'] = requestParameters['categoryFilter']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['countryFilter'] != null) {
            queryParameters['countryFilter'] = requestParameters['countryFilter']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['language'] != null) {
            queryParameters['language'] = requestParameters['language'];
        }

        if (requestParameters['center'] != null) {
            queryParameters['center'] = requestParameters['center']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['radius'] != null) {
            queryParameters['radius'] = requestParameters['radius'];
        }

        if (requestParameters['boundingBox'] != null) {
            queryParameters['boundingBox'] = requestParameters['boundingBox']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/places/by-text`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlacesSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for places based on a single-field text input.
     */
    async searchPlacesByText(requestParameters: SearchPlacesByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PlacesSearchResult> {
        const response = await this.searchPlacesByTextRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
