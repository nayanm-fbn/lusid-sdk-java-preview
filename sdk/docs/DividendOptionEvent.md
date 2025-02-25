

# DividendOptionEvent

DVOP

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | **OffsetDateTime** | Date on which the dividend was announced / declared. |  [optional]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | CashElection for this DividendReinvestmentEvent | 
**exDate** | **OffsetDateTime** | The first business day on which the dividend is not owed to the buying party.  Typically this is T-1 from the RecordDate. | 
**paymentDate** | **OffsetDateTime** | The date the company pays out dividends to shareholders. | 
**recordDate** | **OffsetDateTime** | Date you have to be the holder of record in order to participate in the tender. |  [optional]
**securityElections** | [**List&lt;SecurityElection&gt;**](SecurityElection.md) | SecurityElection for this DividendReinvestmentEvent | 
**securitySettlementDate** | **OffsetDateTime** | Date on which the dividend was the security settles.  Equal to the PaymentDate if not provided. |  [optional]



