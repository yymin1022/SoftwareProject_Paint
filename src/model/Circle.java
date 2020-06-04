package model;

import java.awt.*;

public class Circle extends Shape{
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