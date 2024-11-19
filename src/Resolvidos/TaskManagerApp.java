package Resolvidos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskManagerApp implements ActionListener {

    public TaskManagerApp() {
        JFrame jframe = new JFrame("Task Manager");

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);

        JTextField text = new JTextField(20);
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");

        JPanel panel = new JPanel();
        panel.add(text);
        panel.add(addButton);
        panel.add(removeButton);

        jframe.setLayout(new BorderLayout());
        jframe.add(new JScrollPane(list), BorderLayout.CENTER);
        jframe.add(panel, BorderLayout.SOUTH);


        jframe.setSize(800, 600);
        jframe.setLocation(0,0);
        jframe.setVisible(true);

        addButton.addActionListener(e ->{
            String task = text.getText();
            model.addElement(task);
            text.setText("");
        });

        removeButton.addActionListener(e ->{
            String task = list.getSelectedValue();
            model.removeElement(task);
            text.setText("");
        });


    }



    public static void main(String [] args){
        new TaskManagerApp();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
