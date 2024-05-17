package swing;

import javax.swing.*;

public class FirstSwingProgram {
    public static void main(String[] args) {

        JFrame f = new JFrame(); //creating the instance of the jframe
        JButton b = new JButton("click"); //creating the instance of the jbutton

        b.setBounds(130, 100, 100, 40);//x-axis, y-axis, width, height
        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
