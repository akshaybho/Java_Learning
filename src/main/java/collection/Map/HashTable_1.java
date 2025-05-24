package collection.Map;

import java.util.Hashtable;

public class HashTable_1 {

    public static Hashtable <String, Integer> hashing(Hashtable <String, Integer> table)
    {
        table.put("Akshay", 100);
        table.put("Nikhil", 68);
        table.put("Bhagyesh", 54);

        return table;
    }

    public static void main(String[] args) {

        Hashtable <String, Integer> emptyTable = new Hashtable<>();
        Hashtable <String, Integer> list = hashing(emptyTable);

        System.out.println(list);


    }
}
