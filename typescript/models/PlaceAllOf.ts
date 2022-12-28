/* tslint:disable */
/* eslint-disable */
/**
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

import { exists, mapValues } from '../runtime';
import type { Quality } from './Quality';
import {
    QualityFromJSON,
    QualityFromJSONTyped,
    QualityToJSON,
} from './Quality';

/**
 * 
 * @export
 * @interface PlaceAllOf
 */
export interface PlaceAllOf {
    /**
     * The name of the place.
     * @type {string}
     * @memberof PlaceAllOf
     */
    name?: string;
    /**
     * An array of place category IDs representing the categories this place is assigned to.
     * @type {Array<string>}
     * @memberof PlaceAllOf
     */
    categoryIds: Array<string>;
    /**
     * 
     * @type {Quality}
     * @memberof PlaceAllOf
     */
    quality: Quality;
}

/**
 * Check if a given object implements the PlaceAllOf interface.
 */
export function instanceOfPlaceAllOf(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "categoryIds" in value;
    isInstance = isInstance && "quality" in value;

    return isInstance;
}

export function PlaceAllOfFromJSON(json: any): PlaceAllOf {
    return PlaceAllOfFromJSONTyped(json, false);
}

export function PlaceAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlaceAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'name': !exists(json, 'name') ? undefined : json['name'],
        'categoryIds': json['categoryIds'],
        'quality': QualityFromJSON(json['quality']),
    };
}

export function PlaceAllOfToJSON(value?: PlaceAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'name': value.name,
        'categoryIds': value.categoryIds,
        'quality': QualityToJSON(value.quality),
    };
}

