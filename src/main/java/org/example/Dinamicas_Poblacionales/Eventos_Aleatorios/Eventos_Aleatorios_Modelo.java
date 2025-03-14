package org.example.Dinamicas_Poblacionales.Eventos_Aleatorios;

public class Eventos_Aleatorios_Modelo {
    private String tipoEvento;        // Ejemplo: "Desastre Natural", "Enfermedad", "Cambio Climático"
    private String descripcion;       // Descripción del evento
    private double probabilidad;      // Valor entre 0 y 1 que indica la probabilidad de ocurrencia
    private double impactoPoblacion;  // Impacto en la población (por ejemplo: -0.4 indica una disminución del 40%)

    // Constructor
    public Eventos_Aleatorios_Modelo(String tipoEvento, String descripcion, double probabilidad, double impactoPoblacion) {
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.probabilidad = probabilidad;
        this.impactoPoblacion = impactoPoblacion;
    }

    // Getters y Setters
    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public double getImpactoPoblacion() {
        return impactoPoblacion;
    }

    public void setImpactoPoblacion(double impactoPoblacion) {
        this.impactoPoblacion = impactoPoblacion;
    }

    @Override
    public String toString() {
        return "Eventos_Aleatorios_Modelo{" +
                "tipoEvento='" + tipoEvento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", probabilidad=" + probabilidad +
                ", impactoPoblacion=" + impactoPoblacion +
                '}';
    }
}