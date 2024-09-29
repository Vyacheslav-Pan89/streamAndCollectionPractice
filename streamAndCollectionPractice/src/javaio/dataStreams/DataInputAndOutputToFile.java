package javaio.dataStreams;

import java.io.*;

public class DataInputAndOutputToFile {
    public void writeToFileAndReadFromFile(){
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/javaio/dataStreams/data.dat"));
             DataInputStream dis = new DataInputStream(new FileInputStream("src/javaio/dataStreams/data.dat"))){
            dos.writeInt(100);
            dos.writeDouble(100.101);
            dos.writeBoolean(true);
            dos.writeUTF("Sample Data");

            int id = dis.readInt();
            double myDouble = dis.readDouble();
            boolean myBoolean = dis.readBoolean();
            String str = dis.readUTF();

            System.out.println(id + " " + myDouble + " " + myBoolean + " " + str);


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
