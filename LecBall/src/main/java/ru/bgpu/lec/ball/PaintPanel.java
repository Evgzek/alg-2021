package ru.bgpu.lec.ball;

import ru.bgpu.lec.list.LecList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class PaintPanel extends JPanel implements ActionListener, MouseMotionListener {

    private Timer timer = new Timer(40, this);
    private LecList list = new LecList();
//    private Ball ball = new Ball(0,0,50, Color.decode("#54b7d0"));

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
        for(Object ball: list) {
            ((Ball)ball).paint(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Object ball: list) {
            ((Ball)ball).move(tx,ty);
        }
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Random random = new Random();
        int r = random.nextInt(10)+20;
        list.addFirst(
                new Ball(
                     e.getX()+r/2,
                     e.getY()+r/2,
                     r,
                     new Color(
                             e.getX() % 256,
                             e.getY() % 256,
                             (e.getX()+e.getY()+r) % 256,
                             100
                     )
                )
        );
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        tx = e.getX();
        ty = e.getY();
    }
}
