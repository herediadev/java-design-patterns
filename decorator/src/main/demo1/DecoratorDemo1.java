package main.demo1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorDemo1 {

    public static void main(String[] args) throws Exception {
        File file = new File("./decorator/resources/out.txt");
        file.createNewFile();

        OutputStream fileOutputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeChars("text");

        dataOutputStream.close();
        fileOutputStream.close();

    }
}
