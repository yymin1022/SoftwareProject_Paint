package model;

import java.awt.*;
import java.io.Serializable;

public abstract class Shape implements Serializable {
    public double startX, startY;
    public double endX, endY;
    public int width;
    public int height;

    public Color color;

    abstract void Draw(Graphics graphics);
}