package GUIIserComponent;

import javax.swing.*;

public class GUIIserComponent {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Programm Menu");
        frame.setBounds(600,400,850,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyComponent exit = new MyComponent("Exit", MyListener.EXIT);
        exit.addActionListener(new MyListener());

        MyComponent print = new MyComponent("Print", MyListener.PRINT);
        print.addActionListener(new MyListener());

        print.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        exit.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(print);
        //panel.add(Box.createVerticalGlue());
        panel.add(Box.createVerticalStrut(30));
        panel.add(exit);



        frame.add(panel);
        frame.setVisible(true);

    }
}
