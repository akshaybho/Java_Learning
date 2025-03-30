package dsa;

public class InsertionSort {

    public static void printArray(int []a)
    {
        for(int i=1; i<a.length; i++)// unsorted part
        {
            int current = a[i];
            int j = i-1;
            while(j>=0 && current<a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            //placement
            a[j+1] = current;
        }

        for(int k=0; k<a.length; k++)
        {
            System.out.print(a[k]+" ");
        }


    }
    public static void main(String[] args) {

        printArray(new int[]{7, 8, 3, 1, 2});
    }
}
