package org.example.Usuarios_Simulaciones.Autenticacion;

public class Autenticacion_Modelo {
    private String username;
    private String password;

    // Constructor
    public Autenticacion_Modelo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Autenticacion_Modelo{" +
                "username='" + username + '\'' +
                '}';
    }
}