

# FxForwardTenorCurveDataAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | **OffsetDateTime** | EffectiveAt date of the quoted rates | 
**domCcy** | **String** | Domestic currency of the fx forward | 
**fgnCcy** | **String** | Foreign currency of the fx forward | 
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply | 
**rates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy) | 
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  |  [optional]
**calendars** | [**List&lt;FxTenorConvention&gt;**](FxTenorConvention.md) | The list of conventions that should be used when interpreting tenors as dates. |  [optional]
**spotDaysCalculationType** | **String** | Configures how to calculate the spot date from the build date using the Calendars provided.  Supported string (enumeration) values are: [ SingleCalendar, UnionCalendars ] |  [optional]
**marketDataType** | [**MarketDataTypeEnum**](#MarketDataTypeEnum) | The available values are: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface | 



## Enum: MarketDataTypeEnum

Name | Value
---- | -----
DISCOUNTFACTORCURVEDATA | &quot;DiscountFactorCurveData&quot;
EQUITYVOLSURFACEDATA | &quot;EquityVolSurfaceData&quot;
FXVOLSURFACEDATA | &quot;FxVolSurfaceData&quot;
IRVOLCUBEDATA | &quot;IrVolCubeData&quot;
OPAQUEMARKETDATA | &quot;OpaqueMarketData&quot;
YIELDCURVEDATA | &quot;YieldCurveData&quot;
FXFORWARDCURVEDATA | &quot;FxForwardCurveData&quot;
FXFORWARDPIPSCURVEDATA | &quot;FxForwardPipsCurveData&quot;
FXFORWARDTENORCURVEDATA | &quot;FxForwardTenorCurveData&quot;
FXFORWARDTENORPIPSCURVEDATA | &quot;FxForwardTenorPipsCurveData&quot;
FXFORWARDCURVEBYQUOTEREFERENCE | &quot;FxForwardCurveByQuoteReference&quot;
CREDITSPREADCURVEDATA | &quot;CreditSpreadCurveData&quot;
EQUITYCURVEBYPRICESDATA | &quot;EquityCurveByPricesData&quot;
CONSTANTVOLATILITYSURFACE | &quot;ConstantVolatilitySurface&quot;



