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
    /// An address suggested for the input of the searchLocationsByAddress endpoint.
    /// </summary>
    [DataContract(Name = "SuggestedAddress")]
    public partial class SuggestedAddress : IEquatable<SuggestedAddress>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SuggestedAddress" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SuggestedAddress() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SuggestedAddress" /> class.
        /// </summary>
        /// <param name="caption">A summary of this suggestion that can be displayed on a user interface. (required).</param>
        /// <param name="country">The country of the suggested address or the provided input..</param>
        /// <param name="state">The state/province of the suggested address or the provided input..</param>
        /// <param name="postalCode">The postal code or zip code of the suggested address or the provided input..</param>
        /// <param name="locality">The locality of the suggested address or the provided input..</param>
        /// <param name="street">The street of the suggested address or the provided input..</param>
        /// <param name="houseNumber">The house number of the suggested address or the provided input..</param>
        public SuggestedAddress(string caption = default(string), string country = default(string), string state = default(string), string postalCode = default(string), string locality = default(string), string street = default(string), string houseNumber = default(string))
        {
            // to ensure "caption" is required (not null)
            if (caption == null)
            {
                throw new ArgumentNullException("caption is a required property for SuggestedAddress and cannot be null");
            }
            this.Caption = caption;
            this.Country = country;
            this.State = state;
            this.PostalCode = postalCode;
            this.Locality = locality;
            this.Street = street;
            this.HouseNumber = houseNumber;
        }

        /// <summary>
        /// A summary of this suggestion that can be displayed on a user interface.
        /// </summary>
        /// <value>A summary of this suggestion that can be displayed on a user interface.</value>
        [DataMember(Name = "caption", IsRequired = true, EmitDefaultValue = true)]
        public string Caption { get; set; }

        /// <summary>
        /// The country of the suggested address or the provided input.
        /// </summary>
        /// <value>The country of the suggested address or the provided input.</value>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// The state/province of the suggested address or the provided input.
        /// </summary>
        /// <value>The state/province of the suggested address or the provided input.</value>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public string State { get; set; }

        /// <summary>
        /// The postal code or zip code of the suggested address or the provided input.
        /// </summary>
        /// <value>The postal code or zip code of the suggested address or the provided input.</value>
        [DataMember(Name = "postalCode", EmitDefaultValue = false)]
        public string PostalCode { get; set; }

        /// <summary>
        /// The locality of the suggested address or the provided input.
        /// </summary>
        /// <value>The locality of the suggested address or the provided input.</value>
        [DataMember(Name = "locality", EmitDefaultValue = false)]
        public string Locality { get; set; }

        /// <summary>
        /// The street of the suggested address or the provided input.
        /// </summary>
        /// <value>The street of the suggested address or the provided input.</value>
        [DataMember(Name = "street", EmitDefaultValue = false)]
        public string Street { get; set; }

        /// <summary>
        /// The house number of the suggested address or the provided input.
        /// </summary>
        /// <value>The house number of the suggested address or the provided input.</value>
        [DataMember(Name = "houseNumber", EmitDefaultValue = false)]
        public string HouseNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SuggestedAddress {\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  PostalCode: ").Append(PostalCode).Append("\n");
            sb.Append("  Locality: ").Append(Locality).Append("\n");
            sb.Append("  Street: ").Append(Street).Append("\n");
            sb.Append("  HouseNumber: ").Append(HouseNumber).Append("\n");
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
            return this.Equals(input as SuggestedAddress);
        }

        /// <summary>
        /// Returns true if SuggestedAddress instances are equal
        /// </summary>
        /// <param name="input">Instance of SuggestedAddress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SuggestedAddress input)
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
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.PostalCode == input.PostalCode ||
                    (this.PostalCode != null &&
                    this.PostalCode.Equals(input.PostalCode))
                ) && 
                (
                    this.Locality == input.Locality ||
                    (this.Locality != null &&
                    this.Locality.Equals(input.Locality))
                ) && 
                (
                    this.Street == input.Street ||
                    (this.Street != null &&
                    this.Street.Equals(input.Street))
                ) && 
                (
                    this.HouseNumber == input.HouseNumber ||
                    (this.HouseNumber != null &&
                    this.HouseNumber.Equals(input.HouseNumber))
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
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.PostalCode != null)
                {
                    hashCode = (hashCode * 59) + this.PostalCode.GetHashCode();
                }
                if (this.Locality != null)
                {
                    hashCode = (hashCode * 59) + this.Locality.GetHashCode();
                }
                if (this.Street != null)
                {
                    hashCode = (hashCode * 59) + this.Street.GetHashCode();
                }
                if (this.HouseNumber != null)
                {
                    hashCode = (hashCode * 59) + this.HouseNumber.GetHashCode();
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
