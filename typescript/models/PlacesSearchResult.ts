/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.15
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
import type { Place } from './Place';
import {
    PlaceFromJSON,
    PlaceFromJSONTyped,
    PlaceToJSON,
} from './Place';

/**
 * The result of a places search.
 * @export
 * @interface PlacesSearchResult
 */
export interface PlacesSearchResult {
    /**
     * The places which where found.
     * @type {Array<Place>}
     * @memberof PlacesSearchResult
     */
    places?: Array<Place>;
    /**
     * A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match. 
     *  
     *  This is experimental and may change at any time in the future.
     * @type {string}
     * @memberof PlacesSearchResult
     */
    noMatchFeedbackId?: string;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof PlacesSearchResult
     */
    warnings?: Array<Warning>;
}

/**
 * Check if a given object implements the PlacesSearchResult interface.
 */
export function instanceOfPlacesSearchResult(value: object): value is PlacesSearchResult {
    return true;
}

export function PlacesSearchResultFromJSON(json: any): PlacesSearchResult {
    return PlacesSearchResultFromJSONTyped(json, false);
}

export function PlacesSearchResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlacesSearchResult {
    if (json == null) {
        return json;
    }
    return {
        
        'places': json['places'] == null ? undefined : ((json['places'] as Array<any>).map(PlaceFromJSON)),
        'noMatchFeedbackId': json['noMatchFeedbackId'] == null ? undefined : json['noMatchFeedbackId'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function PlacesSearchResultToJSON(value?: PlacesSearchResult | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'places': value['places'] == null ? undefined : ((value['places'] as Array<any>).map(PlaceToJSON)),
        'noMatchFeedbackId': value['noMatchFeedbackId'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(WarningToJSON)),
    };
}

