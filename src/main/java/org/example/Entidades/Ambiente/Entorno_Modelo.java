package org.example.Entidades.Ambiente;

import java.util.Map;

// Clase que representa el modelo del entorno
public class Entorno_Modelo {
    private String clima;
    private String terreno;
    private Map<String, Integer> recursos;

    // Constructor
    public Entorno_Modelo(String clima, String terreno, Map<String, Integer> recursos) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursos = recursos;
    }

    // Getters y Setters
    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public Map<String, Integer> getRecursos() {
        return recursos;
    }

    public void setRecursos(Map<String, Integer> recursos) {
        this.recursos = recursos;
    }

    @Override
    public String toString() {
        return "Entorno_Modelo{" +
                "clima='" + clima + '\'' +
                ", terreno='" + terreno + '\'' +
                ", recursos=" + recursos +
                '}';
    }
}

