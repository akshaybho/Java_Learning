package arrays;

public class HighestMarks {

    public static void main(String[] args) {

        int []b = {44,58,65,12,65,72,95,63,67};
        highetMarks(b);

    }

    public static void highetMarks(int []a)
    {
        int max = a[0];

        for(int i=0; i<a.length; i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println("The maximum marks is  = "+max);
    }
}
