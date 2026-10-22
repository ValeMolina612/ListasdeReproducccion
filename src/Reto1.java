/**
 * Reto 1 - Lista simple cola de canciones
 * Permite insertar canciones al inicio, contar e invertir la lista.
 *
 * 
 * Molina Rosas Maria Valeria 
 * Villanueva lazo lluvia Estefania
 **/

public class Reto1 {

    // nodo que guarda una cancion y la referencia al siguiente nodo.
    static class Nodo {
        String cancion;
        Nodo siguiente;

        Nodo(String cancion) {
            this.cancion = cancion;
        }
    }

    /** Lista simplemente enlazada de canciones. */
    static class ListaSimple {
        private Nodo cabeza;

        /** Inserta una cancion al inicio de la lista. */
        public void insertarInicio(String cancion) {
            Nodo nuevo = new Nodo(cancion);
            // El nuevo nodo apunta a la cabeza anterior.
            nuevo.siguiente = cabeza;
            // El nuevo nodo se convierte en la cabeza.
            cabeza = nuevo;
        }

        /** Cuenta los nodos recorriendo la lista una sola vez. */
        public int contar() {
            int total = 0;
            Nodo actual = cabeza;

            while (actual != null) {
                total++;
                actual = actual.siguiente;
            }
            return total;
        }

        /**
         * Invierte la lista sin crear nodos nuevos.
         * Se guarda el siguiente nodo antes de cambiar cada enlace.
         */
        public void invertir() {
            Nodo anterior = null;
            Nodo actual = cabeza;

            while (actual != null) {
                Nodo proximo = actual.siguiente;
                actual.siguiente = anterior;
                anterior = actual;
                actual = proximo;
            }

            // El ultimo nodo procesado pasa a ser la nueva cabeza.
            cabeza = anterior;
        }

        /** Muestra las canciones desde la cabeza hasta null. */
        public void mostrar() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.print(actual.cancion + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ListaSimple playlist = new ListaSimple();

        System.out.println("RETO 1: COLA DE CANCIONES");
        System.out.println("Lista vacia:");
        playlist.mostrar();
        System.out.println("Cantidad inicial: " + playlist.contar());

        // Se agregan canciones propias. Al insertar al inicio,
        // cada cancion nueva aparece antes que las anteriores.
        playlist.insertarInicio("Vivir mi vida");
        playlist.insertarInicio("La bicicleta");
        playlist.insertarInicio("Color esperanza");
        playlist.insertarInicio("Bailando");
        playlist.insertarInicio("Limón y sal");

        System.out.println("\nPlaylist original:");
        playlist.mostrar();
        System.out.println("Cantidad de canciones: " + playlist.contar());

        playlist.invertir();
        System.out.println("\nPlaylist invertida:");
        playlist.mostrar();
        System.out.println("Cantidad despues de invertir: " + playlist.contar());

        // Prueba de invertir nuevamente para recuperar el orden inicial.
        playlist.invertir();
        System.out.println("\nPlaylist despues de invertir otra vez:");
        playlist.mostrar();

        // Prueba de lista vacia y lista de un solo elemento.
        ListaSimple vacia = new ListaSimple();
        vacia.invertir();
        System.out.println("\nInvertir lista vacia; cantidad: " + vacia.contar());

        ListaSimple unaCancion = new ListaSimple();
        unaCancion.insertarInicio("Una cancion");
        unaCancion.invertir();
        System.out.println("Lista de un solo nodo:");
        unaCancion.mostrar();
    }
}
