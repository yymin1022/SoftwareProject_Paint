package controller;

import model.Shape;
import view.PaintPanel;
import view.PaintView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class PaintController{
    public double startX;
    public double startY;
    public double endX;
    public double endY;

    public ArrayList<Shape> shapeArrayList;
    public PaintPanel paintPanel;
    public PaintView paintView;
    public Shape selectedShape;

    public PaintController(ArrayList<Shape> shapeArrayList, PaintView paintView){
        this.paintPanel = paintView.getPaintPanel();
        this.paintView = paintView;
        this.shapeArrayList = shapeArrayList;
    }

    public class panelMouseListener implements MouseListener, MouseMotionListener{
        @Override
        public void mouseClicked(MouseEvent e){

        }

        @Override
        public void mousePressed(MouseEvent e){

        }

        @Override
        public void mouseReleased(MouseEvent e){

        }

        @Override
        public void mouseEntered(MouseEvent e){

        }

        @Override
        public void mouseExited(MouseEvent e){

        }

        @Override
        public void mouseDragged(MouseEvent e){

        }

        @Override
        public void mouseMoved(MouseEvent e){

        }
    }
}