package supermercado.utilidades;

import java.util.Random;

public class RandomProductGenerator {

    private static final String[] producto = {"Leche", "Huevos", "Queso", "Manzanas", "Pan", "Arroz", "Pollo", "Carne", "Atún", "Aceite", "Pasta", "Coca-cola"};

    public static String getRandomProduct() {
        Random random = new Random();
        return producto[random.nextInt(producto.length)];
    }

}
