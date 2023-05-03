package supermercado.entidades;
import java.util.LinkedList;
import java.util.Queue;
public class Cajero {
    private int numeroCaja;
    private Queue<Cliente> colaClientes;


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


