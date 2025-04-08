package swing;

import javax.swing.*;

public class Test_2 {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel jl = new JLabel("Enter Name : ");
        jl.setBounds(100,50,100,30);
        f.add(jl);

        JTextField jt = new JTextField();
        jt.setBounds(200, 50, 100, 30);
        f.add(jt);
        f.setVisible(true);
    }
}
