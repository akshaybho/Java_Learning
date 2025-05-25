package JDBC.TypesResultSet;

import JDBC.callableStatement.DriverManagerBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static JDBC.callableStatement.DriverManagerBase.con;

public class ResultSet_2 {

    public static void main(String[] args) throws SQLException {

        DriverManagerBase.getConnection();

        String sql_query = "SELECT *FROM data";
        PreparedStatement ps = con.prepareStatement(sql_query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = ps.executeQuery();

        rs.absolute(3); //absolute() cursor on 3rd row

        rs.relative(3);// suppose resultset cursor at 3 row then it will skip 3 more rows means cursor on the 6th row

        while(rs.next())
        {
            System.out.print(rs.getString(1));
            System.out.print(" , "+rs.getString(2));
            System.out.print(" , "+rs.getString(3));
            System.out.print(" , "+rs.getString(4));
            System.out.print(" , "+rs.getString(5));
            System.out.println();
        }

    }
}
