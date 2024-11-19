package Resolvidos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MouseAction2 implements ActionListener {

    public MouseAction2(){




        JFrame jframe = new JFrame();
        jframe.setTitle("Mouse Action 2");
        jframe.setSize(400, 200);
        jframe.setLayout(new FlowLayout());
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setResizable(false);

        JButton playButton = new JButton("PLAY");
        JButton clearButton = new JButton("CLEAR");

        jframe.add(playButton);


        playButton.addActionListener(e -> {
            jframe.add(clearButton);
            jframe.revalidate();
            jframe.repaint();
        });

        clearButton.addActionListener(e -> {
            jframe.remove(clearButton);
            jframe.repaint();
        });




        jframe.setVisible(true);




    }



    public static void main(String[] args){
        new MouseAction2();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
