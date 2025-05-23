/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.17
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
    /// A search text suggested for the input of the searchLocationsByText endpoint.
    /// </summary>
    [DataContract(Name = "Suggestion")]
    public partial class Suggestion : IEquatable<Suggestion>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Suggestion" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Suggestion() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Suggestion" /> class.
        /// </summary>
        /// <param name="caption">A search address suggestion that can be displayed on a user interface as caption. (required).</param>
        /// <param name="subCaption">An additional address information for the suggestion that can be displayed on a user interface as sub caption. (required).</param>
        public Suggestion(string caption = default(string), string subCaption = default(string))
        {
            // to ensure "caption" is required (not null)
            if (caption == null)
            {
                throw new ArgumentNullException("caption is a required property for Suggestion and cannot be null");
            }
            this.Caption = caption;
            // to ensure "subCaption" is required (not null)
            if (subCaption == null)
            {
                throw new ArgumentNullException("subCaption is a required property for Suggestion and cannot be null");
            }
            this.SubCaption = subCaption;
        }

        /// <summary>
        /// A search address suggestion that can be displayed on a user interface as caption.
        /// </summary>
        /// <value>A search address suggestion that can be displayed on a user interface as caption.</value>
        [DataMember(Name = "caption", IsRequired = true, EmitDefaultValue = true)]
        public string Caption { get; set; }

        /// <summary>
        /// An additional address information for the suggestion that can be displayed on a user interface as sub caption.
        /// </summary>
        /// <value>An additional address information for the suggestion that can be displayed on a user interface as sub caption.</value>
        [DataMember(Name = "subCaption", IsRequired = true, EmitDefaultValue = true)]
        public string SubCaption { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Suggestion {\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  SubCaption: ").Append(SubCaption).Append("\n");
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
            return this.Equals(input as Suggestion);
        }

        /// <summary>
        /// Returns true if Suggestion instances are equal
        /// </summary>
        /// <param name="input">Instance of Suggestion to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Suggestion input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
                ) && 
                (
                    this.SubCaption == input.SubCaption ||
                    (this.SubCaption != null &&
                    this.SubCaption.Equals(input.SubCaption))
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
                if (this.Caption != null)
                {
                    hashCode = (hashCode * 59) + this.Caption.GetHashCode();
                }
                if (this.SubCaption != null)
                {
                    hashCode = (hashCode * 59) + this.SubCaption.GetHashCode();
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
