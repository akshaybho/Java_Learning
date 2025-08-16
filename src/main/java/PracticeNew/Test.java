package PracticeNew;

public class Test {
/*Write a program that uses ONLY JAVA Object that creates an array structure elements of
"Abba,Civic,Dewed,Malayalam,Noon,PatsTap" and reverses each ELEMENT contents via
code and then reverses Object array, lastly whole thing is displayed in order on console.
 */
    public static void main(String[] args) {

        Object[] words = {"Abba" ,"Civic" ,"Dewed" ,"Malayalam" ,"Noon","PatsTap"};

        //Reverse each element
        for(int i=0; i< words.length; i++)
        {
            String data = (String)words[i];
            String reverse = new StringBuilder(data).reverse().toString();
            words[i] = reverse;
        }
        //reverse an array object
        for(int i=0; i< words.length/2; i++)
        {
            Object count = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = count;
        }
        //display on console
        for(Object word : words)
        {
            System.out.println(word);
        }
    }


}






