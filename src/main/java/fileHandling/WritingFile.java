package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Akshay\\OneDrive\\Desktop\\Dear Akshay Yaduraj Bhogale,.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath)))
        {
            bw.write("hello world good afternoon");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
