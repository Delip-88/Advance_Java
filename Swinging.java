

import javax.swing.*;
import java.awt.*;

public class Swinging extends JFrame {
Swinging(){
    setSize(400,400);
    setTitle("FOrm");
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.LEFT));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    JLabel l1= new JLabel("Frist Name");
    JLabel l2 = new JLabel("Last Name");
    JLabel l3 = new JLabel("Gender");
    JLabel l4 = new JLabel("Hobbies");
    JLabel l5 = new JLabel("Country");
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);
    JRadioButton b1 = new JRadioButton("Male");
    JRadioButton b2 = new JRadioButton("Female");
    ButtonGroup g1 = new ButtonGroup();
    JCheckBox c1 = new JCheckBox("Swimming");
    JCheckBox c2 = new JCheckBox("Dancing");
    JCheckBox c3 = new JCheckBox("Singing");
    String country[]={"nepal","ktm","chitwan","nepalgunj"};
    JComboBox j1 = new JComboBox(country);
    
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    g1.add(b1);
    g1.add(b2);
    add(b1);
    add(b2);
    add(l4);
    add(c1);
    add(c2);
    add(c3);
    add(l5);
    add(j1);
    
    
    
}
    public static void main(String[] args) {
        Swinging s = new Swinging();
    }
}
