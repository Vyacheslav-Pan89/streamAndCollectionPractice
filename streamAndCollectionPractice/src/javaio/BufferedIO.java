package javaio;

import java.io.*;

public class BufferedIO {
    public void copyFile(){
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/javaio/src/input.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/javaio/src/output.txt"))){
            byte[] data = bis.readAllBytes();
            bos.write(data);
            bos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
