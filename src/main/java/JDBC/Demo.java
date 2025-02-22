package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

    public static void main(String[] args) {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Aksh@115");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT *FROM temp1");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3));
                con.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
