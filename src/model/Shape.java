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