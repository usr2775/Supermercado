import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

import supermercado.entidades.*;
import supermercado.utilidades.RandomNameGenerator;
import supermercado.utilidades.RandomProductGenerator;


public class Main {
    private static Cajero cajero = new Cajero(1);
    static Cliente cliente = cajero.atenderCliente();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Cajero cajero = new Cajero(1);


        int opcion = 0;
        do {
            // Presentar opciones del menú
            System.out.println("\n----- SUPERMERCADO -----\n");
            System.out.println("Elija una opción:");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    cajero.abrirCaja();
                    break;

                case 2:
                    if (cajero.cajaAbierta) {
                        String nombre = RandomNameGenerator.getRandomName();
                        cliente = new Cliente(nombre);
                        cajero.agregarCliente(cliente);
                        System.out.println("Se ha añadido un nuevo cliente a la cola:\n" + cliente);
                    } else {
                        System.out.println("La caja está cerrada, no se puede añadir un nuevo cliente");
                    }
                    break;


                case 3:

                    if (cliente != null) {
                        cajero.atenderCliente();
                        System.out.println("El siguiente cliente ha sido atendido:\n" + cliente);
                    } else {
                        System.out.println("No hay clientes pendientes");
                    }
                    break;

                case 4:
                    if (cajero.cajaAbierta) {
                        System.out.println("Clientes en la cola:");
                        System.out.println(cajero.getTotalClientes());
                        System.out.println("Cajero:");
                        System.out.println(cajero.getNumeroCaja());
                    } else {
                        System.out.println("La caja está cerrada. No hay clientes pendientes.");
                    }
                    break;

                case 5:
                    if (cajero.cajaAbierta) {
                        cajero.cerrarCaja();
                        System.out.println("La caja se ha cerrado correctamente. ¡Hasta la próxima!");
                    } else {
                        System.out.println("La caja ya estaba cerrada. ¡Hasta la próxima!");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }


}