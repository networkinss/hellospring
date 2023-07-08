package com.example.helloworld.servicees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorldCitiesTest {

    private WorldCities worldCities;
    private static final String csvFilePath = "test.csv";

    @BeforeEach
    public void setup() throws IOException {
        worldCities = new WorldCities();
        Files.write(Paths.get(csvFilePath), "city,country\nParis,France\nLondon,UK".getBytes());
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(csvFilePath));
    }

    @Test
    public void testFillWorldCities() {
        worldCities.fillWorldCities(csvFilePath);
        Map<String, String[]> map = worldCities.getWorldCities();

        assertTrue(map.containsKey("Paris"));
        assertArrayEquals(new String[]{"France"}, map.get("Paris"));

        assertTrue(map.containsKey("London"));
        assertArrayEquals(new String[]{"UK"}, map.get("London"));
    }
}

