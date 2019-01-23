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
            num_Color = (new Color(114,177,178)); //color 1
              break;
            case 2:
            num_Color = (new Color(59,98,98));//color 2
              break;
			case 3:
			num_Color = (new Color(42,70,70));//color 3
			  break;
			case 4:
			num_Color = (new Color(152,254,255));//color 4
			  break;
			case 5:
			num_Color = (new Color(79,212,214));//color 5
			  break;
			case 6:
			num_Color = (new Color(106,251,253));//color 6
			  break;
			case 7:
			num_Color = (new Color(62,180,181));//color 7
			  break;
			case 8:
			num_Color = (new Color(44,129,130));//color 8
			  break;
			case 9:
			num_Color = (new Color(20,59,59));//color 9
			  break;
			case 10:
			num_Color = (new Color(63,170,172));//color 10
			  break;
			case 11:
		    num_Color = (new Color(43,128,129));//color 11
			  break;
			case 12:
		    num_Color = (new Color(26,80,81));//color 12
			  break;
			case 13:
		    num_Color = (new Color(13,39,39));//color 13
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