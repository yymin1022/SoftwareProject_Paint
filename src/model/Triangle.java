package model;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Triangle extends Shape{
    public Triangle(Color settedLineColor, Color settedFillColor){
        super(settedLineColor, settedFillColor);
    }

    @Override
    public void drawShape(Graphics graphics){
        int[] xPoints = {(int)(startX + endX) / 2, (int)startX, (int)endX};
        int[] yPoints = {(int)startY, (int)endY, (int)endY};

        Graphics2D graphics2D = (Graphics2D)graphics;
        AffineTransform transform = graphics2D.getTransform();

        if(this.isRotated()){
            graphics2D.rotate(rotateDegree, (startX + endX) / 2, (startY + endY) / 2);
        }

        graphics2D.setColor(fillColor);
        graphics2D.fillPolygon(xPoints, yPoints, 3);
        graphics2D.setColor(lineColor);
        graphics2D.drawPolygon(xPoints, yPoints, 3);
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
