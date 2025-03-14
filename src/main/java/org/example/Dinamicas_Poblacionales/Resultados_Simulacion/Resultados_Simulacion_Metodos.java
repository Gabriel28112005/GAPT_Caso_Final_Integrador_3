package org.example.Dinamicas_Poblacionales.Resultados_Simulacion;

import java.util.List;

public class Resultados_Simulacion_Metodos {

    // Calcula el promedio de población a partir de una serie histórica
    public double calcularPromedioPoblacion(List<Integer> poblacionHistorica) {
        if (poblacionHistorica == null || poblacionHistorica.isEmpty()) return 0;
        int suma = 0;
        for (int pop : poblacionHistorica) {
            suma += pop;
        }
        return (double) suma / poblacionHistorica.size();
    }

    // Calcula la tasa de crecimiento poblacional tomando el primer y último valor de la serie
    public double calcularTasaCrecimiento(List<Integer> poblacionHistorica) {
        if (poblacionHistorica == null || poblacionHistorica.size() < 2) return 0;
        int primero = poblacionHistorica.get(0);
        int ultimo = poblacionHistorica.get(poblacionHistorica.size() - 1);
        if (primero == 0) return 0;
        return ((double)(ultimo - primero)) / primero;
    }

    // Calcula la tasa de mortalidad como la parte negativa de la tasa de crecimiento (si hay decrecimiento)
    public double calcularTasaMortalidad(List<Integer> poblacionHistorica) {
        double tasa = calcularTasaCrecimiento(poblacionHistorica);
        return tasa < 0 ? -tasa : 0;
    }

    // Calcula un índice de salud del ecosistema a partir del promedio poblacional y la tasa de crecimiento
    // Fórmula de ejemplo: índice = promedio * (1 + tasa de crecimiento)
    public double calcularIndiceSaludEcosistema(List<Integer> poblacionHistorica) {
        double promedio = calcularPromedioPoblacion(poblacionHistorica);
        double crecimiento = calcularTasaCrecimiento(poblacionHistorica);
        return promedio * (1 + crecimiento);
    }

    // Actualiza el modelo de resultados con los cálculos obtenidos a partir de la serie histórica de población
    public void actualizarEstadisticas(Resultados_Simulacion_Modelo modelo, List<Integer> poblacionHistorica) {
        double promedio = calcularPromedioPoblacion(poblacionHistorica);
        double crecimiento = calcularTasaCrecimiento(poblacionHistorica);
        double mortalidad = calcularTasaMortalidad(poblacionHistorica);
        double indiceSalud = calcularIndiceSaludEcosistema(poblacionHistorica);

        modelo.setAveragePopulation(promedio);
        modelo.setPopulationGrowthRate(crecimiento);
        modelo.setMortalityRate(mortalidad);
        modelo.setEcosystemHealthIndex(indiceSalud);
    }

    // Presenta en consola las estadísticas almacenadas en el modelo
    public void presentarEstadisticas(Resultados_Simulacion_Modelo modelo) {
        System.out.println("=== " + modelo.getTitulo() + " ===");
        System.out.println(modelo.getDescripcion());
        System.out.println("Índice de salud del ecosistema: " + modelo.getEcosystemHealthIndex());
        System.out.println("Población promedio: " + modelo.getAveragePopulation());
        System.out.println("Tasa de crecimiento poblacional: " + modelo.getPopulationGrowthRate());
        System.out.println("Tasa de mortalidad: " + modelo.getMortalityRate());
        System.out.println("==================================");
    }
}