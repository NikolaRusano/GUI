package MyFrame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JTextField nameTF;
    private JTextField emailTF;
    private JCheckBox news;


    public MyFrame(){
        super("My Programm");
        setBounds(600,400,850,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20,0,0,0));
        JLabel labelTitle = new JLabel("My Form");
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD,22));
        top.add(labelTitle);

        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Name: ");
        nameTF = new JTextField();
        JLabel emailF = new JLabel("E-mail: ");
        emailTF = new JTextField();


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
        news = new JCheckBox("Subscribe for news");
        JButton button = new JButton("Send");
        button.setPreferredSize(new Dimension(200,50));
        //bottom.setLayout(new BorderLayout());
        bottom.add(news);
        bottom.add(button);
        bottom.setBorder(new EmptyBorder(0,0,20,0));

        add(top,BorderLayout.NORTH);
        add(form,BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);

       /* button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                top.setBackground(Color.GREEN);
                form.setBackground(Color.CYAN);
                bottom.setBackground(Color.BLUE);
                labelTitle.setForeground(Color.ORANGE);
            }
        })*/
    button.addActionListener(this);
    news.addActionListener(this);

    }




    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        if (ae.getActionCommand().equals("Subscribe for news")){
            System.out.println("Pressed checkbox");
        }else if(ae.getActionCommand().equals("Send")){
            System.out.println("Pressed button Send");
            String name = nameTF.getText();
            String email = emailTF.getText();
            boolean bNews = news.isSelected();
            try{
                User user = new User(name,email,bNews);
                User.add(user);
                User.printAllUsers();
            }catch (UserException e){
                if(e.getCode() == UserException.NO_NAME) showError("You haven't inputted name");
                else if(e.getCode() == UserException.NO_EMAIL) showError("You haven't inputted e-mail");
            }
        }
    }

    private void showError(String text) {
        JOptionPane.showMessageDialog(this,text,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
