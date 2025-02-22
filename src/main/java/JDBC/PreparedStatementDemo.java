package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

    public static void main(String[] args) {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Aksh@115");
            PreparedStatement stmt = con.prepareStatement("insert into college (id, name) values(?,?)");
            stmt.setInt(1, 101);
            stmt.setString(5, "Ratan");

            int i = stmt.executeUpdate();
            System.out.println(i+" records inserted");
        }
        catch(Exception e)
        {

        }
    }
}
