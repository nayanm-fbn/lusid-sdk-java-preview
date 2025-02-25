

# TotalReturnSwap

A swap in which one party makes payments based on leg rates (fixed or floating) while the other party makes payments based on the return of an underlying instrument.  The underlying instrument can be provided as an inline economic definition or as a reference instrument pointing to an already upserted instrument.  A reference instrument in this case would consist of instrument scope, instrument id and instrument id type (ISIN, LUID etc.).                This instrument has multiple legs, to see how legs are used in LUSID see https://support.lusid.com/knowledgebase/article/KA-02252.                | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | AssetLeg | Cash flows relating to the returns generated by an underlying bond. |  | 2 | FundingLeg | The funding leg of the swap. |

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. | 
**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | 
**assetLeg** | [**AssetLeg**](AssetLeg.md) |  | 
**fundingLeg** | [**InstrumentLeg**](InstrumentLeg.md) |  | 



