/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.13.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AccessConfigurationEntity;
import io.swagger.client.model.AccessStatusEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessApi
 */
@Ignore
public class AccessApiTest {

    private final AccessApi api = new AccessApi();

    
    /**
     * Creates a token for accessing the REST API via username/password
     *
     * The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenTest() throws ApiException {
        String username = null;
        String password = null;
        String response = api.createAccessToken(username, password);

        // TODO: test validations
    }
    
    /**
     * Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
     *
     * The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccessTokenFromTicketTest() throws ApiException {
        String response = api.createAccessTokenFromTicket();

        // TODO: test validations
    }
    
    /**
     * Creates a single use access token for downloading FlowFile content.
     *
     * The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDownloadTokenTest() throws ApiException {
        String response = api.createDownloadToken();

        // TODO: test validations
    }
    
    /**
     * Creates a single use access token for accessing a NiFi UI extension.
     *
     * The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUiExtensionTokenTest() throws ApiException {
        String response = api.createUiExtensionToken();

        // TODO: test validations
    }
    
    /**
     * Gets the status the client&#39;s access
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessStatusTest() throws ApiException {
        AccessStatusEntity response = api.getAccessStatus();

        // TODO: test validations
    }
    
    /**
     * Retrieves the access configuration for this NiFi
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoginConfigTest() throws ApiException {
        AccessConfigurationEntity response = api.getLoginConfig();

        // TODO: test validations
    }
    
    /**
     * Redirect/callback URI for processing the result of the Apache Knox login sequence.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void knoxCallbackTest() throws ApiException {
        api.knoxCallback();

        // TODO: test validations
    }
    
    /**
     * Performs a logout in the Apache Knox.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void knoxLogoutTest() throws ApiException {
        api.knoxLogout();

        // TODO: test validations
    }
    
    /**
     * Initiates a request to authenticate through Apache Knox.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void knoxRequestTest() throws ApiException {
        api.knoxRequest();

        // TODO: test validations
    }
    
    /**
     * Performs a logout for other providers that have been issued a JWT.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logOutTest() throws ApiException {
        api.logOut();

        // TODO: test validations
    }
    
    /**
     * Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logOutCompleteTest() throws ApiException {
        api.logOutComplete();

        // TODO: test validations
    }
    
    /**
     * Redirect/callback URI for processing the result of the OpenId Connect login sequence.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcCallbackTest() throws ApiException {
        api.oidcCallback();

        // TODO: test validations
    }
    
    /**
     * Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcExchangeTest() throws ApiException {
        String response = api.oidcExchange();

        // TODO: test validations
    }
    
    /**
     * Performs a logout in the OpenId Provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcLogoutTest() throws ApiException {
        api.oidcLogout();

        // TODO: test validations
    }
    
    /**
     * Redirect/callback URI for processing the result of the OpenId Connect logout sequence.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcLogoutCallbackTest() throws ApiException {
        api.oidcLogoutCallback();

        // TODO: test validations
    }
    
    /**
     * Initiates a request to authenticate through the configured OpenId Connect provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcRequestTest() throws ApiException {
        api.oidcRequest();

        // TODO: test validations
    }
    
    /**
     * Local logout when SAML is enabled, does not communicate with the IDP.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlLocalLogoutTest() throws ApiException {
        api.samlLocalLogout();

        // TODO: test validations
    }
    
    /**
     * Retrieves a JWT following a successful login sequence using the configured SAML identity provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlLoginExchangeTest() throws ApiException {
        String response = api.samlLoginExchange();

        // TODO: test validations
    }
    
    /**
     * Processes the SSO response from the SAML identity provider for HTTP-POST binding.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlLoginHttpPostConsumerTest() throws ApiException {
        api.samlLoginHttpPostConsumer();

        // TODO: test validations
    }
    
    /**
     * Processes the SSO response from the SAML identity provider for HTTP-REDIRECT binding.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlLoginHttpRedirectConsumerTest() throws ApiException {
        api.samlLoginHttpRedirectConsumer();

        // TODO: test validations
    }
    
    /**
     * Initiates an SSO request to the configured SAML identity provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlLoginRequestTest() throws ApiException {
        api.samlLoginRequest();

        // TODO: test validations
    }
    
    /**
     * Retrieves the service provider metadata.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlMetadataTest() throws ApiException {
        api.samlMetadata();

        // TODO: test validations
    }
    
    /**
     * Processes a SingleLogout message from the configured SAML identity provider using the HTTP-POST binding.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlSingleLogoutHttpPostConsumerTest() throws ApiException {
        api.samlSingleLogoutHttpPostConsumer();

        // TODO: test validations
    }
    
    /**
     * Processes a SingleLogout message from the configured SAML identity provider using the HTTP-REDIRECT binding.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlSingleLogoutHttpRedirectConsumerTest() throws ApiException {
        api.samlSingleLogoutHttpRedirectConsumer();

        // TODO: test validations
    }
    
    /**
     * Initiates a logout request using the SingleLogout service of the configured SAML identity provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samlSingleLogoutRequestTest() throws ApiException {
        api.samlSingleLogoutRequest();

        // TODO: test validations
    }
    
}
