package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Akshay\\OneDrive\\Desktop\\Dear Akshay Yaduraj Bhogale,.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }
}
