import javax.swing.*;

public class GUI2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programm2");
        frame.setBounds(300,300,850,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        JButton button = new JButton("Button");
        panel.add(button);

        JLabel label = new JLabel("Label Text");
        panel.add(label);

        JCheckBox checkBox = new JCheckBox("Checkbox Text");
        panel.add(checkBox);

        JTextField tf = new JTextField("Text by default");
        panel.add(tf);

        ButtonGroup bg = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("RadiaBtn1");
        JRadioButton rb2 = new JRadioButton("RadiaBtn1");
        bg.add(rb1);
        bg.add(rb2);
        panel.add(rb1);
        panel.add(rb2);

        JTextArea ta = new JTextArea("Text in Text Area");
        panel.add(ta);

        String[][] data = {{"1","2"},{"3","4"},{"5","6"},{"7","8"},{"9","10"},{"11","12"}
                ,{"13","14"},{"15","16"},{"17","18"},{"19","20"},{"21","22"},{"23","24"},{"25","26"},{"27","28"},
                {"29","30"},{"31","32"},{"33","32"},{"31","32"},{"31","32"},{"31","32"},{"31","32"},{"31","32"},
                {"31","32"},{"31","32"},{"31","32"},{"31","32"},{"31","32"},{"31","32"},{"31","32"},{"31","32"}};
        String[] cols = {"Column1","Column2"};

        JTable table = new JTable(data,cols);
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);
        //panel.add(table);


        frame.add(panel);
        frame.setVisible(true);

    }
}
