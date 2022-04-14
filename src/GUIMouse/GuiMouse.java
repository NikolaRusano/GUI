package GUIMouse;

import Menu.MyListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GuiMouse {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Programm Menu");
        frame.setBounds(600,400,850,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse click");
                System.out.println(e.getX() + " - " + e.getY());
                if (e.getButton() == MouseEvent.BUTTON1){
                    System.out.println("Clicked left mouse btn");
                }else if (e.getButton() == MouseEvent.BUTTON3){
                    System.out.println("Clicked right mouse btn");
                }else if (e.getButton() == MouseEvent.BUTTON2){
                    System.out.println("Clicked middle mouse btn");
                }else if (e.getButton() == MouseEvent.MOUSE_MOVED){
                    System.out.println("Clicked  mouse wheel btn");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //System.out.println("Mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //System.out.println("Mouse button released from press");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //System.out.println("Mouse cursor is over the container");
            }

            @Override
            public void mouseExited(MouseEvent e) {
               //System.out.println("Mouse cursor is get out of the container");
            }
        });

        frame.setVisible(true);

    }
}
