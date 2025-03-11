/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.16
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
    /// The result of a locations search.
    /// </summary>
    [DataContract(Name = "LocationsSearchResult")]
    public partial class LocationsSearchResult : IEquatable<LocationsSearchResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LocationsSearchResult" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LocationsSearchResult() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocationsSearchResult" /> class.
        /// </summary>
        /// <param name="locations">The found locations. (required).</param>
        /// <param name="noMatchFeedbackId">A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future..</param>
        /// <param name="warnings">A list of warnings concerning the validity of the result..</param>
        public LocationsSearchResult(List<Location> locations = default(List<Location>), Guid? noMatchFeedbackId = default(Guid?), List<Warning> warnings = default(List<Warning>))
        {
            // to ensure "locations" is required (not null)
            if (locations == null)
            {
                throw new ArgumentNullException("locations is a required property for LocationsSearchResult and cannot be null");
            }
            this.Locations = locations;
            this.NoMatchFeedbackId = noMatchFeedbackId;
            this.Warnings = warnings;
        }

        /// <summary>
        /// The found locations.
        /// </summary>
        /// <value>The found locations.</value>
        [DataMember(Name = "locations", IsRequired = true, EmitDefaultValue = true)]
        public List<Location> Locations { get; set; }

        /// <summary>
        /// A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future.
        /// </summary>
        /// <value>A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future.</value>
        [DataMember(Name = "noMatchFeedbackId", EmitDefaultValue = true)]
        public Guid? NoMatchFeedbackId { get; set; }

        /// <summary>
        /// A list of warnings concerning the validity of the result.
        /// </summary>
        /// <value>A list of warnings concerning the validity of the result.</value>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<Warning> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LocationsSearchResult {\n");
            sb.Append("  Locations: ").Append(Locations).Append("\n");
            sb.Append("  NoMatchFeedbackId: ").Append(NoMatchFeedbackId).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
            return this.Equals(input as LocationsSearchResult);
        }

        /// <summary>
        /// Returns true if LocationsSearchResult instances are equal
        /// </summary>
        /// <param name="input">Instance of LocationsSearchResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LocationsSearchResult input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Locations == input.Locations ||
                    this.Locations != null &&
                    input.Locations != null &&
                    this.Locations.SequenceEqual(input.Locations)
                ) && 
                (
                    this.NoMatchFeedbackId == input.NoMatchFeedbackId ||
                    (this.NoMatchFeedbackId != null &&
                    this.NoMatchFeedbackId.Equals(input.NoMatchFeedbackId))
                ) && 
                (
                    this.Warnings == input.Warnings ||
                    this.Warnings != null &&
                    input.Warnings != null &&
                    this.Warnings.SequenceEqual(input.Warnings)
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
                if (this.Locations != null)
                {
                    hashCode = (hashCode * 59) + this.Locations.GetHashCode();
                }
                if (this.NoMatchFeedbackId != null)
                {
                    hashCode = (hashCode * 59) + this.NoMatchFeedbackId.GetHashCode();
                }
                if (this.Warnings != null)
                {
                    hashCode = (hashCode * 59) + this.Warnings.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
