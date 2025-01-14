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

import { mapValues } from '../runtime';
import type { Area } from './Area';
import {
    AreaFromJSON,
    AreaFromJSONTyped,
    AreaToJSON,
} from './Area';

/**
 * 
 * @export
 * @interface PlacesByAreaRequest
 */
export interface PlacesByAreaRequest {
    /**
     * 
     * @type {Area}
     * @memberof PlacesByAreaRequest
     */
    area: Area;
}

/**
 * Check if a given object implements the PlacesByAreaRequest interface.
 */
export function instanceOfPlacesByAreaRequest(value: object): value is PlacesByAreaRequest {
    if (!('area' in value) || value['area'] === undefined) return false;
    return true;
}

export function PlacesByAreaRequestFromJSON(json: any): PlacesByAreaRequest {
    return PlacesByAreaRequestFromJSONTyped(json, false);
}

export function PlacesByAreaRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlacesByAreaRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'area': AreaFromJSON(json['area']),
    };
}

export function PlacesByAreaRequestToJSON(value?: PlacesByAreaRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'area': AreaToJSON(value['area']),
    };
}

