package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintView {
    public ArrayList<model.Shape> shapeArrayList;
    public JButton btnCircle, btnDiamond, btnMouse, btnRectangle, btnTriangle;
    public JButton btnColor, btnJPEG, btnMove, btnRotate, btnSize;
    public JFrame frameMain;
    public JPanel panelButton;
    public PaintPanel panelDraw;

    public PaintView(ArrayList<model.Shape> shapeArrayList){
        this.shapeArrayList = shapeArrayList;

        frameMain = new JFrame();
        panelButton = new JPanel(new GridLayout(2, 0));
        panelDraw = new PaintPanel(shapeArrayList);

        btnCircle = new JButton("원");
        btnDiamond = new JButton("마름모");
        btnMouse = new JButton("곡선");
        btnRectangle = new JButton("사각형");
        btnTriangle = new JButton("삼각형");
        btnColor = new JButton("테두리/색상");
        btnJPEG = new JButton("JPEG");
        btnMove = new JButton("이동");
        btnRotate = new JButton("회전");
        btnSize = new JButton("크기");

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

        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setSize(530, 600);
        frameMain.setTitle("Paint");
        frameMain.setVisible(true);

        frameMain.getContentPane().add(BorderLayout.NORTH, panelButton);
        frameMain.getContentPane().add(BorderLayout.CENTER, panelDraw);
        frameMain.getContentPane().setBackground(Color.DARK_GRAY);
    }

    public PaintPanel getPaintPanel(){
        return panelDraw;
    }
}
