package ru.bgpu.lec.ball;

import java.awt.*;
import java.util.Random;

public class Ball {

    private int x;
    private int y;
    private int dx;
    private int dy;

    private int r;

    private Color color;
    private Random random = new Random();

    public Ball(int x, int y, int r, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,r,r);
        g.setColor(new Color(
                color.getRed(), color.getGreen(), color.getBlue()
        ));
        g.drawOval(x,y,r,r);
    }

    public void move(int tx, int ty) {
        if(x < tx) {
            dx += random.nextInt(3);
        } else {
            dx -= random.nextInt(3);
        }
        if(y < ty) {
            dy += random.nextInt(3);
        } else {
            dy -= random.nextInt(3);
        }
        if(dx > 10) dx = 10;
        if(dy > 10) dy = 10;
        x = x + dx;
        y = y + dy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
