package supermercado.entidades;

import java.util.Stack;


    public class Cliente {
        private static int idGlobal = 1;
        private final int id;
        private final String nombre;
        private final Stack<String> cesta;

        public Cliente(String nombre) {
            this.id = idGlobal++;
            this.nombre = nombre;
            this.cesta = new Stack<>();
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }
        public void agregarProducto(String producto) {
            cesta.push(producto);
        }

        public String sacarProducto() {
            return cesta.pop();
        }

        public int getCantidadProductos() {
            return cesta.size();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Cliente\n");
            sb.append("===================================\n");
            sb.append("• Nombre: ").append(nombre).append("\n");
            sb.append("• Total de productos: ").append(getCantidadProductos()).append("\n");
            sb.append("• Lista de artículos en la cesta:\n");
            for (String producto : cesta) {
                sb.append(producto).append("\n");
            }
            sb.append("===================================\n");
            return sb.toString();
        }



    }
