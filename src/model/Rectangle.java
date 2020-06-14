package model;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Rectangle extends Shape{
    public Rectangle(Color settedLineColor, Color settedFillColor){
        super(settedLineColor, settedFillColor);
    }

    @Override
    public void drawShape(Graphics graphics){
       Graphics2D graphics2D = (Graphics2D)graphics;
        AffineTransform transform = graphics2D.getTransform();

        if(this.isRotated()) {
            graphics2D.rotate(rotateDegree, (startX + endX) / 2, (startY + endY) / 2);
        }

        graphics2D.setColor(lineColor);
        graphics2D.fillRect((int)Math.min(startX, endX), (int)Math.min(startY, endY), width, height);
        graphics2D.drawRect((int)Math.min(startX, endX), (int)Math.min(startY, endY), width, height);
        graphics2D.setTransform(transform);
    }

    @Override
    public void moveShape(double movedX, double movedY){
        this.startX += movedX;
        this.startY += movedY;
        this.endX += movedX;
        this.endY += movedY;
    }

    @Override
    public void resizeShape(double resizedX, double resizedY){
        this.setEndXY(endX + resizedX, endY = resizedY);
    }
}