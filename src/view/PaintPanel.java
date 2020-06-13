package view;

import model.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintPanel extends JPanel{
    ArrayList<Shape> shapeArrayList;

    public PaintPanel(ArrayList<Shape> shapeArrayList){
        this.shapeArrayList = shapeArrayList;
    }

    @Override
    public void paint(Graphics graphics){
//        graphics.setColor(Color.WHITE);
//        graphics.fillRect(0,0, this.getWidth(),this.getHeight());
        for(Shape shapes : shapeArrayList){
            shapes.drawShape(graphics);
        }
        repaint();
    }
}
