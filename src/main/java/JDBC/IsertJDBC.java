package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class IsertJDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Aksh@115");

            String q = "create table table1(tID int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";

            Statement smt = con.createStatement();
            smt.executeUpdate(q);
            System.out.println("table is created in database");


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
