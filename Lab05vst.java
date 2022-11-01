// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;

//g.drawLine(100, 980, 530, 950);g.drawLine(100, 980, 530, 950); g.drawLine(100, 640, 990, 630); g.drawLine(100, 640, 990, 620); g.drawLine(100, 639, 990, 610); g.drawLine(100, 639, 990, 600); g.drawLine(125, 639, 990, 590); g.drawLine(125, 638, 990, 580);
public class Lab05vst extends Applet
{
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 630;
        g.drawRect(10, 10, width, height);


        for (int k = 0; k <= 65; k++) {
            g.drawLine(x1, y1, x2, y2);
            y2 -= 10;
            x1 += 15;
        }

        }
}

