
# Bucket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**JaxbLink**](JaxbLink.md) | An WebLink to this entity. |  [optional]
**identifier** | **String** | An ID to uniquely identify this object. |  [optional]
**name** | **String** | The name of the bucket. | 
**createdTimestamp** | **Long** | The timestamp of when the bucket was first created. This is set by the server at creation time. |  [optional]
**description** | **String** | A description of the bucket. |  [optional]
**allowBundleRedeploy** | **Boolean** | Indicates if this bucket allows the same version of an extension bundle to be redeployed and thus overwrite the existing artifact. By default this is false. |  [optional]
**allowPublicRead** | **Boolean** | Indicates if this bucket allows read access to unauthenticated anonymous users |  [optional]
**permissions** | [**Permissions**](Permissions.md) | The access that the current user has to this bucket. |  [optional]
**revision** | [**RevisionInfo**](RevisionInfo.md) | The revision of this entity used for optimistic-locking during updates. |  [optional]



