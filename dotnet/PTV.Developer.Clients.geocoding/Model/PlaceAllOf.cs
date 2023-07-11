/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.8
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
    /// PlaceAllOf
    /// </summary>
    [DataContract(Name = "Place_allOf")]
    public partial class PlaceAllOf : IEquatable<PlaceAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaceAllOf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PlaceAllOf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaceAllOf" /> class.
        /// </summary>
        /// <param name="name">The name of the place..</param>
        /// <param name="categoryIds">An array of place category IDs representing the categories this place is assigned to. (required).</param>
        /// <param name="quality">quality (required).</param>
        public PlaceAllOf(string name = default(string), List<string> categoryIds = default(List<string>), Quality quality = default(Quality))
        {
            // to ensure "categoryIds" is required (not null)
            if (categoryIds == null)
            {
                throw new ArgumentNullException("categoryIds is a required property for PlaceAllOf and cannot be null");
            }
            this.CategoryIds = categoryIds;
            // to ensure "quality" is required (not null)
            if (quality == null)
            {
                throw new ArgumentNullException("quality is a required property for PlaceAllOf and cannot be null");
            }
            this.Quality = quality;
            this.Name = name;
        }

        /// <summary>
        /// The name of the place.
        /// </summary>
        /// <value>The name of the place.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// An array of place category IDs representing the categories this place is assigned to.
        /// </summary>
        /// <value>An array of place category IDs representing the categories this place is assigned to.</value>
        [DataMember(Name = "categoryIds", IsRequired = true, EmitDefaultValue = true)]
        public List<string> CategoryIds { get; set; }

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
            sb.Append("class PlaceAllOf {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CategoryIds: ").Append(CategoryIds).Append("\n");
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
            return this.Equals(input as PlaceAllOf);
        }

        /// <summary>
        /// Returns true if PlaceAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaceAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaceAllOf input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.CategoryIds == input.CategoryIds ||
                    this.CategoryIds != null &&
                    input.CategoryIds != null &&
                    this.CategoryIds.SequenceEqual(input.CategoryIds)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.CategoryIds != null)
                {
                    hashCode = (hashCode * 59) + this.CategoryIds.GetHashCode();
                }
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
