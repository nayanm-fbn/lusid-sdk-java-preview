package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.model.Instrument;
import com.finbourne.lusid.model.InstrumentDefinition;
import com.finbourne.lusid.model.UpsertInstrumentsResponse;
import com.finbourne.lusid.model.InstrumentIdValue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.finbourne.lusid.utilities.TestDataUtilities.DefaultScope;

/*
    Utility to load a set of instruments into LUSID
 */
public class InstrumentLoader {

    private InstrumentsApi  instrumentsApi;

    public InstrumentLoader(InstrumentsApi instrumentsApi) {
        this.instrumentsApi = instrumentsApi;
    }

    /**
     *  Loads a set of instruments into LUSID
     *
     * @return List of LUSID instrument ids
     */
    public List<String> loadInstruments() throws ApiException {

        UpsertInstrumentsResponse instrumentsResponse = instrumentsApi.upsertInstruments(Stream.of(new Object[][] {
                { "request1", new InstrumentDefinition().name("Anglo American plc").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BBLDF4")); }}) },
                { "request2", new InstrumentDefinition().name("Avast").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG00KW3SK62")); }}) },
                { "request3", new InstrumentDefinition().name("Berkeley Group Holdings").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000H6ZKT3")); }}) },
                { "request4", new InstrumentDefinition().name("Croda International").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BDCLS8")); }}) },
                { "request5", new InstrumentDefinition().name("Experian").identifiers(new HashMap<String, InstrumentIdValue>() {{ put("Figi", new InstrumentIdValue().value("BBG000BKFZN3")); }}) }
            }).collect(Collectors.toMap(data -> (String)data[0], data -> (InstrumentDefinition)data[1])),
            DefaultScope);

        return instrumentsResponse
                .getValues()
                .values()
                .stream()
                .sorted(Comparator.comparing(Instrument::getName))
                .map(inst -> inst.getLusidInstrumentId())
                .collect(Collectors.toList());
    }
}
