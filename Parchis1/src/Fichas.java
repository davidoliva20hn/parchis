
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Fichas {

    Tablero tab = new Tablero();
    private int x = 120;
    private int y = 480;
    private final int ancho = 30;
    private final int alto = 30;
    private final int movimiento = 30;

    public void paint(Graphics graficos) {
        graficos.setColor(Color.red);
        graficos.fillOval(x, y, ancho, alto);
        graficos.setColor(Color.black);
        graficos.drawOval(x, y, ancho, alto);

    }

    public void teclaaa(KeyEvent evento) {
        char[][] tablero = tab.crearLaberinto();
        if (evento.getKeyCode() == 37 || evento.getKeyCode() == 65 || evento.getKeyCode() == 97) {//izquierda
            if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                y = 270;
                x = 270;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[y / 30][(x / 30) - 1] != '#') {
                x = x - movimiento;
            }
        }
        if (evento.getKeyCode() == 39 || evento.getKeyCode() == 68 || evento.getKeyCode() == 100) {//Derecha
            if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                x = x + 0;
                y = 270;
                x = 270;
                x = x + 0;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[y / 30][(x / 30) + 1] != '#') {
                x = x + movimiento;
            }

        }
        if (evento.getKeyCode() == 40 || evento.getKeyCode() == 83 || evento.getKeyCode() == 115) {//Abajo
            if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                x = x + 0;
                y = 270;
                x = 270;
                x = x + 0;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[(y / 30) + 1][x / 30] != '#') {
                y = y + movimiento;
            }
        }
        if (evento.getKeyCode() == 38 || evento.getKeyCode() == 87 || evento.getKeyCode() == 119) {//Arriba
            if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                y = 270;
                x = 270;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[(y / 30) - 1][x / 30] != '#') {
                y = y - movimiento;
            }
        }
    }
}
