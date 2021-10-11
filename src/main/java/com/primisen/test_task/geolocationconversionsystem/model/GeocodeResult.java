package com.primisen.test_task.geolocationconversionsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodeResult {

    List<GeocodeObject> results;

    public GeocodeResult() {
    }

    public List<GeocodeObject> getResults() {
        return results;
    }
    public void setResults(List<GeocodeObject> results) {
        this.results = results;
    }
}
