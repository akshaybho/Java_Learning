package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args) {

        boolean status = getResult("title", "paper");
        System.out.println(status);
    }

    public static boolean getResult(String a, String b)
    {
        if(a.length()!=b.length())
        {
            return false;
        }
        Map <Character, Character> mapAtoB = new HashMap<>();


        for(int i=0; i<a.length(); i++)
        {
            char chA = a.charAt(i);
            char chB = b.charAt(i);

            //check a-> b mapping
            if (mapAtoB.containsKey(chA)) {
                if (mapAtoB.get(chA) != chB) {
                    return false;
                }
            } else {
                mapAtoB.put(chA, chB);
            }
            Map<Character, Character> mapBtoA = new HashMap<>();
            if (mapBtoA.containsKey(chB)) {
                if (mapBtoA.get(chB) != chA) {
                    return false;
                }
            } else {
                mapBtoA.put(chB, chA);
            }
            // Check b → a mapping (to prevent two a's mapping to same b)
        }
        return true;

    }
}
