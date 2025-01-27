import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingExample extends JFrame implements ActionListener {
    private JTextField t1, t2, t3;

    public EventHandlingExample() {
        JLabel l1 = new JLabel("First Number");
        JLabel l2 = new JLabel("Second Number");
        JLabel l3 = new JLabel("Result");

        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        t3.setEditable(false);  // Make result field non-editable

        JButton b1 = new JButton("Add");

        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        
        b1.addActionListener(this);

        setTitle("Event Handling");
        setSize(200,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int x, y, z = 0;
        try {
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());

            if (ae.getActionCommand().equals("Add")) {  // Use equals for string comparison
                z = x + y;
                t3.setText(String.valueOf(z));
            }
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new EventHandlingExample();
    }
}
