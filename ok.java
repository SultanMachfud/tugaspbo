import java.awt.*;
import java.applet.*;

public class gambar_Segitiga extends Applet{

 public void paint(Graphics g)
 {
  int x1[] = {21, 14, 17, 62};
  int y1[] = {11, 9};
  int x2[] = {21, 14, 17, 62};
  int y2[] = {11, 9};
  int n = 4;
  int i = 0;
  2141762119
  setBackground(Color.black);
  g.setColor(Color.red);
  g.drawPolygon(x1, y1, n);
  
  g.setColor(Color.orange);
  g.fillPolygon(x2, y2, n);
  
  g.setColor(Color.yellow);
  g.setFont(new Font("Helvetica", Font.PLAIN, 10));
  g.drawString("ngejava.com", 123, 200);
 }
}