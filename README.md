# Pizza-Track

Simulador de gestión de pedidos para una pizzería, desarrollado en Java para la actividad EA2 (Manipulación de Arreglos y Listas). Permite registrar pedidos y deshacer o rehacer esa acción mediante dos pilas construidas manualmente con listas ligadas, sin usar `java.util.Stack`.

## Objetivo

Aplicar el concepto de pila (estructura LIFO) a un caso de gestión de pedidos, implementando desde cero la lógica de inserción y extracción sobre nodos enlazados, y combinándola con el uso de un arreglo de tamaño fijo para representar los ingredientes de cada pizza.

## Estructura del proyecto

```
Pizza-Track/
├── src/
│   ├── Pizza.java
│   ├── Nodo.java
│   ├── Pila.java
│   ├── GestionPedidos.java
│   └── Main.java
└── README.md
```

- **Pizza**: representa un pedido; guarda el nombre y un arreglo de 3 ingredientes.
- **Nodo**: unidad básica de la lista ligada; guarda una pizza y una referencia al siguiente nodo.
- **Pila**: implementación manual de una pila sobre nodos enlazados (`push`, `pop`, `peek`, `isEmpty`).
- **GestionPedidos**: coordina la pila principal y la secundaria para manejar el Undo/Redo.
- **Main**: menú de consola que conecta todo lo anterior con el usuario.

## ¿Qué es una pila y cómo se usa aquí?

Una pila es una estructura de datos que solo permite agregar y quitar elementos por un extremo, llamado tope, bajo el orden LIFO: el último elemento en entrar es el primero en salir. Aquí se usan dos pilas independientes para lograr el Undo/Redo:

- La **pila principal** guarda los pedidos activos, en el orden en que fueron registrados.
- La **pila secundaria** guarda temporalmente los pedidos que se han deshecho, para poder recuperarlos.

Cuando el usuario registra una pizza, esta se apila (`push`) en la pila principal. Al elegir Deshacer, se retira (`pop`) el pedido que está en el tope de la pila principal y se apila en la secundaria; el pedido no se borra, simplemente cambia de pila. Al elegir Rehacer ocurre el proceso inverso: se retira el tope de la secundaria y se vuelve a apilar en la principal. Por eso el ciclo Registro → Deshacer → Rehacer siempre devuelve el pedido a su estado anterior.

## Requisitos

- JDK (Eclipse Temurin)
- Visual Studio Code con la extensión de Java, o cualquier IDE compatible

## Cómo ejecutar

1. Clonar este repositorio.
2. Abrir la carpeta del proyecto en VS Code.
3. Ejecutar la clase `Main.java` (botón *Run* del editor, o `java Main` desde la carpeta compilada).
4. Usar el menú para registrar pizzas, deshacer, rehacer o consultar el pedido actual.

## Capturas de ejecución

*(Agregar aquí las capturas de consola mostrando el ciclo Registro → Deshacer → Rehacer)*

## Video de sustentación

*(Agregar aquí el enlace al video individual — YouTube, Drive o GitHub)*

## Autores

*(Agregar los nombres de los integrantes del equipo)*
