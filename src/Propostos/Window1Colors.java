package Propostos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window1Colors implements ActionListener{

    public Window1Colors(){

        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.green);
        JButton yellowButton = new JButton("Yellow");
        yellowButton.setBackground(Color.yellow);
        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        JButton blackButton = new JButton("Black");
        blackButton.setBackground(Color.black);

        JFrame jframe = new JFrame();
        jframe.setTitle("Background Colors");
        jframe.setSize(400, 200);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setLayout(new FlowLayout());



        jframe.add(greenButton);
        jframe.add(yellowButton);
        jframe.add(whiteButton);
        jframe.add(redButton);
        jframe.add(blueButton);
        jframe.add(blackButton);
        jframe.setVisible(true);

        greenButton.addActionListener(e -> {
           jframe.getContentPane().setBackground(Color.GREEN);
        });
        yellowButton.addActionListener(e -> {
            jframe.getContentPane().setBackground(Color.YELLOW);
        });
        whiteButton.addActionListener(e -> {
            jframe.getContentPane().setBackground(Color.WHITE);
        });
        redButton.addActionListener(e -> {
            jframe.getContentPane().setBackground(Color.RED);
        });
        blueButton.addActionListener(e -> {
            jframe.getContentPane().setBackground(Color.BLUE);
        });
        blackButton.addActionListener(e -> {
            jframe.getContentPane().setBackground(Color.BLACK);
        });


    }



    public static void main(String [] args){
        new Window1Colors();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
