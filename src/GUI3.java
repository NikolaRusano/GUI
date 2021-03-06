import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUI3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Program3");
        frame.setBounds(600,400,850,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20,0,0,0));
        JLabel labelTitle = new JLabel("My Form");
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD,22));
        top.add(labelTitle);

        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Name: ");
        JTextField nameTF = new JTextField();
        JLabel emailF = new JLabel("E-mail: ");
        JTextField emailTF = new JTextField();


        nameTF.setHorizontalAlignment(SwingConstants.RIGHT);
        emailTF.setHorizontalAlignment(SwingConstants.RIGHT);

        nameTF.setPreferredSize(new Dimension(200,40));
        emailTF.setPreferredSize(new Dimension(200,40));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0,0,10,5);
        form.add(nameL,c);

        c.gridx = 1;
        form.add(nameTF,c);

        c.gridx = 0;
        c.gridy = 1;
        form.add(emailF,c);

        c.gridx = 1;
        form.add(emailTF,c);

        JPanel bottom = new JPanel();
        JCheckBox news = new JCheckBox("Subscribe for news");
        JButton button = new JButton("Send");
        button.setPreferredSize(new Dimension(200,50));
        //bottom.setLayout(new BorderLayout());
        bottom.add(news);
        bottom.add(button);
        bottom.setBorder(new EmptyBorder(0,0,20,0));

        frame.add(top,BorderLayout.NORTH);
        frame.add(form,BorderLayout.CENTER);
        frame.add(bottom,BorderLayout.SOUTH);


        frame.setVisible(true);
    }
}
