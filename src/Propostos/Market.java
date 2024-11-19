package Propostos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Market implements ActionListener{

    public Market(){
        Panel panel1 = new Panel();
        panel1.setLayout(new GridLayout(12, 3));
        panel1.setVisible(true);

        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(12, 1));
        panel2.setVisible(true);

        Panel panel3 = new Panel();
        panel3.setLayout(new GridLayout(12, 1));
        panel3.setVisible(true);


        JButton buyButton = new JButton("Buy");
        JLabel totalBill = new JLabel("Total Bill: ");


        Label l1 = new Label("Products");
        panel1.add(l1);
        JCheckBox cb1 = new JCheckBox("Potato");
        panel1.add(cb1);
        JCheckBox cb2 = new JCheckBox("Carrot");
        panel1.add(cb2);
        JCheckBox cb3 = new JCheckBox("Onion");
        panel1.add(cb3);
        JCheckBox cb4 = new JCheckBox("Beet");
        panel1.add(cb4);
        JCheckBox cb5 = new JCheckBox("Cucumber");
        panel1.add(cb5);
        JCheckBox cb6 = new JCheckBox("Pepper");
        panel1.add(cb6);
        JCheckBox cb7 = new JCheckBox("Tomato");
        panel1.add(cb7);

        Label l3 = new Label("Amount(kg)");
        panel3.add(l3);
        TextField tf1 = new TextField();
        panel3.add(tf1);
        TextField tf2 = new TextField();
        panel3.add(tf2);
        TextField tf3 = new TextField();
        panel3.add(tf3);
        TextField tf4 = new TextField();
        panel3.add(tf4);
        TextField tf5 = new TextField();
        panel3.add(tf5);
        TextField tf6 = new TextField();
        panel3.add(tf6);
        TextField tf7 = new TextField();
        panel3.add(tf7);


        Label l2 = new Label("Value");
        panel2.add(l2);
        Label v1 = new Label("$ 1.50");
        panel2.add(v1);
        Label v2 = new Label("$ 2.00");
        panel2.add(v2);
        Label v3 = new Label("$ 3.10");
        panel2.add(v3);
        Label v4 = new Label("$ 2.35");
        panel2.add(v4);
        Label v5 = new Label("$ 1.85");
        panel2.add(v5);
        Label v6 = new Label("$ 3.00");
        panel2.add(v6);
        Label v7 = new Label("$ 3.50");
        panel2.add(v7);
        panel2.add(buyButton);
        panel2.add(totalBill);


        JFrame jframe = new JFrame();
        jframe.setTitle("Market");
        jframe.setSize(500, 800);
        jframe.setLayout(new GridLayout(1,3 ));
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);



        jframe.add(panel1);
        jframe.add(panel2);
        jframe.add(panel3);



        jframe.setVisible(true);
        buyButton.addActionListener(e -> {
            float totalBillValue = 0;
           if(tf1.getText() != "" && cb1.isSelected()){
               float tf1Value = Float.parseFloat(tf1.getText());
               totalBill.setText("Total Bill: $ " + (totalBillValue += (tf1Value * 1.50)));
           }
           if(tf2.getText() != "" && cb2.isSelected()){
                float tf2Value = Float.parseFloat(tf2.getText());
                totalBill.setText("Total Bill: $ " + (totalBillValue += (tf2Value * 2.00)));
           }
            if(tf3.getText() != "" && cb3.isSelected()){
                float tf3Value = Float.parseFloat(tf3.getText());
                totalBill.setText("Total Bill: $ " + (totalBillValue += (tf3Value * 3.10)));
            }
            if(tf4.getText() != "" && cb4.isSelected()){
                float tf4Value = Float.parseFloat(tf4.getText());
                totalBill.setText("Total Bill: $ " + (totalBillValue += (tf4Value * 2.35)));
            }
            if(tf5.getText() != "" && cb5.isSelected()){
                float tf5Value = Float.parseFloat(tf5.getText());
                totalBill.setText("Total Bill: $ " + (totalBillValue += (tf5Value * 1.85)));
            }
            if(tf6.getText() != "" && cb6.isSelected()){
                float tf6Value = Float.parseFloat(tf6.getText());
                totalBill.setText("Total Bill: $ " + (totalBillValue += (tf6Value * 3.00)));
            }
            if(tf7.getText() != "" && cb7.isSelected()){
                float tf7Value = Float.parseFloat(tf7.getText());
                totalBill.setText("Total Bill: $ " + (totalBillValue += (tf7Value * 3.50)));
            }
        });


    }



    public static void main(String [] args){
        new Market();
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
