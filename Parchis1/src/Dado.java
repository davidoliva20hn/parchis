
import java.util.Random;

public class Dado {

    public static int lanzarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
    }
}

