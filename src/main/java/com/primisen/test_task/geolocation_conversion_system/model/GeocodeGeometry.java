package com.primisen.test_task.geolocation_conversion_system.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodeGeometry {

    @JsonProperty("location")
    private GeocodeLocation geocodeLocation;

    public GeocodeGeometry(){}

    public GeocodeLocation getGeocodeLocation() {
        return geocodeLocation;
    }

    public void setGeocodeLocation(GeocodeLocation geocodeLocation) {
        this.geocodeLocation = geocodeLocation;
    }
}
