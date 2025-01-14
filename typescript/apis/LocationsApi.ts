/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  ErrorResponse,
  InputField,
  LocationsSearchResult,
  Results,
  SuggestionsByAddressResponse,
  SuggestionsByTextResponse,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    InputFieldFromJSON,
    InputFieldToJSON,
    LocationsSearchResultFromJSON,
    LocationsSearchResultToJSON,
    ResultsFromJSON,
    ResultsToJSON,
    SuggestionsByAddressResponseFromJSON,
    SuggestionsByAddressResponseToJSON,
    SuggestionsByTextResponseFromJSON,
    SuggestionsByTextResponseToJSON,
} from '../models/index';

export interface GetSuggestionsByAddressRequest {
    inputField: InputField;
    country?: string;
    state?: string;
    locality?: string;
    postalCode?: string;
    street?: string;
    houseNumber?: string;
}

export interface GetSuggestionsByTextRequest {
    searchText: string;
    countryFilter?: Array<string>;
    center?: Array<number>;
}

export interface SearchLocationsByAddressRequest {
    country?: string;
    state?: string;
    locality?: string;
    postalCode?: string;
    street?: string;
    houseNumber?: string;
    countryFilter?: Array<string>;
    language?: string;
    results?: Array<Results>;
}

export interface SearchLocationsByPositionRequest {
    latitude: number;
    longitude: number;
    language?: string;
}

export interface SearchLocationsByTextRequest {
    searchText: string;
    countryFilter?: Array<string>;
    language?: string;
    results?: Array<Results>;
    cleanInput?: boolean;
}

/**
 * 
 */
export class LocationsApi extends runtime.BaseAPI {

