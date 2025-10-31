package practice_questions;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of an array");
        int n = sc.nextInt();
        int []array = new int[10];
        System.out.println("Taking input from user");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Printing elements of an array");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
