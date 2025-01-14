/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.14
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
    /// PlacesByAreaRequest
    /// </summary>
    [DataContract(Name = "PlacesByAreaRequest")]
    public partial class PlacesByAreaRequest : IEquatable<PlacesByAreaRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlacesByAreaRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PlacesByAreaRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PlacesByAreaRequest" /> class.
        /// </summary>
        /// <param name="area">area (required).</param>
        public PlacesByAreaRequest(Area area = default(Area))
        {
            // to ensure "area" is required (not null)
            if (area == null)
            {
                throw new ArgumentNullException("area is a required property for PlacesByAreaRequest and cannot be null");
            }
            this.Area = area;
        }

        /// <summary>
        /// Gets or Sets Area
        /// </summary>
        [DataMember(Name = "area", IsRequired = true, EmitDefaultValue = true)]
        public Area Area { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PlacesByAreaRequest {\n");
            sb.Append("  Area: ").Append(Area).Append("\n");
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
            return this.Equals(input as PlacesByAreaRequest);
        }

        /// <summary>
        /// Returns true if PlacesByAreaRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of PlacesByAreaRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlacesByAreaRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Area == input.Area ||
                    (this.Area != null &&
                    this.Area.Equals(input.Area))
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
                if (this.Area != null)
                {
                    hashCode = (hashCode * 59) + this.Area.GetHashCode();
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