    /**
     * Gets suggestions for the address input of the searchLocationsByAddress endpoint.
     */
    async getSuggestionsByAddressRaw(requestParameters: GetSuggestionsByAddressRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<SuggestionsByAddressResponse>> {
        if (requestParameters['inputField'] == null) {
            throw new runtime.RequiredError(
                'inputField',
                'Required parameter "inputField" was null or undefined when calling getSuggestionsByAddress().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['country'] != null) {
            queryParameters['country'] = requestParameters['country'];
        }

        if (requestParameters['state'] != null) {
            queryParameters['state'] = requestParameters['state'];
        }

        if (requestParameters['locality'] != null) {
            queryParameters['locality'] = requestParameters['locality'];
        }

        if (requestParameters['postalCode'] != null) {
            queryParameters['postalCode'] = requestParameters['postalCode'];
        }

        if (requestParameters['street'] != null) {
            queryParameters['street'] = requestParameters['street'];
        }

        if (requestParameters['houseNumber'] != null) {
            queryParameters['houseNumber'] = requestParameters['houseNumber'];
        }

        if (requestParameters['inputField'] != null) {
            queryParameters['inputField'] = requestParameters['inputField'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/suggestions/by-address`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => SuggestionsByAddressResponseFromJSON(jsonValue));
    }

    /**
     * Gets suggestions for the address input of the searchLocationsByAddress endpoint.
     */
    async getSuggestionsByAddress(requestParameters: GetSuggestionsByAddressRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<SuggestionsByAddressResponse> {
        const response = await this.getSuggestionsByAddressRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Gets suggestions for the input of the searchLocationsByText endpoint.  This method is in a preview state. It is stable, but feature changes could be introduced in the future.
     */
    async getSuggestionsByTextRaw(requestParameters: GetSuggestionsByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<SuggestionsByTextResponse>> {
        if (requestParameters['searchText'] == null) {
            throw new runtime.RequiredError(
                'searchText',
                'Required parameter "searchText" was null or undefined when calling getSuggestionsByText().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['searchText'] != null) {
            queryParameters['searchText'] = requestParameters['searchText'];
        }

        if (requestParameters['countryFilter'] != null) {
            queryParameters['countryFilter'] = requestParameters['countryFilter']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['center'] != null) {
            queryParameters['center'] = requestParameters['center']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/suggestions/by-text`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => SuggestionsByTextResponseFromJSON(jsonValue));
    }

    /**
     * Gets suggestions for the input of the searchLocationsByText endpoint.  This method is in a preview state. It is stable, but feature changes could be introduced in the future.
     */
    async getSuggestionsByText(requestParameters: GetSuggestionsByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<SuggestionsByTextResponse> {
        const response = await this.getSuggestionsByTextRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Searches for locations based on a multi-field address input.
     */
    async searchLocationsByAddressRaw(requestParameters: SearchLocationsByAddressRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LocationsSearchResult>> {
        const queryParameters: any = {};

        if (requestParameters['country'] != null) {
            queryParameters['country'] = requestParameters['country'];
        }

        if (requestParameters['state'] != null) {
            queryParameters['state'] = requestParameters['state'];
        }

        if (requestParameters['locality'] != null) {
            queryParameters['locality'] = requestParameters['locality'];
        }

        if (requestParameters['postalCode'] != null) {
            queryParameters['postalCode'] = requestParameters['postalCode'];
        }

        if (requestParameters['street'] != null) {
            queryParameters['street'] = requestParameters['street'];
        }

        if (requestParameters['houseNumber'] != null) {
            queryParameters['houseNumber'] = requestParameters['houseNumber'];
        }

        if (requestParameters['countryFilter'] != null) {
            queryParameters['countryFilter'] = requestParameters['countryFilter']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['language'] != null) {
            queryParameters['language'] = requestParameters['language'];
        }

        if (requestParameters['results'] != null) {
            queryParameters['results'] = requestParameters['results']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/locations/by-address`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LocationsSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for locations based on a multi-field address input.
     */
    async searchLocationsByAddress(requestParameters: SearchLocationsByAddressRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LocationsSearchResult> {
        const response = await this.searchLocationsByAddressRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Searches for locations near a given geographical position.
     */
    async searchLocationsByPositionRaw(requestParameters: SearchLocationsByPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LocationsSearchResult>> {
        if (requestParameters['latitude'] == null) {
            throw new runtime.RequiredError(
                'latitude',
                'Required parameter "latitude" was null or undefined when calling searchLocationsByPosition().'
            );
        }

        if (requestParameters['longitude'] == null) {
            throw new runtime.RequiredError(
                'longitude',
                'Required parameter "longitude" was null or undefined when calling searchLocationsByPosition().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['language'] != null) {
            queryParameters['language'] = requestParameters['language'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/locations/by-position/{latitude}/{longitude}`.replace(`{${"latitude"}}`, encodeURIComponent(String(requestParameters['latitude']))).replace(`{${"longitude"}}`, encodeURIComponent(String(requestParameters['longitude']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LocationsSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for locations near a given geographical position.
     */
    async searchLocationsByPosition(requestParameters: SearchLocationsByPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LocationsSearchResult> {
        const response = await this.searchLocationsByPositionRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Searches for locations based on a single-field text input.
     */
    async searchLocationsByTextRaw(requestParameters: SearchLocationsByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LocationsSearchResult>> {
        if (requestParameters['searchText'] == null) {
            throw new runtime.RequiredError(
                'searchText',
                'Required parameter "searchText" was null or undefined when calling searchLocationsByText().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['searchText'] != null) {
            queryParameters['searchText'] = requestParameters['searchText'];
        }

        if (requestParameters['countryFilter'] != null) {
            queryParameters['countryFilter'] = requestParameters['countryFilter']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['language'] != null) {
            queryParameters['language'] = requestParameters['language'];
        }

        if (requestParameters['results'] != null) {
            queryParameters['results'] = requestParameters['results']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['cleanInput'] != null) {
            queryParameters['cleanInput'] = requestParameters['cleanInput'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/locations/by-text`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LocationsSearchResultFromJSON(jsonValue));
    }

    /**
     * Searches for locations based on a single-field text input.
     */
    async searchLocationsByText(requestParameters: SearchLocationsByTextRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LocationsSearchResult> {
        const response = await this.searchLocationsByTextRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
