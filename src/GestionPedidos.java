public class GestionPedidos {

    private Pila pilaPrincipal;
    private Pila pilaSecundaria;

    public GestionPedidos() {
        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }

    public void registrarPedido(Pizza pizza) {
        pilaPrincipal.push(pizza);
        pilaSecundaria.clear();
    }

    public Pizza deshacer() {
        if (pilaPrincipal.isEmpty()) {
            return null;
        }
        Pizza pizza = pilaPrincipal.pop();
        pilaSecundaria.push(pizza);
        return pizza;
    }

    public Pizza rehacer() {
        if (pilaSecundaria.isEmpty()) {
            return null;
        }
        Pizza pizza = pilaSecundaria.pop();
        pilaPrincipal.push(pizza);
        return pizza;
    }

    public Pizza verPedidoActual() {
        return pilaPrincipal.peek();
    }
}
