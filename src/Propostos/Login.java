package Propostos;

import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class Login implements ActionListener {


    String user = "";
    char[] pass;
    public Login(){
        CardLayout cl = new CardLayout();

        JLabel info = new JLabel("Enter your user and password: ");
        JLabel userL = new JLabel("User:");
        JLabel passL = new JLabel("Password:");
        JTextField userTf = new JTextField(10);
        JPasswordField passTf = new JPasswordField(10);
        JButton register = new JButton("Register");
        JButton login = new JButton("Login");
        JButton cancel = new JButton("Cancel");



        JFrame jframe = new JFrame();
        jframe.setTitle("Login");
        jframe.setSize(400,250);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLayout(new GridLayout(6,2));
        jframe.setResizable(false);

        JFrame jframe1 = new JFrame();
        jframe1.setTitle("Welcome to application main window");
        jframe1.setSize(500, 300);
        jframe1.setResizable(false);




        //jframe.add(info);
        jframe.add(userL);
        jframe.add(passL);
        jframe.add(userTf);
        jframe.add(passTf);
        jframe.add(register);
        jframe.add(login);
        jframe.add(cancel);
        jframe.setVisible(true);

        register.addActionListener(e -> {
            user = userTf.getText();
            pass = passTf.getPassword();
            if(!user.isEmpty()){
                JOptionPane.showMessageDialog(jframe, "User successfully register");
                userTf.setText("");
                passTf.setText("");
            }
        });
        cancel.addActionListener(e -> {
           userTf.setText("");
           passTf.setText("");
        });
        login.addActionListener(e -> {
            String userLogin = userTf.getText();
            char[] passLogin = passTf.getPassword();
           if(userLogin.equals(user) && Arrays.equals(pass, passLogin)){
                jframe.setVisible(false);
                jframe1.setVisible(true);
           }
           else{
               JOptionPane.showMessageDialog(jframe, "Invalid user or password");
           }
        });

    }

    public static void main(String [] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
