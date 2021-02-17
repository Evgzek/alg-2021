package ru.bgpu.lec.ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PaintPanel extends JPanel implements ActionListener, MouseMotionListener {

    private Timer timer = new Timer(40, this);
    private Ball ball = new Ball(0,0,50, Color.decode("#54b7d0"));

    private int tx;
    private int ty;

    public PaintPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(600,600));
        tx = 300; ty = 300;
        addMouseMotionListener(this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ball.paint(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ball.move(tx, ty);
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e) {
        tx = e.getX();
        ty = e.getY();
    }
}
