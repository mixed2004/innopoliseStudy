package ru.MaximBorisov.Lesson18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer {
    public void writeFile(String inputString, String fileNameWrite, String coding) {
        try {
            FileOutputStream fos = new FileOutputStream(fileNameWrite);
            OutputStreamWriter osw = new OutputStreamWriter(fos, coding);
            osw.write(inputString);
            osw.close();
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
