package JDBC.blob_and_clob;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static JDBC.blob_and_clob.ManageDriver.con;

public class GetImage {

    public static void main(String[] args) {

        ManageDriver.getConnection();

        try
        {
            PreparedStatement ps = con.prepareStatement("SELECT *FROM gallary");
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println(rs.getString(1));

            FileOutputStream fos = new FileOutputStream("C:\\Users\\Akshay\\OneDrive\\Desktop\\images\\abc.jpg");
            InputStream is = rs.getBinaryStream(2);
            int val = is.read();
            while(val!=-1)
            {
                fos.write(val);
                val=is.read();
            }
            System.out.println("Image saved successfully");
        }
        catch(Exception e)
        {

        }
    }
}
