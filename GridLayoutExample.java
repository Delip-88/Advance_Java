
import javax.swing.*;
import java.awt.*;


public class GridLayoutExample extends JFrame{
    GridLayoutExample(){
        setSize(500,500);
        setTitle("Grid Layout Example");
        setVisible(true);
        setLayout(new GridLayout(4,4,10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("One");
        JButton b2 = new JButton("Two");
        JButton b3 = new JButton("Three");
        JButton b4 = new JButton("Four");
        JButton b5 = new JButton("Five");
        JButton b6 = new JButton("Six");
        JButton b7 = new JButton("Seven");
        JButton b8 = new JButton("eight");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        
        
        
    }
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
