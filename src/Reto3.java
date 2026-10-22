/**
 * Reto 3 - Lista circular: reproduccion en bucle
 * Molin Rosas Maria Valeria 
 *   Villanueva Lazo Lluvia Estefania
 **/

public class Reto3 {

    //nodo circular que almacena una cancion. 
    static class NodoCircular {
        String cancion;
        NodoCircular siguiente;

        NodoCircular(String cancion) {
            this.cancion = cancion;
        }
    }

    //Playlist circular; actual es la cancion que se esta reproduciendo. 
    static class ListaCircular {
        private NodoCircular actual;
        private NodoCircular cola;

        //inserta al final, justo antes de regresar a la cabeza
        public void insertar(String cancion) {
            NodoCircular nuevo = new NodoCircular(cancion);

            if (cola == null) {
                // El primer nodo es actual y cola, y apunta a si mismo.
                actual = nuevo;
                cola = nuevo;
                nuevo.siguiente = nuevo;
            } else {
                // La cabeza es cola.siguiente; se inserta entre cola y cabeza.
                nuevo.siguiente = cola.siguiente;
                cola.siguiente = nuevo;
                cola = nuevo;
            }
        }

        //avanza n posiciones en el circulo; no necesita revisar null. 
        public void rotar(int n) {
            if (actual == null || n <= 0) {
                return;
            }

            for (int i = 0; i < n; i++) {
                actual = actual.siguiente;
            }
        }

        
         //elimina la cancion actual y avanza a la siguiente.
         //maneja lista vacia, un solo nodo y actualizaciones de cola.
         
        public void eliminarActual() {
            if (cola == null) {
                System.out.println("No hay canciones para eliminar.");
                return;
            }

            // Si actual apunta a si mismo, solo hay un nodo.
            if (actual == actual.siguiente) {
                actual = null;
                cola = null;
                return;
            }

            //encuentra el nodo anterior a la cancion actual.
            NodoCircular anterior = cola;
            while (anterior.siguiente != actual) {
                anterior = anterior.siguiente;
            }

            //el anterior salta la cancion que se va a eliminar.
            anterior.siguiente = actual.siguiente;

            // Si se elimina la cola, la cola pasa a ser el nodo anterior.
            if (actual == cola) {
                cola = anterior;
            }

            // La reproduccion continua con el siguiente nodo.
            actual = actual.siguiente;

            //asegura que la cola vuelva a apuntar a la cabeza.
            cola.siguiente = cola.siguiente; // Enlace circular ya conservado.
        }

               public void mostrarUnaVuelta() {
            if (actual == null) {
                System.out.println("Playlist vacia.");
                return;
            }

            NodoCircular inicio = actual;
            NodoCircular nodo = inicio;
            do {
                String marca = (nodo == actual) ? " [ACTUAL]" : "";
                System.out.print(nodo.cancion + marca + " -> ");
                nodo = nodo.siguiente;
            } while (nodo != inicio);

            System.out.println("(vuelve a " + inicio.cancion + ")");
        }

        //devuelve la cantidad de canciones de la playlist circular
        public int contar() {
            if (actual == null) {
                return 0;
            }

            int total = 0;
            NodoCircular nodo = actual;
            do {
                total++;
                nodo = nodo.siguiente;
            } while (nodo != actual);

            return total;
        }

        //Muestra el nombre de la cancion que esta en reproduccion
        public void mostrarActual() {
            if (actual == null) {
                System.out.println("No hay cancion en reproduccion.");
            } else {
                System.out.println("Cancion actual: " + actual.cancion);
            }
        }
    }

    public static void main(String[] args) {
        ListaCircular playlist = new ListaCircular();

        System.out.println("RETO 3 REPRODUCCION EN BUCLE");
        playlist.mostrarUnaVuelta();
        System.out.println("Cantidad inicial: " + playlist.contar());

        playlist.insertar("Vivir mi vida");
        playlist.insertar("Bailando");
        playlist.insertar("La bicicleta");
        playlist.insertar("Color esperanza");

        System.out.println("\nPlaylist circular:");
        playlist.mostrarUnaVuelta();
        System.out.println("Cantidad: " + playlist.contar());
        playlist.mostrarActual();

        System.out.println("\nAvanzar 2 canciones:");
        playlist.rotar(2);
        playlist.mostrarActual();
        playlist.mostrarUnaVuelta();

        System.out.println("\nEliminar la cancion actual:");
        playlist.eliminarActual();
        playlist.mostrarUnaVuelta();
        System.out.println("Cantidad: " + playlist.contar());

        System.out.println("\nRotar 10 canciones para comprobar el bucle:");
        playlist.rotar(10);
        playlist.mostrarActual();

        System.out.println("\nEliminar hasta dejar una sola cancion:");
        while (playlist.contar() > 1) {
            playlist.eliminarActual();
        }
        playlist.mostrarUnaVuelta();

        System.out.println("Eliminar la ultima cancion:");
        playlist.eliminarActual();
        playlist.mostrarUnaVuelta();
        System.out.println("Cantidad final: " + playlist.contar());

        //prueba de eliminar en una lista vacia.
        playlist.eliminarActual();
    }
}
