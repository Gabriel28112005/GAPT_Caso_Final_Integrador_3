package org.example.Usuarios_Simulaciones.Interfaz_Usuario;

public class Interfaz_Usuario_Modelo {
    private String tituloInterfaz;
    private String mensajeBienvenida;
    private String menuOpciones;

    // Constructor
    public Interfaz_Usuario_Modelo(String tituloInterfaz, String mensajeBienvenida, String menuOpciones) {
        this.tituloInterfaz = tituloInterfaz;
        this.mensajeBienvenida = mensajeBienvenida;
        this.menuOpciones = menuOpciones;
    }

    // Getters y Setters
    public String getTituloInterfaz() {
        return tituloInterfaz;
    }

    public void setTituloInterfaz(String tituloInterfaz) {
        this.tituloInterfaz = tituloInterfaz;
    }

    public String getMensajeBienvenida() {
        return mensajeBienvenida;
    }

    public void setMensajeBienvenida(String mensajeBienvenida) {
        this.mensajeBienvenida = mensajeBienvenida;
    }

    public String getMenuOpciones() {
        return menuOpciones;
    }

    public void setMenuOpciones(String menuOpciones) {
        this.menuOpciones = menuOpciones;
    }

    @Override
    public String toString() {
        return "Interfaz_Usuario_Modelo{" +
                "tituloInterfaz='" + tituloInterfaz + '\'' +
                ", mensajeBienvenida='" + mensajeBienvenida + '\'' +
                ", menuOpciones='" + menuOpciones + '\'' +
                '}';
    }
}