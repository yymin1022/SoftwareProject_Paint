package view;

import model.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintPanel extends JPanel{
    ArrayList<Shape> shapeList;

    public PaintPanel(ArrayList<Shape> shapeList){
        this.shapeList = shapeList;
    }

    @Override
    public void paint(Graphics graphics){
        graphics.setColor(Color.WHITE);
        for(Shape shapes : shapeList){
            shapes.drawShape(graphics);
        }
    }
}
