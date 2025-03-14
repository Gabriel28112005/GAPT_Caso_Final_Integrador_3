package org.example.Analisis_Avanzado.Resolucion_Problemas;

public class Resolucion_Problemas_Modelo {
    private String tipoProblema; // Por ejemplo: "Equilibrio Ecológico" o "Estrategia de Conservación"
    private Object datosProblema; // Los datos necesarios para resolver el problema (puede ser un Map, una lista, etc.)
    private Object resultado;    // El resultado obtenido tras aplicar la resolución del problema

    // Constructor
    public Resolucion_Problemas_Modelo(String tipoProblema, Object datosProblema) {
        this.tipoProblema = tipoProblema;
        this.datosProblema = datosProblema;
    }

    // Getters y Setters
    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public Object getDatosProblema() {
        return datosProblema;
    }

    public void setDatosProblema(Object datosProblema) {
        this.datosProblema = datosProblema;
    }

    public Object getResultado() {
        return resultado;
    }

    public void setResultado(Object resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Resolucion_Problemas_Modelo{" +
                "tipoProblema='" + tipoProblema + '\'' +
                ", datosProblema=" + datosProblema +
                ", resultado=" + resultado +
                '}';
    }
}

