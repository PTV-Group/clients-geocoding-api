/* tslint:disable */
/* eslint-disable */
/**
 * Geocoding
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { CausingError } from './CausingError';
import {
    CausingErrorFromJSON,
    CausingErrorFromJSONTyped,
    CausingErrorToJSON,
} from './CausingError';

/**
 * 
 * @export
 * @interface ErrorResponse
 */
export interface ErrorResponse {
    /**
     * A human readable message that describes the error.
     * @type {string}
     * @memberof ErrorResponse
     */
    description: string;
    /**
     * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.  
     * 
     * Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  
     * 
     * **HTTP status code: 400**  
     * * `GENERAL_VALIDATION_ERROR` - The validation of the request failed. Details can be found in **causes**.  
     * * `GENERAL_PARSING_ERROR` - The JSON syntax is invalid.  
     * 
     * **HTTP status code: 401**  
     * * `GENERAL_UNAUTHENTICATED` - Invalid or missing authentication credentials.  
     *   * `message` - An additional error message.  
     * 
     * **HTTP status code: 403**  
     * * `GENERAL_FORBIDDEN` - Insufficient access rights.  
     * * `GENERAL_QUOTA_EXCEEDED` - The transaction limit is exceeded.  
     *   * `message` - An additional error message.  
     * 
     * **HTTP status code: 404**  
     * * `GENERAL_RESOURCE_NOT_FOUND` - A requested resource does not exist.  
     *   * `message` - An additional error message.  
     * 
     * **HTTP status code: 429**  
     * * `GENERAL_RATE_LIMIT_EXCEEDED` - The rate limit is exceeded.  
     * 
     * **HTTP status code: 500**  
     * * `GENERAL_INTERNAL_SERVER_ERROR` - The request could not be processed due to an internal error.  
     *   * `message` - An additional error message.  
     *   * `hint` - A hint how to solve the problem.  
     * 
     * **HTTP status code: 503**  
     * * `GENERAL_SERVICE_UNAVAILABLE` - The service is temporarily unavailable.
     * @type {string}
     * @memberof ErrorResponse
     */
    errorCode: string;
    /**
     * A unique identifier of the corresponding trace forest. It can be used to trace errors by the support.
     * @type {string}
     * @memberof ErrorResponse
     */
    traceId: string;
    /**
     * A unique identifier specific to this error instance. It can be used to trace errors by the support.
     * @type {string}
     * @memberof ErrorResponse
     */
    errorId?: string;
    /**
     * A list of affected parameters and/or properties that caused this error.
     * @type {Array<CausingError>}
     * @memberof ErrorResponse
     */
    causes?: Array<CausingError>;
    /**
     * Additional properties specific to this error class.
     * @type {{ [key: string]: any; }}
     * @memberof ErrorResponse
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the ErrorResponse interface.
 */
export function instanceOfErrorResponse(value: object): value is ErrorResponse {
    if (!('description' in value) || value['description'] === undefined) return false;
    if (!('errorCode' in value) || value['errorCode'] === undefined) return false;
    if (!('traceId' in value) || value['traceId'] === undefined) return false;
    return true;
}

export function ErrorResponseFromJSON(json: any): ErrorResponse {
    return ErrorResponseFromJSONTyped(json, false);
}

export function ErrorResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ErrorResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'],
        'errorCode': json['errorCode'],
        'traceId': json['traceId'],
        'errorId': json['errorId'] == null ? undefined : json['errorId'],
        'causes': json['causes'] == null ? undefined : ((json['causes'] as Array<any>).map(CausingErrorFromJSON)),
        'details': json['details'] == null ? undefined : json['details'],
    };
}

export function ErrorResponseToJSON(value?: ErrorResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'errorCode': value['errorCode'],
        'traceId': value['traceId'],
        'errorId': value['errorId'],
        'causes': value['causes'] == null ? undefined : ((value['causes'] as Array<any>).map(CausingErrorToJSON)),
        'details': value['details'],
    };
}

