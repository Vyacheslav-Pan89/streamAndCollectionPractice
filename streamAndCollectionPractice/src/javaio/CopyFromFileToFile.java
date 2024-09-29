package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyFromFileToFile {
    public ArrayList<Byte> readFromFile() {
        ArrayList<Byte> byteArrayList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("src/javaio/src/input.txt")) {
            int readByte;
            while ((readByte = fis.read()) != -1) {
                byteArrayList.add((byte) readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayList;
    }

    public void writeToFile(ArrayList<Byte> arrayList) {
        try (FileOutputStream fos = new FileOutputStream("src/javaio/src/output.txt")) {
            byte[] bytes = new byte[arrayList.size()];
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = arrayList.get(i);
            }
            fos.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void copyFromFileToFile(){
        writeToFile(readFromFile());
    }
}
