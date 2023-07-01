package com.example.helloworld.api;

import com.example.helloworld.servicees.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    private final WeatherService weatherService;

    HomeController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/text")
    public String getPlainText() {
        return "This is a plain text response";
    }

    @GetMapping("/weather")
    public ResponseEntity<String> getLocation(String lat, String lon) {
        if (lat == null || lat.isBlank()) {
            lat = "47.3769";
        }
        if (lon == null || lon.isBlank()) {
            lon = "8.5417";
        }
        String response = this.weatherService.getWeather(lat, lon);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
