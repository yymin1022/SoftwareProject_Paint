package model;

import java.awt.*;

public abstract class Shape{
    public double startX, startY;
    public double endX, endY;
    public double rotateDegree;
    public int width;
    public int height;
    public int lineThick = 10;

    public Color lineColor;
    public Color fillColor;

    public Shape(Color lineColor, Color fillColor){
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }

    public boolean isInside(double pointX, double pointY){
        if (pointX >= this.startX && pointX <= this.endX || pointX <= this.startX && pointX >= this.endX)
                return (pointY >= this.startY && pointY <= this.endY || pointY <= this.startY && pointY >= this.endY);
        return false;
    }

    public boolean isRotated(){
        return rotateDegree != 0;
    }

    public double getStartX(){
        return startX;
    }

    public double getStartY(){
        return startY;
    }

    public double getEndX(){
        return endX;
    }

    public double getEndY(){
        return endY;
    }

    public void setLineColor(Color lineColor){
        this.lineColor = lineColor;
    }

    public void setLineThick(int lineThick){
        this.lineThick = lineThick;
    }

    public void setFillColor(Color fillColor){
        this.fillColor = fillColor;
    }

    public void setRotateDegree(double rotateDegree){
        this.rotateDegree = rotateDegree;
    }

    public void setPoints(double startX, double startY, double endX, double endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

        this.width = (int)Math.abs(endX - startX);
        this.height = (int)Math.abs(endY - startY);
    }

    public void setStartXY(double startX, double startY){
        this.startX = startX;
        this.startY = startY;
    }

    public void setEndXY(double endX, double endY){
        this.endX = endX;
        this.endY = endY;

        this.width =(int)Math.abs(endX - startX);
        this.height = (int)Math.abs(endY - startY);
    }

    public abstract void drawShape(Graphics2D graphics2D);
    public abstract void moveShape(double movedX, double movedY);
    public abstract void resizeShape(double resizedX, double resizedY);
}