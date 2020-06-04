package view;

import javax.swing.*;
import java.awt.*;

public class PaintView {
    public JButton btnCircle, btnDiamond, btnMouse, btnRectangle, btnTriangle;
    public JButton btnColor, btnJPEG, btnMove, btnRotate, btnSize;
    public JFrame frameMain;
    public JPanel panelDraw, panelButton;

    public PaintView(){
        frameMain = new JFrame();
        panelButton = new JPanel();
        panelButton.setLayout(null);
        panelButton.setBounds(0, 0, 510, 130);

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

        panelButton.add(btnCircle);
        panelButton.add(btnDiamond);
        panelButton.add(btnMouse);
        panelButton.add(btnRectangle);
        panelButton.add(btnTriangle);
        panelButton.add(btnColor);
        panelButton.add(btnJPEG);
        panelButton.add(btnMove);
        panelButton.add(btnRotate);
        panelButton.add(btnSize);

        panelDraw = new JPanel();
        panelDraw.setBackground(Color.white);
        panelDraw.setLayout(null);
        panelDraw.setBounds(10, 130, 490, 460);

        frameMain.setBackground(Color.DARK_GRAY);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setSize(530, 600);
        frameMain.setTitle("Paint");
        frameMain.setVisible(true);

        frameMain.getContentPane().add(panelButton);
        frameMain.getContentPane().add(panelDraw);
    }
}
