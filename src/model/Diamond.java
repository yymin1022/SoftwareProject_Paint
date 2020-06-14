package model;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Diamond extends Shape{

    public Diamond(Color currentColor){
        super(currentColor);
    }

    @Override
    public void drawShape(Graphics graphics){
        int[] xPoints = {(int)(startX + endX) / 2, (int)endX, (int)(startX + endX) / 2, (int)startX};
        int[] yPoints = {(int)startY, (int)(startY + endY) / 2, (int)endY,(int)(startY + endY) / 2};

        graphics.setColor(color);

        Graphics2D graphics2D = (Graphics2D)graphics;
        AffineTransform transform = graphics2D.getTransform();

        if(this.isRotated()){
            graphics2D.rotate(rotateDegree, (startX + endX) / 2, (startY + endY) / 2);
        }

        graphics.drawPolygon(xPoints, yPoints, 4);
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
