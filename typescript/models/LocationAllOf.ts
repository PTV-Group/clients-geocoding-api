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
import type { LocationType } from './LocationType';
import {
    LocationTypeFromJSON,
    LocationTypeFromJSONTyped,
    LocationTypeToJSON,
} from './LocationType';
import type { Quality } from './Quality';
import {
    QualityFromJSON,
    QualityFromJSONTyped,
    QualityToJSON,
} from './Quality';

/**
 * 
 * @export
 * @interface LocationAllOf
 */
export interface LocationAllOf {
    /**
     * 
     * @type {LocationType}
     * @memberof LocationAllOf
     */
    locationType: LocationType;
    /**
     * 
     * @type {Quality}
     * @memberof LocationAllOf
     */
    quality: Quality;
}

/**
 * Check if a given object implements the LocationAllOf interface.
 */
export function instanceOfLocationAllOf(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "locationType" in value;
    isInstance = isInstance && "quality" in value;

    return isInstance;
}

export function LocationAllOfFromJSON(json: any): LocationAllOf {
    return LocationAllOfFromJSONTyped(json, false);
}

export function LocationAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): LocationAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'locationType': LocationTypeFromJSON(json['locationType']),
        'quality': QualityFromJSON(json['quality']),
    };
}

export function LocationAllOfToJSON(value?: LocationAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'locationType': LocationTypeToJSON(value.locationType),
        'quality': QualityToJSON(value.quality),
    };
}

