import java.awt.*;
import javax.swing.*;

class CG_as_1 extends JPanel {
    public static void main(String[] args) {
        CG_as_1 m = new CG_as_1();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Lab2");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
      //  Bresenham(Color.RED, 100, 100, 400, 200, g);
       // Bresenham(Color.BLUE, 400, 200, 100, 100, g);
        Bresenham(Color.BLACK, 100, 100, 200, 400, g);
    }

    private void plot(Graphics g, int x, int y, Color c) {
        g.setColor(c);
        g.fillRect(x, y, 4, 4);

    }

    private void Bresenham(Color c, int x1, int y1, int x2, int y2, Graphics g) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int Dk = 2 * dy - dx;

        if (x1 > x2) {
            int y = y2;
            for (int x = x2; x < x1; x++) {
                plot(g, x, y, c);
                if (Dk >= 0) {
                    y = y + 1;
                    Dk = Dk - 2 * dx;
                }
                Dk = Dk + 2 * dy;

            }
        } else {
            int y = y1;
            for (int x = x1; x < x2; x++) {
                plot(g, x, y, c);
                if (Dk >= 0) {
                    y = y + 1;
                    Dk = Dk - 2 * dx;
                }
                Dk = Dk + 2 * dy;

            }
        }

    }
}