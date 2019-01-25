import java.awt.*;
import javax.swing.*;

class CG_as_1 extends JPanel {
    public static void main(String[] args) {
        CG_as_1 m = new CG_as_1();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("ASG_1");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {

        work_60050165 j = new work_60050165(g); // Draw Work From 600165
        work_60050143 n = new work_60050143(g); // Draw Work From 600163

    }

    public Color set_CG(int num) { // setColorGroup
        Color num_Color;
        switch (num) {
        case 1:
            num_Color = (new Color(114, 177, 178)); // color 1
            break;
        case 2:
            num_Color = (new Color(59, 98, 98));// color 2
            break;
        case 3:
            num_Color = (new Color(42, 70, 70));// color 3
            break;
        case 4:
            num_Color = (new Color(152, 254, 255));// color 4
            break;
        case 5:
            num_Color = (new Color(79, 212, 214));// color 5
            break;
        case 6:
            num_Color = (new Color(106, 251, 253));// color 6
            break;
        case 7:
            num_Color = (new Color(62, 180, 181));// color 7
            break;
        case 8:
            num_Color = (new Color(44, 129, 130));// color 8
            break;
        case 9:
            num_Color = (new Color(20, 59, 59));// color 9
            break;
        case 10:
            num_Color = (new Color(63, 170, 172));// color 10
            break;
        case 11:
            num_Color = (new Color(43, 128, 129));// color 11
            break;
        case 12:
            num_Color = (new Color(26, 80, 81));// color 12
            break;
        case 13:
            num_Color = (new Color(13, 39, 39));// color 13
            break;
        default:
            num_Color = (new Color(100, 100, 100));
        }

        return num_Color;
    }

    // draw dot
    public void plot(Graphics g, Color c, int x, int y) {
        g.setColor(c);
        g.fillRect(x, y, 1, 1);

    }

    // draw dot with size
    public void plot(Graphics g, Color c, int x, int y, int sizeX, int sizeY) {
        g.setColor(c);
        g.fillRect(x, y, sizeX, sizeY);

    }

    // fillcolor only 1y
    public void fillcolorX(Graphics g, Color c, int x1, int y1, int x2, int y2, int y3) {
        int d = 0;
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int dx2 = 2 * dx;
        int dy2 = 2 * dy;
        int ix = x1 < x2 ? 1 : -1;
        int iy = y1 < y2 ? 1 : -1;
        int x = x1;
        int y = y1;

        if (dx >= dy) {
            while (true) {
                Bresenham(g, c, x, y3, x, y);
                if (x == x2)
                    break;
                x += ix;
                d += dy2;
                if (d > dx) {
                    y += iy;
                    d -= dx2;
                }
            }
        } else {
            while (true) {
                Bresenham(g, c, x, y3, x, y);
                if (y == y2)
                    break;
                y += iy;
                d += dx2;
                if (d > dy) {
                    x += ix;
                    d -= dy2;
                }
            }
        }

    }

    // fillcolor only 2y
    public void fillcolorX(Graphics g, Color c, int x1, int y1, int x2, int y2, int yS, int yD) {
        int d = 0;
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int dz = Math.abs(yS - yD);
        int dx2 = 2 * dx;
        int dy2 = 2 * dy;
        int dz2 = 2* dy;
        int ix = x1 < x2 ? 1 : -1;
        int iy = y1 < y2 ? 1 : -1;
        int iz = yS < yD ? 1 : -1;
        int x = x1;
        int y = y1;
        int z= yS;
        if (dx >= dy) {
            while (true) {
                Bresenham(g, c, x, z, x, y);
                
                if (x == x2) {
                    break;
                }
                x += ix;
                d += dy2;
                if (d > dx) {
                    z  += iz;
                    y += iy;
                    d -= dx2;
                }

            }
        } else {
            while (true) {
                Bresenham(g, c, x,z, x, y);
                

                if (y == y2) {
                    break;
                }
                z +=iz;
                y += iy;
                d += dx2;
                if (d > dy) {
                   
                    x += ix;
                    d -= dy2;
                }

            }
        }

    }

   
    

    // draw line
    public void Bresenham(Graphics g, Color c, int x1, int y1, int x2, int y2) {
        int d = 0;

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int dx2 = 2 * dx;
        int dy2 = 2 * dy;

        int ix = x1 < x2 ? 1 : -1;
        int iy = y1 < y2 ? 1 : -1;

        int x = x1;
        int y = y1;

        if (dx >= dy) {
            while (true) {
                plot(g, c, x, y);
                if (x == x2)
                    break;
                x += ix;
                d += dy2;
                if (d > dx) {
                    y += iy;
                    d -= dx2;
                }
            }
        } else {
            while (true) {
                plot(g, c, x, y);
                if (y == y2)
                    break;
                y += iy;
                d += dx2;
                if (d > dy) {
                    x += ix;
                    d -= dy2;
                }
            }
        }

    }
}
