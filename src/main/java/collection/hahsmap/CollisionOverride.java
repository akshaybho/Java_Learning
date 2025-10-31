package collection.hahsmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CollisionOverride {

    String name;
    int id;

    public CollisionOverride(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
            if(!(o instanceof CollisionOverride)) return false;

            CollisionOverride that = (CollisionOverride) o;
            return id == that.id && Objects.equals(name, that.name);

    }

    public static void main(String[] args) {

        Map<CollisionOverride, String> map = new HashMap<>();
        map.put(new CollisionOverride("Akshay", 101), "Developer");
        map.put(new CollisionOverride("Akshay", 101), "Manager");

        System.out.println(map.size());
    }
}
