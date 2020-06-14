package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintView {
    public ArrayList<model.Shape> shapeArrayList;
    public JButton btnCircle, btnDiamond, btnRectangle, btnTriangle;
    public JButton btnColor, btnMove, btnRotate, btnSize, btnSave, btnLoad;
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
        btnRectangle = new JButton("사각형");
        btnTriangle = new JButton("삼각형");
        btnColor = new JButton("테두리/색상");
        btnMove = new JButton("이동");
        btnRotate = new JButton("회전");
        btnSize = new JButton("크기");
        btnSave = new JButton("저장");
        btnLoad = new JButton("불러오기");

        panelButton.add(btnCircle);
        panelButton.add(btnDiamond);
        panelButton.add(btnRectangle);
        panelButton.add(btnTriangle);
        panelButton.add(btnColor);
        panelButton.add(btnMove);
        panelButton.add(btnRotate);
        panelButton.add(btnSize);
        panelButton.add(btnSave);
        panelButton.add(btnLoad);

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
