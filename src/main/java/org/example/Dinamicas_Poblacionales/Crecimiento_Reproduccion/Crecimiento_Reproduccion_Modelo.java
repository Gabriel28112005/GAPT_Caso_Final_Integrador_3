package org.example.Dinamicas_Poblacionales.Crecimiento_Reproduccion;

public class Crecimiento_Reproduccion_Modelo {
    private String especie;
    private int poblacionInicial;
    private int poblacionActual;
    private double tasaCrecimiento;   // Por ejemplo: 0.05 para un crecimiento del 5% por ciclo
    private double tasaReproduccion;   // Por ejemplo: 0.1 para que cada individuo genere un 10% más de individuos

    // Constructor
    public Crecimiento_Reproduccion_Modelo(String especie, int poblacionInicial, double tasaCrecimiento, double tasaReproduccion) {
        this.especie = especie;
        this.poblacionInicial = poblacionInicial;
        this.poblacionActual = poblacionInicial;
        this.tasaCrecimiento = tasaCrecimiento;
        this.tasaReproduccion = tasaReproduccion;
    }

    // Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPoblacionInicial() {
        return poblacionInicial;
    }

    public void setPoblacionInicial(int poblacionInicial) {
        this.poblacionInicial = poblacionInicial;
    }

    public int getPoblacionActual() {
        return poblacionActual;
    }

    public void setPoblacionActual(int poblacionActual) {
        this.poblacionActual = poblacionActual;
    }

    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }

    public double getTasaReproduccion() {
        return tasaReproduccion;
    }

    public void setTasaReproduccion(double tasaReproduccion) {
        this.tasaReproduccion = tasaReproduccion;
    }

    @Override
    public String toString() {
        return "Crecimiento_Reproduccion_Modelo{" +
                "especie='" + especie + '\'' +
                ", poblacionInicial=" + poblacionInicial +
                ", poblacionActual=" + poblacionActual +
                ", tasaCrecimiento=" + tasaCrecimiento +
                ", tasaReproduccion=" + tasaReproduccion +
                '}';
    }
}