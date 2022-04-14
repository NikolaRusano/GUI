package Menu;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GUIMenu {

    public static void main(String[] args) {


        JFrame frame = new JFrame("My Programm Menu");
        MyListener listener = new MyListener(frame);
        frame.setBounds(600,400,850,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Programm");
        JMenuItem exit = new JMenuItem("Exit");
        main.add(exit);
        mb.add(main);

        JMenu bg = new JMenu("Background");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem yellow = new JMenuItem("Yellow");
        bg.add(blue);
        bg.add(yellow);
        mb.add(bg);

        JMenu submenu = new JMenu("SubMenu");
        bg.add(submenu);
        JMenuItem submenuItem = new JMenuItem("Item of submenu");
        submenu.add(submenuItem);
        submenu.addSeparator();
        JCheckBoxMenuItem checkboxItem = new JCheckBoxMenuItem("CheckBox");
        submenu.add(checkboxItem);


        frame.setJMenuBar(mb);

        exit.addActionListener(listener);
        blue.addActionListener(listener);
        yellow.addActionListener(listener);
        submenuItem.addActionListener(listener);
        checkboxItem.addActionListener(listener);

        frame.setVisible(true);
    }
}
