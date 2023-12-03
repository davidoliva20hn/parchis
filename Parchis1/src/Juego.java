
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Juego extends JPanel {

    Tablero tablero = new Tablero();
    Fichas fichas = new Fichas();

    public Juego() {
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
               
            }
            @Override
            public void keyPressed(KeyEvent e) {
                fichas.teclaaa(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
        });
        setFocusable(true);

    }

    @Override
    public void paint(Graphics graficos) {
        tablero.paint(graficos);
        fichas.paint(graficos);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Parchis");
        Juego game = new Juego();
        ventana.add(game);
        ventana.setSize(647, 670);
        ventana.setLocation(310, 40);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            game.repaint();
        }
    }
}
