# ReportingTasksApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearState**](ReportingTasksApi.md#clearState) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task
[**getPropertyDescriptor**](ReportingTasksApi.md#getPropertyDescriptor) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor
[**getReportingTask**](ReportingTasksApi.md#getReportingTask) | **GET** /reporting-tasks/{id} | Gets a reporting task
[**getState**](ReportingTasksApi.md#getState) | **GET** /reporting-tasks/{id}/state | Gets the state for a reporting task
[**removeReportingTask**](ReportingTasksApi.md#removeReportingTask) | **DELETE** /reporting-tasks/{id} | Deletes a reporting task
[**updateReportingTask**](ReportingTasksApi.md#updateReportingTask) | **PUT** /reporting-tasks/{id} | Updates a reporting task
[**updateRunStatus**](ReportingTasksApi.md#updateRunStatus) | **PUT** /reporting-tasks/{id}/run-status | Updates run status of a reporting task


<a name="clearState"></a>
# **clearState**
> ComponentStateEntity clearState(id)

Clears the state for a reporting task



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateEntity result = apiInstance.clearState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#clearState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName)

Gets a reporting task property descriptor



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
String propertyName = "propertyName_example"; // String | The property name.
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **propertyName** | **String**| The property name. |

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getReportingTask"></a>
# **getReportingTask**
> ReportingTaskEntity getReportingTask(id)

Gets a reporting task



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ReportingTaskEntity result = apiInstance.getReportingTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateEntity getState(id)

Gets the state for a reporting task



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateEntity result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeReportingTask"></a>
# **removeReportingTask**
> ReportingTaskEntity removeReportingTask(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a reporting task



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ReportingTaskEntity result = apiInstance.removeReportingTask(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#removeReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateReportingTask"></a>
# **updateReportingTask**
> ReportingTaskEntity updateReportingTask(id, body)

Updates a reporting task



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
try {
    ReportingTaskEntity result = apiInstance.updateReportingTask(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#updateReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ReportingTaskEntity updateRunStatus(id, body)

Updates run status of a reporting task



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
ReportingTaskRunStatusEntity body = new ReportingTaskRunStatusEntity(); // ReportingTaskRunStatusEntity | The reporting task run status.
try {
    ReportingTaskEntity result = apiInstance.updateRunStatus(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **body** | [**ReportingTaskRunStatusEntity**](ReportingTaskRunStatusEntity.md)| The reporting task run status. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

