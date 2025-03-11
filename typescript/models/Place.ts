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
import type { RoadAccessPosition } from './RoadAccessPosition';
import {
    RoadAccessPositionFromJSON,
    RoadAccessPositionFromJSONTyped,
    RoadAccessPositionToJSON,
} from './RoadAccessPosition';
import type { Address } from './Address';
import {
    AddressFromJSON,
    AddressFromJSONTyped,
    AddressToJSON,
} from './Address';
import type { Quality } from './Quality';
import {
    QualityFromJSON,
    QualityFromJSONTyped,
    QualityToJSON,
} from './Quality';
import type { ReferencePosition } from './ReferencePosition';
import {
    ReferencePositionFromJSON,
    ReferencePositionFromJSONTyped,
    ReferencePositionToJSON,
} from './ReferencePosition';

/**
 * 
 * @export
 * @interface Place
 */
export interface Place {
    /**
     * 
     * @type {ReferencePosition}
     * @memberof Place
     */
    referencePosition: ReferencePosition;
    /**
     * 
     * @type {RoadAccessPosition}
     * @memberof Place
     */
    roadAccessPosition?: RoadAccessPosition;
    /**
     * 
     * @type {Address}
     * @memberof Place
     */
    address: Address;
    /**
     * A single string representing the address, typically consisting of the street, house number, postal code, city, and country. The precise format may differ based on what is appropriate for the address.
     * @type {string}
     * @memberof Place
     */
    formattedAddress?: string;
    /**
     * A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match. 
     *  
     *  This is experimental and may change at any time in the future.
     * @type {string}
     * @memberof Place
     */
    feedbackId?: string;
    /**
     * The name of the place.
     * @type {string}
     * @memberof Place
     */
    name?: string;
    /**
     * An array of place category IDs representing the categories this place is assigned to.
     * @type {Array<string>}
     * @memberof Place
     */
    categoryIds: Array<string>;
    /**
     * 
     * @type {Quality}
     * @memberof Place
     */
    quality: Quality;
}

/**
 * Check if a given object implements the Place interface.
 */
export function instanceOfPlace(value: object): value is Place {
    if (!('referencePosition' in value) || value['referencePosition'] === undefined) return false;
    if (!('address' in value) || value['address'] === undefined) return false;
    if (!('categoryIds' in value) || value['categoryIds'] === undefined) return false;
    if (!('quality' in value) || value['quality'] === undefined) return false;
    return true;
}

export function PlaceFromJSON(json: any): Place {
    return PlaceFromJSONTyped(json, false);
}

export function PlaceFromJSONTyped(json: any, ignoreDiscriminator: boolean): Place {
    if (json == null) {
        return json;
    }
    return {
        
        'referencePosition': ReferencePositionFromJSON(json['referencePosition']),
        'roadAccessPosition': json['roadAccessPosition'] == null ? undefined : RoadAccessPositionFromJSON(json['roadAccessPosition']),
        'address': AddressFromJSON(json['address']),
        'formattedAddress': json['formattedAddress'] == null ? undefined : json['formattedAddress'],
        'feedbackId': json['feedbackId'] == null ? undefined : json['feedbackId'],
        'name': json['name'] == null ? undefined : json['name'],
        'categoryIds': json['categoryIds'],
        'quality': QualityFromJSON(json['quality']),
    };
}

export function PlaceToJSON(value?: Place | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'referencePosition': ReferencePositionToJSON(value['referencePosition']),
        'roadAccessPosition': RoadAccessPositionToJSON(value['roadAccessPosition']),
        'address': AddressToJSON(value['address']),
        'formattedAddress': value['formattedAddress'],
        'feedbackId': value['feedbackId'],
        'name': value['name'],
        'categoryIds': value['categoryIds'],
        'quality': QualityToJSON(value['quality']),
    };
}

