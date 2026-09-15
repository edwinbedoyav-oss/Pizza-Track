public class Pila {

    private Nodo tope;
    private int tamano;

    public void push(Pizza pizza) {
        Nodo nuevo = new Nodo(pizza);
        // El nuevo nodo queda delante del tope anterior.
        nuevo.siguiente = tope;
        tope = nuevo;
        tamano++;
    }

    public Pizza pop() {
        if (isEmpty()) {
            return null;
        }
        Pizza pizza = tope.pizza;
        // Avanzar el tope desconecta el nodo retirado de la lista.
        tope = tope.siguiente;
        tamano--;
        return pizza;
    }

    public Pizza peek() {
        return isEmpty() ? null : tope.pizza;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void clear() {
        tope = null;
        tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }
}
