package jdbc_project;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static jdbc_project.DatabaseUtility.con;

public class Main {

    public static void main(String[] args) {

        String sql_query = "INSERT INTO data(rollno, name, marks, grade, city) VALUES(?,?,?,?,?)";
        try {

            DatabaseUtility.getConnection();
            //try with resource
            try (
                    PreparedStatement ps = con.prepareStatement(sql_query);
            ) {

                ps.setInt(1, 112);
                ps.setString(2, "Akshat");
                ps.setInt(3, 70);
                ps.setString(4, "C");
                ps.setString(5, "Banglore");

                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("Success");
                } else {
                    System.out.println("Fail");
                }
            }
        }
            catch(SQLException e)
            {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
