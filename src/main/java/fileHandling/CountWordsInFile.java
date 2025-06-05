package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountWordsInFile {

    public static void main(String[] args) {

        int count = countWords(readFile());
        System.out.println(count);
    }

    public static String readFile()
    {
        String b = "";
        String path = "C:\\Users\\Akshay\\OneDrive\\Desktop\\Dear Akshay Yaduraj Bhogale,.txt";
        try
        {
            FileReader file = new FileReader(path);
            BufferedReader bf = new BufferedReader(file);
            String line;
            while((line = bf.readLine())!=null)
            {
                 b = line;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    public static int countWords(String c)
    {

        String []words = c.split(" ");
        return words.length;
    }
}
