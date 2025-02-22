package fileHandling;

import java.io.File;


public class ReadingPdf {

    static void readPdf(String path)
    {
        try
        {
            File file = new File(path);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
