import controller.PaintController;
import model.Shape;
import view.PaintView;

import java.awt.*;
import java.util.ArrayList;

public class PaintMain{
    public static void main(String[] arg0){
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        PaintView paintView = new PaintView(shapeArrayList);

        new PaintController(shapeArrayList, paintView);
    }
}