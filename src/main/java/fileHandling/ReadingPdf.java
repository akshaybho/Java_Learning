package fileHandling;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;


public class ReadingPdf {

    static void readPdf(String path)
    {
        try
        {
            File file = new File(path);
            PDDocument document = PDDocument.load(file);
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            System.out.println(text);



        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readPdf("C:\\Users\\Akshay\\Downloads\\109130_Akshay Yaduraj Bhogale_Relieving and Experience Letter.pdf");
    }
}
