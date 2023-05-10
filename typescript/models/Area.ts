/* tslint:disable */
/* eslint-disable */
/**
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

import { exists, mapValues } from '../runtime';
/**
 * Defines the area as [GeoJSON](https://datatracker.ietf.org/doc/html/rfc7946) geometry. Supported geometry types are Polygon and MultiPolygon. Geometries that cause too long processing times will be rejected. In this case an error response is returned that explains the reason.
 * @export
 * @interface Area
 */
export interface Area {
    /**
     * 
     * @type {string}
     * @memberof Area
     */
    geometry: string;
}

/**
 * Check if a given object implements the Area interface.
 */
export function instanceOfArea(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "geometry" in value;

    return isInstance;
}

export function AreaFromJSON(json: any): Area {
    return AreaFromJSONTyped(json, false);
}

export function AreaFromJSONTyped(json: any, ignoreDiscriminator: boolean): Area {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'geometry': json['geometry'],
    };
}

export function AreaToJSON(value?: Area | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'geometry': value.geometry,
    };
}

