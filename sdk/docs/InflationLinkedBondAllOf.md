

# InflationLinkedBondAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the bond. | 
**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | 
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | 
**inflationIndexConventions** | [**InflationIndexConventions**](InflationIndexConventions.md) |  | 
**couponRate** | **java.math.BigDecimal** | Simple coupon rate. | 
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. |  [optional]
**baseCPI** | **java.math.BigDecimal** | BaseCPI value. This is optional, if not provided the BaseCPI value will be calculated from the BaseCPIDate,  if that too is not present the StartDate will be used.                If provided then this value will always set the BaseCPI on this bond.                The BaseCPI of an inflation linked bond is calculated using the following logic:  - If a BaseCPI value is provided, this is used.  - Otherwise, if BaseCPIDate is provided, the CPI for this date is calculated and used.  - Otherwise, the CPI for the StartDate is calculated and used.                Note that if both BaseCPI and BaseCPIDate are set, the BaseCPI value will be used and the BaseCPIDate  will be ignored but can still be added for informative purposes.                Some bonds are issued with a BaseCPI date that does not correspond to the StartDate CPI value, in this  case the value should be provided here or with the BaseCPIDate. |  [optional]
**baseCPIDate** | **OffsetDateTime** | BaseCPIDate. This is optional. Gives the date that the BaseCPI is calculated for.                Note this is an un-lagged date (similar to StartDate) so the Bond ObservationLag will  be applied to this date when calculating the CPI.                The BaseCPI of an inflation linked bond is calculated using the following logic:  - If a BaseCPI value is provided, this is used.  - Otherwise, if BaseCPIDate is provided, the CPI for this date is calculated and used.  - Otherwise, the CPI for the StartDate is calculated and used.                Note that if both BaseCPI and BaseCPIDate are set, the BaseCPI value will be used and the BaseCPIDate  will be ignored but can still be added for informative purposes.                Some bonds are issued with a BaseCPI date that does not correspond to the StartDate CPI value, in this  case the value should be provided here or with the actual BaseCPI. |  [optional]
**calculationType** | **String** | The calculation type applied to the bond coupon and principal amount.  The default CalculationType is &#x60;Standard&#x60;.    Supported string (enumeration) values are: [Standard, Quarterly, Ratio, Brazil]. |  [optional]
**exDividendDays** | **Integer** | Number of Good Business Days before the next coupon payment, in which the bond goes ex-dividend. |  [optional]
**indexPrecision** | **Integer** | Number of decimal places used to round IndexRatio. This defaults to 5 if not set. |  [optional]
**principal** | **java.math.BigDecimal** | The face-value or principal for the bond at outset. | 
**principalProtection** | **Boolean** | If true then the principal is protected in that the redemption amount will be at least the face value (Principal).  This is typically set to true for inflation linked bonds issued by the United States and France (for example).  This is typically set to false for inflation linked bonds issued by the United Kingdom (post 2005).  For other sovereigns this can vary from issue to issue.  If not set this property defaults to true.  This is sometimes referred to as Deflation protection or an inflation floor of 0%. |  [optional]
**stubType** | **String** | StubType. Most Inflation linked bonds have a ShortFront stub type so this is the default, however in some cases  with a long front stub LongFront should be selected.  StubType Both is not supported for InflationLinkedBonds.    Supported string (enumeration) values are: [ShortFront, ShortBack, LongBack, LongFront, Both]. |  [optional]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. |  [optional]
**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | The available values are: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg | 



## Enum: InstrumentTypeEnum

Name | Value
---- | -----
QUOTEDSECURITY | &quot;QuotedSecurity&quot;
INTERESTRATESWAP | &quot;InterestRateSwap&quot;
FXFORWARD | &quot;FxForward&quot;
FUTURE | &quot;Future&quot;
EXOTICINSTRUMENT | &quot;ExoticInstrument&quot;
FXOPTION | &quot;FxOption&quot;
CREDITDEFAULTSWAP | &quot;CreditDefaultSwap&quot;
INTERESTRATESWAPTION | &quot;InterestRateSwaption&quot;
BOND | &quot;Bond&quot;
EQUITYOPTION | &quot;EquityOption&quot;
FIXEDLEG | &quot;FixedLeg&quot;
FLOATINGLEG | &quot;FloatingLeg&quot;
BESPOKECASHFLOWSLEG | &quot;BespokeCashFlowsLeg&quot;
UNKNOWN | &quot;Unknown&quot;
TERMDEPOSIT | &quot;TermDeposit&quot;
CONTRACTFORDIFFERENCE | &quot;ContractForDifference&quot;
EQUITYSWAP | &quot;EquitySwap&quot;
CASHPERPETUAL | &quot;CashPerpetual&quot;
CAPFLOOR | &quot;CapFloor&quot;
CASHSETTLED | &quot;CashSettled&quot;
CDSINDEX | &quot;CdsIndex&quot;
BASKET | &quot;Basket&quot;
FUNDINGLEG | &quot;FundingLeg&quot;
FXSWAP | &quot;FxSwap&quot;
FORWARDRATEAGREEMENT | &quot;ForwardRateAgreement&quot;
SIMPLEINSTRUMENT | &quot;SimpleInstrument&quot;
REPO | &quot;Repo&quot;
EQUITY | &quot;Equity&quot;
EXCHANGETRADEDOPTION | &quot;ExchangeTradedOption&quot;
REFERENCEINSTRUMENT | &quot;ReferenceInstrument&quot;
COMPLEXBOND | &quot;ComplexBond&quot;
INFLATIONLINKEDBOND | &quot;InflationLinkedBond&quot;
INFLATIONSWAP | &quot;InflationSwap&quot;
SIMPLECASHFLOWLOAN | &quot;SimpleCashFlowLoan&quot;
TOTALRETURNSWAP | &quot;TotalReturnSwap&quot;
INFLATIONLEG | &quot;InflationLeg&quot;



