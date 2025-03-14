package org.example.Usuarios_Simulaciones.Interfaz_Usuario;

import java.util.Scanner;

public class Interfaz_Usuario_Metodos {

    // Muestra la interfaz utilizando los datos del modelo
    public void mostrarInterfaz(Interfaz_Usuario_Modelo modelo) {
        System.out.println("=== " + modelo.getTituloInterfaz() + " ===");
        System.out.println(modelo.getMensajeBienvenida());
        System.out.println("Menú de opciones:");
        System.out.println(modelo.getMenuOpciones());
    }

    // Captura la opción ingresada por el usuario desde la consola
    public String capturarEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una opción: ");
        return scanner.nextLine();
    }

    // Procesa la opción ingresada por el usuario
    public void procesarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                System.out.println("Configurando simulación...");
                // Aquí se agregaría la lógica para configurar la simulación
                break;
            case "2":
                System.out.println("Iniciando simulación...");
                // Aquí se agregaría la lógica para iniciar la simulación
                break;
            case "3":
                System.out.println("Mostrando resultados de la simulación...");
                // Aquí se agregaría la lógica para mostrar los resultados
                break;
            case "4":
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida. Por favor, intente de nuevo.");
                break;
        }
    }

    // Inicia el bucle principal de la interfaz de usuario
    public void iniciarInterfaz(Interfaz_Usuario_Modelo modelo) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarInterfaz(modelo);
            String opcion = capturarEntrada();
            procesarOpcion(opcion);
            System.out.println(); // Salto de línea para mejorar la legibilidad
        }
    }
}