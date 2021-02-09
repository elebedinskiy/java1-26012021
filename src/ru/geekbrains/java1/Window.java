package ru.geekbrains.java1;

import javafx.scene.input.DataFormat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    Window(){

        setSize(600,400);
        setLocation(400,400);
        setTitle("Урок 8: практическое задание");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JTextField field1 = new JTextField();
        field1.setColumns(30);

        JTextArea jTextArea1 = new JTextArea();
        JButton batton1 = new JButton("Ок");
        JButton batton2 = new JButton("Выход");
        JPanel panel1 = new JPanel();

        add(jTextArea1, BorderLayout.CENTER);

        panel1.add(field1);
        panel1.add(batton1);
        panel1.add(batton2);
        add(panel1, BorderLayout.SOUTH);

        field1.addActionListener(e -> {
            jTextArea1.append(">> " + field1.getText() + "\n");
            field1.setText("");

        });
        batton1.addActionListener(e -> {
            jTextArea1.append(">> " + field1.getText() + "\n");
            field1.setText("");
        });
        batton2.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
