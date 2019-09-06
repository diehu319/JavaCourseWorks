import javax.swing.JComponent;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

public class Boat extends JComponent {
  int width, height; 
  public Boat(int width, int height) {
    this.width = width;
    this.height = height; 
  }
  public void paintComponent(Graphics g) {
    // default color is Color.BLACK 
    //g.drawOval(  0,   0, 500, 500); // circle in the background (not necessary) [ 0] 
    g.setColor(Color.WHITE); 
    g.fillRect(  0,   0, 500, 500); // background (see marks by circle)         [ 0] 
    g.setColor(new Color(102,51,0));        // used by body                             [ 1] 
    // Brown Color
    g.fillPolygon( new Polygon // put this last                                 [11] 
                    ( new int[] { 75,75,90,285,300,300}, 
                      new int[] { 320,350,380,380,350,320}, 
                      6
                    )
                 );
    g.setColor(new Color(153,102,0));
    //Light Brown Color
    g.fillPolygon( new Polygon // put this last                                 [11] 
                    ( new int[] { 160,160,155,155}, 
                      new int[] { 320,100,100,320}, 
                      4
                    )
                 );
    g.setColor(new Color(192,192,192));
    //Silver Color
    g.fillPolygon( new Polygon
                    (new int[]{160,160,280},
                     new int[]{110,300,300},
                     3
                       )
                 );
  }
}