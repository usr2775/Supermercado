package supermercado.utilidades;

import java.util.Random;


public class RandomNameGenerator {
    private static final String[] nombres = {"Chibuike", "María", "Pedro", "Lucía", "Miguel", "Ana", "Carlos", "Sofía", "Juan", "Sara", "Javier", "Laura", "Manuel", "Carmen", "David", "Elena", "Pablo", "Isabel", "Jorge", "Marta"};

    public static String getRandomName() {
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }

}
