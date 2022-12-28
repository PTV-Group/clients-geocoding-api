/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Represents the address of a geographical object. Whenever a string, such as a city or street name, is available in multiple languages, it is returned in the default language specified by the country in which an object is located. Most of the fields are optional, because addressing schemes vary strongly between countries.
 * @export
 * @interface Address
 */
export interface Address {
    /**
     * The country. In a response, it is represented by its full name (not abbreviated or encoded).
     * @type {string}
     * @memberof Address
     */
    countryName?: string;
    /**
     * The name of the principal country subdivision which the address belongs to (for example, a state in the USA, or a canton in Switzerland).
     * @type {string}
     * @memberof Address
     */
    state?: string;
    /**
     * The name of the second-level country subdivision which the address belongs to (for example, a county in the UK, or a province in Italy).
     * @type {string}
     * @memberof Address
     */
    province?: string;
    /**
     * The postal code of the address.
     * @type {string}
     * @memberof Address
     */
    postalCode?: string;
    /**
     * The city of the address, i.e. the highest entity at the communal level which the address belongs to.
     * @type {string}
     * @memberof Address
     */
    city?: string;
    /**
     * The district of the address, i.e. the entity below city.
     * @type {string}
     * @memberof Address
     */
    district?: string;
    /**
     * The subdistrict of the address, i.e. the entity below district.
     * @type {string}
     * @memberof Address
     */
    subdistrict?: string;
    /**
     * The street of the address.
     * @type {string}
     * @memberof Address
     */
    street?: string;
    /**
     * The house number of the address.
     * @type {string}
     * @memberof Address
     */
    houseNumber?: string;
}

/**
 * Check if a given object implements the Address interface.
 */
export function instanceOfAddress(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function AddressFromJSON(json: any): Address {
    return AddressFromJSONTyped(json, false);
}

export function AddressFromJSONTyped(json: any, ignoreDiscriminator: boolean): Address {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'countryName': !exists(json, 'countryName') ? undefined : json['countryName'],
        'state': !exists(json, 'state') ? undefined : json['state'],
        'province': !exists(json, 'province') ? undefined : json['province'],
        'postalCode': !exists(json, 'postalCode') ? undefined : json['postalCode'],
        'city': !exists(json, 'city') ? undefined : json['city'],
        'district': !exists(json, 'district') ? undefined : json['district'],
        'subdistrict': !exists(json, 'subdistrict') ? undefined : json['subdistrict'],
        'street': !exists(json, 'street') ? undefined : json['street'],
        'houseNumber': !exists(json, 'houseNumber') ? undefined : json['houseNumber'],
    };
}

export function AddressToJSON(value?: Address | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'countryName': value.countryName,
        'state': value.state,
        'province': value.province,
        'postalCode': value.postalCode,
        'city': value.city,
        'district': value.district,
        'subdistrict': value.subdistrict,
        'street': value.street,
        'houseNumber': value.houseNumber,
    };
}

