package supermercado.entidades;

import java.util.LinkedList;
import java.util.Queue;

    public class Cliente {
        private static int idGlobal = 1;
        private final int id;
        private final String nombre;
        private final Queue<String> cesta;

        public Cliente(String nombre) {
            this.id = idGlobal++;
            this.nombre = nombre;
            this.cesta = new LinkedList<>();
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }


    }
