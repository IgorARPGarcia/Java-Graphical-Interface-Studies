package Resolvidos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JPasswordField passwordField;
    JLabel label;

    public Login() {
        super("Testando JTextField e JPasswordField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);


        textField2 = new JTextField("Digite um texto aqui");
        add(textField2);


        textField3 = new JTextField("TextField desabilitado para edição", 21);
        textField3.setEditable(false);
        add(textField3);


        passwordField = new JPasswordField("Password");
        add(passwordField);
        label = new JLabel("Tecle Enter após digitação em algum TextFields");
        add(label);


        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);

        setLocation(400, 200);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class TextFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = "";


            if (event.getSource() == textField1) {
                string = String.format("textField1: %s", event.getActionCommand());
            }

            else if (event.getSource() == textField2) {
                string = String.format("textField2: %s", event.getActionCommand());
            }

            else if (event.getSource() == textField3) {
                string = String.format("textField3: %s", event.getActionCommand());
            }

            else if (event.getSource() == passwordField) {
                string = String.format("passwordField: %s", new String(passwordField.getPassword()));
            }

            JOptionPane.showMessageDialog(null, string);
        }
    }

    public static void main(String[] args) {
        new Login();

    }
}


