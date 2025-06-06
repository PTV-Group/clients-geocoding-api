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


/**
 * Enumeration to specify a parameter of a suggestions/by-address request.  
 *  * `COUNTRY` - Specifies the country parameter.  
 *  * `STATE` - Specifies the state parameter.  
 *  * `POSTAL_CODE` - Specifies the postalCode parameter.  
 *  * `LOCALITY` - Specifies the locality parameter.  
 *  * `STREET` - Specifies the street parameter.  
 *  * `HOUSE_NUMBER` - Specifies the houseNumber parameter.
 * @export
 */
export const InputField = {
    COUNTRY: 'COUNTRY',
    STATE: 'STATE',
    POSTAL_CODE: 'POSTAL_CODE',
    LOCALITY: 'LOCALITY',
    STREET: 'STREET',
    HOUSE_NUMBER: 'HOUSE_NUMBER'
} as const;
export type InputField = typeof InputField[keyof typeof InputField];


export function instanceOfInputField(value: any): boolean {
    for (const key in InputField) {
        if (Object.prototype.hasOwnProperty.call(InputField, key)) {
            if (InputField[key as keyof typeof InputField] === value) {
                return true;
            }
        }
    }
    return false;
}

export function InputFieldFromJSON(json: any): InputField {
    return InputFieldFromJSONTyped(json, false);
}

export function InputFieldFromJSONTyped(json: any, ignoreDiscriminator: boolean): InputField {
    return json as InputField;
}

export function InputFieldToJSON(value?: InputField | null): any {
    return value as any;
}

