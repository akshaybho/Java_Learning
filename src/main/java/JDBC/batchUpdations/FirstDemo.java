package JDBC.batchUpdations;

import java.sql.Statement;

import static JDBC.batchUpdations.DriverManagement.con;

public class FirstDemo {

    public static void main(String[] args) throws Exception {

        DriverManagement.getConnection();

        Statement st = con.createStatement();

        st.addBatch("INSERT INTO items VALUES(101, 'jeans', 699)");
        st.addBatch("INSERT INTO items VALUES(102, 'top', 699)");
        st.addBatch("INSERT INTO items VALUES(103, 'shirt', 399)");
        st.addBatch("INSERT INTO items VALUES(104, 'lower', 299)");

        int[] rowCount = st.executeBatch();

        for(int i: rowCount)
        {
            System.out.println(i+" row manipulated");
        }
    }
}
