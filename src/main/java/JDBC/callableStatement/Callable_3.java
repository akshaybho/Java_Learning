package JDBC.callableStatement;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import static JDBC.callableStatement.DriverManagerBase.con;

public class Callable_3 {

    public static void main(String[] args) throws SQLException {

        DriverManagerBase.getConnection();

        String call = "{?=call getAverageMarks()}";
        CallableStatement cs = con.prepareCall(call);

        cs.registerOutParameter(1, Types.INTEGER);
        cs.execute();
        System.out.println(cs.getInt(1));

        con.close();
    }
}
