package ru.bgpu.lec.ball;

import java.awt.*;

public class Ball {

    private int x;
    private int y;

    private int r;

    private Color color;

    public Ball(int x, int y, int r, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color.brighter());
        g.fillOval(x,y,r,r);
        g.setColor(color.darker());
        g.fillOval(x,y,r,r);
    }

    public void move(int tx, int ty) {
        if(x < tx) {
            x += 10;
        } else {
            x -= 10;
        }
        if(y < ty) {
            y += 10;
        } else {
            y -= 10;
        }
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
