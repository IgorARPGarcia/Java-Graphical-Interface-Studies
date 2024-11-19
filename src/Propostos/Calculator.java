package Propostos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {

    double num1 = 0;
    String operator = "";

    public Calculator(){

        Panel panel1 = new Panel();
        panel1.setLayout(new GridLayout(1, 1));

        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(4,4));


        JTextField input = new JTextField(30);
        panel1.add(input);
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton point = new JButton(".");
        JButton equal = new JButton("=");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton division = new JButton("/");
        panel2.add(seven);
        panel2.add(eight);
        panel2.add(nine);
        panel2.add(division);
        panel2.add(four);
        panel2.add(five);
        panel2.add(six);
        panel2.add(multiply);
        panel2.add(one);
        panel2.add(two);
        panel2.add(three);
        panel2.add(minus);
        panel2.add(zero);
        panel2.add(point);
        panel2.add(equal);
        panel2.add(plus);



        JFrame jframe = new JFrame();
        jframe.setTitle("Calculator");
        jframe.setSize(350, 350);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLayout(new BorderLayout());
        jframe.setResizable(false);




        jframe.add(panel1, BorderLayout.NORTH);
        jframe.add(panel2, BorderLayout.CENTER);

        jframe.setVisible(true);

        StringBuilder finalCalculation = new StringBuilder("");

        zero.addActionListener(e -> {
            finalCalculation.append(0);
            input.setText(finalCalculation.toString());
        });
        one.addActionListener(e -> {
            finalCalculation.append(1);
            input.setText(finalCalculation.toString());
        });
        two.addActionListener(e -> {
            finalCalculation.append(2);
            input.setText(finalCalculation.toString());
        });
        three.addActionListener(e -> {
            finalCalculation.append(3);
            input.setText(finalCalculation.toString());
        });
        four.addActionListener(e -> {
            finalCalculation.append(4);
            input.setText(finalCalculation.toString());
        });
        five.addActionListener(e -> {
            finalCalculation.append(5);
            input.setText(finalCalculation.toString());
        });
        six.addActionListener(e -> {
            finalCalculation.append(6);
            input.setText(finalCalculation.toString());
        });
        seven.addActionListener(e -> {
            finalCalculation.append(7);
            input.setText(finalCalculation.toString());
        });
        eight.addActionListener(e -> {
            finalCalculation.append(8);
            input.setText(finalCalculation.toString());
        });
        nine.addActionListener(e -> {
            finalCalculation.append(9);
            input.setText(finalCalculation.toString());
        });
        point.addActionListener(e -> {
            finalCalculation.append(".");
            input.setText(finalCalculation.toString());
        });

        minus.addActionListener(e -> {
            num1 = Double.parseDouble(input.getText());
            operator = "-";
            finalCalculation.setLength(0);
            input.setText("");
        });
        multiply.addActionListener(e -> {
            num1 = Double.parseDouble(input.getText());
            operator = "*";
            finalCalculation.setLength(0);
            input.setText("");
        });
        division.addActionListener(e -> {
            num1 = Double.parseDouble(input.getText());
            operator = "/";
            finalCalculation.setLength(0);
            input.setText("");
        });
        plus.addActionListener(e -> {
            num1 = Double.parseDouble(input.getText());
            operator = "+";
            finalCalculation.setLength(0);
            input.setText("");
        });

        equal.addActionListener(e -> {
            double num2 = Double.parseDouble(input.getText());
            double result = 0;
            switch(operator){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;

            }
            input.setText(String.valueOf(result));
            finalCalculation.setLength(0);
            operator = "";

        });

    }


    public static void main(String [] args){
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
