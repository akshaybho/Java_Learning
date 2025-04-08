package swing;

import javax.swing.*;
import java.awt.*;

public class RegisterPage {

    public static void main(String[] args) {

        JFrame jf = new JFrame("Register Page");
        jf.setSize(600, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);


        JLabel jl = new JLabel("Registration Page");
        jl.setBounds(180, 20,300,40);
        jl.setFont(new Font("Arial", Font.BOLD, 16));
        jf.add(jl);

        JLabel jl1 = new JLabel("Enter Name : ");
        jl1.setBounds(150, 80,150,30);
        jf.add(jl1);

        JLabel jl2 = new JLabel("Enter email : ");
        jl2.setBounds(150, 130,150,30);
        jf.add(jl2);

        JTextField jt1 = new JTextField();
        jt1.setBounds(250, 80, 150, 30);
        jf.add(jt1);

        JTextField jt2 = new JTextField();
        jt2.setBounds(250, 130, 150, 30);
        jf.add(jt2);

        JButton jb = new JButton("Register");
        jb.setBounds(200, 180, 100, 30);
        jf.add(jb);





        jf.setVisible(true);


    }
}
