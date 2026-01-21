package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {

       boolean result =  patternMatch("abba", "dog cat cat fish");
        System.out.println(result);
    }

    public static boolean patternMatch(String pattern, String s){

       String []words = s.split(" ");

       if(pattern.length()!= words.length){
           return false;
       }

       Map<Character, String> patternToWord = new HashMap<>();
       Map<String, Character> wordToPattern = new HashMap<>();

       for(int i=0; i<pattern.length(); i++){

           char c = pattern.charAt(i);
           String data = words[i];



           if(patternToWord.containsKey(c)){
               if(!patternToWord.get(c).equals(data)){
                   return false;
               }
           }else{
               patternToWord.put(c, data);
           }

           if(wordToPattern.containsKey(data)){
               if(!(wordToPattern.get(data) != c)){
                   return false;
               }
               else{
                   wordToPattern.put(data, c);
               }
           }
       }
       return true;
    }
}
