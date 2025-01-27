


import javax.swing.*;
import java.awt.*;

public class MenuBar extends JFrame {
MenuBar(){
    setSize(600,600);
    setTitle("MENUBAR");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JMenuBar menubar = new JMenuBar();
    JMenu filemenu = new JMenu("File");
    JMenu editmenu = new JMenu("edit");
    JMenu helpmenu = new JMenu("help");

    menubar.add(filemenu);
    menubar.add(editmenu);
    menubar.add(helpmenu);
    
    setJMenuBar(menubar);

    JMenuItem save = new JMenuItem("Save");
    JMenuItem saveas = new JMenuItem("Save As");
    JMenuItem close = new JMenuItem("Close");
    JMenuItem call = new JMenuItem("Call 911");
    
    
    filemenu.add(save);
    filemenu.add(saveas);
    filemenu.add(close);
    helpmenu.add(call);
    
    
    
}
    public static void main(String[] args) {
        new MenuBar();
    }
}
