package controller;

import com.bric.colorpicker.ColorPicker;
import model.*;
import model.Rectangle;
import model.Shape;
import view.PaintPanel;
import view.PaintView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaintController{
    ButtonState btnState = ButtonState.BTN_MOUSE;

    public double startX;
    public double startY;
    public double endX;
    public double endY;

    public ArrayList<Shape> shapeArrayList;
    public PaintPanel paintPanel;
    public PaintView paintView;
    public Shape selectedShape;
    public static Color settedLineColor = Color.BLACK;
    public static Color settedFillColor = Color.WHITE;

    public PaintController(ArrayList<Shape> shapeArrayList, PaintView paintView){
        this.paintPanel = paintView.getPaintPanel();
        this.paintView = paintView;
        this.shapeArrayList = shapeArrayList;

        paintPanel.addMouseListener(new panelMouseListener());
        paintPanel.addMouseMotionListener(new panelMouseListener());

        paintView.btnCircle.addActionListener(e -> btnState = ButtonState.BTN_CIRCLE);
        paintView.btnDiamond.addActionListener(e -> btnState = ButtonState.BTN_DIAMOND);
        paintView.btnMouse.addActionListener(e -> btnState = ButtonState.BTN_MOUSE);
        paintView.btnRectangle.addActionListener(e -> btnState = ButtonState.BTN_RECTANGLE);
        paintView.btnTriangle.addActionListener(e -> btnState = ButtonState.BTN_TRIANGLE);

        paintView.btnColor.addActionListener(e -> btnState = ButtonState.BTN_COLOR);
        paintView.btnJPEG.addActionListener(e -> btnState = ButtonState.BTN_JPEG);
        paintView.btnMove.addActionListener(e -> btnState = ButtonState.BTN_MOVE);
        paintView.btnRotate.addActionListener(e -> btnState = ButtonState.BTN_ROTATE);
        paintView.btnSize.addActionListener(e -> btnState = ButtonState.BTN_SIZE);
    }

    public enum ButtonState{
        BTN_CIRCLE{
            @Override
            public Shape addShape() {
                return new Circle(settedLineColor, settedFillColor);
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_DIAMOND{
            @Override
            public Shape addShape() {
                return new Diamond(settedLineColor, settedFillColor);
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_MOUSE{
            @Override
            public Shape addShape() {
                return null;
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_RECTANGLE{
            @Override
            public Shape addShape() {
                return new Rectangle(settedLineColor, settedFillColor);
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_TRIANGLE{
            @Override
            public Shape addShape() {
                return new Triangle(settedLineColor, settedFillColor);
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_COLOR{
            @Override
            public Shape addShape() {
                return null;
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_JPEG{
            @Override
            public Shape addShape() {
                return null;
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_MOVE{
            @Override
            public Shape addShape() {
                return null;
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {
                selectedShape.moveShape(startX - endX, startY - endY);
            }
        }, BTN_ROTATE{
            @Override
            public Shape addShape() {
                return null;
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {
                double centerX = (selectedShape.getStartX() + selectedShape.getEndX()) / 2;
                double centerY = (selectedShape.getStartY() + selectedShape.getEndY()) / 2;

                double angle1 = Math.atan2(startY - centerY, startX - centerX);
                double angle2 = Math.atan2(endY - centerY, endX - centerX);

                selectedShape.setRotateDegree(angle1 - angle2);
            }
        }, BTN_SIZE{
            @Override
            public Shape addShape() {
                return null;
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {
                selectedShape.resizeShape(startX - endX, startY - endY);
            }
        };

        public abstract Shape addShape();
        public abstract void getAction(Shape selectedShape, double startX, double startY, double endX, double endY);
    }

    public class panelMouseListener implements MouseListener, MouseMotionListener{
        @Override
        public void mouseClicked(MouseEvent e){
            for(Shape currentShape : shapeArrayList){
                if(currentShape.isInside(e.getX(), e.getY())){
                    selectedShape = currentShape;
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e){
            startX = e.getX();
            startY = e.getY();

            for(Shape currentShape : shapeArrayList){
                if(currentShape.isInside(e.getX(), e.getY())){
                    selectedShape = currentShape;
                }
            }

            if(btnState.addShape() != null){
                selectedShape = btnState.addShape();
                selectedShape.setPoints(startX, startY, startX, startY);
                shapeArrayList.add(selectedShape);
            }else if(btnState == ButtonState.BTN_COLOR){
                new ColorTypeFrame(selectedShape);
            }
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
            endX = e.getX();
            endY = e.getY();

            if(btnState.addShape() != null){
                selectedShape.setPoints(startX, startY, endX, endY);
            }else{
                btnState.getAction(selectedShape, endX, endY, startX, startY);

                if(btnState != ButtonState.BTN_ROTATE){
                    startX = e.getX();
                    startY = e.getY();
                }
            }
        }

        @Override
        public void mouseMoved(MouseEvent e){

        }
    }
}

class ColorTypeFrame extends JFrame{
    ColorTypeFrame(Shape selectedShape){
        JPanel panelColorType =  new JPanel();
        JButton btnLineColor = new JButton("선 색상");
        JButton btnFillColor = new JButton("면 색상");
        JLabel labelLineThick = new JLabel("선 두께");
        JSlider sliderLineThick = new JSlider(1, 100, 5);

        btnLineColor.addActionListener(e -> new LineColorPickerFrame(selectedShape));
        btnFillColor.addActionListener(e -> new FillColorPickerFrame(selectedShape));
        sliderLineThick.setMajorTickSpacing(10);
        sliderLineThick.setPaintTicks(true);
        sliderLineThick.addChangeListener(e -> selectedShape.setLineThick(sliderLineThick.getValue()));

        btnLineColor.setBounds(50, 20, 140, 60);
        btnFillColor.setBounds(210, 20, 140, 60);
        labelLineThick.setBounds(50, 90, 300, 30);
        sliderLineThick.setBounds(50, 120, 300, 30);

        panelColorType.setLayout(null);
        panelColorType.add(btnLineColor);
        panelColorType.add(btnFillColor);
        panelColorType.add(labelLineThick);
        panelColorType.add(sliderLineThick);

        setContentPane(panelColorType);
        setResizable(false);
        setSize(400, 200);
        setTitle("Color Type");
        setVisible(true);
    }
}

class LineColorPickerFrame extends JFrame{
    LineColorPickerFrame(Shape selectedShape){
        JPanel panelColorPicker =  new JPanel();

        ColorPicker colorPicker = new ColorPicker(true, true);
        colorPicker.setColor(Color.BLUE);
        colorPicker.addColorListener(colorModel -> selectedShape.setLineColor(colorModel.getColor()));

        panelColorPicker.add(colorPicker);

        setContentPane(panelColorPicker);
        setResizable(false);
        setSize(600, 400);
        setTitle("Color Picker");
        setVisible(true);
    }
}

class FillColorPickerFrame extends JFrame{
    FillColorPickerFrame(Shape selectedShape){
        JPanel panelColorPicker =  new JPanel();

        ColorPicker colorPicker = new ColorPicker(true, true);
        colorPicker.setColor(Color.BLUE);
        colorPicker.addColorListener(colorModel -> selectedShape.setFillColor(colorModel.getColor()));

        panelColorPicker.add(colorPicker);

        setContentPane(panelColorPicker);
        setResizable(false);
        setSize(600, 400);
        setTitle("Color Picker");
        setVisible(true);
    }
}