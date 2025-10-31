package leetcode.array;

public class TwoSum {
    int sum;
    public void sum(){
        int []a = {2, 11, 7, 5, 3, 4, 6};
        int target = 12;

        for( int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               sum = a[i]+a[j];
               if(sum == target){
                   System.out.println(i+" "+j);

               }
           }
        }
    }
    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        t.sum();
    }
}
