package leetcode.array;

public class RotateByOne {

    public static void main(String[] args) {

        int []a = {7, 6, 5, 4};

        int temp = a[0];
        int index = 0;
        for(int i=1; i<a.length; i++){

            a[index] = a[i];
            index++;
            if(index == a.length-1){
                a[index] = temp;
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
