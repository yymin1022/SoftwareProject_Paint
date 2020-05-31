import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaintMain extends JFrame{
    int penStartX, penStartY, penEndX, penEndY;
    int shapeType = 3;
/*  0 : Circle
    1 : Diamond
    2 : Line (Mouse)
    3 : Rectangle
    4 : Triangle
 */

    Graphics graphics;
    Graphics2D graphics2D;

    JButton btnCircle, btnDiamond, btnMouse, btnRectangle, btnTriangle;
    JButton btnColor, btnJPEG, btnMove, btnRotate, btnSize;
    JPanel panelDraw, panelMain;

    public PaintMain(){
        setBackground(Color.darkGray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(510, 600);
        setTitle("Paint");

        panelMain = new JPanel();
        panelMain.setLayout(null);
        panelMain.setBounds(0, 0, 510, 130);

        btnCircle = new JButton("원");
        btnDiamond = new JButton("마름모");
        btnMouse = new JButton("곡선");
        btnRectangle = new JButton("사각형");
        btnTriangle = new JButton("삼각형");
        btnColor = new JButton("색상");
        btnJPEG = new JButton("JPEG");
        btnMove = new JButton("이동");
        btnRotate = new JButton("회전");
        btnSize = new JButton("크기");

        btnCircle.setBounds(10, 10, 90, 50);
        btnDiamond.setBounds(210, 10, 90, 50);
        btnMouse.setBounds(410, 70, 90, 50);
        btnRectangle.setBounds(110, 10, 90, 50);
        btnTriangle.setBounds(310, 10, 90, 50);
        btnColor.setBounds(10, 70, 90, 50);
        btnJPEG.setBounds(410, 10, 90, 50);
        btnMove.setBounds(210, 70, 90, 50);
        btnRotate.setBounds(110, 70, 90, 50);
        btnSize.setBounds(310, 70, 90, 50);

        btnCircle.addActionListener(drawButtonClickListener);
        btnDiamond.addActionListener(drawButtonClickListener);
        btnMouse.addActionListener(drawButtonClickListener);
        btnRectangle.addActionListener(drawButtonClickListener);
        btnTriangle.addActionListener(drawButtonClickListener);

        btnColor.addActionListener(buttonClickListener);
        btnJPEG.addActionListener(buttonClickListener);
        btnMove.addActionListener(buttonClickListener);
        btnRotate.addActionListener(buttonClickListener);
        btnSize.addActionListener(buttonClickListener);

        panelMain.add(btnCircle);
        panelMain.add(btnDiamond);
        panelMain.add(btnMouse);
        panelMain.add(btnRectangle);
        panelMain.add(btnTriangle);
        panelMain.add(btnColor);
        panelMain.add(btnJPEG);
        panelMain.add(btnMove);
        panelMain.add(btnRotate);
        panelMain.add(btnSize);

        panelDraw = new JPanel();
        panelDraw.setBackground(Color.white);
        panelDraw.setLayout(null);
        panelDraw.setBounds(10, 130, 490, 460);

        add(panelMain);
        add(panelDraw);
        setVisible(true);

        graphics = getGraphics();
        graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(Color.black);
        graphics2D.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND,0));
    }

    public static void main(String[] arg0){
        ArrayList<Shape> shapeList = new ArrayList<>();

        new PaintMain();
    }

    MouseMotionListener drawPenListener = new MouseMotionListener(){
        @Override
        public void mouseDragged(MouseEvent e) {
            penEndX = e.getX();
            penEndY = e.getY();

            graphics2D.drawLine(penStartX + 10, penStartY + 150, penEndX + 10, penEndY + 150);

            penStartX = penEndX;
            penStartY = penEndY;
        }

        @Override
        public void mouseMoved(MouseEvent e) {}
    };

    MouseMotionListener drawPenFirstListener = new MouseMotionListener() {
        @Override
        public void mouseDragged(MouseEvent e) {
            penStartX = e.getX();
            penStartY = e.getY();
        }

        @Override
        public void mouseMoved(MouseEvent e) {}
    };

    MouseListener drawShapeListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(shapeType){
                case 0:
                    Circle circle = new Circle();
                    circle.x1 = e.getX();
                    circle.y1 = e.getY();
                    circle.color = Color.black;
                    circle.graphics = graphics;
                    circle.graphics2D = graphics2D;
                    circle.Draw(graphics2D);
                    break;
                case 1:
                    break;
                case 3:
                    Rectangle rectangle = new Rectangle();
                    rectangle.x1 = e.getX();
                    rectangle.y1 = e.getY();
                    rectangle.color = Color.black;
                    rectangle.graphics = graphics;
                    rectangle.graphics2D = graphics2D;
                    rectangle.Draw(graphics2D);
                    break;
                case 4:
                    break;
            }
            panelDraw.removeMouseListener(drawShapeListener);
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    };

    ActionListener drawButtonClickListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnCircle){
                shapeType = 0;
                panelDraw.removeMouseMotionListener(drawPenListener);
                panelDraw.addMouseListener(drawShapeListener);
            }else if(e.getSource() == btnDiamond){
                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
            }else if(e.getSource() == btnMouse){
                panelDraw.addMouseMotionListener(drawPenFirstListener);
                panelDraw.addMouseMotionListener(drawPenListener);
            }else if(e.getSource() == btnRectangle){
                shapeType = 3;
                panelDraw.removeMouseMotionListener(drawPenListener);
                panelDraw.addMouseListener(drawShapeListener);
            }else if(e.getSource() == btnTriangle){
                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    };

    ActionListener buttonClickListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnColor){
                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
            }else if(e.getSource() == btnJPEG){
                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
            }else if(e.getSource() == btnMove){
                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
            }else if(e.getSource() == btnRotate){
                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
            }else if(e.getSource() == btnSize){
                JOptionPane.showMessageDialog(null, "준비중입니다.", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    };
}