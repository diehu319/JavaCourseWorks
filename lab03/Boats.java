import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics; 

public class Boats extends JComponent {
  public static void main(String[] args) {
    JFrame frame = new JFrame(); 
    frame.setVisible(true); 
    int width = 500, height = 500;
    frame.setSize(width + 20, height + 40); 
    Boats drawing = new Boats(width, height); 
    frame.add(drawing);     
  }
  int width, height; 
  Boat a, b, c; 
  public Boats(int width, int height) {
    this.width = width;
    this.height = height; 
    a = new Boat( 145,  70, 0.5);         
    b = new Boat(300,  30, 0.2);         
    c = new Boat( 280, 330, 0.4);         
  }
  public void paintComponent(Graphics g) {
    a.draw(g); 
    b.draw(g); 
    c.draw(g); 
  }
}