package GUIIserComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    final  static public int EXIT = 0;
    final  static public int PRINT = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        int code = ((MyComponent)e.getSource()).getCode();
        if(code == EXIT){
            System.exit(0);
        }else if (code == PRINT){
            System.out.println("Out into console info ...");
        }
    }
}
