package swing;

import javax.swing.*;

public class Test_1 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        JButton b = new JButton("click");
        JButton c = new JButton("add");

        b.setBounds(130, 100, 100, 40);
        c.setBounds(260, 100, 100, 40);

        f.add(b);
        f.add(c);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
