package ru.bgpu.lec.ball;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        PaintPanel panel = new PaintPanel();

        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
