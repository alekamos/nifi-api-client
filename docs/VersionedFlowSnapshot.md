
# VersionedFlowSnapshot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snapshotMetadata** | [**VersionedFlowSnapshotMetadata**](VersionedFlowSnapshotMetadata.md) | The metadata for this snapshot | 
**flowContents** | [**VersionedProcessGroup**](VersionedProcessGroup.md) | The contents of the versioned flow | 
**externalControllerServices** | [**Map&lt;String, ExternalControllerServiceReference&gt;**](ExternalControllerServiceReference.md) | The information about controller services that exist outside this versioned flow, but are referenced by components within the versioned flow. |  [optional]
**parameterContexts** | [**Map&lt;String, VersionedParameterContext&gt;**](VersionedParameterContext.md) | The parameter contexts referenced by process groups in the flow contents. The mapping is from the name of the context to the context instance, and it is expected that any context in this map is referenced by at least one process group in this flow. |  [optional]
**flowEncodingVersion** | **String** | The optional encoding version of the flow contents. |  [optional]
**flow** | [**VersionedFlow**](VersionedFlow.md) | The flow this snapshot is for |  [optional]
**bucket** | [**Bucket**](Bucket.md) | The bucket where the flow is located |  [optional]
**latest** | **Boolean** |  |  [optional]



