package com.example.helloworld.servicees;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherService {

    public String getWeather(String lat, String lon) {

        OkHttpClient client = new OkHttpClient();
        String result = null;
        Request request = new Request.Builder()
                .url("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/minutely?lat=" + lat + "&lon=" + lon)
//                .url("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/minutely?lat=35.5&lon=-78.5")
                .get()
                .addHeader("X-RapidAPI-Key", "6b2a4e7dcdmsh896711926fcf267p17e16ajsn9d6bd63e5c8f")
                .addHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .build();
        try {
            Response response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println(result);
            return result;
        } catch (IOException e) {
            return "Error";
        }
    }
}
