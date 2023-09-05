/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * A position on or very close to a road that marks the entry to the object. Available only for objects which represent buildings with a complete address and only if present in the data.  
 *  The road from which the object can be accessed is not necessarily the road which is closest to the object.
 * @export
 * @interface RoadAccessPosition
 */
export interface RoadAccessPosition {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof RoadAccessPosition
     */
    latitude: number;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof RoadAccessPosition
     */
    longitude: number;
}

/**
 * Check if a given object implements the RoadAccessPosition interface.
 */
export function instanceOfRoadAccessPosition(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "latitude" in value;
    isInstance = isInstance && "longitude" in value;

    return isInstance;
}

export function RoadAccessPositionFromJSON(json: any): RoadAccessPosition {
    return RoadAccessPositionFromJSONTyped(json, false);
}

export function RoadAccessPositionFromJSONTyped(json: any, ignoreDiscriminator: boolean): RoadAccessPosition {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
    };
}

export function RoadAccessPositionToJSON(value?: RoadAccessPosition | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
    };
}

