package dsa;

public class SelectionSort {

    public static void printArray(int []a)
    {
        for(int i=0; i<a.length; i++)
        {
            int smallest = i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[smallest]>a[j])
                {
                    smallest = j;
                }
            }
            int temp = a[smallest]; // temp = 1
            a[smallest] = a[i];     // a[3] = 7
            a[i] = temp;            // a[0] = 1
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
