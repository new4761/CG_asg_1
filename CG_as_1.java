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
   // 60050143 n =new 60050143();
   work_60050165 j =new work_60050165(g);

    
  //  plot(g,test(2),50,50);
    }
    
    public Color test(int num){
        Color num_Color;
        switch(num) {
            case 1:
            num_Color = (new Color(0,0,0)); //
              break;
            case 2:
            num_Color = (new Color(50,50,50));
              break;
         default:num_Color = (new Color(100,100,100));
          }
        

 return num_Color;
    }
    public void plot(Graphics g,Color c, int x, int y) {
        g.setColor(c);
        g.fillRect(x, y, 4, 4);

    }

   /* public void Bresenham(Color c, int x1, int y1, int x2, int y2, Graphics g) {
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

    }*/

}