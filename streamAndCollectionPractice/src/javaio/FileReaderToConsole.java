package javaio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderToConsole {
    public void readToConsole() {
        try (FileInputStream fileInputStream = new FileInputStream("src/javaio/src/input.txt")) {
            int bytes;
            while ((bytes = fileInputStream.read()) != -1) {
                System.out.print((char) bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
