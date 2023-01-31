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
 * 
 * @export
 * @interface Warning
 */
export interface Warning {
    /**
     * A human readable message that describes the warning.
     * @type {string}
     * @memberof Warning
     */
    description: string;
    /**
     * A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.  
     * 
     * Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.  
     * 
     * * `GEOCODING_COUNTRY_FILTER_MODIFIED` - A given code in **countryFilter** referring to a subdivision of a country was modified to its corresponding country code.  
     *   * `requestedSubdivisionCode` - The subdivision code that was originally requested.  
     *   * `fallbackCountryCode` - The country code that was used as a fallback in the search.  
     * * `GEOCODING_TIMEOUT` - The search ran into a timeout while trying to find results.  
     * * `GEOCODING_INPUT_TOO_LONG` - The input was rejected because it is too long.  
     *   * `maximumSize` - The maximum allowed size of a singleField request.  
     * * `TOO_MANY_INPUT_WORDS` - At least one of the input fields exceeded the maximum number of input words.  
     *   * `inputField` - The input field that had too many input words.
     *   * `actualNumberOfWords` - The number of words found in `inputField`.
     *   * `maximumAllowedNumberOfWords` - The maximum number of words allowed in `inputField`.
     * * `GEOCODING_TOO_MANY_RESULTS` - Too many results found. Not all of them are provided in the response.  
     * @type {string}
     * @memberof Warning
     */
    warningCode: string;
    /**
     * Additional properties specific to this class of warnings.
     * @type {{ [key: string]: any; }}
     * @memberof Warning
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the Warning interface.
 */
export function instanceOfWarning(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "description" in value;
    isInstance = isInstance && "warningCode" in value;

    return isInstance;
}

export function WarningFromJSON(json: any): Warning {
    return WarningFromJSONTyped(json, false);
}

export function WarningFromJSONTyped(json: any, ignoreDiscriminator: boolean): Warning {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'description': json['description'],
        'warningCode': json['warningCode'],
        'details': !exists(json, 'details') ? undefined : json['details'],
    };
}

export function WarningToJSON(value?: Warning | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'description': value.description,
        'warningCode': value.warningCode,
        'details': value.details,
    };
}

