package generics;

public class Box <T>{

    //T stands for the type
    private T value;

    public Box(T value)
    {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
