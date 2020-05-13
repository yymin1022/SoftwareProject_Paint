import javax.swing.*;
import java.awt.*;

public class PaintMain extends JFrame{
    JButton btnCircle, btnMouse, btnRectangle, btnTriangle;
    JButton btnMove, btnRotate;
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

        add(panelMain);
        setVisible(true);
    }

    public static void main(String[] arg0){
        new PaintMain();
    }
}