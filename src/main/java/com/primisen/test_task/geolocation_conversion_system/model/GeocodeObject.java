package com.primisen.test_task.geolocation_conversion_system.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodeObject {

    @JsonProperty("formatted_address")
    String formattedAddress;

    GeocodeGeometry geometry;

    public GeocodeObject() {
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
    public GeocodeGeometry getGeometry() {
        return geometry;
    }
    public void setGeometry(GeocodeGeometry geometry) {
        this.geometry = geometry;
    }
}
