package JDBC.callableStatement;

import java.sql.*;

import static JDBC.callableStatement.DriverManagerBase.con;

public class Callable_1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String call = "{call getAllData()}";

        DriverManagerBase.getConnection();

        CallableStatement cs = con.prepareCall(call);
        ResultSet rs = cs.executeQuery();

        while(rs.next())
        {
            System.out.println("Roll NO : "+rs.getString(1));
            System.out.println("Name : "+rs.getString(2));
            System.out.println("Marks : "+rs.getString(3));
            System.out.println("Grade : "+rs.getString(4));
            System.out.println("City : "+rs.getString(5));
            System.out.println("========================================================");
        }
        con.close();
    }

}
