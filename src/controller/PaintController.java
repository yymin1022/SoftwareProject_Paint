package controller;

import model.Circle;
import model.Rectangle;
import model.Shape;
import view.PaintPanel;
import view.PaintView;

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

    public PaintController(ArrayList<Shape> shapeArrayList, PaintView paintView){
        this.paintPanel = paintView.getPaintPanel();
        this.paintView = paintView;
        this.shapeArrayList = shapeArrayList;

        paintPanel.addMouseListener(new panelMouseListener());
        paintPanel.addMouseMotionListener(new panelMouseListener());

        paintView.btnCircle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_CIRCLE;
            }
        });
        paintView.btnDiamond.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_DIAMOND;
            }
        });
        paintView.btnMouse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_MOUSE;
            }
        });
        paintView.btnRectangle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_RECTANGLE;
            }
        });
        paintView.btnTriangle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_TRIANGLE;
            }
        });

        paintView.btnColor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_COLOR;
            }
        });
        paintView.btnJPEG.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_JPEG;
            }
        });
        paintView.btnMove.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_MOVE;
            }
        });
        paintView.btnRotate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_ROTATE;
            }
        });
        paintView.btnSize.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                btnState = ButtonState.BTN_SIZE;
            }
        });
    }

    public enum ButtonState{
        BTN_CIRCLE{
            @Override
            public Shape addShape() {
                return new Circle();
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_DIAMOND{
            @Override
            public Shape addShape() {
                return null;
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
                return new Rectangle();
            }

            @Override
            public void getAction(Shape selectedShape, double startX, double startY, double endX, double endY) {

            }
        }, BTN_TRIANGLE{
            @Override
            public Shape addShape() {
                return null;
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