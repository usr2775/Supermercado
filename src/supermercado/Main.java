package supermercado;
import java.util.Scanner;

import supermercado.entidades.Cajero;

public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero(1);

        // Leer opción del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        boolean salir = false;
        while (!salir) {
            // Presentar opciones del menú
            System.out.println("Elija una opción:");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");


        }

    }
}