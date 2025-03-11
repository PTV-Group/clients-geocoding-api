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
    /// Place
    /// </summary>
    [DataContract(Name = "Place")]
    public partial class Place : IEquatable<Place>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Place" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Place() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Place" /> class.
        /// </summary>
        /// <param name="referencePosition">referencePosition (required).</param>
        /// <param name="roadAccessPosition">roadAccessPosition.</param>
        /// <param name="address">address (required).</param>
        /// <param name="formattedAddress">A single string representing the address, typically consisting of the street, house number, postal code, city, and country. The precise format may differ based on what is appropriate for the address..</param>
        /// <param name="feedbackId">A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future..</param>
        /// <param name="name">The name of the place..</param>
        /// <param name="categoryIds">An array of place category IDs representing the categories this place is assigned to. (required).</param>
        /// <param name="quality">quality (required).</param>
        public Place(ReferencePosition referencePosition = default(ReferencePosition), RoadAccessPosition roadAccessPosition = default(RoadAccessPosition), Address address = default(Address), string formattedAddress = default(string), Guid? feedbackId = default(Guid?), string name = default(string), List<string> categoryIds = default(List<string>), Quality quality = default(Quality))
        {
            // to ensure "referencePosition" is required (not null)
            if (referencePosition == null)
            {
                throw new ArgumentNullException("referencePosition is a required property for Place and cannot be null");
            }
            this.ReferencePosition = referencePosition;
            // to ensure "address" is required (not null)
            if (address == null)
            {
                throw new ArgumentNullException("address is a required property for Place and cannot be null");
            }
            this.Address = address;
            // to ensure "categoryIds" is required (not null)
            if (categoryIds == null)
            {
                throw new ArgumentNullException("categoryIds is a required property for Place and cannot be null");
            }
            this.CategoryIds = categoryIds;
            // to ensure "quality" is required (not null)
            if (quality == null)
            {
                throw new ArgumentNullException("quality is a required property for Place and cannot be null");
            }
            this.Quality = quality;
            this.RoadAccessPosition = roadAccessPosition;
            this.FormattedAddress = formattedAddress;
            this.FeedbackId = feedbackId;
            this.Name = name;
        }

        /// <summary>
        /// Gets or Sets ReferencePosition
        /// </summary>
        [DataMember(Name = "referencePosition", IsRequired = true, EmitDefaultValue = true)]
        public ReferencePosition ReferencePosition { get; set; }

        /// <summary>
        /// Gets or Sets RoadAccessPosition
        /// </summary>
        [DataMember(Name = "roadAccessPosition", EmitDefaultValue = false)]
        public RoadAccessPosition RoadAccessPosition { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name = "address", IsRequired = true, EmitDefaultValue = true)]
        public Address Address { get; set; }

        /// <summary>
        /// A single string representing the address, typically consisting of the street, house number, postal code, city, and country. The precise format may differ based on what is appropriate for the address.
        /// </summary>
        /// <value>A single string representing the address, typically consisting of the street, house number, postal code, city, and country. The precise format may differ based on what is appropriate for the address.</value>
        [DataMember(Name = "formattedAddress", EmitDefaultValue = true)]
        public string FormattedAddress { get; set; }

        /// <summary>
        /// A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future.
        /// </summary>
        /// <value>A unique identifier for a location or a place in UUID format that can be used to provide feedback. It can also be used to provide feedback that none of the returned locations or places was a match.     This is experimental and may change at any time in the future.</value>
        [DataMember(Name = "feedbackId", EmitDefaultValue = true)]
        public Guid? FeedbackId { get; set; }

        /// <summary>
        /// The name of the place.
        /// </summary>
        /// <value>The name of the place.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
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
            sb.Append("class Place {\n");
            sb.Append("  ReferencePosition: ").Append(ReferencePosition).Append("\n");
            sb.Append("  RoadAccessPosition: ").Append(RoadAccessPosition).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  FormattedAddress: ").Append(FormattedAddress).Append("\n");
            sb.Append("  FeedbackId: ").Append(FeedbackId).Append("\n");
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
            return this.Equals(input as Place);
        }

        /// <summary>
        /// Returns true if Place instances are equal
        /// </summary>
        /// <param name="input">Instance of Place to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Place input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ReferencePosition == input.ReferencePosition ||
                    (this.ReferencePosition != null &&
                    this.ReferencePosition.Equals(input.ReferencePosition))
                ) && 
                (
                    this.RoadAccessPosition == input.RoadAccessPosition ||
                    (this.RoadAccessPosition != null &&
                    this.RoadAccessPosition.Equals(input.RoadAccessPosition))
                ) && 
                (
                    this.Address == input.Address ||
                    (this.Address != null &&
                    this.Address.Equals(input.Address))
                ) && 
                (
                    this.FormattedAddress == input.FormattedAddress ||
                    (this.FormattedAddress != null &&
                    this.FormattedAddress.Equals(input.FormattedAddress))
                ) && 
                (
                    this.FeedbackId == input.FeedbackId ||
                    (this.FeedbackId != null &&
                    this.FeedbackId.Equals(input.FeedbackId))
                ) && 
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
                if (this.ReferencePosition != null)
                {
                    hashCode = (hashCode * 59) + this.ReferencePosition.GetHashCode();
                }
                if (this.RoadAccessPosition != null)
                {
                    hashCode = (hashCode * 59) + this.RoadAccessPosition.GetHashCode();
                }
                if (this.Address != null)
                {
                    hashCode = (hashCode * 59) + this.Address.GetHashCode();
                }
                if (this.FormattedAddress != null)
                {
                    hashCode = (hashCode * 59) + this.FormattedAddress.GetHashCode();
                }
                if (this.FeedbackId != null)
                {
                    hashCode = (hashCode * 59) + this.FeedbackId.GetHashCode();
                }
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
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
