package ru.MaximBorisov.Lesson20;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadDateFromInternet {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://datazen.katren.ru/calendar/day/");
            try (InputStream is = url.openStream();
                 Reader reader = new InputStreamReader(is);
                 BufferedReader br = new BufferedReader(reader)) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    ObjectMapper objectMapper = new ObjectMapper();
                    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
                    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                    Holiday day = objectMapper.readValue(line, Holiday.class);
                    System.out.println(day);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}



