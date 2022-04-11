import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My programm");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(size);
        //frame.setBounds(0,0,size.width,size.height);
        frame.setLocation(0,0);
        frame.setSize(size);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
