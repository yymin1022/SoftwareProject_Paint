import model.Circle;
import view.PaintView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaintMain extends JFrame{
    int penStartX, penStartY, penEndX, penEndY;
    int shapeType = 3;
/*  0 : model.Circle
    1 : Diamond
    2 : Line (Mouse)
    3 : model.Rectangle
    4 : Triangle
 */

    Graphics graphics;
    Graphics2D graphics2D;



    public PaintMain(){


        graphics = getGraphics();
        graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(Color.black);
        graphics2D.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND,0));
    }

    public static void main(String[] arg0){
        ArrayList<Shape> shapeList = new ArrayList<>();

        PaintView paintView = new PaintView();
    }

//    MouseMotionListener drawPenListener = new MouseMotionListener(){
//        @Override
//        public void mouseDragged(MouseEvent e) {
//            penEndX = e.getX();
//            penEndY = e.getY();
//
//            graphics2D.drawLine(penStartX + 10, penStartY + 150, penEndX + 10, penEndY + 150);
//
//            penStartX = penEndX;
//            penStartY = penEndY;
//        }
//
//        @Override
//        public void mouseMoved(MouseEvent e) {}
//    };
//
//    MouseMotionListener drawPenFirstListener = new MouseMotionListener() {
//        @Override
//        public void mouseDragged(MouseEvent e) {
//            penStartX = e.getX();
//            penStartY = e.getY();
//        }
//
//        @Override
//        public void mouseMoved(MouseEvent e) {}
//    };
//
//    MouseListener drawShapeListener = new MouseListener() {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            switch(shapeType){
//                case 0:
//                    Circle circle = new Circle();
//                    circle.x1 = e.getX();
//                    circle.y1 = e.getY();
//                    circle.color = Color.black;
//                    circle.graphics = graphics;
//                    circle.graphics2D = graphics2D;
//                    circle.Draw(graphics2D);
//                    break;
//                case 1:
//                    break;
//                case 3:
//                    model.Rectangle rectangle = new model.Rectangle();
//                    rectangle.x1 = e.getX();
//                    rectangle.y1 = e.getY();
//                    rectangle.color = Color.black;
//                    rectangle.graphics = graphics;
//                    rectangle.graphics2D = graphics2D;
//                    rectangle.Draw(graphics2D);
//                    break;
//                case 4:
//                    break;
//            }
//            panelDraw.removeMouseListener(drawShapeListener);
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {}
//
//        @Override
//        public void mouseReleased(MouseEvent e) {}
//
//        @Override
//        public void mouseEntered(MouseEvent e) {}
//
//        @Override
//        public void mouseExited(MouseEvent e) {}
//    };
//
//    ActionListener drawButtonClickListener = new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if(e.getSource() == btnCircle){
//                shapeType = 0;
//                panelDraw.removeMouseMotionListener(drawPenListener);
//                panelDraw.addMouseListener(drawShapeListener);
//            }else if(e.getSource() == btnDiamond){
//                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
//            }else if(e.getSource() == btnMouse){
//                panelDraw.addMouseMotionListener(drawPenFirstListener);
//                panelDraw.addMouseMotionListener(drawPenListener);
//            }else if(e.getSource() == btnRectangle){
//                shapeType = 3;
//                panelDraw.removeMouseMotionListener(drawPenListener);
//                panelDraw.addMouseListener(drawShapeListener);
//            }else if(e.getSource() == btnTriangle){
//                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
//            }
//        }
//    };
//
//    ActionListener buttonClickListener = new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if(e.getSource() == btnColor){
//                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
//            }else if(e.getSource() == btnJPEG){
//                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
//            }else if(e.getSource() == btnMove){
//                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
//            }else if(e.getSource() == btnRotate){
//                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
//            }else if(e.getSource() == btnSize){
//                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
//            }
//        }
//    };
}