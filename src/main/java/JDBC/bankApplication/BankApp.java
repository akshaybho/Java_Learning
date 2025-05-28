package JDBC.bankApplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static JDBC.bankApplication.DriverManagement.con;

public class BankApp {

    Scanner sc;
    public static void main(String[] args) {

        BankApp ba = new BankApp();
        ba.startBankApp();
        ba.getUserInput();
    }
    void startBankApp()
    {
        System.out.println("\n======================================");
        System.out.println("1. Add Account");
        System.out.println("2. Fund Transfer");
        System.out.println("3. Mini Statement");
        System.out.println("4. Exit");

        System.out.println("\nSelect any one option");
        System.out.println("=========================================");

        getUserInput();
    }
    void getUserInput()
    {
         sc = new Scanner(System.in);
        int useroption = sc.nextInt();

        System.out.println("-------------------------------------------------------");
        if(useroption==1)
        {
            addAccount();
        }
        else if (useroption==2)
        {
            fundTransfer();
        }
        else if (useroption==3)
        {
            miniStatement();
        }
        else if (useroption==4)
        {
            System.out.println("Bank App Closed");
            System.exit(0);
        }
    }
    void addAccount()
    {
        System.out.println("Enter ID : ");
        int id = sc.nextInt();

        System.out.println("Enter Name : ");
        String name = sc.next();

        System.out.println("Enter email : ");
        String email = sc.next();

        System.out.println("Enter Phone no");
        String phone_no = sc.next();

        System.out.println("Enter account_no");
        int account_no = sc.nextInt();

        try
        {

            DriverManagement.getConnection();
            con.setAutoCommit(false);

            //----------------Creating Account -----------------
            PreparedStatement ps1 = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?)");
            ps1.setInt(1, id);
            ps1.setString(2, name);
            ps1.setString(3, email);
            ps1.setString(4, phone_no);
            ps1.setInt(5, account_no);

            int rowCount1 = ps1.executeUpdate();

            //-------------------Deposit money in account---------------------
            PreparedStatement ps2 = con.prepareStatement("INSERT INTO total_amount VALUES(?,?,?)");
            ps2.setInt(1, id);
            ps2.setInt(2, account_no);
            ps2.setInt(3, 50000);

            int rowCount2 = ps2.executeUpdate();

            if(rowCount1>0 && rowCount2>0)
            {
                con.commit();
                System.out.println("Amount inserted successfully");
            }
            else
            {
                con.rollback();
                System.out.println("Account creation failed due to some error");
            }
        }
        catch(Exception f)
        {
           try
           {
               con.rollback();
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
            System.out.println(f);
        }
        startBankApp();

    }
    void fundTransfer()
    {
        System.out.println("Enter from Account No : ");
        int from_accno = sc.nextInt();

        System.out.println("Enter to Account No : ");
        int to_accno = sc.nextInt();

        System.out.println("Enter Amount : ");
        int deposit_amount = sc.nextInt();

        int from_bal=0, to_bal=0;

        try
        {
            DriverManagement.getConnection();

            PreparedStatement ps1 = con.prepareStatement("SELECT balance FROM total_amount WHERE accountno=?");
            ps1.setInt(1, from_accno);

            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next())
            {
                from_bal= rs1.getInt(1);
            }
            PreparedStatement ps2 = con.prepareStatement("SELECT balance FROM total_amount WHERE accountno=?");
            ps2.setInt(1, to_accno);

            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next())
            {
                from_bal= rs2.getInt(1);
            }
            int new_from_bal = from_bal - deposit_amount;
            int new_to_bal = to_bal + deposit_amount;

            PreparedStatement ps3 = con.prepareStatement("UPDATE total_amount SET amount=? WHERE accountno=?");
            ps3.setInt(1, new_from_bal);
            ps3.setInt(2, from_accno);
            int rowCount3 = ps3.executeUpdate();

            PreparedStatement ps4 = con.prepareStatement("UPDATE total_amount SET amount=? WHERE accountno=?");
            ps4.setInt(1, new_to_bal);
            ps4.setInt(2, to_accno);
            int rowCount4 = ps4.executeUpdate();

            //---------------------get System current date & time-----------------
            Date d = new Date();

            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            String date1 = sdf1.format(d);

            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            String date2 = sdf1.format(d);
            //-----------------------------------------------------------------------

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        startBankApp();
    }
    void miniStatement()
    {
        System.out.println("Mini statement");

        startBankApp();
    }
}
