package org.example.Usuarios_Simulaciones.Registro_Actividades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro_Actividades_Modelo {
    private String simulationId;
    private String configuration;
    private String results;
    private String timestamp;

    // Constructor que genera automáticamente la marca de tiempo actual
    public Registro_Actividades_Modelo(String simulationId, String configuration, String results) {
        this.simulationId = simulationId;
        this.configuration = configuration;
        this.results = results;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Getters y Setters
    public String getSimulationId() {
        return simulationId;
    }

    public void setSimulationId(String simulationId) {
        this.simulationId = simulationId;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getTimestamp() {
        return timestamp;
    }

    // El timestamp se establece automáticamente, por lo que no es necesario un setter

    @Override
    public String toString() {
        return "Registro_Actividades_Modelo{" +
                "simulationId='" + simulationId + '\'' +
                ", configuration='" + configuration + '\'' +
                ", results='" + results + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}