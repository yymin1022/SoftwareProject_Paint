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
        Graphics2D graphics2D = (Graphics2D)graphics;

        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0,0, this.getWidth(),this.getHeight());
        for(Shape shapes : shapeArrayList){
            shapes.drawShape(graphics2D);
        }
        repaint();
    }
}
