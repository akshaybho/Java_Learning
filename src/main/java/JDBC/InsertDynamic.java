package JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class InsertDynamic {

    public static void main(String[] args) {

        try
        {
            String url = "jdbc:mysql://localhost:3306/college";
            String username = "root";
            String password = "Aksh@115";
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);


            String q = "insert into college (id, name) values(?,?)";


            PreparedStatement pstmt = con.prepareStatement(q);
            ResultSet rs = pstmt.executeQuery("SELECT *FROM temp1");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter name:");
            String name = br.readLine();

            System.out.println("Enter id:");
            String id = br.readLine();

            pstmt.setString(1, name);
            pstmt.setString(2, id);

            pstmt.executeUpdate();

            System.out.println("inserted....");
        }
        catch(Exception e)
        {

        }
    }
}
