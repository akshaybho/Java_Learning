package practice_questions;

import java.util.HashSet;

public class MissingNumbers {
    public static void main(String[] args) {
        int []b = {2,4,1,5,7,8,0,11,12,16,15,14,17};
        missingNumbers(b);
    }
    public static void missingNumbers(int []a){

        HashSet <Integer> set = new HashSet <Integer> ();
        for(int num :a){
            set.add(num);
        }
        int n = a.length+5;
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
