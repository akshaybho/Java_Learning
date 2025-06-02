package JDBC.blob_and_clob;

import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;

import static JDBC.blob_and_clob.ManageDriver.con;

public class BlobOperation {

    public static void main(String[] args) {

        ManageDriver.getConnection();

        String filePath = "C:\\Users\\Akshay\\OneDrive\\Desktop\\WhatsApp Image 2025-05-30 at 00.08.10_141c3b5c.jpg";
        try
        {
            PreparedStatement ps = con.prepareStatement("INSERT INTO gallary VALUES(?,?)");

            ps.setString(1, "Akshay");

            File f = new File(filePath);
            FileInputStream fis = new FileInputStream(f);

            ps.setBlob(2, fis);

            int rowCount = ps.executeUpdate();

            if(rowCount>0)
            {
                System.out.println("Image successfully inserted");
            }
            else
            {
                System.out.println("Fail");
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
