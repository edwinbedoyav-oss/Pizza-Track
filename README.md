# Pizza-Track

Proyecto desarrollado en Java para gestionar pedidos de una pizzería con el uso de pilas y estructuras de datos. La aplicación permite registrar pizzas, deshacer la última acción y rehacerla cuando sea necesario.

## Descripción

Pizza-Track simula la gestión de pedidos mediante dos pilas:

- La pila principal guarda los pedidos actuales.
- La pila secundaria guarda los pedidos deshechos para poder volver a restaurarlos.

Esto permite implementar la funcionalidad de Undo/Redo de manera sencilla y funcional.

## Objetivo

Aplicar el concepto de pila (LIFO) a un caso real de negocio, usando nodos enlazados para crear la estructura sin depender de `java.util.Stack`.

## Estructura del proyecto

```text
Pizza-Track/
├── src/
│   ├── Pizza.java
│   ├── Nodo.java
│   ├── Pila.java
│   ├── GestionPedidos.java
│   └── Main.java
├── capturas12/
│   ├── captura1.png
│   ├── captura2.png
│   └── captura3.png
├── README.md
└── bin/
```

### Clases principales

- `Pizza`: representa una pizza con nombre e ingredientes.
- `Nodo`: nodo de la lista enlazada utilizada por la pila.
- `Pila`: implementación manual de la estructura LIFO.
- `GestionPedidos`: administra los pedidos activos y los deshechos.
- `Main`: menú principal para interactuar con el usuario.

## ¿Cómo funciona?

La lógica es muy simple:

1. El usuario registra una pizza.
2. La pizza entra a la pila principal.
3. Si se elige deshacer, la última pizza sale de la principal y pasa a la secundaria.
4. Si se elige rehacer, la pizza regresa a la principal.

Este comportamiento simula la lógica de una pila con historial de acciones.

## Requisitos

- Java JDK instalado.
- Visual Studio Code con soporte para Java o cualquier IDE compatible.

## Cómo ejecutar

1. Abre la carpeta del proyecto en tu IDE o terminal.
2. Compila los archivos Java.
3. Ejecuta la clase `Main`.
4. Usa el menú para registrar, deshacer, rehacer o consultar el pedido actual.

Ejemplo de ejecución:

```bash
javac -d bin src\*.java
java -cp bin Main
```

## Capturas de ejecución

A continuación se muestran algunas capturas del funcionamiento del programa:

<p align="center">
  <img src="capturas12/captura1.png" alt="Captura 1" width="900" />
</p>

<p align="center">
  <img src="capturas12/captura2.png" alt="Captura 2" width="900" />
</p>

<p align="center">
  <img src="capturas12/captura3.png" alt="Captura 3" width="900" />
</p>

## Video de sustentación

*(Agregar aquí el enlace del video individual o de Google Drive/YouTube.)*

## Autores

*(Agregar los nombres de los integrantes del equipo.)*
