import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class PaintMain extends JFrame{
    int penStartX, penStartY, penEndX, penEndY;

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

        btnCircle.addActionListener(new drawButtonClickListener());
        btnDiamond.addActionListener(new drawButtonClickListener());
        btnMouse.addActionListener(new drawButtonClickListener());
        btnRectangle.addActionListener(new drawButtonClickListener());
        btnTriangle.addActionListener(new drawButtonClickListener());

        btnColor.addActionListener(new buttonClickListener());
        btnJPEG.addActionListener(new buttonClickListener());
        btnMove.addActionListener(new buttonClickListener());
        btnRotate.addActionListener(new buttonClickListener());
        btnSize.addActionListener(new buttonClickListener());

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
        graphics.setColor(Color.black);
        graphics2D = (Graphics2D)graphics;
    }

    public static void main(String[] arg0){
        ArrayList<Shape> shapeList = new ArrayList<>();

        new PaintMain();
    }

    public class drawPen implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
            penEndX = e.getX();
            penEndY = e.getY();

            graphics2D.setStroke(new BasicStroke(10, BasicStroke.CAP_SQUARE,0));
            graphics2D.drawLine(penStartX + 10, penStartY + 150, penEndX + 10, penEndY + 150);

            penStartX = penEndX;
            penStartY = penEndY;
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    public class drawButtonClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnCircle){

            }else if(e.getSource() == btnDiamond){

            }else if(e.getSource() == btnMouse){
                panelDraw.addMouseMotionListener(new MouseMotionListener() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        penStartX = e.getX();
                        penStartY = e.getY();
                    }

                    @Override
                    public void mouseMoved(MouseEvent e) {

                    }
                });
                panelDraw.addMouseMotionListener(new drawPen());
            }else if(e.getSource() == btnRectangle){
                
            }else if(e.getSource() == btnTriangle){

            }
        }
    }

    public class buttonClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnColor){

            }else if(e.getSource() == btnJPEG){

            }else if(e.getSource() == btnMove){

            }else if(e.getSource() == btnRotate){

            }else if(e.getSource() == btnSize){

            }
        }
    }
}