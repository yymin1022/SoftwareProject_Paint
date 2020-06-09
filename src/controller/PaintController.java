package controller;

import model.Shape;
import view.PaintView;

import java.util.ArrayList;

public class PaintController {
    public double startX;
    public double startY;
    public double endX;
    public double endY;

    public ArrayList<Shape> shapeList;
    public PaintView paintView;

    public PaintController(ArrayList<Shape> shapeList, PaintView paintView){
        this.paintView = paintView;
        this.shapeList = shapeList;
    }
}
