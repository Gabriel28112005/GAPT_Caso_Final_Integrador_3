package org.example.Usuarios_Simulaciones.Registro_Actividades;

import java.util.ArrayList;
import java.util.List;

public class Registro_Actividades_Metodos {
    private List<Registro_Actividades_Modelo> registros;

    // Constructor que inicializa la lista de registros
    public Registro_Actividades_Metodos() {
        this.registros = new ArrayList<>();
    }

    // Método para agregar un nuevo registro
    public void agregarRegistro(Registro_Actividades_Modelo registro) {
        registros.add(registro);
        System.out.println("Registro agregado: " + registro.toString());
    }

    // Método para mostrar todos los registros almacenados
    public void mostrarRegistros() {
        System.out.println("=== Registros de Actividades ===");
        if (registros.isEmpty()) {
            System.out.println("No hay registros disponibles.");
        } else {
            for (Registro_Actividades_Modelo registro : registros) {
                System.out.println(registro.toString());
            }
        }
        System.out.println("================================");
    }

    // Método opcional para buscar un registro por su ID
    public Registro_Actividades_Modelo buscarRegistroPorId(String simulationId) {
        for (Registro_Actividades_Modelo registro : registros) {
            if (registro.getSimulationId().equals(simulationId)) {
                return registro;
            }
        }
        System.out.println("No se encontró un registro con el ID: " + simulationId);
        return null;
    }
}