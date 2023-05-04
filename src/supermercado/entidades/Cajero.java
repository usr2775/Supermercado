package supermercado.entidades;
import java.util.LinkedList;
import java.util.Queue;
public class Cajero {
    private int numeroCaja;
    static private Queue<Cliente> colaClientes;
    public boolean cajaAbierta = false;
    public boolean abiertaPorPrimeraVez = true;



    public Cajero(int numeroCaja) {
        this.numeroCaja = numeroCaja;
        colaClientes = new LinkedList<Cliente>();
    }

    public void agregarCliente(Cliente cliente) {
        colaClientes.add(cliente);
    }

    public Cliente atenderCliente() {
        return colaClientes.poll();
    }

    public int getTotalClientes() {
        return colaClientes.size();
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void abrirCaja() {
        if (cajaAbierta) {
            System.out.println("La caja ya estaba abierta.");
        } else {
            if (abiertaPorPrimeraVez) {
                System.out.println("La caja se ha abierto por primera vez.");
                abiertaPorPrimeraVez = false;
            } else {
                System.out.println("La caja se ha abierto.");
            }
            cajaAbierta = true;
        }
    }

    public void cerrarCaja() {
        if (cajaAbierta) {
            cajaAbierta = false;
            System.out.println("La caja se ha cerrado correctamente. ¡Hasta la próxima!");
        } else {
            System.out.println("La caja ya estaba cerrada. ¡Hasta la próxima!");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Cajero\n");
        result.append("===================================\n");
        result.append("• Número de caja: " + numeroCaja + ":\n");
        result.append("• Total de clientes: " + colaClientes.size() + "\n");
        result.append("• Clientes en la fila:\n");
        for (Cliente cliente : colaClientes) {
            result.append(cliente.getNombre() + "\n");
        }
        return result.toString();
    }



}


