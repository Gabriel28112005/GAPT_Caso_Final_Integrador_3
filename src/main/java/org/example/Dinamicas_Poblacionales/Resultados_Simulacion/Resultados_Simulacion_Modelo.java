package org.example.Dinamicas_Poblacionales.Resultados_Simulacion;

public class Resultados_Simulacion_Modelo {
    private String titulo;
    private String descripcion;
    private double ecosystemHealthIndex;
    private double averagePopulation;
    private double populationGrowthRate;
    private double mortalityRate;

    // Constructor
    public Resultados_Simulacion_Modelo(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getEcosystemHealthIndex() {
        return ecosystemHealthIndex;
    }
    public void setEcosystemHealthIndex(double ecosystemHealthIndex) {
        this.ecosystemHealthIndex = ecosystemHealthIndex;
    }

    public double getAveragePopulation() {
        return averagePopulation;
    }
    public void setAveragePopulation(double averagePopulation) {
        this.averagePopulation = averagePopulation;
    }

    public double getPopulationGrowthRate() {
        return populationGrowthRate;
    }
    public void setPopulationGrowthRate(double populationGrowthRate) {
        this.populationGrowthRate = populationGrowthRate;
    }

    public double getMortalityRate() {
        return mortalityRate;
    }
    public void setMortalityRate(double mortalityRate) {
        this.mortalityRate = mortalityRate;
    }

    @Override
    public String toString() {
        return "Resultados_Simulacion_Modelo{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ecosystemHealthIndex=" + ecosystemHealthIndex +
                ", averagePopulation=" + averagePopulation +
                ", populationGrowthRate=" + populationGrowthRate +
                ", mortalityRate=" + mortalityRate +
                '}';
    }
}