/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * The actual position of the object itself, such as the rooftop of a building, the center of a street, or the reference position of a city.
 * @export
 * @interface ReferencePosition
 */
export interface ReferencePosition {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof ReferencePosition
     */
    latitude: number;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof ReferencePosition
     */
    longitude: number;
}

/**
 * Check if a given object implements the ReferencePosition interface.
 */
export function instanceOfReferencePosition(value: object): value is ReferencePosition {
    if (!('latitude' in value) || value['latitude'] === undefined) return false;
    if (!('longitude' in value) || value['longitude'] === undefined) return false;
    return true;
}

export function ReferencePositionFromJSON(json: any): ReferencePosition {
    return ReferencePositionFromJSONTyped(json, false);
}

export function ReferencePositionFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReferencePosition {
    if (json == null) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
    };
}

export function ReferencePositionToJSON(value?: ReferencePosition | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'latitude': value['latitude'],
        'longitude': value['longitude'],
    };
}

