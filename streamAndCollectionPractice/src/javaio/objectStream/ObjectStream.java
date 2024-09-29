package javaio.objectStream;

import java.io.*;

public class ObjectStream {

    public void saveAndReadObject() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/javaio/objectStream/example.dat"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/javaio/objectStream/example.dat"))) {

            Example example = new Example(1, "Example 1");

            oos.writeObject(example);
            oos.flush();
            Example example1 = (Example) ois.readObject();
            ois.close();
            System.out.println(example1);
            oos.write(0);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
