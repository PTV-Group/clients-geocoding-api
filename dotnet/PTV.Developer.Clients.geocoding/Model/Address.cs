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
    /// Represents the address of a geographical object. Whenever a string, such as a city or street name, is available in multiple languages, it is returned in the default language specified by the country in which an object is located. Most of the fields are optional, because addressing schemes vary strongly between countries.
    /// </summary>
    [DataContract(Name = "Address")]
    public partial class Address : IEquatable<Address>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Address" /> class.
        /// </summary>
        /// <param name="countryName">The country. In a response, it is represented by its full name (not abbreviated or encoded)..</param>
        /// <param name="state">The name of the principal country subdivision which the address belongs to (for example, a state in the USA, or a canton in Switzerland)..</param>
        /// <param name="province">The name of the second-level country subdivision which the address belongs to (for example, a county in the UK, or a province in Italy)..</param>
        /// <param name="postalCode">The postal code of the address..</param>
        /// <param name="city">The city of the address, i.e. the highest entity at the communal level which the address belongs to..</param>
        /// <param name="district">The district of the address, i.e. the entity below city..</param>
        /// <param name="subdistrict">The subdistrict of the address, i.e. the entity below district..</param>
        /// <param name="street">The street of the address..</param>
        /// <param name="houseNumber">The house number of the address..</param>
        /// <param name="countryCodeIsoAlpha2">The country code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)..</param>
        /// <param name="countryCodeIsoAlpha3">The country code according to [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3)..</param>
        /// <param name="countryCode">The country or subdivision represented by its code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision..</param>
        public Address(string countryName = default(string), string state = default(string), string province = default(string), string postalCode = default(string), string city = default(string), string district = default(string), string subdistrict = default(string), string street = default(string), string houseNumber = default(string), string countryCodeIsoAlpha2 = default(string), string countryCodeIsoAlpha3 = default(string), string countryCode = default(string))
        {
            this.CountryName = countryName;
            this.State = state;
            this.Province = province;
            this.PostalCode = postalCode;
            this.City = city;
            this.District = district;
            this.Subdistrict = subdistrict;
            this.Street = street;
            this.HouseNumber = houseNumber;
            this.CountryCodeIsoAlpha2 = countryCodeIsoAlpha2;
            this.CountryCodeIsoAlpha3 = countryCodeIsoAlpha3;
            this.CountryCode = countryCode;
        }

        /// <summary>
        /// The country. In a response, it is represented by its full name (not abbreviated or encoded).
        /// </summary>
        /// <value>The country. In a response, it is represented by its full name (not abbreviated or encoded).</value>
        [DataMember(Name = "countryName", EmitDefaultValue = true)]
        public string CountryName { get; set; }

        /// <summary>
        /// The name of the principal country subdivision which the address belongs to (for example, a state in the USA, or a canton in Switzerland).
        /// </summary>
        /// <value>The name of the principal country subdivision which the address belongs to (for example, a state in the USA, or a canton in Switzerland).</value>
        [DataMember(Name = "state", EmitDefaultValue = true)]
        public string State { get; set; }

        /// <summary>
        /// The name of the second-level country subdivision which the address belongs to (for example, a county in the UK, or a province in Italy).
        /// </summary>
        /// <value>The name of the second-level country subdivision which the address belongs to (for example, a county in the UK, or a province in Italy).</value>
        [DataMember(Name = "province", EmitDefaultValue = true)]
        public string Province { get; set; }

        /// <summary>
        /// The postal code of the address.
        /// </summary>
        /// <value>The postal code of the address.</value>
        [DataMember(Name = "postalCode", EmitDefaultValue = true)]
        public string PostalCode { get; set; }

        /// <summary>
        /// The city of the address, i.e. the highest entity at the communal level which the address belongs to.
        /// </summary>
        /// <value>The city of the address, i.e. the highest entity at the communal level which the address belongs to.</value>
        [DataMember(Name = "city", EmitDefaultValue = true)]
        public string City { get; set; }

        /// <summary>
        /// The district of the address, i.e. the entity below city.
        /// </summary>
        /// <value>The district of the address, i.e. the entity below city.</value>
        [DataMember(Name = "district", EmitDefaultValue = true)]
        public string District { get; set; }

        /// <summary>
        /// The subdistrict of the address, i.e. the entity below district.
        /// </summary>
        /// <value>The subdistrict of the address, i.e. the entity below district.</value>
        [DataMember(Name = "subdistrict", EmitDefaultValue = true)]
        public string Subdistrict { get; set; }

        /// <summary>
        /// The street of the address.
        /// </summary>
        /// <value>The street of the address.</value>
        [DataMember(Name = "street", EmitDefaultValue = true)]
        public string Street { get; set; }

        /// <summary>
        /// The house number of the address.
        /// </summary>
        /// <value>The house number of the address.</value>
        [DataMember(Name = "houseNumber", EmitDefaultValue = true)]
        public string HouseNumber { get; set; }

        /// <summary>
        /// The country code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
        /// </summary>
        /// <value>The country code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).</value>
        [DataMember(Name = "countryCodeIsoAlpha2", EmitDefaultValue = true)]
        public string CountryCodeIsoAlpha2 { get; set; }

        /// <summary>
        /// The country code according to [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3).
        /// </summary>
        /// <value>The country code according to [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3).</value>
        [DataMember(Name = "countryCodeIsoAlpha3", EmitDefaultValue = true)]
        public string CountryCodeIsoAlpha3 { get; set; }

        /// <summary>
        /// The country or subdivision represented by its code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
        /// </summary>
        /// <value>The country or subdivision represented by its code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.</value>
        [DataMember(Name = "countryCode", EmitDefaultValue = true)]
        public string CountryCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Address {\n");
            sb.Append("  CountryName: ").Append(CountryName).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Province: ").Append(Province).Append("\n");
            sb.Append("  PostalCode: ").Append(PostalCode).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  District: ").Append(District).Append("\n");
            sb.Append("  Subdistrict: ").Append(Subdistrict).Append("\n");
            sb.Append("  Street: ").Append(Street).Append("\n");
            sb.Append("  HouseNumber: ").Append(HouseNumber).Append("\n");
            sb.Append("  CountryCodeIsoAlpha2: ").Append(CountryCodeIsoAlpha2).Append("\n");
            sb.Append("  CountryCodeIsoAlpha3: ").Append(CountryCodeIsoAlpha3).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
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
            return this.Equals(input as Address);
        }

        /// <summary>
        /// Returns true if Address instances are equal
        /// </summary>
        /// <param name="input">Instance of Address to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Address input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.CountryName == input.CountryName ||
                    (this.CountryName != null &&
                    this.CountryName.Equals(input.CountryName))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.Province == input.Province ||
                    (this.Province != null &&
                    this.Province.Equals(input.Province))
                ) && 
                (
                    this.PostalCode == input.PostalCode ||
                    (this.PostalCode != null &&
                    this.PostalCode.Equals(input.PostalCode))
                ) && 
                (
                    this.City == input.City ||
                    (this.City != null &&
                    this.City.Equals(input.City))
                ) && 
                (
                    this.District == input.District ||
                    (this.District != null &&
                    this.District.Equals(input.District))
                ) && 
                (
                    this.Subdistrict == input.Subdistrict ||
                    (this.Subdistrict != null &&
                    this.Subdistrict.Equals(input.Subdistrict))
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
                ) && 
                (
                    this.CountryCodeIsoAlpha2 == input.CountryCodeIsoAlpha2 ||
                    (this.CountryCodeIsoAlpha2 != null &&
                    this.CountryCodeIsoAlpha2.Equals(input.CountryCodeIsoAlpha2))
                ) && 
                (
                    this.CountryCodeIsoAlpha3 == input.CountryCodeIsoAlpha3 ||
                    (this.CountryCodeIsoAlpha3 != null &&
                    this.CountryCodeIsoAlpha3.Equals(input.CountryCodeIsoAlpha3))
                ) && 
                (
                    this.CountryCode == input.CountryCode ||
                    (this.CountryCode != null &&
                    this.CountryCode.Equals(input.CountryCode))
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
                if (this.CountryName != null)
                {
                    hashCode = (hashCode * 59) + this.CountryName.GetHashCode();
                }
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.Province != null)
                {
                    hashCode = (hashCode * 59) + this.Province.GetHashCode();
                }
                if (this.PostalCode != null)
                {
                    hashCode = (hashCode * 59) + this.PostalCode.GetHashCode();
                }
                if (this.City != null)
                {
                    hashCode = (hashCode * 59) + this.City.GetHashCode();
                }
                if (this.District != null)
                {
                    hashCode = (hashCode * 59) + this.District.GetHashCode();
                }
                if (this.Subdistrict != null)
                {
                    hashCode = (hashCode * 59) + this.Subdistrict.GetHashCode();
                }
                if (this.Street != null)
                {
                    hashCode = (hashCode * 59) + this.Street.GetHashCode();
                }
                if (this.HouseNumber != null)
                {
                    hashCode = (hashCode * 59) + this.HouseNumber.GetHashCode();
                }
                if (this.CountryCodeIsoAlpha2 != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCodeIsoAlpha2.GetHashCode();
                }
                if (this.CountryCodeIsoAlpha3 != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCodeIsoAlpha3.GetHashCode();
                }
                if (this.CountryCode != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCode.GetHashCode();
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
