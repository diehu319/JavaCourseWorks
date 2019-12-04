import javax.swing.*;
import java.awt.*;

public class newBoats extends JComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        int width = 500, height = 500;
        frame.setSize(width + 20, height + 40);
        newBoats drawing = new newBoats(width, height);
        frame.add(drawing);
    }
    int width, height;
    newBoat a, b, c;
    public newBoats(int width, int height) {
        this.width = width;
        this.height = height;
        a = new newBoat( 145,  70, 0.5);
        b = new newBoat(300,  30, 0.2);
        c = new newBoat( 280, 330, 0.4);
    }
    public void paintComponent(Graphics g) {
        a.draw(g);
        b.draw(g);
        c.draw(g);
    }
}