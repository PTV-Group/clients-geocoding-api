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
import type { AddressScores } from './AddressScores';
import {
    AddressScoresFromJSON,
    AddressScoresFromJSONTyped,
    AddressScoresToJSON,
} from './AddressScores';

/**
 * Quality indicators that help deciding how well a result fits to the search input.
 * @export
 * @interface Quality
 */
export interface Quality {
    /**
     * The spatial distance in \[m\] between the location or the place and the input of a position search.  
     *  This is only available for **searchLocationsByPosition** and **searchPlacesByPosition**.
     * @type {number}
     * @memberof Quality
     */
    distance?: number | null;
    /**
     * An overall score in \[%\] for address searches. 100 percent represents a perfect match between the input and the result.  
     *  This is only available for **searchLocationsByText** and **searchLocationsByAddress** results.
     * @type {number}
     * @memberof Quality
     */
    totalScore?: number | null;
    /**
     * 
     * @type {AddressScores}
     * @memberof Quality
     */
    addressScores?: AddressScores;
}

/**
 * Check if a given object implements the Quality interface.
 */
export function instanceOfQuality(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function QualityFromJSON(json: any): Quality {
    return QualityFromJSONTyped(json, false);
}

export function QualityFromJSONTyped(json: any, ignoreDiscriminator: boolean): Quality {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'distance': !exists(json, 'distance') ? undefined : json['distance'],
        'totalScore': !exists(json, 'totalScore') ? undefined : json['totalScore'],
        'addressScores': !exists(json, 'addressScores') ? undefined : AddressScoresFromJSON(json['addressScores']),
    };
}

export function QualityToJSON(value?: Quality | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'distance': value.distance,
        'totalScore': value.totalScore,
        'addressScores': AddressScoresToJSON(value.addressScores),
    };
}

