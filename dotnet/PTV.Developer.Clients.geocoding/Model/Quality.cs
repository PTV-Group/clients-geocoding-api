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
    /// Quality indicators that help deciding how well a result fits to the search input.
    /// </summary>
    [DataContract(Name = "Quality")]
    public partial class Quality : IEquatable<Quality>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Quality" /> class.
        /// </summary>
        /// <param name="distance">The spatial distance in \\[m\\] between the location or the place and the input of a position search.    This is only available for **searchLocationsByPosition** and **searchPlacesByPosition**..</param>
        /// <param name="totalScore">An overall score in \\[%\\] for address searches. 100 percent represents a perfect match between the input and the result.    This is only available for **searchLocationsByText** and **searchLocationsByAddress** results..</param>
        /// <param name="addressScores">addressScores.</param>
        public Quality(int? distance = default(int?), int? totalScore = default(int?), AddressScores addressScores = default(AddressScores))
        {
            this.Distance = distance;
            this.TotalScore = totalScore;
            this.AddressScores = addressScores;
        }

        /// <summary>
        /// The spatial distance in \\[m\\] between the location or the place and the input of a position search.    This is only available for **searchLocationsByPosition** and **searchPlacesByPosition**.
        /// </summary>
        /// <value>The spatial distance in \\[m\\] between the location or the place and the input of a position search.    This is only available for **searchLocationsByPosition** and **searchPlacesByPosition**.</value>
        [DataMember(Name = "distance", EmitDefaultValue = true)]
        public int? Distance { get; set; }

        /// <summary>
        /// An overall score in \\[%\\] for address searches. 100 percent represents a perfect match between the input and the result.    This is only available for **searchLocationsByText** and **searchLocationsByAddress** results.
        /// </summary>
        /// <value>An overall score in \\[%\\] for address searches. 100 percent represents a perfect match between the input and the result.    This is only available for **searchLocationsByText** and **searchLocationsByAddress** results.</value>
        [DataMember(Name = "totalScore", EmitDefaultValue = true)]
        public int? TotalScore { get; set; }

        /// <summary>
        /// Gets or Sets AddressScores
        /// </summary>
        [DataMember(Name = "addressScores", EmitDefaultValue = false)]
        public AddressScores AddressScores { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Quality {\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  TotalScore: ").Append(TotalScore).Append("\n");
            sb.Append("  AddressScores: ").Append(AddressScores).Append("\n");
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
            return this.Equals(input as Quality);
        }

        /// <summary>
        /// Returns true if Quality instances are equal
        /// </summary>
        /// <param name="input">Instance of Quality to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Quality input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Distance == input.Distance ||
                    (this.Distance != null &&
                    this.Distance.Equals(input.Distance))
                ) && 
                (
                    this.TotalScore == input.TotalScore ||
                    (this.TotalScore != null &&
                    this.TotalScore.Equals(input.TotalScore))
                ) && 
                (
                    this.AddressScores == input.AddressScores ||
                    (this.AddressScores != null &&
                    this.AddressScores.Equals(input.AddressScores))
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
                if (this.Distance != null)
                {
                    hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                }
                if (this.TotalScore != null)
                {
                    hashCode = (hashCode * 59) + this.TotalScore.GetHashCode();
                }
                if (this.AddressScores != null)
                {
                    hashCode = (hashCode * 59) + this.AddressScores.GetHashCode();
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
