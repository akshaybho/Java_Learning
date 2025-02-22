package project_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
            }
        }
    }
}
