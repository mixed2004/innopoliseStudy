package ru.MaximBorisov.Lesson18;

import java.io.*;

public class Reader {
    public String readIFile(String fileName, String coding) throws IOException {
        String result = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), coding))){
            String line = null;
            while ((line = reader.readLine()) != null) {
                result += line;
            }
            return result;
        }
    }



}
