package model;

import java.awt.*;
import java.io.Serializable;

public abstract class Shape implements Serializable {
    public double startX, startY;
    public double endX, endY;
    public int width;
    public int height;

    public Color color;

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

    abstract void Draw(Graphics graphics);
}