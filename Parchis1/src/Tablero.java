
import java.awt.Color;
import java.awt.Graphics;


public class Tablero {

    private int Fila = 0;
    private int Culumna = 0;
    private int alto = 10;
    private int ancho = 10;

    public void paint(Graphics graficos) {
        char[][] Tablero = crearLaberinto();
        for (Fila = 0; Fila < Tablero.length; Fila++) {
            for (Culumna = 0; Culumna < Tablero[0].length; Culumna++) {
                if (Tablero[Fila][Culumna] == '#') {
                    graficos.setColor(Color.decode("#A04000"));
                    graficos.fillRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);
                    graficos.setColor(Color.black);
                    graficos.drawRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);

                } else if (Tablero[Fila][Culumna] == '=') {//gris
                    graficos.setColor(Color.gray);
                    graficos.fillRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);
                    graficos.setColor(Color.black);
                    graficos.drawRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);

                } else if (Tablero[Fila][Culumna] == '1') {//Amariyo
                    graficos.setColor(Color.YELLOW);
                    graficos.fillRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);
                    graficos.setColor(Color.black);
                    graficos.drawRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);

                } else if (Tablero[Fila][Culumna] == 'r') {//rojo
                    graficos.setColor(Color.RED);
                    graficos.fillRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);
                    graficos.setColor(Color.black);
                    graficos.drawRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);

                } else {
                    graficos.setColor(Color.white);
                    graficos.fillRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);
                    graficos.setColor(Color.black);
                    graficos.drawRect(Culumna * 30, Fila * 30, ancho * 3, alto * 3);
                }
            }

        }

    }

    public static char[][] crearLaberinto() {
        char[][] laberinto = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', 'S', ' ', ' ', '#', ' ', 'r', 'r', 'r', 'r', 'r', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', 'S', '#', ' ', '#', ' ', 'r', 'r', 'r', 'r', 'r', '#'},
            {'#', ' ', ' ', '=', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', 'r', 'r', '=', 'r', 'r', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', 'r', 'r', 'r', 'r', 'r', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', 'r', 'r', 'r', 'r', 'r', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', 'r', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '1', ' ', 'r', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', 'S', '1', '1', '1', '1', '1', '1', '1', '1', '=', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'S', '#'},
            {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '1', ' ', 'r', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', '1', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '1', '1', '1', '1', '1', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '1', '1', '1', '1', '1', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '1', '1', '=', '1', '1', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', '=', ' ', ' ', '#'},
            {'#', '1', '1', '1', '1', '1', ' ', '#', ' ', '#', 'S', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '1', '1', '1', '1', '1', ' ', '#', ' ', ' ', 'S', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},};

        return laberinto;
    }
}
