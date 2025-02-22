package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {

    public static void main(String[] args) {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Aksh@115");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("SELECT *FROM temp1");

           rs.absolute(2);
            //rs.next();
            //rs.previous();
            //rs.first();
            //rs.last();
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

        }
        catch (Exception e)
        {

        }
    }
}
