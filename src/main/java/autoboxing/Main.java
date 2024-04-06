package autoboxing;


import java.util.ArrayList;

class IntWrapper{
    public int num;

    public IntWrapper(int num)
    {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class Main {

    public static void main(String[] args) {


        ArrayList<IntWrapper> numberList = new ArrayList<>();
        numberList.add(new IntWrapper(65));
        System.out.println(numberList.get(0).getNum());

    }
}