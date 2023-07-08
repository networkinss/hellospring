package com.example.helloworld.servicees;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

@Service
public class WorldCities implements CommandLineRunner {

    private Map<String, String[]> worldCities = new HashMap<>();

    @Override
    public void run(String... args) throws Exception {
        fillWorldCities("src/main/resources/worldcities.csv");
    }

    /**
     * Liest CSV Daten ein.
     *
     * @param csvFilePath Pfad zur CSV-Datei
     */
    public void fillWorldCities(String csvFilePath) {
        try {
            Reader in = new FileReader(csvFilePath);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
            for (CSVRecord record : records) {
                String key = record.get(0); // assuming key is in the first column
                String[] values = new String[record.size() - 1];
                for (int i = 1; i < record.size(); i++) {
                    values[i - 1] = record.get(i);
                }
                worldCities.put(key, values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String[]> getWorldCities() {
        return worldCities;
    }
}
