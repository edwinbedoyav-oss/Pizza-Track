import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GestionPedidos gestion = new GestionPedidos();

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    registrarPizza();
                    break;
                case 2:
                    deshacer();
                    break;
                case 3:
                    rehacer();
                    break;
                case 4:
                    mostrarActual();
                    break;
                case 0:
                    System.out.println("Cerrando Pizza-Track. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();

        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("========= PIZZA-TRACK =========");
        System.out.println("1. Registrar pizza");
        System.out.println("2. Deshacer (Undo)");
        System.out.println("3. Rehacer (Redo)");
        System.out.println("4. Mostrar pedido actual");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private static int leerOpcion() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void registrarPizza() {
        System.out.print("Nombre de la pizza: ");
        String nombre = sc.nextLine().trim();

        String[] ingredientes = new String[3];
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.print("Ingrediente " + (i + 1) + ": ");
            ingredientes[i] = sc.nextLine().trim();
        }

        Pizza pizza = new Pizza(nombre, ingredientes);
        gestion.registrarPedido(pizza);
        System.out.println("Pedido registrado -> " + pizza);
    }

    private static void deshacer() {
        Pizza pizza = gestion.deshacer();
        if (pizza == null) {
            System.out.println("No hay pedidos para deshacer.");
        } else {
            System.out.println("Se deshizo -> " + pizza);
        }
    }

    private static void rehacer() {
        Pizza pizza = gestion.rehacer();
        if (pizza == null) {
            System.out.println("No hay pedidos para rehacer.");
        } else {
            System.out.println("Se recuperó -> " + pizza);
        }
    }

    private static void mostrarActual() {
        Pizza pizza = gestion.verPedidoActual();
        if (pizza == null) {
            System.out.println("No hay pedidos activos en este momento.");
        } else {
            System.out.println("Pedido actual -> " + pizza);
        }
    }
}
