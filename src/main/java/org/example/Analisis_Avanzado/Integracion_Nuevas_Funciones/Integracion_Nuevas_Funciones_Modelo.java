package org.example.Analisis_Avanzado.Integracion_Nuevas_Funciones;

public class Integracion_Nuevas_Funciones_Modelo{
    private String nombreModelo;
    private Object parametros;

    // Constructor
    public Integracion_Nuevas_Funciones_Modelo(String nombreModelo, Object parametros) {
        this.nombreModelo = nombreModelo;
        this.parametros = parametros;
    }

    // Getters y Setters
    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public Object getParametros() {
        return parametros;
    }

    public void setParametros(Object parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "Integracion_Nuevas_Funciones_Modelos{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", parametros=" + parametros +
                '}';
    }

    // Interfaz funcional para definir funciones personalizadas.
    // Los investigadores deberán implementar este método para ejecutar su lógica sobre el modelo.
    @FunctionalInterface
    public interface CustomFunction {
        Object ejecutar(Integracion_Nuevas_Funciones_Modelo modelo);
    }
}

