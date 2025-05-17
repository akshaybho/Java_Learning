package JDBC;

import java.sql.*;
import java.util.Scanner;

public class DynamicSQLQueries {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Aksh@115";

        String sql_queryAll = "SELECT *FROM data WHERE rollno = ?";
        String sql_query = "INSERT INTO data(rollno, name, marks, grade) VALUES(?,?,?,?)";
        String sql_check = "SELECT *FROM data";


        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcURL, username, password);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Roll No : ");
            int rollno = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Name : ");
            String name = sc.nextLine();

            System.out.println("Enter marks : ");
            int marks = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter grades : ");
            String grade = sc.nextLine();

            PreparedStatement checkps = con.prepareStatement(sql_queryAll);
            checkps.setInt(1, rollno);
            ResultSet rs = checkps.executeQuery();

            if(rs.next())
            {
                System.out.println("Roll number is already existed in database");
            }
            else
            {
                PreparedStatement ps = con.prepareStatement(sql_query);
                ps.setInt(1, rollno);
                ps.setString(2, name);
                ps.setInt(3, marks);
                ps.setString(4, grade);

                int rows = ps.executeUpdate();

                if(rows>0)
                {
                    System.out.println("Update successfully");
                }
                else
                {
                    System.out.println("Insertion failed");
                }
            }
            PreparedStatement fetch = con.prepareStatement(sql_check);
            ResultSet result = fetch.executeQuery();

            ResultSetMetaData metaData = result.getMetaData();
            int coloumnCount = metaData.getColumnCount();
            while(result.next())
            {
                for(int i=1; i<coloumnCount; i++)
                {
                    System.out.println(result.getString(i)+"\t");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
