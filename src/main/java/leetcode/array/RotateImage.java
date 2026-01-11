package leetcode.array;

public class RotateImage {

    public static void main(String[] args) {

        int [][]a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = a.length;

        //Step 1 = Transpose
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }

        // Step 2 = Reverse each row
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;

            while(left < right){

                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}
