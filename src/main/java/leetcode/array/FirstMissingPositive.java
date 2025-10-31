package leetcode.array;

public class FirstMissingPositive {

    public static void main(String[] args) {

        int []a = {3, 4, -1, 1};

        int n = a.length;
        for(int i=0; i<n; i++)
        {
         while(a[i]>0 && a[i] <= n && a[a[i]-1]!=a[i]){
             int correctIndex = a[i] - 1;
             int tmp = a[i];
             a[i] = a[correctIndex];
             a[correctIndex] = tmp;
         }
        }
        for(int i=0; i<n; i++){
            if(a[i]!= i+1){

            }
        }
    }
}
