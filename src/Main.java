public class Main {
    public static void main(String[] args) {

        // Creacion de pila con capacidad máxima para 5 elementos
        ArrayStack miPila = new ArrayStack(5);

        System.out.println("--- INICIANDO LA PILA ---");
        System.out.println("¿La pila está vacía? " + miPila.isEmpty());

        //Insertar elementos (push)
        System.out.println("\n--- INSERTANDO DATOS ---");
        miPila.push("Primer Elemento");
        miPila.push("Segundo Elemento");
        miPila.push("Tercer Elemento");

        System.out.println("Estado actual de la pila: " + miPila.toString());
        System.out.println("Cantidad de elementos (size): " + miPila.size());

        //Ver el tope sin sacarlo (peek)
        System.out.println("\n--- CONSULTANDO EL TOPE ---");
        System.out.println("El elemento en la cima es: " + miPila.peek());

        //Busqueda de elementos (search)
        System.out.println("\n--- BUSCANDO DATOS ---");
        System.out.println("¿Existe 'Segundo Elemento'? " + miPila.search("Segundo Elemento"));
        System.out.println("¿Existe 'Cuarto Elemento'? " + miPila.search("Cuarto Elemento"));

        //Extraer un elemento (pop)
        System.out.println("\n--- EXTRAYENDO EL TOPE ---");
        System.out.println("Elemento extraído: " + miPila.pop());
        System.out.println("Estado de la pila después del pop: " + miPila.toString());
        System.out.println("Nueva cantidad de elementos: " + miPila.size());

        //Limpieza de toda la memoria (clear)
        System.out.println("\n--- LIMPIANDO LA PILA ---");
        miPila.clear();
        System.out.println("Estado de la pila después del clear: " + miPila.toString());
        System.out.println("¿La pila está vacía ahora? " + miPila.isEmpty());
    }
}