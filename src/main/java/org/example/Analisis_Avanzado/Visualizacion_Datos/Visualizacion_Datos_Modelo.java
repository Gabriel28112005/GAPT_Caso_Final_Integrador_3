package org.example.Analisis_Avanzado.Visualizacion_Datos;

public class Visualizacion_Datos_Modelo {
    private String titulo;         // Título de la visualización
    private Object datos;          // Datos de la simulación (puede ser un Map, lista, etc.)
    private String descripcion;    // Descripción o detalles adicionales de la visualización

    // Constructor
    public Visualizacion_Datos_Modelo(String titulo, Object datos, String descripcion) {
        this.titulo = titulo;
        this.datos = datos;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Object getDatos() {
        return datos;
    }

    public void setDatos(Object datos) {
        this.datos = datos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Visualizacion_Datos_Modelo{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", datos=" + datos +
                '}';
    }
}
