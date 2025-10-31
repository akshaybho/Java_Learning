package collection.hahsmap;

import java.util.HashMap;
import java.util.Map;

//WITHOUT USING hashcod() AND equals()
public class Collision {

    String name;
    int id;

    public Collision(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        Map<Collision, String> map = new HashMap<>();
        map.put(new Collision("Akshay", 101), "Developer");
        map.put(new Collision("Akshay", 101), "Manager");

        System.out.println(map.size());
    }
}
