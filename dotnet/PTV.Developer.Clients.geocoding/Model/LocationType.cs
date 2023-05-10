/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.7
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
    /// Distinguishes different types of Locations:    * &#x60;LOCALITY&#x60; - Represents a locality (town, city or place).    * &#x60;POSTAL_CODE&#x60; - Represents a postal code area.    * &#x60;STREET&#x60; - Represents a street, or a section of a street.    * &#x60;EXACT_ADDRESS:&#x60; - An address that is contained exactly in the geocoding data.     * &#x60;INTERPOLATED_ADDRESS&#x60; - An address that was interpolated from an address range.     * &#x60;INTERSECTION&#x60; - An at-grade junction where two streets meet.     * &#x60;POINT_OF_INTEREST&#x60; - A point of interest, like e.g. a shop, a service, or a museum.
    /// </summary>
    /// <value>Distinguishes different types of Locations:    * &#x60;LOCALITY&#x60; - Represents a locality (town, city or place).    * &#x60;POSTAL_CODE&#x60; - Represents a postal code area.    * &#x60;STREET&#x60; - Represents a street, or a section of a street.    * &#x60;EXACT_ADDRESS:&#x60; - An address that is contained exactly in the geocoding data.     * &#x60;INTERPOLATED_ADDRESS&#x60; - An address that was interpolated from an address range.     * &#x60;INTERSECTION&#x60; - An at-grade junction where two streets meet.     * &#x60;POINT_OF_INTEREST&#x60; - A point of interest, like e.g. a shop, a service, or a museum.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum LocationType
    {
        /// <summary>
        /// Enum LOCALITY for value: LOCALITY
        /// </summary>
        [EnumMember(Value = "LOCALITY")]
        LOCALITY = 1,

        /// <summary>
        /// Enum POSTAL_CODE for value: POSTAL_CODE
        /// </summary>
        [EnumMember(Value = "POSTAL_CODE")]
        POSTAL_CODE = 2,

        /// <summary>
        /// Enum STREET for value: STREET
        /// </summary>
        [EnumMember(Value = "STREET")]
        STREET = 3,

        /// <summary>
        /// Enum EXACT_ADDRESS for value: EXACT_ADDRESS
        /// </summary>
        [EnumMember(Value = "EXACT_ADDRESS")]
        EXACT_ADDRESS = 4,

        /// <summary>
        /// Enum INTERPOLATED_ADDRESS for value: INTERPOLATED_ADDRESS
        /// </summary>
        [EnumMember(Value = "INTERPOLATED_ADDRESS")]
        INTERPOLATED_ADDRESS = 5,

        /// <summary>
        /// Enum INTERSECTION for value: INTERSECTION
        /// </summary>
        [EnumMember(Value = "INTERSECTION")]
        INTERSECTION = 6,

        /// <summary>
        /// Enum POINT_OF_INTEREST for value: POINT_OF_INTEREST
        /// </summary>
        [EnumMember(Value = "POINT_OF_INTEREST")]
        POINT_OF_INTEREST = 7

    }

}
