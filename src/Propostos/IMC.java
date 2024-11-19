package Propostos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

public class IMC implements ActionListener{

    public IMC(){

        JLabel weightLabel = new JLabel("Type your weight in kg: ");
        JTextField weightText = new JTextField();

        JLabel heightLabel = new JLabel("Type your height in m:");
        JTextField heightText = new JTextField();

        JButton calculateButton = new JButton("Calculate");

        JFrame jframe = new JFrame();
        jframe.setSize(400, 400);
        jframe.setLayout(new GridLayout(6, 1));
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);



        jframe.add(weightLabel);
        jframe.add(weightText);
        jframe.add(heightLabel);
        jframe.add(heightText);
        jframe.add(calculateButton);
        jframe.setVisible(true);

        calculateButton.addActionListener(e -> {
            double imc = 0;

            if(weightText.getText().isEmpty() || heightText.getText().isEmpty()){
                JOptionPane.showMessageDialog(jframe, "Please, fill all requested fields");
            }

            double weight = Double.parseDouble(weightText.getText());
            double height = Double.parseDouble(heightText.getText());
            imc = weight / (Math.pow(height, 2));


            if(imc < 16.9){
                JOptionPane.showMessageDialog(jframe, String.format("Your IMC: %.2f\nYou're very underweight", imc));
            }
            else if(imc >= 17 && imc < 18.5){
                JOptionPane.showMessageDialog(jframe, String.format("Your IMC: %.2f\nYou're underweight", imc));
            }
            else if(imc >= 18.5 && imc < 25.0){
                JOptionPane.showMessageDialog(jframe, String.format("Your IMC: %.2f\nYou're at normal weight", imc));
            }
            else if(imc >= 25.0 && imc < 30.0){
                JOptionPane.showMessageDialog(jframe, String.format("Your IMC: %.2f\nYou're overweight", imc));
            }
            else if(imc >= 30.0 && imc < 35.0){
                JOptionPane.showMessageDialog(jframe, String.format("Your IMC: %.2f\nYou have level 1 obesity", imc));
            }
            else if(imc >= 35.0 && imc < 40.0){
                JOptionPane.showMessageDialog(jframe, String.format("Your IMC: %.2f\nYou have level 2 obesity", imc));
            }
            else if(imc >= 40.0){
                JOptionPane.showMessageDialog(jframe, String.format("Your IMC: %.2f\nYou have level 3 obesity (morbid obesity)", imc));
            }
        });
    }



    public static void main(String [] args){
        new IMC();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
