

import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample extends JFrame {
    FlowLayoutExample() {
        setLayout(new FlowLayout(FlowLayout.LEFT,50,20));
        setVisible(true);
        setTitle("MyLayout");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("One");
        JButton b2 = new JButton("Two");
        JButton b3 = new JButton("Three");
        JButton b4 = new JButton("Four");
        JButton b5 = new JButton("Five");
        JButton b6 = new JButton("Six");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
