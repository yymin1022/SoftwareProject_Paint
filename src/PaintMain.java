import javax.swing.*;
import java.awt.*;

public class PaintMain extends JFrame{
    JButton btnCircle, btnDiamond, btnMouse, btnRectangle, btnTriangle;
    JButton btnColor, btnJPEG, btnMove, btnRotate, btnSize;
    JPanel panelDraw, panelMain;

    public PaintMain(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(900, 750);
        setTitle("Paint");

        panelMain = new JPanel();
        panelMain.setBackground(Color.GRAY);
        panelMain.setLayout(null);
        panelMain.setBounds(0, 0, 510, 600);

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

        add(panelMain);
        setVisible(true);
    }

    public static void main(String[] arg0){
        new PaintMain();
    }
}