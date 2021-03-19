
# VersionedFlow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**JaxbLink**](JaxbLink.md) | An WebLink to this entity. |  [optional]
**identifier** | **String** | An ID to uniquely identify this object. |  [optional]
**name** | **String** | The name of the item. | 
**description** | **String** | A description of the item. |  [optional]
**bucketIdentifier** | **String** | The identifier of the bucket this items belongs to. This cannot be changed after the item is created. | 
**bucketName** | **String** | The name of the bucket this items belongs to. |  [optional]
**createdTimestamp** | **Long** | The timestamp of when the item was created, as milliseconds since epoch. |  [optional]
**modifiedTimestamp** | **Long** | The timestamp of when the item was last modified, as milliseconds since epoch. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of item. | 
**permissions** | [**Permissions**](Permissions.md) | The access that the current user has to the bucket containing this item. |  [optional]
**versionCount** | **Long** | The number of versions of this flow. |  [optional]
**revision** | [**RevisionInfo**](RevisionInfo.md) | The revision of this entity used for optimistic-locking during updates. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FLOW | &quot;Flow&quot;
BUNDLE | &quot;Bundle&quot;



