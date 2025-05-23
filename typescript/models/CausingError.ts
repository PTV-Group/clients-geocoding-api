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
/**
 * 
 * @export
 * @interface CausingError
 */
export interface CausingError {
    /**
     * A human readable message that describes the error.
     * @type {string}
     * @memberof CausingError
     */
    description: string;
    /**
     * A constant string that can be used to identify this error class programmatically.
     * 
     * If additional information is available for an errorCode, it will be provided as key-value pairs with the parameter **details**. The keys available for a specific errorCode are documented directly with the errorCode. Unless stated otherwise, the values are of type string.
     * 
     * As an example, the following errorCode provides one key-value pair in the **details**. The key is called **value**.
     * * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.
     *   * `value` - The invalid value.
     * 
     * Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  
     * 
     * **Error codes for** `GENERAL_VALIDATION_ERROR`
     * * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.  
     *   * `value` - The invalid value.   
     * * `GENERAL_UNRECOGNIZED_PARAMETER` - A parameter is unknown.  
     * * `GENERAL_MISSING_PARAMETER` - A required parameter is missing.  
     * * `GENERAL_DUPLICATE_PARAMETER` - A parameter is duplicated.  
     * * `GENERAL_MINIMUM_VALUE_VIOLATED` - The minimum value of a parameter is violated.  
     *   * `minimumValue` - The minimum value (integer or double).  
     * * `GENERAL_MAXIMUM_VALUE_VIOLATED` - The maximum value of a parameter is violated.  
     *   * `maximumValue` - The maximum value (integer or double).  
     * * `GENERAL_MINIMUM_ITEMS_VIOLATED` - The minimum number of items of an array is violated.  
     *   * `minimumItems` - The minimum number of items (integer).  
     * * `GENERAL_MAXIMUM_ITEMS_VIOLATED` - The maximum number of items of an array is violated.  
     *   * `maximumItems` - The maximum number of items (integer).  
     * * `GEOCODING_PARAMETER_CONFLICT` - Conflicting parameters found. Only one of them is allowed.  
     *   * `conflictingParameter` - The name of the conflicting parameter.
     * * `GEOCODING_PARAMETER_DEPENDENCY_VIOLATED` - A parameter depends on another parameter which is missing.  
     *   * `missingParameter` - The name of the missing parameter.  
     * * `GENERAL_TYPE_VIOLATED` - The value of a parameter has an invalid type.  
     *   * `type` - The type.  
     * * `GENERAL_FORMAT_VIOLATED` - The value of a parameter has an invalid format.
     *   * `format` - The format.
     * * `GENERAL_PATTERN_VIOLATED` - The value of a string parameter does not satisfy the required pattern.  
     *   * `pattern` - The pattern.  
     * * `GENERAL_ENUM_VIOLATED` - The value of a parameter is not one of the specified enum values.  
     *   * `enum` - The allowed enum values.
     * @type {string}
     * @memberof CausingError
     */
    errorCode: string;
    /**
     * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
     * @type {string}
     * @memberof CausingError
     */
    parameter?: string;
    /**
     * Additional properties specific to this error class.
     * @type {{ [key: string]: any; }}
     * @memberof CausingError
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the CausingError interface.
 */
export function instanceOfCausingError(value: object): value is CausingError {
    if (!('description' in value) || value['description'] === undefined) return false;
    if (!('errorCode' in value) || value['errorCode'] === undefined) return false;
    return true;
}

export function CausingErrorFromJSON(json: any): CausingError {
    return CausingErrorFromJSONTyped(json, false);
}

export function CausingErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): CausingError {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'],
        'errorCode': json['errorCode'],
        'parameter': json['parameter'] == null ? undefined : json['parameter'],
        'details': json['details'] == null ? undefined : json['details'],
    };
}

export function CausingErrorToJSON(value?: CausingError | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'errorCode': value['errorCode'],
        'parameter': value['parameter'],
        'details': value['details'],
    };
}

