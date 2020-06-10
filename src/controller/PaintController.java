package controller;

import model.Shape;
import view.PaintPanel;
import view.PaintView;

import java.awt.event.*;
import java.util.ArrayList;

public class PaintController{
    int btnState = ButtonState.BTN_MOUSE;

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