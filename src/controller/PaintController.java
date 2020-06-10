package controller;

import model.Shape;
import view.PaintPanel;
import view.PaintView;

import java.awt.event.*;
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

        paintView.btnCircle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnDiamond.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnMouse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnRectangle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnTriangle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        paintView.btnColor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnJPEG.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnMove.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnRotate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        paintView.btnSize.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

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