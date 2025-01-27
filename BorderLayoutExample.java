

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    BorderLayoutExample() {
        setVisible(true);
        setTitle("Hello Border Layout");
        setSize(400, 400);
        setLayout(new BorderLayout(40, 40));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("One");
        JButton b2 = new JButton("Two");
        JButton b3 = new JButton("Three");
        JButton b4 = new JButton("Four");
        JButton b5 = new JButton("Five");

        add(b1, BorderLayout.EAST);
        add(b2, BorderLayout.CENTER);
        add(b3, BorderLayout.NORTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}