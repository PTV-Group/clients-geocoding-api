/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.10
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.geocoding.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.geocoding.Model
{
    /// <summary>
    /// Enumeration to specify a parameter of a suggestions/by-address request.    * &#x60;COUNTRY&#x60; - Specifies the country parameter.    * &#x60;STATE&#x60; - Specifies the state parameter.    * &#x60;POSTAL_CODE&#x60; - Specifies the postalCode parameter.    * &#x60;LOCALITY&#x60; - Specifies the locality parameter.    * &#x60;STREET&#x60; - Specifies the street parameter.    * &#x60;HOUSE_NUMBER&#x60; - Specifies the houseNumber parameter.
    /// </summary>
    /// <value>Enumeration to specify a parameter of a suggestions/by-address request.    * &#x60;COUNTRY&#x60; - Specifies the country parameter.    * &#x60;STATE&#x60; - Specifies the state parameter.    * &#x60;POSTAL_CODE&#x60; - Specifies the postalCode parameter.    * &#x60;LOCALITY&#x60; - Specifies the locality parameter.    * &#x60;STREET&#x60; - Specifies the street parameter.    * &#x60;HOUSE_NUMBER&#x60; - Specifies the houseNumber parameter.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum InputField
    {
        /// <summary>
        /// Enum COUNTRY for value: COUNTRY
        /// </summary>
        [EnumMember(Value = "COUNTRY")]
        COUNTRY = 1,

        /// <summary>
        /// Enum STATE for value: STATE
        /// </summary>
        [EnumMember(Value = "STATE")]
        STATE = 2,

        /// <summary>
        /// Enum POSTAL_CODE for value: POSTAL_CODE
        /// </summary>
        [EnumMember(Value = "POSTAL_CODE")]
        POSTAL_CODE = 3,

        /// <summary>
        /// Enum LOCALITY for value: LOCALITY
        /// </summary>
        [EnumMember(Value = "LOCALITY")]
        LOCALITY = 4,

        /// <summary>
        /// Enum STREET for value: STREET
        /// </summary>
        [EnumMember(Value = "STREET")]
        STREET = 5,

        /// <summary>
        /// Enum HOUSE_NUMBER for value: HOUSE_NUMBER
        /// </summary>
        [EnumMember(Value = "HOUSE_NUMBER")]
        HOUSE_NUMBER = 6

    }

}
