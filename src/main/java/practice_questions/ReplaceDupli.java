package practice_questions;

import java.util.HashMap;
import java.util.Map;

public class ReplaceDupli {

    public static void replaceDupliWithCount(String s)
    {
        char []c = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<c.length; i++)
        {
            if(map.get(c[i])!=null)
            {
                map.put(c[i],map.get(c[i])+1);
            }
            else
            {
                map.put(c[i],1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue()<2)
            {
                sb.append(entry.getKey());
            }
            else
            {
                sb.append(entry.getValue());
            }
        }
        String a = sb.toString();
        System.out.println(a);
    }

    public static void main(String[] args) {

        String h = "javadevloper";
        replaceDupliWithCount(h);
    }
}
