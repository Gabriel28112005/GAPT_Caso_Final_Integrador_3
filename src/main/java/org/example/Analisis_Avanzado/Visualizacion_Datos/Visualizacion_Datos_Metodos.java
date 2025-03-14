package org.example.Analisis_Avanzado.Visualizacion_Datos;

public class Visualizacion_Datos_Metodos {

    // Método para mostrar los datos de la simulación en consola de forma estructurada
    public void mostrarDatos(Visualizacion_Datos_Modelo modelo) {
        System.out.println("=== " + modelo.getTitulo() + " ===");
        System.out.println(modelo.getDescripcion());
        System.out.println("Datos de la simulación:");
        System.out.println(modelo.getDatos());
        System.out.println("==================================");
    }

    // Método para mostrar un resumen de los datos, asumiendo que 'datos' es un Map o estructura similar
    public void mostrarResumen(Visualizacion_Datos_Modelo modelo) {
        System.out.println("Resumen de: " + modelo.getTitulo());
        if (modelo.getDatos() instanceof java.util.Map) {
            java.util.Map<?, ?> datosMap = (java.util.Map<?, ?>) modelo.getDatos();
            for (Object key : datosMap.keySet()) {
                System.out.println(key + ": " + datosMap.get(key));
            }
        } else {
            System.out.println("El formato de datos no es reconocible para un resumen detallado.");
        }
    }
}