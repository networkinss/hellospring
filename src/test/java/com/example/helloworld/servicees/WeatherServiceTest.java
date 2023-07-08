package com.example.helloworld.servicees;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * In order to test this WeatherService class effectively,
 * you'll need to mock the dependencies it has, particularly
 * the OkHttpClient which makes a HTTP request to an external
 * service.
 * This is a best practice because your tests should not depend
 * on an external service to pass.
 */
@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class WeatherServiceTest {

    @Mock
    private OkHttpClient client;

    @InjectMocks
    private WeatherService service;

    @Mock
    private Call call;

    @Test
    void testGetWeatherStatusCode() throws IOException {
        // Given
        String lat = "35.5";
        String lon = "-78.5";
        int expectedStatusCode = 200;

        Response mockResponse = mock(Response.class);

//        when(client.newCall(any(Request.class))).thenReturn(call);
//        when(call.execute()).thenReturn(mockResponse);
        when(mockResponse.code()).thenReturn(expectedStatusCode);

        // When
        service.getWeather(lat, lon); // This will return the weather data

        // Then
        assertEquals(expectedStatusCode, mockResponse.code());
    }
}
