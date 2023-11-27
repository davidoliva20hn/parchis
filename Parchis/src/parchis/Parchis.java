/*
 */
package parchis;

import java.util.Scanner;

public class Parchis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese nombre de jugador: ");
        String nombre = leer.nextLine();
        char[][] laberinto = crearLaberinto(nombre);
        System.out.println(nombre);
        imprimirLaberinto(laberinto);
        boolean gano = false;
        int fila = 12;
        int columna = 5;
        while (!gano) {
            System.out.print("Ingrese un movimiento (w/a/s/d): ");
            String movimiento = leer.nextLine().toLowerCase();
            char movi = movimiento.charAt(0);
            while (movi != 's' && movi != 'w' && movi != 'a' && movi != 'd') {
                System.out.print("Ingrese un movimiento (w/a/s/d): ");
                movimiento = leer.nextLine().toLowerCase();
                movi = movimiento.charAt(0);
            }
            for (char op : movimiento.toCharArray()) {
                switch (op) {
                    case 'w':

                        if (fila > 1 && laberinto[fila - 1][columna] != '#') {
                            laberinto[fila][columna] = ' ';
                            fila--;
                        }
                        break;
                    case 's':
                        if (fila < laberinto.length - 1 && laberinto[fila + 1][columna] != '#') {
                            laberinto[fila][columna] = ' ';
                            fila++;
                        }
                        break;
                    case 'a':
                        if (columna > 1 && laberinto[fila][columna - 1] != '#') {
                            laberinto[fila][columna] = ' ';
                            columna--;
                        }
                        break;
                    case 'd':
                        if (columna < laberinto[0].length - 1 && laberinto[fila][columna + 1] != '#') {
                            laberinto[fila][columna] = ' ';
                            columna++;
                        }
                        break;
                }

                laberinto[fila][columna] = nombre.charAt(0);
                System.out.println(nombre);
                imprimirLaberinto(laberinto);

                if (fila == 25 && columna == 25) {
                    gano = true;
                    System.out.println("Completaste el lab mas facil del mundo felicidades");
                    System.out.println("");
                    break;
                }
            }
        }
    }

    public static char[][] crearLaberinto(String n) {
        char[][] laberinto = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},};

        return laberinto;
    }

    public static void imprimirLaberinto(char[][] laberinto) {
        for (char[] fila : laberinto) {
            for (char es : fila) {
                System.out.print("[" + es + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
}
