import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {

    GridBagLayoutExample() {
        setSize(400, 400);
        setTitle("Grid bag layout example");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();
        setLayout(new GridBagLayout());

        JButton b1 = new JButton("One");
        c.gridx = 0;
        c.gridy = 0;
        add(b1, c);  

        JButton b2 = new JButton("Two");
        c.gridx = 1;
        c.gridy = 1;
        add(b2, c);

        JButton b3 = new JButton("Three");
        c.gridx = 2;
        c.gridy = 2;
        add(b3, c);

        JButton b4 = new JButton("Four");
        c.gridx = 4;
        c.gridy = 4;
        add(b4, c);
    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }

}
