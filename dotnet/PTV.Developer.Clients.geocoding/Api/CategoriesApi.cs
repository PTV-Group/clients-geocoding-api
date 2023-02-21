/*
 * Geocoding
 *
 * With the Geocoding service you can find locations by converting street addresses into GPS-coordinates and vice versa. The Places service allows to search for millions of shops and prominent points of interest in various categories.
 *
 * The version of the OpenAPI document: 1.6
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using PTV.Developer.Clients.geocoding.Client;
using PTV.Developer.Clients.geocoding.Model;

namespace PTV.Developer.Clients.geocoding.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICategoriesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns the list of place categories.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>PlaceCategories</returns>
        PlaceCategories GetPlaceCategories(int operationIndex = 0);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns the list of place categories.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of PlaceCategories</returns>
        ApiResponse<PlaceCategories> GetPlaceCategoriesWithHttpInfo(int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICategoriesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns the list of place categories.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PlaceCategories</returns>
        System.Threading.Tasks.Task<PlaceCategories> GetPlaceCategoriesAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Returns the list of place categories.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PlaceCategories)</returns>
        System.Threading.Tasks.Task<ApiResponse<PlaceCategories>> GetPlaceCategoriesWithHttpInfoAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICategoriesApi : ICategoriesApiSync, ICategoriesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class CategoriesApi : ICategoriesApi
    {
        private PTV.Developer.Clients.geocoding.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="CategoriesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CategoriesApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CategoriesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CategoriesApi(string basePath)
        {
            this.Configuration = PTV.Developer.Clients.geocoding.Client.Configuration.MergeConfigurations(
                PTV.Developer.Clients.geocoding.Client.GlobalConfiguration.Instance,
                new PTV.Developer.Clients.geocoding.Client.Configuration { BasePath = basePath }
            );
            this.Client = new PTV.Developer.Clients.geocoding.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new PTV.Developer.Clients.geocoding.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = PTV.Developer.Clients.geocoding.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CategoriesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CategoriesApi(PTV.Developer.Clients.geocoding.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = PTV.Developer.Clients.geocoding.Client.Configuration.MergeConfigurations(
                PTV.Developer.Clients.geocoding.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new PTV.Developer.Clients.geocoding.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new PTV.Developer.Clients.geocoding.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = PTV.Developer.Clients.geocoding.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CategoriesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public CategoriesApi(PTV.Developer.Clients.geocoding.Client.ISynchronousClient client, PTV.Developer.Clients.geocoding.Client.IAsynchronousClient asyncClient, PTV.Developer.Clients.geocoding.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = PTV.Developer.Clients.geocoding.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public PTV.Developer.Clients.geocoding.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public PTV.Developer.Clients.geocoding.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public PTV.Developer.Clients.geocoding.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public PTV.Developer.Clients.geocoding.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        ///  Returns the list of place categories.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>PlaceCategories</returns>
        public PlaceCategories GetPlaceCategories(int operationIndex = 0)
        {
            PTV.Developer.Clients.geocoding.Client.ApiResponse<PlaceCategories> localVarResponse = GetPlaceCategoriesWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Returns the list of place categories.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of PlaceCategories</returns>
        public PTV.Developer.Clients.geocoding.Client.ApiResponse<PlaceCategories> GetPlaceCategoriesWithHttpInfo(int operationIndex = 0)
        {
            PTV.Developer.Clients.geocoding.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.geocoding.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.geocoding.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.geocoding.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            localVarRequestOptions.Operation = "CategoriesApi.GetPlaceCategories";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<PlaceCategories>("/place-categories", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPlaceCategories", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Returns the list of place categories.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PlaceCategories</returns>
        public async System.Threading.Tasks.Task<PlaceCategories> GetPlaceCategoriesAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            PTV.Developer.Clients.geocoding.Client.ApiResponse<PlaceCategories> localVarResponse = await GetPlaceCategoriesWithHttpInfoAsync(operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Returns the list of place categories.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.geocoding.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PlaceCategories)</returns>
        public async System.Threading.Tasks.Task<PTV.Developer.Clients.geocoding.Client.ApiResponse<PlaceCategories>> GetPlaceCategoriesWithHttpInfoAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            PTV.Developer.Clients.geocoding.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.geocoding.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.geocoding.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.geocoding.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            localVarRequestOptions.Operation = "CategoriesApi.GetPlaceCategories";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<PlaceCategories>("/place-categories", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPlaceCategories", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
