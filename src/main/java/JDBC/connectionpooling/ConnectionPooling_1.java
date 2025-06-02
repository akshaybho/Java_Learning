package JDBC.connectionpooling;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class ConnectionPooling_1 {

    public static void main(String[] args) throws SQLException {

        MysqlDataSource ds = new MysqlDataSource();

        ds.setURL("jdbc:mysql://localhost:3306/student");
        ds.setUser("root");
        ds.setPassword("Aksh@115");

        Connection con = ds.getConnection();

        PreparedStatement ps = con.prepareStatement("SELECT *FROM data");
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

    }

