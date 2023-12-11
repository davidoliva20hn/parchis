
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Fichas {

    Tablero tab = new Tablero();
    private int x = 120;
    private int y = 480;
    private final int ancho = 30;
    private final int alto = 30;
    private final int movimiento = 30;
    private int contpos = 0;
    public int valordado = Dado.lanzarDado();

    ;
    public void paint(Graphics graficos) {
        graficos.setColor(Color.decode("#FFEE58"));
        graficos.fillOval(x, y, ancho, alto);
        graficos.setColor(Color.black);
        graficos.drawOval(x, y, ancho, alto);

    }
    private int x2 = 480;
    private int y2 = 120;

    public void paint2(Graphics graficos) {
        graficos.setColor(Color.decode("#C62828"));
        graficos.fillOval(x2, y2, ancho, alto);
        graficos.setColor(Color.black);
        graficos.drawOval(x2, y2, ancho, alto);

    }

    public void tecla1(KeyEvent evento) {
        char[][] tablero = tab.crearLaberinto();
        if (evento.getKeyCode() == KeyEvent.VK_LEFT || evento.getKeyCode() == KeyEvent.VK_A) {//izquierda
            if (y == 360 && x == 120) {
                x = x + 0;
            } else if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                y = 270;
                x = 270;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[y / 30][(x / 30) - 1] != '#') {
                x = x - movimiento;
                contpos++;
                System.out.println(contpos);

            }
        }
        if (evento.getKeyCode() == KeyEvent.VK_RIGHT || evento.getKeyCode() == KeyEvent.VK_D) {//Derecha
            if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                y = 270;
                x = 270;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[y / 30][(x / 30) + 1] != '#') {
                x = x + 30;
                contpos++;
                System.out.println(contpos);
            }

        }
        if (evento.getKeyCode() == KeyEvent.VK_DOWN || evento.getKeyCode() == KeyEvent.VK_S) {//Abajo
            if (y == 300 && x == 30) {
                y = y - 0;
            } else if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                y = 270;
                x = 270;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[(y / 30) + 1][x / 30] != '#') {

                y = y + movimiento;
                contpos++;
                System.out.println(contpos);

            }
        }
        if (evento.getKeyCode() == KeyEvent.VK_UP || evento.getKeyCode() == KeyEvent.VK_W) {//Arriba
            if (y == 480 && x == 120) {
                y = 360;
            } else if (y == 300 && x == 270) {
                y = 270;
                x = 270;
            } else if (y == 270 && x == 270) {
                x = x + 0;
            } else if (tablero[(y / 30) - 1][x / 30] != '#') {
                y = y - movimiento;
                contpos++;
                System.out.println(contpos);

            }
        }
    }

    public void tecla2(KeyEvent evento) {
        char[][] tablero = tab.crearLaberinto();
        if (evento.getKeyCode() == KeyEvent.VK_LEFT || evento.getKeyCode() == KeyEvent.VK_A) {//izquierda
            if (y2 == 120 && x2 == 480) {
                y2 = 240;
            } else if (y2 == 300 && x2 == 330) {
                y2 = 270;
                x2 = 330;
            } else if (y2 == 270 && x2 == 330) {
                x2 = x2 + 0;
            } else if (tablero[y2 / 30][(x2 / 30) - 1] != '#') {
                x2 = x2 - movimiento;
                contpos++;
                System.out.println(contpos);
            }
        }
        if (evento.getKeyCode() == KeyEvent.VK_RIGHT || evento.getKeyCode() == KeyEvent.VK_D) {//Derecha
            if (x2 == 480 && y2 == 240) {
                x2 = x2 + 0;
            } else if (y2 == 120 && x2 == 480) {
                y2 = 240;
            } else if (y2 == 300 && x2 == 330) {
                y2 = 270;
                x2 = 330;
            } else if (y2 == 270 && x2 == 330) {
                x2 = x2 + 0;
            } else if (tablero[y2 / 30][(x2 / 30) + 1] != '#') {
                x2 = x2 + movimiento;
                contpos++;
                System.out.println(contpos);
            }
        }
        if (evento.getKeyCode() == KeyEvent.VK_DOWN || evento.getKeyCode() == KeyEvent.VK_S) {//Abajo
            if (y2 == 120 && x2 == 480) {
                y2 = 240;
            } else if (y2 == 300 && x2 == 330) {
                y2 = 270;
                x2 = 330;
            } else if (y2 == 270 && x2 == 330) {
                x2 = x2 + 0;
            } else if (tablero[(y2 / 30) + 1][x2 / 30] != '#') {
                y2 = y2 + movimiento;
                contpos++;
                System.out.println(contpos);
            }
        }
        if (evento.getKeyCode() == KeyEvent.VK_UP || evento.getKeyCode() == KeyEvent.VK_W) {//Arriba
            if (x2 == 570 && y2 == 300) {
                y2 = y2 + 0;
            } else if (y2 == 120 && x2 == 480) {
                y2 = 240;
            } else if (y2 == 300 && x2 == 330) {
                y2 = 270;
                x2 = 330;
            } else if (y2 == 270 && x2 == 330) {
                x2 = x2 + 0;
            } else if (tablero[(y2 / 30) - 1][x2 / 30] != '#') {
                y2 = y2 - movimiento;
                contpos++;
                System.out.println(contpos);

            }
        }
    }

    public int getContPos() {
        return contpos;
    }

    public void setContPos(int ContPos) {
        this.contpos = ContPos;
    }

}
