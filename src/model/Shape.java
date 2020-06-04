package model;

import java.awt.*;
import java.io.Serializable;

public abstract class Shape implements Serializable {
    int x1, y1;

    Color color;
    Graphics graphics;
    Graphics2D graphics2D;

    abstract void Draw(Graphics graphics);
}

class Circle extends Shape{
    Circle(){
        super();
    }

    @Override
    void Draw(Graphics graphics) {
        graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(color);
        graphics2D.drawOval(x1 - 50, y1 + 50, 100, 100);
    }
}

class Rectangle extends Shape{
    Rectangle(){
        super();
    }

    @Override
    void Draw(Graphics graphics) {
        graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(color);
        graphics2D.drawRect(x1 - 50, y1 + 50, 100, 100);
    }
}