package JDBC.batchUpdations;

import java.sql.PreparedStatement;

import static JDBC.batchUpdations.DriverManagement.con;

public class SecondDemo {

    public static void main(String[] args) throws Exception {

        DriverManagement.getConnection();

        PreparedStatement ps = con.prepareStatement("INSERT INTO items VALUES(?,?,?)");

        ps.setInt(1, 105);
        ps.setString(2, "jacket");
        ps.setInt(3, 399);
        ps.addBatch();

        ps.setInt(1, 106);
        ps.setString(2, "chaddi");
        ps.setInt(3, 399);
        ps.addBatch();

        ps.setInt(1, 107);
        ps.setString(2, "pant");
        ps.setInt(3, 399);
        ps.addBatch();

        int[] rowCount = ps.executeBatch();

        for(int i : rowCount)
        {
            System.out.println(i+" Success ");
        }



    }
}
