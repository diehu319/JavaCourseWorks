import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

public class Boat {
  int x, y; 
  double scale;
  public Boat(int x, int y, double scale) {
    this.x = x;
    this.y = y; 
    this.scale = scale;
  }
  private int scale(int size){
    return (int)(this.scale * size);
  }
  public void draw(Graphics g) {
    // default color is Color.BLACK 
    //g.drawOval(  0,   0, 500, 500); // circle in the background (not necessary) [ 0] 
    g.setColor(Color.WHITE); 
    g.fillRect(  x + 0,   y + 0, scale(500), scale(500)); // background (see marks by circle)         [ 0] 
    g.setColor(new Color(102,51,0));        // used by body                             [ 1] 
    // Brown Color
    g.fillPolygon( new Polygon // put this last                                 [11] 
                    ( new int[] { x + scale(75),x + scale(75),x + scale(90),x + scale(285),x + scale(300),x + scale(300)}, 
                      new int[] { y + scale(320),y + scale(350),y + scale(380),y + scale(380),y + scale(350),y + scale(320)}, 
                      6
                    )
                 );
    g.setColor(new Color(153,102,0));
    //Light Brown Color
    g.fillPolygon( new Polygon // put this last                                 [11] 
                    ( new int[] { x + scale(160),x + scale(160),x + scale(155),x + scale(155)}, 
                      new int[] { y + scale(320),y + scale(100),y + scale(100),y + scale(320)}, 
                      4
                    )
                 );
    g.setColor(new Color(192,192,192));
    //Silver Color
    g.fillPolygon( new Polygon
                    (new int[]{x + scale(160),x + scale(160),x + scale(280)},
                     new int[]{y + scale(110),y + scale(300),y + scale(300)},
                     3
                       )
                 );
  }
}