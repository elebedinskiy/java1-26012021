package ru.geekbrains.java1;

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

        JButton batton1 = new JButton("Ок");
        JButton batton2 = new JButton("Выход");
        JPanel panel1 = new JPanel();
        panel1.add(batton1);
        panel1.add(batton2);
        add(panel1, BorderLayout.SOUTH);

        batton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ... кнопка ок
            }
        });
        batton2.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
