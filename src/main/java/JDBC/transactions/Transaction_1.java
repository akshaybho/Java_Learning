package JDBC.transactions;

import JDBC.callableStatement.DriverManagerBase;

import java.sql.Statement;

import static JDBC.callableStatement.DriverManagerBase.con;

public class Transaction_1 {

    public static void main(String[] args) {

        try {
            DriverManagerBase.getConnection();

            con.setAutoCommit(false);

            Statement st = con.createStatement();

            int rowCount1 = st.executeUpdate("INSERT INTO items VALUES(101, 'tshirt', 1000)");
            int rowCount2 = st.executeUpdate("INSERT INTO items VALUES(102, 'jeans', 599)");
            int rowCount3 = st.executeUpdate("INSERT INTO items VALUES(103, 799, 'top')");
            int rowCount4 = st.executeUpdate("INSERT INTO items VALUES(104, 'pant', 999)");

            if(rowCount1>0 && rowCount2>0 && rowCount3>0 && rowCount4>0)
            {
                con.commit();
                System.out.println("items added successfully");
            }
            else
            {
                con.rollback();
                System.out.println("items insertion failed");
            }

        }
        catch(Exception e)
        {
           try
           {
               con.rollback();
           }
           catch(Exception f)
           {
               System.out.println(f);
           }
            System.out.println(e);
        }
    }
}
