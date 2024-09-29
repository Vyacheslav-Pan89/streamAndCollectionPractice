package javaio;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public void writeToFile(){
        String dataToWrite = "Some random data to write into a file: 123456";
        try (FileOutputStream fos = new FileOutputStream("src/javaio/src/output.txt")){
            byte[] dataArray = dataToWrite.getBytes();
            fos.write(dataArray);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
