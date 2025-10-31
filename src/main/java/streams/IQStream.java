package streams;

import java.util.Arrays;

public class IQStream {

    public static void main(String[] args) {

        int []a = {103, 3, 35, 45, 65, 78};

        int []result = listWithDigit(a);
        for(int i=0; i<result.length; i++)
        {

            System.out.print(result[i]+" ");

        }
    }

    public static int[] listWithDigit(int []b)
    {
        return Arrays.stream(b)
                .filter(n->String.valueOf(n).contains("3"))
                .toArray();
    }
}
