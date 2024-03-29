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

import { exists, mapValues } from '../runtime';
import type { PlaceCategory } from './PlaceCategory';
import {
    PlaceCategoryFromJSON,
    PlaceCategoryFromJSONTyped,
    PlaceCategoryToJSON,
} from './PlaceCategory';

/**
 * Response type for place category requests.
 * @export
 * @interface PlaceCategories
 */
export interface PlaceCategories {
    /**
     * The individual place categories.
     * @type {Array<PlaceCategory>}
     * @memberof PlaceCategories
     */
    placeCategories?: Array<PlaceCategory>;
}

/**
 * Check if a given object implements the PlaceCategories interface.
 */
export function instanceOfPlaceCategories(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function PlaceCategoriesFromJSON(json: any): PlaceCategories {
    return PlaceCategoriesFromJSONTyped(json, false);
}

export function PlaceCategoriesFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlaceCategories {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'placeCategories': !exists(json, 'placeCategories') ? undefined : ((json['placeCategories'] as Array<any>).map(PlaceCategoryFromJSON)),
    };
}

export function PlaceCategoriesToJSON(value?: PlaceCategories | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'placeCategories': value.placeCategories === undefined ? undefined : ((value.placeCategories as Array<any>).map(PlaceCategoryToJSON)),
    };
}

