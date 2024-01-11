/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.12
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
    /// The actual position of the object itself, such as the rooftop of a building, the center of a street, or the reference position of a city.
    /// </summary>
    [DataContract(Name = "ReferencePosition")]
    public partial class ReferencePosition : IEquatable<ReferencePosition>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReferencePosition" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ReferencePosition() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReferencePosition" /> class.
        /// </summary>
        /// <param name="latitude">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        public ReferencePosition(double latitude = default(double), double longitude = default(double))
        {
            this.Latitude = latitude;
            this.Longitude = longitude;
        }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north.</value>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = true)]
        public double Latitude { get; set; }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east.</value>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = true)]
        public double Longitude { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReferencePosition {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ReferencePosition);
        }

        /// <summary>
        /// Returns true if ReferencePosition instances are equal
        /// </summary>
        /// <param name="input">Instance of ReferencePosition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReferencePosition input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Latitude == input.Latitude ||
                    this.Latitude.Equals(input.Latitude)
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    this.Longitude.Equals(input.Longitude)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Latitude.GetHashCode();
                hashCode = (hashCode * 59) + this.Longitude.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // Latitude (double) maximum
            if (this.Latitude > (double)90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double) minimum
            if (this.Latitude < (double)-90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double) maximum
            if (this.Longitude > (double)180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double) minimum
            if (this.Longitude < (double)-180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            yield break;
        }
    }

}
