
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Juego extends JPanel {
    Tablero tablero = new Tablero();
    Fichas fichas = new Fichas();
    int resultadoDado;
    int turno=1;
    public Juego() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (turno == 1) {
                    fichas.tecla1(e);
                    repaint();
                    // Verificar si el movimiento de la ficha ha sido completado
                    if (fichas.getContPos() == resultadoDado) {
                        fichas.setContPos(0);
                        turno = 2;
                        lanzarDado2();  // Mostrar automáticamente la ventana de lanzar dado
                    }
                } else if (turno == 2) {
                    fichas.tecla2(e);
                    repaint();
                    if (fichas.getContPos() == resultadoDado) {
                        fichas.setContPos(0);
                        turno = 1;
                        lanzarDado1();  // Mostrar automáticamente la ventana de lanzar dado
                    }
                }
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
        fichas.paint2(graficos);
    }

    public void lanzarDado1() {
        String opcion[] = {"Lanzar", "Pasar Turno"};
        int opc = JOptionPane.showOptionDialog(null, "Turno de Jugador 1", "Turno del jugador", 0, JOptionPane.QUESTION_MESSAGE, null, opcion, null);
        if (opc == 0) {
            resultadoDado = Dado.lanzarDado();
            mostrarResultadoDado();
        } else if (opc == 1) {
            lanzarDado2();
            turno = 2;
        }
    }

    public void lanzarDado2() {
        String opcion[] = {"Lanzar", "Pasar Turno"};
        int opc = JOptionPane.showOptionDialog(null, "Turno de Jugador 2", "Turno del jugador", 0, JOptionPane.QUESTION_MESSAGE, null, opcion, null);
        if (opc == 0) {
            resultadoDado = Dado.lanzarDado();
            mostrarResultadoDado();
        } else if (opc == 1) {
            lanzarDado1();
            turno = 1;
        }
    }
    private void mostrarResultadoDado() {
        JOptionPane.showMessageDialog(null, "Número obtenido: " + resultadoDado, "Resultado del Dado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String opcion[] = {"Iniciar", "Salir"};
        int opc = JOptionPane.showOptionDialog(null, "Bienvenido a Parchis", "Menu de inicio", 0, JOptionPane.INFORMATION_MESSAGE, null, opcion, null);
        if (opc == 0) {
            showGame();
        } else if (opc == 1) {
            System.exit(0);
        }
    }

    private static void showGame() {
        JFrame VentanaGame = new JFrame("Parchis");
        Juego Game = new Juego();
        VentanaGame.add(Game);
        VentanaGame.setSize(647, 670);
        VentanaGame.setLocationRelativeTo(null);
        VentanaGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread GameThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    Game.repaint();
                }
            }
        });
        VentanaGame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                GameThread.interrupt();
            }
        });
        VentanaGame.setVisible(true);
        GameThread.start();
        Game.lanzarDado1(); // Iniciar el lanzamiento del dado al comenzar el juego
    }
}






