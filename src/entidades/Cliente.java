package entidades;

import java.util.ArrayList;


public class Cliente {
    private String nombre;
    private ArrayList<String> cesta;

    public Cliente(String nombre, ArrayList<String> cesta) {
        this.nombre = nombre;
        cesta = new ArrayList<String>();


    }
}
