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
    /**
     * The country code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     * @type {string}
     * @memberof Address
     */
    countryCodeIsoAlpha2?: string;
    /**
     * The country code according to [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3).
     * @type {string}
     * @memberof Address
     */
    countryCodeIsoAlpha3?: string;
    /**
     * The country or subdivision represented by its code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof Address
     */
    countryCode?: string;
}

/**
 * Check if a given object implements the Address interface.
 */
export function instanceOfAddress(value: object): value is Address {
    return true;
}

export function AddressFromJSON(json: any): Address {
    return AddressFromJSONTyped(json, false);
}

export function AddressFromJSONTyped(json: any, ignoreDiscriminator: boolean): Address {
    if (json == null) {
        return json;
    }
    return {
        
        'countryName': json['countryName'] == null ? undefined : json['countryName'],
        'state': json['state'] == null ? undefined : json['state'],
        'province': json['province'] == null ? undefined : json['province'],
        'postalCode': json['postalCode'] == null ? undefined : json['postalCode'],
        'city': json['city'] == null ? undefined : json['city'],
        'district': json['district'] == null ? undefined : json['district'],
        'subdistrict': json['subdistrict'] == null ? undefined : json['subdistrict'],
        'street': json['street'] == null ? undefined : json['street'],
        'houseNumber': json['houseNumber'] == null ? undefined : json['houseNumber'],
        'countryCodeIsoAlpha2': json['countryCodeIsoAlpha2'] == null ? undefined : json['countryCodeIsoAlpha2'],
        'countryCodeIsoAlpha3': json['countryCodeIsoAlpha3'] == null ? undefined : json['countryCodeIsoAlpha3'],
        'countryCode': json['countryCode'] == null ? undefined : json['countryCode'],
    };
}

export function AddressToJSON(value?: Address | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'countryName': value['countryName'],
        'state': value['state'],
        'province': value['province'],
        'postalCode': value['postalCode'],
        'city': value['city'],
        'district': value['district'],
        'subdistrict': value['subdistrict'],
        'street': value['street'],
        'houseNumber': value['houseNumber'],
        'countryCodeIsoAlpha2': value['countryCodeIsoAlpha2'],
        'countryCodeIsoAlpha3': value['countryCodeIsoAlpha3'],
        'countryCode': value['countryCode'],
    };
}

