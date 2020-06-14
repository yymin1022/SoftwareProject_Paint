package model;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Diamond extends Shape{

    public Diamond(Color settedLineColor, Color settedFillColor){
        super(settedLineColor, settedFillColor);
    }

    @Override
    public void drawShape(Graphics graphics){
        int[] xPoints = {(int)(startX + endX) / 2, (int)endX, (int)(startX + endX) / 2, (int)startX};
        int[] yPoints = {(int)startY, (int)(startY + endY) / 2, (int)endY,(int)(startY + endY) / 2};

        Graphics2D graphics2D = (Graphics2D)graphics;
        AffineTransform transform = graphics2D.getTransform();

        if(this.isRotated()){
            graphics2D.rotate(rotateDegree, (startX + endX) / 2, (startY + endY) / 2);
        }

        graphics2D.setStroke(new BasicStroke(this.lineThick));
        graphics2D.setColor(fillColor);
        graphics2D.fillPolygon(xPoints, yPoints, 4);
        graphics2D.setColor(lineColor);
        graphics2D.drawPolygon(xPoints, yPoints, 4);
        graphics2D.setTransform(transform);
    }

    @Override
    public void moveShape(double movedX, double movedY){
        this.startX += movedX;
        this.endX += movedX;
        this.startY += movedY;
        this.endY += movedY;
    }

    @Override
    public void resizeShape(double movedX, double movedY){
        this.setEndXY(endX + movedX, endY + movedY);
    }
}
