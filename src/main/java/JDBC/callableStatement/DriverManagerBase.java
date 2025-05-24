package JDBC.callableStatement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DriverManagerBase {

    static String jdbcURL = "jdbc:mysql://localhost:3306/student";
    static String username = "root";
    static String password = "Aksh@115";
    static Connection con;
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection(jdbcURL, username, password);
        }
        catch(Exception e)
        {

        }
        return con;
    }


}
