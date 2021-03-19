# AccessApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessToken**](AccessApi.md#createAccessToken) | **POST** /access/token | Creates a token for accessing the REST API via username/password
[**createAccessTokenFromTicket**](AccessApi.md#createAccessTokenFromTicket) | **POST** /access/kerberos | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
[**createDownloadToken**](AccessApi.md#createDownloadToken) | **POST** /access/download-token | Creates a single use access token for downloading FlowFile content.
[**createUiExtensionToken**](AccessApi.md#createUiExtensionToken) | **POST** /access/ui-extension-token | Creates a single use access token for accessing a NiFi UI extension.
[**getAccessStatus**](AccessApi.md#getAccessStatus) | **GET** /access | Gets the status the client&#39;s access
[**getLoginConfig**](AccessApi.md#getLoginConfig) | **GET** /access/config | Retrieves the access configuration for this NiFi
[**knoxCallback**](AccessApi.md#knoxCallback) | **GET** /access/knox/callback | Redirect/callback URI for processing the result of the Apache Knox login sequence.
[**knoxLogout**](AccessApi.md#knoxLogout) | **GET** /access/knox/logout | Performs a logout in the Apache Knox.
[**knoxRequest**](AccessApi.md#knoxRequest) | **GET** /access/knox/request | Initiates a request to authenticate through Apache Knox.
[**logOut**](AccessApi.md#logOut) | **DELETE** /access/logout | Performs a logout for other providers that have been issued a JWT.
[**logOutComplete**](AccessApi.md#logOutComplete) | **GET** /access/logout/complete | Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.
[**oidcCallback**](AccessApi.md#oidcCallback) | **GET** /access/oidc/callback | Redirect/callback URI for processing the result of the OpenId Connect login sequence.
[**oidcExchange**](AccessApi.md#oidcExchange) | **POST** /access/oidc/exchange | Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
[**oidcLogout**](AccessApi.md#oidcLogout) | **GET** /access/oidc/logout | Performs a logout in the OpenId Provider.
[**oidcLogoutCallback**](AccessApi.md#oidcLogoutCallback) | **GET** /access/oidc/logoutCallback | Redirect/callback URI for processing the result of the OpenId Connect logout sequence.
[**oidcRequest**](AccessApi.md#oidcRequest) | **GET** /access/oidc/request | Initiates a request to authenticate through the configured OpenId Connect provider.
[**samlLocalLogout**](AccessApi.md#samlLocalLogout) | **GET** /access/saml/local-logout | Local logout when SAML is enabled, does not communicate with the IDP.
[**samlLoginExchange**](AccessApi.md#samlLoginExchange) | **POST** /access/saml/login/exchange | Retrieves a JWT following a successful login sequence using the configured SAML identity provider.
[**samlLoginHttpPostConsumer**](AccessApi.md#samlLoginHttpPostConsumer) | **POST** /access/saml/login/consumer | Processes the SSO response from the SAML identity provider for HTTP-POST binding.
[**samlLoginHttpRedirectConsumer**](AccessApi.md#samlLoginHttpRedirectConsumer) | **GET** /access/saml/login/consumer | Processes the SSO response from the SAML identity provider for HTTP-REDIRECT binding.
[**samlLoginRequest**](AccessApi.md#samlLoginRequest) | **GET** /access/saml/login/request | Initiates an SSO request to the configured SAML identity provider.
[**samlMetadata**](AccessApi.md#samlMetadata) | **GET** /access/saml/metadata | Retrieves the service provider metadata.
[**samlSingleLogoutHttpPostConsumer**](AccessApi.md#samlSingleLogoutHttpPostConsumer) | **POST** /access/saml/single-logout/consumer | Processes a SingleLogout message from the configured SAML identity provider using the HTTP-POST binding.
[**samlSingleLogoutHttpRedirectConsumer**](AccessApi.md#samlSingleLogoutHttpRedirectConsumer) | **GET** /access/saml/single-logout/consumer | Processes a SingleLogout message from the configured SAML identity provider using the HTTP-REDIRECT binding.
[**samlSingleLogoutRequest**](AccessApi.md#samlSingleLogoutRequest) | **GET** /access/saml/single-logout/request | Initiates a logout request using the SingleLogout service of the configured SAML identity provider.


<a name="createAccessToken"></a>
# **createAccessToken**
> String createAccessToken(username, password)

Creates a token for accessing the REST API via username/password

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    String result = apiInstance.createAccessToken(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  | [optional]
 **password** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="createAccessTokenFromTicket"></a>
# **createAccessTokenFromTicket**
> String createAccessTokenFromTicket()

Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createAccessTokenFromTicket();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessTokenFromTicket");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="createDownloadToken"></a>
# **createDownloadToken**
> String createDownloadToken()

Creates a single use access token for downloading FlowFile content.

The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createDownloadToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createDownloadToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="createUiExtensionToken"></a>
# **createUiExtensionToken**
> String createUiExtensionToken()

Creates a single use access token for accessing a NiFi UI extension.

The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createUiExtensionToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createUiExtensionToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="getAccessStatus"></a>
# **getAccessStatus**
> AccessStatusEntity getAccessStatus()

Gets the status the client&#39;s access

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    AccessStatusEntity result = apiInstance.getAccessStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getAccessStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessStatusEntity**](AccessStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getLoginConfig"></a>
# **getLoginConfig**
> AccessConfigurationEntity getLoginConfig()

Retrieves the access configuration for this NiFi



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    AccessConfigurationEntity result = apiInstance.getLoginConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getLoginConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessConfigurationEntity**](AccessConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="knoxCallback"></a>
# **knoxCallback**
> knoxCallback()

Redirect/callback URI for processing the result of the Apache Knox login sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="knoxLogout"></a>
# **knoxLogout**
> knoxLogout()

Performs a logout in the Apache Knox.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="knoxRequest"></a>
# **knoxRequest**
> knoxRequest()

Initiates a request to authenticate through Apache Knox.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="logOut"></a>
# **logOut**
> logOut()

Performs a logout for other providers that have been issued a JWT.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.logOut();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#logOut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="logOutComplete"></a>
# **logOutComplete**
> logOutComplete()

Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.logOutComplete();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#logOutComplete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="oidcCallback"></a>
# **oidcCallback**
> oidcCallback()

Redirect/callback URI for processing the result of the OpenId Connect login sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="oidcExchange"></a>
# **oidcExchange**
> String oidcExchange()

Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.oidcExchange();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcExchange");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: text/plain

<a name="oidcLogout"></a>
# **oidcLogout**
> oidcLogout()

Performs a logout in the OpenId Provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="oidcLogoutCallback"></a>
# **oidcLogoutCallback**
> oidcLogoutCallback()

Redirect/callback URI for processing the result of the OpenId Connect logout sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcLogoutCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcLogoutCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="oidcRequest"></a>
# **oidcRequest**
> oidcRequest()

Initiates a request to authenticate through the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlLocalLogout"></a>
# **samlLocalLogout**
> samlLocalLogout()

Local logout when SAML is enabled, does not communicate with the IDP.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlLocalLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlLocalLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlLoginExchange"></a>
# **samlLoginExchange**
> String samlLoginExchange()

Retrieves a JWT following a successful login sequence using the configured SAML identity provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.samlLoginExchange();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlLoginExchange");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: text/plain

<a name="samlLoginHttpPostConsumer"></a>
# **samlLoginHttpPostConsumer**
> samlLoginHttpPostConsumer()

Processes the SSO response from the SAML identity provider for HTTP-POST binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlLoginHttpPostConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlLoginHttpPostConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: */*

<a name="samlLoginHttpRedirectConsumer"></a>
# **samlLoginHttpRedirectConsumer**
> samlLoginHttpRedirectConsumer()

Processes the SSO response from the SAML identity provider for HTTP-REDIRECT binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlLoginHttpRedirectConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlLoginHttpRedirectConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlLoginRequest"></a>
# **samlLoginRequest**
> samlLoginRequest()

Initiates an SSO request to the configured SAML identity provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlLoginRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlLoginRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlMetadata"></a>
# **samlMetadata**
> samlMetadata()

Retrieves the service provider metadata.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlMetadata();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlMetadata");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/samlmetadata+xml

<a name="samlSingleLogoutHttpPostConsumer"></a>
# **samlSingleLogoutHttpPostConsumer**
> samlSingleLogoutHttpPostConsumer()

Processes a SingleLogout message from the configured SAML identity provider using the HTTP-POST binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlSingleLogoutHttpPostConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlSingleLogoutHttpPostConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlSingleLogoutHttpRedirectConsumer"></a>
# **samlSingleLogoutHttpRedirectConsumer**
> samlSingleLogoutHttpRedirectConsumer()

Processes a SingleLogout message from the configured SAML identity provider using the HTTP-REDIRECT binding.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlSingleLogoutHttpRedirectConsumer();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlSingleLogoutHttpRedirectConsumer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="samlSingleLogoutRequest"></a>
# **samlSingleLogoutRequest**
> samlSingleLogoutRequest()

Initiates a logout request using the SingleLogout service of the configured SAML identity provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.samlSingleLogoutRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#samlSingleLogoutRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

