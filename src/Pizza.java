public class Pizza {

    private String nombre;
    private String[] ingredientes;

    public Pizza(String nombre, String[] ingredientes) {
        if (ingredientes.length != 3) {
            throw new IllegalArgumentException("Una pizza debe tener exactamente 3 ingredientes.");
        }
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return nombre + " (" + String.join(", ", ingredientes) + ")";
    }
}
