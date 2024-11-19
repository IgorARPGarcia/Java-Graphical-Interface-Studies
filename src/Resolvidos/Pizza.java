package Resolvidos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizza implements ActionListener {

    public Pizza(){
        JFrame jframe = new JFrame("Pizza Order");
        jframe.setSize(600, 400);
        jframe.setLayout(new GridLayout(5, 1));
        jframe.setLocation(0,0);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        JCheckBox cheeseBox = new JCheckBox("Cheese");
        JCheckBox mushroomBox = new JCheckBox("Mushroom");
        JCheckBox onionBox = new JCheckBox("Onion");

        JLabel label1 = new JLabel("Choose the ingredients:");

        JButton finishOrder = new JButton("Finish Order");

        jframe.add(label1);
        jframe.add(cheeseBox);
        jframe.add(mushroomBox);
        jframe.add(onionBox);
        jframe.add(finishOrder);

        finishOrder.addActionListener(e -> {
            StringBuilder sb = new StringBuilder("Pizza: ");
           if(cheeseBox.isSelected()){
               sb.append("\n-Cheese");
           }
           if(mushroomBox.isSelected()){
               sb.append("\n-Mushroom");
           }
           if(onionBox.isSelected()){
               sb.append("\n-Onion");
           }
           JOptionPane.showMessageDialog(jframe, sb.toString());
        });






        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Pizza();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
