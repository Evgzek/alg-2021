package ru.bgpu.lec.ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintPanel extends JPanel implements ActionListener {

    private Timer timer = new Timer(40, this);
    private int y = 0;

    public PaintPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(600,600));
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(0,y,200,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        y++;
        repaint();
    }
}
