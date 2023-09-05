/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.9
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
    /// LocationAllOf
    /// </summary>
    [DataContract(Name = "Location_allOf")]
    public partial class LocationAllOf : IEquatable<LocationAllOf>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets LocationType
        /// </summary>
        [DataMember(Name = "locationType", IsRequired = true, EmitDefaultValue = true)]
        public LocationType LocationType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocationAllOf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LocationAllOf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocationAllOf" /> class.
        /// </summary>
        /// <param name="locationType">locationType (required).</param>
        /// <param name="quality">quality (required).</param>
        public LocationAllOf(LocationType locationType = default(LocationType), Quality quality = default(Quality))
        {
            this.LocationType = locationType;
            // to ensure "quality" is required (not null)
            if (quality == null)
            {
                throw new ArgumentNullException("quality is a required property for LocationAllOf and cannot be null");
            }
            this.Quality = quality;
        }

        /// <summary>
        /// Gets or Sets Quality
        /// </summary>
        [DataMember(Name = "quality", IsRequired = true, EmitDefaultValue = true)]
        public Quality Quality { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LocationAllOf {\n");
            sb.Append("  LocationType: ").Append(LocationType).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
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
            return this.Equals(input as LocationAllOf);
        }

        /// <summary>
        /// Returns true if LocationAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of LocationAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LocationAllOf input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.LocationType == input.LocationType ||
                    this.LocationType.Equals(input.LocationType)
                ) && 
                (
                    this.Quality == input.Quality ||
                    (this.Quality != null &&
                    this.Quality.Equals(input.Quality))
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
                hashCode = (hashCode * 59) + this.LocationType.GetHashCode();
                if (this.Quality != null)
                {
                    hashCode = (hashCode * 59) + this.Quality.GetHashCode();
                }
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
            yield break;
        }
    }

}
