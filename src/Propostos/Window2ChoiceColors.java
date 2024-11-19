package Propostos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Window2ChoiceColors implements ActionListener {

    public Window2ChoiceColors(){

        Choice c1 = new Choice();
        c1.add("Green");
        c1.add("Blue");
        c1.add("Red");
        c1.add("Black");

        JCheckBox backGroundBox = new JCheckBox("Background");
        JCheckBox foreGroundBox = new JCheckBox("Foreground");

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        JFrame jframe = new JFrame();
        jframe.setTitle("Choice Colors");
        jframe.setSize(400, 200);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout());




        jframe.add(c1);
        jframe.add(backGroundBox);
        jframe.add(foreGroundBox);
        jframe.add(okButton);
        jframe.add(cancelButton);
        jframe.setVisible(true);

        okButton.addActionListener(e -> {
           if(backGroundBox.isSelected() && c1.getSelectedItem().equals("Green")){
               jframe.getContentPane().setBackground(Color.GREEN);
           }
           else if(backGroundBox.isSelected() && c1.getSelectedItem().equals("Blue")){
               jframe.getContentPane().setBackground(Color.BLUE);
           }
           else if(backGroundBox.isSelected() && c1.getSelectedItem().equals("Red")){
               jframe.getContentPane().setBackground(Color.RED);
           }
           else if(backGroundBox.isSelected() && c1.getSelectedItem().equals("Black")){
               jframe.getContentPane().setBackground(Color.BLACK);
           }
           if(foreGroundBox.isSelected() && c1.getSelectedItem().equals("Green")){
               jframe.getContentPane().setForeground(Color.GREEN);
               c1.setForeground(Color.GREEN);
           }
           else if(foreGroundBox.isSelected() && c1.getSelectedItem().equals("Blue")){
               jframe.getContentPane().setForeground(Color.BLUE);
               c1.setForeground(Color.BLUE);
           }
           else if(foreGroundBox.isSelected() && c1.getSelectedItem().equals("Red")){
               jframe.getContentPane().setForeground(Color.RED);
               c1.setForeground(Color.RED);
           }
           else if(foreGroundBox.isSelected() && c1.getSelectedItem().equals("Black")){
               jframe.getContentPane().setForeground(Color.BLACK);
               c1.setForeground(Color.BLACK);
           }

        });
        cancelButton.addActionListener(e -> {
            jframe.getContentPane().setBackground(Color.WHITE);
            c1.setForeground(Color.BLACK);
        });

    }

    public static void main(String [] args){
        new Window2ChoiceColors();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
