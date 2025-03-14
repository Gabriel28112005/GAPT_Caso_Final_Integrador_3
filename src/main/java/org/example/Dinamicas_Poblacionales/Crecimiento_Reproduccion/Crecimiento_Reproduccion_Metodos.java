package org.example.Dinamicas_Poblacionales.Crecimiento_Reproduccion;

public class Crecimiento_Reproduccion_Metodos {

    // Simula el crecimiento poblacional durante un ciclo
    // La población aumenta en función de la tasa de crecimiento
    public void simularCrecimiento(Crecimiento_Reproduccion_Modelo modelo) {
        int poblacionActual = modelo.getPoblacionActual();
        double incremento = poblacionActual * modelo.getTasaCrecimiento();
        int nuevaPoblacion = poblacionActual + (int) incremento;
        modelo.setPoblacionActual(nuevaPoblacion);
        System.out.println("Después del crecimiento, la población de " + modelo.getEspecie() + " es: " + nuevaPoblacion);
    }

    // Simula la reproducción de la especie durante un ciclo
    // La población aumenta en función de la tasa de reproducción
    public void simularReproduccion(Crecimiento_Reproduccion_Modelo modelo) {
        int poblacionActual = modelo.getPoblacionActual();
        double nuevosIndividuos = poblacionActual * modelo.getTasaReproduccion();
        int nuevaPoblacion = poblacionActual + (int) nuevosIndividuos;
        modelo.setPoblacionActual(nuevaPoblacion);
        System.out.println("Después de la reproducción, la población de " + modelo.getEspecie() + " es: " + nuevaPoblacion);
    }

    // Simula un ciclo completo que incluye crecimiento y reproducción
    public void simularCicloCompleto(Crecimiento_Reproduccion_Modelo modelo) {
        System.out.println("Simulación de ciclo completo para la especie: " + modelo.getEspecie());
        simularCrecimiento(modelo);
        simularReproduccion(modelo);
        System.out.println("Población final después del ciclo completo: " + modelo.getPoblacionActual());
    }
}