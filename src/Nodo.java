public class Nodo {

    Pizza pizza;
    Nodo siguiente;

    public Nodo(Pizza pizza) {
        this.pizza = pizza;
        // La referencia se actualiza cuando el nodo se apila.
        this.siguiente = null;
    }
}
