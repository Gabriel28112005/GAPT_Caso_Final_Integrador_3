package org.example.Usuarios_Simulaciones.Autenticacion;

import java.util.HashMap;
import java.util.Map;

public class Autenticacion_Metodos {
    // Mapa que almacena los usuarios autorizados.
    // En un entorno real, se usaría una base de datos o un servicio seguro.
    private Map<String, String> usuariosAutorizados;

    // Constructor: inicializa el mapa con algunos usuarios por defecto.
    public Autenticacion_Metodos() {
        usuariosAutorizados = new HashMap<>();
        // Usuarios de ejemplo: usuario -> contraseña
        usuariosAutorizados.put("admin", "admin123");
        usuariosAutorizados.put("investigador", "invest123");
    }

    /**
     * Método para autenticar un usuario.
     * @param usuario Objeto Autenticacion_Modelo que contiene las credenciales.
     * @return true si las credenciales son correctas; false en caso contrario.
     */
    public boolean autenticar(Autenticacion_Modelo usuario) {
        if (usuario == null || usuario.getUsername() == null || usuario.getPassword() == null) {
            System.out.println("Credenciales inválidas.");
            return false;
        }
        String username = usuario.getUsername();
        String password = usuario.getPassword();
        if (usuariosAutorizados.containsKey(username) && usuariosAutorizados.get(username).equals(password)) {
            System.out.println("Usuario " + username + " autenticado exitosamente.");
            return true;
        } else {
            System.out.println("Autenticación fallida para usuario " + username + ".");
            return false;
        }
    }

    /**
     * Método para registrar un nuevo usuario autorizado.
     * @param username Nombre de usuario.
     * @param password Contraseña asociada.
     */
    public void registrarUsuario(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            System.out.println("No se puede registrar un usuario con credenciales vacías.");
            return;
        }
        if (usuariosAutorizados.containsKey(username)) {
            System.out.println("El usuario " + username + " ya está registrado.");
        } else {
            usuariosAutorizados.put(username, password);
            System.out.println("Usuario " + username + " registrado exitosamente.");
        }
    }
}