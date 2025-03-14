package org.example.Entidades.Ambiente;

// Clase que implementa métodos para manipular y representar el entorno
public class Entorno_Metodos {

    public Entorno_Metodos(String soleado, String bosque, int i) {
    }

    public Entorno_Metodos() {

    }

    // Método para cambiar el clima del entorno
    public void cambiarClima(Entorno_Modelo entorno, String nuevoClima) {
        entorno.setClima(nuevoClima);
        System.out.println("El clima ha cambiado a: " + nuevoClima);
    }

    // Método para cambiar el terreno del entorno
    public void cambiarTerreno(Entorno_Modelo entorno, String nuevoTerreno) {
        entorno.setTerreno(nuevoTerreno);
        System.out.println("El terreno ha cambiado a: " + nuevoTerreno);
    }

    // Método para actualizar o agregar un recurso y su cantidad en el entorno
    public void actualizarRecursos(Entorno_Modelo entorno, String recurso, int cantidad) {
        // Se puede agregar o actualizar la cantidad del recurso
        entorno.getRecursos().put(recurso, cantidad);
        System.out.println("El recurso " + recurso + " se ha actualizado a: " + cantidad);
    }

    // Método para mostrar el estado actual del entorno
    public void mostrarEstado(Entorno_Modelo entorno) {
        System.out.println(entorno.toString());
    }
}
