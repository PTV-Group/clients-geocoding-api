/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { Warning } from './Warning';
import {
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';
import type { Location } from './Location';
import {
    LocationFromJSON,
    LocationFromJSONTyped,
    LocationToJSON,
} from './Location';

/**
 * The result of a locations search.
 * @export
 * @interface LocationsSearchResult
 */
export interface LocationsSearchResult {
    /**
     * The found locations.
     * @type {Array<Location>}
     * @memberof LocationsSearchResult
     */
    locations: Array<Location>;
    /**
     * A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match. 
     *  
     *  This is experimental and may change at any time in the future.
     * @type {string}
     * @memberof LocationsSearchResult
     */
    noMatchFeedbackId?: string;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof LocationsSearchResult
     */
    warnings?: Array<Warning>;
}

/**
 * Check if a given object implements the LocationsSearchResult interface.
 */
export function instanceOfLocationsSearchResult(value: object): value is LocationsSearchResult {
    if (!('locations' in value) || value['locations'] === undefined) return false;
    return true;
}

export function LocationsSearchResultFromJSON(json: any): LocationsSearchResult {
    return LocationsSearchResultFromJSONTyped(json, false);
}

export function LocationsSearchResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): LocationsSearchResult {
    if (json == null) {
        return json;
    }
    return {
        
        'locations': ((json['locations'] as Array<any>).map(LocationFromJSON)),
        'noMatchFeedbackId': json['noMatchFeedbackId'] == null ? undefined : json['noMatchFeedbackId'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function LocationsSearchResultToJSON(value?: LocationsSearchResult | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'locations': ((value['locations'] as Array<any>).map(LocationToJSON)),
        'noMatchFeedbackId': value['noMatchFeedbackId'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(WarningToJSON)),
    };
}

