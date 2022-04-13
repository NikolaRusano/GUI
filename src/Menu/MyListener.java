package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    JFrame frame;
    public MyListener(JFrame frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        String c = ae.getActionCommand();
        if(c.equals("Exit")){
            System.exit(0);
        }else if (c.equals("Blue")){
            frame.getContentPane().setBackground(Color.BLUE);
        }else if (c.equals("Yellow")){
            frame.getContentPane().setBackground(Color.YELLOW);

        }

    }
}
