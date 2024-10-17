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
  PlaceCategories,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    PlaceCategoriesFromJSON,
    PlaceCategoriesToJSON,
} from '../models/index';

/**
 * 
 */
export class CategoriesApi extends runtime.BaseAPI {

    /**
     * Returns the list of place categories.
     */
    async getPlaceCategoriesRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PlaceCategories>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/place-categories`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlaceCategoriesFromJSON(jsonValue));
    }

    /**
     * Returns the list of place categories.
     */
    async getPlaceCategories(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PlaceCategories> {
        const response = await this.getPlaceCategoriesRaw(initOverrides);
        return await response.value();
    }

}
