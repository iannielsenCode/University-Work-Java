/*****************************************************************************
 * Name:Ian Nielsen
 * Assignment 1
 * Date Due: September 16th 2013
 *****************************************************************************/

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*****************************************************************************
 * Class generates an applet that bars four lengths of four bridges, all with 
 * different colors and a title.
 * 
 ****************************************************************************/
public class FirstApp extends Applet{
    public void paint(Graphics g){
        String bridge1 = getParameter("bridge1");
        String bridge2 = getParameter("bridge2");
        String bridge3 = getParameter("bridge3");
        String bridge4 = getParameter("bridge4");
        String length1 = getParameter("length1");
        String length2 = getParameter("length2");
        String length3 = getParameter("length3");
        String length4 = getParameter("length4");
        String color1 = getParameter("color1");
        String color2 = getParameter("color2");
        String color3 = getParameter("color3");
        String color4 = getParameter("color4");
        
        int a = Integer.parseInt(length1);
        int b = Integer.parseInt(length2);
        int c = Integer.parseInt(length3);
        int d = Integer.parseInt(length4);
        
        g.setColor(Color.getColor(color1));
        g.fillRect(200,500,100,((a/5)+(a%5)));
        g.drawString(bridge1,140,600);
        g.setColor(Color.getColor(color2));
        g.fillRect(500,500,100,((b/5)+(a%5)));
        g.drawString(bridge1,440,600);
        g.setColor(Color.getColor(color3));
        g.fillRect(800,500,100,((c/5)+(c%5)));
        g.drawString(bridge1,740,600);
        g.setColor(Color.getColor(color4));
        g.fillRect(1100,500,100,((d/5)+(d%5)));
        g.drawString(bridge1,1140,600);
        
        }
}
