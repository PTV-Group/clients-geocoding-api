/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Quality indicators that help deciding how well a result fits to the search input.
 * @export
 * @interface AddressScores
 */
export interface AddressScores {
    /**
     * The score for the returned country in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    country?: number;
    /**
     * The score for the returned state in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    state?: number;
    /**
     * The score for the returned province in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    province?: number;
    /**
     * The score for the returned postalCode in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    postalCode?: number;
    /**
     * The score for the returned city in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    city?: number;
    /**
     * The score for the returned district in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    district?: number;
    /**
     * The score for the returned subdistrict in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    subDistrict?: number;
    /**
     * The score for the returned street in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    street?: number;
    /**
     * The score for the returned house number in \[%\].
     * @type {number}
     * @memberof AddressScores
     */
    houseNumber?: number;
}

/**
 * Check if a given object implements the AddressScores interface.
 */
export function instanceOfAddressScores(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function AddressScoresFromJSON(json: any): AddressScores {
    return AddressScoresFromJSONTyped(json, false);
}

export function AddressScoresFromJSONTyped(json: any, ignoreDiscriminator: boolean): AddressScores {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'country': !exists(json, 'country') ? undefined : json['country'],
        'state': !exists(json, 'state') ? undefined : json['state'],
        'province': !exists(json, 'province') ? undefined : json['province'],
        'postalCode': !exists(json, 'postalCode') ? undefined : json['postalCode'],
        'city': !exists(json, 'city') ? undefined : json['city'],
        'district': !exists(json, 'district') ? undefined : json['district'],
        'subDistrict': !exists(json, 'subDistrict') ? undefined : json['subDistrict'],
        'street': !exists(json, 'street') ? undefined : json['street'],
        'houseNumber': !exists(json, 'houseNumber') ? undefined : json['houseNumber'],
    };
}

export function AddressScoresToJSON(value?: AddressScores | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'country': value.country,
        'state': value.state,
        'province': value.province,
        'postalCode': value.postalCode,
        'city': value.city,
        'district': value.district,
        'subDistrict': value.subDistrict,
        'street': value.street,
        'houseNumber': value.houseNumber,
    };
}

