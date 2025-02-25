

# HoldingAdjustment

The target holdings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. |  [optional]
**instrumentScope** | **String** | The scope of the instrument that the holding adjustment is in. |  [optional]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding adjustment is in. | 
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The set of unique transaction properties and associated values stored with the holding adjustment transactions automatically created by LUSID. Each property will be from the &#39;Transaction&#39; domain. |  [optional]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The set of unique holding properties and associated values stored with the target holding. Each property will be from the &#39;Holding&#39; domain. |  [optional]
**taxLots** | [**List&lt;TargetTaxLot&gt;**](TargetTaxLot.md) | The tax-lots that together make up the target holding. | 
**currency** | **String** | The Holding currency. |  [optional]



