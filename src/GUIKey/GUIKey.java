package GUIKey;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUIKey {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Programm Menu");
        frame.setBounds(600,400,850,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Press key that can be typed ");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed key");

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Press key - released");
                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == 27){
                    System.out.println("Pressed Esc");
                    System.exit(0);
                }

            }
        });


        frame.setVisible(true);

    }
}
