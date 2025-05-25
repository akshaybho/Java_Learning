package JDBC.TypesResultSet;

import JDBC.callableStatement.DriverManagerBase;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static JDBC.callableStatement.DriverManagerBase.con;


public class ResultSet_1 {

    public static void main(String[] args) throws SQLException, IOException {

        DriverManagerBase.getConnection();

        String sql_query = "SELECT *FROM data";
        PreparedStatement ps = con.prepareStatement(sql_query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = ps.executeQuery();

        System.out.println("Get value in Forward direction");
        System.out.println("-------------------------------------------------");

        while(rs.next())
        {
            System.out.print(rs.getString(1));
            System.out.print(" , "+rs.getString(2));
            System.out.print(" , "+rs.getString(3));
            System.out.print(" , "+rs.getString(4));
            System.out.print(" , "+rs.getString(5));
            System.out.println();
        }

        System.out.println();
        System.out.println("Get values in Backward direction");
        System.out.println("-------------------------------------------------");

        rs.afterLast();
        while(rs.previous())
        {
            System.out.print(rs.getString(1));
            System.out.print(" , "+rs.getString(2));
            System.out.print(" , "+rs.getString(3));
            System.out.print(" , "+rs.getString(4));
            System.out.print(" , "+rs.getString(5));
            System.out.println();
        }

        //pause the execution from program and enter the values in database manually
        System.in.read();

        System.out.println("Hello");
    }
}
