package Resolvidos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public MouseAction(){


        JButton buttonOk = new JButton("OK");
        JButton buttonCancel = new JButton("CANCEL");


        JFrame jframe = new JFrame();
        jframe.setTitle("Mouse Action");
        jframe.setSize(350, 250);
        jframe.setLayout(new GridLayout(2,1));
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);



        jframe.add(buttonOk);
        jframe.add(buttonCancel);

        buttonOk.addActionListener(e -> {
            JOptionPane.showMessageDialog(jframe, "OK Button Pressed");
        });
        buttonCancel.addActionListener(e -> {
            JOptionPane.showMessageDialog(jframe, "CANCEL Button Pressed");
        });





        jframe.setVisible(true);




    }

    public static void main(String [] args){
        new MouseAction();
    }
}
