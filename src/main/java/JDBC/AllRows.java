package JDBC;

import java.sql.*;

public class AllRows {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Aksh@115";

        String query = "SELECT *FROM data";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcURL, username, password);
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet result = ps.executeQuery();

            ResultSetMetaData metaData = result.getMetaData();
            int coloumnCount = metaData.getColumnCount();

            for(int i=1; i<=coloumnCount; i++)
            {
                System.out.print(metaData.getColumnName(i)+"\t");
            }
            System.out.println();

            //print all rows
            while(result.next())
            {
                for(int i=1; i<=coloumnCount; i++)
                {
                    System.out.print(result.getString(i)+"\t");
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
