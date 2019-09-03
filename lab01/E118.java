//E1.18
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E118{
  public static void main(String[] args) throws Exception{
    URL imageLocation = new URL(
                                "https://vignette.wikia.nocookie.net/sonicpokemon/images/b/b2/Psyduck_AG_anime.png/revision/latest?cb=20130626041931");
    JOptionPane.showMessageDialog(null,"Hi ","Title",
                                  JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}//This program now shows a message with picture of a psyduck and a word "Hi".