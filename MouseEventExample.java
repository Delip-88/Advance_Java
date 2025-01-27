import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener {
    public JTextField t1,t2,t3;
    MouseEventExample(){
        JLabel l1 = new JLabel("First Number");
        JLabel l2 = new JLabel("Second Number");
        JLabel l3 = new JLabel("Result");

        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        t3.setEditable(false);  // Make result field non-editable


        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        t3.addMouseListener(this);

        setTitle("Event Handling");
        setSize(200,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void mousePressed(MouseEvent ae){
        int x,y,z=0;
        try {
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
            z= x+y;
            t3.setText(String.valueOf(z));
            
        } catch (Exception e) {
            t3.setText("Invalid Input");
        }


    }
    public void mouseReleased(MouseEvent ae){
        int x,y,z=0;
        try {
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
            z= x-y;
            t3.setText(String.valueOf(z));
            
        } catch (Exception e) {
            t3.setText("Invalid Input");
        }

    }
    public void mouseExited(MouseEvent ae){
        
    }
    public void mouseClicked(MouseEvent ae){
        
    }
    public void mouseEntered(MouseEvent ae){
        
    }
    public static void main(String[] args) {
        new MouseEventExample();
    }
}
