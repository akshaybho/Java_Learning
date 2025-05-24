package JDBC.callableStatement;

import java.sql.CallableStatement;
import java.sql.SQLException;

import static JDBC.callableStatement.DriverManagerBase.con;

public class Callable_2 {

    public static void main(String[] args) throws SQLException {

        DriverManagerBase.getConnection();

        String call = "{call myProcedure(?,?,?,?,?)}";
        CallableStatement cs = con.prepareCall(call);

        cs.setInt(1, 117);
        cs.setString(2, "Akboss");
        cs.setInt(3, 87);
        cs.setString(4, "D");
        cs.setString(5, "Indapur");

        cs.execute();
        System.out.println("Data inserted successfully");

    }
}
