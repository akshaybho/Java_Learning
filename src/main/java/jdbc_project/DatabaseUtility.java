package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {

    static String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    static String jdbcURL = "jdbc:mysql://localhost:3306/student";
    static String username = "root";
    static String password = "Aksh@115";
    static Connection con;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

         Class.forName(DRIVER_CLASS);
         con = DriverManager.getConnection(jdbcURL, username, password);

        return con;
    }

    public static void closeConnection() throws SQLException {
        if(con!=null)
        {
            con.close();
        }
    }
}
