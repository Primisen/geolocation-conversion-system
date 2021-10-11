package com.primisen.test_task.geolocation_conversion_system.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.primisen.test_task.geolocation_conversion_system.model.GeocodeResult;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URLEncoder;

@RestController
@PropertySource("classpath:security.properties")
public class GeocodeController {

    @Value("${key}")
    private String key;

    private static final String ENCODING = "UTF-8";

    @RequestMapping(path = "/geocode", method = RequestMethod.GET)
    public GeocodeResult getGeocode(@RequestParam String address) throws IOException{

        Request request = buildRequest(address);

        OkHttpClient client = new OkHttpClient();
        ResponseBody responseBody = client.newCall(request).execute().body();
        ObjectMapper objectMapper = new ObjectMapper();
        GeocodeResult geocodeResult = objectMapper.readValue(responseBody.string(), GeocodeResult.class);

        return geocodeResult;
    }

    private String encodeAddress(String address) throws IOException {
        return URLEncoder.encode(address, ENCODING);
    }

    private Request buildRequest(String address) throws IOException {

        String encodedAddress = encodeAddress(address);

        Request request = new Request.Builder()
                .url("https://maps.googleapis.com/maps/api/geocode/json?" +
                        "address=" + encodedAddress +
                        "&" +
                        "key=" + key)
                .get()
                .build();

        return request;
    }
}
