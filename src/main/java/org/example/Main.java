package org.example;

import org.example.Analisis_Avanzado.Resolucion_Problemas.Resolucion_Problemas_Metodos;
import org.example.Analisis_Avanzado.Resolucion_Problemas.Resolucion_Problemas_Modelo;
import org.example.Analisis_Avanzado.Visualizacion_Datos.Visualizacion_Datos_Metodos;
import org.example.Analisis_Avanzado.Visualizacion_Datos.Visualizacion_Datos_Modelo;

import org.example.Dinamicas_Poblacionales.Eventos_Aleatorios.Eventos_Aleatorios_Metodos;
import org.example.Dinamicas_Poblacionales.Eventos_Aleatorios.Eventos_Aleatorios_Modelo;
import org.example.Dinamicas_Poblacionales.Resultados_Simulacion.Resultados_Simulacion_Metodos;
import org.example.Dinamicas_Poblacionales.Resultados_Simulacion.Resultados_Simulacion_Modelo;

import org.example.Entidades.Ambiente.Entorno_Metodos;
import org.example.Entidades.Ambiente.Entorno_Modelo;
import org.example.Entidades.Organismos.Animal;
import org.example.Entidades.Organismos.Planta;

import org.example.Usuarios_Simulaciones.Autenticacion.Autenticacion_Metodos;
import org.example.Usuarios_Simulaciones.Autenticacion.Autenticacion_Modelo;
import org.example.Usuarios_Simulaciones.Interfaz_Usuario.Interfaz_Usuario_Metodos;
import org.example.Usuarios_Simulaciones.Interfaz_Usuario.Interfaz_Usuario_Modelo;
import org.example.Usuarios_Simulaciones.Registro_Actividades.Registro_Actividades_Metodos;
import org.example.Usuarios_Simulaciones.Registro_Actividades.Registro_Actividades_Modelo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. AUTENTICACIÓN
        System.out.println("=== AUTENTICACIÓN ===");
        Autenticacion_Metodos authMetodos = new Autenticacion_Metodos();
        Autenticacion_Modelo adminUser = new Autenticacion_Modelo("admin", "admin123");
        boolean isAuthenticated = authMetodos.autenticar(adminUser);
        System.out.println("Usuario autenticado: " + isAuthenticated);
        System.out.println();

        // 2. ENTORNO
        System.out.println("=== CONFIGURACIÓN DEL ENTORNO ===");
        Map<String, Integer> recursos = new HashMap<>();
        recursos.put("Agua", 100);
        recursos.put("Comida", 50);

        Entorno_Modelo entorno = new Entorno_Modelo("Soleado", "Urbano", recursos);
        Entorno_Metodos entornoMetodos = new Entorno_Metodos();

        entornoMetodos.mostrarEstado(entorno);
        entornoMetodos.cambiarClima(entorno, "Lluvioso");
        entornoMetodos.mostrarEstado(entorno);
        System.out.println();

        // 3. ORGANISMOS (Animal y Planta)
        System.out.println("=== ORGANISMOS ===");
        Animal animal = new Animal(10, 20, 100, 2, true);
        Planta planta = new Planta(5, 5, 80, 1, false);

        System.out.println("Animal -> Posición: (" + animal.getPosicionX() + ", "
                + animal.getPosicionY() + "), Salud: " + animal.getSalud()
                + ", Edad: " + animal.getEdad()
                + ", Estado reproductivo: " + animal.isEstadoReproductivo());

        System.out.println("Planta -> Posición: (" + planta.getPosicionX() + ", "
                + planta.getPosicionY() + "), Salud: " + planta.getSalud()
                + ", Edad: " + planta.getEdad()
                + ", Estado reproductivo: " + planta.isEstadoReproductivo());
        System.out.println();

        // 4. RESOLUCIÓN DE PROBLEMAS (Equilibrio Ecológico y Estrategia de Conservación)
        System.out.println("=== RESOLUCIÓN DE PROBLEMAS ===");
        Map<String, Integer> poblaciones = new HashMap<>();
        poblaciones.put("Especie A", 50);
        poblaciones.put("Especie B", 70);
        poblaciones.put("Especie C", 30);

        Resolucion_Problemas_Modelo modeloEquilibrio = new Resolucion_Problemas_Modelo(
                "Equilibrio Ecológico",
                poblaciones
        );
        Resolucion_Problemas_Metodos resolucionMetodos = new Resolucion_Problemas_Metodos();
        resolucionMetodos.buscarEquilibrioEcologico(modeloEquilibrio);

        Map<String, Object> estrategiaDatos = new HashMap<>();
        estrategiaDatos.put("estrategia", "Protección de hábitat");
        estrategiaDatos.put("eficiencia", 85.5);

        Resolucion_Problemas_Modelo modeloConservacion = new Resolucion_Problemas_Modelo(
                "Estrategia de Conservación",
                estrategiaDatos
        );
        resolucionMetodos.evaluarEstrategiaConservacion(modeloConservacion);
        System.out.println();

        // 5. VISUALIZACIÓN DE DATOS
        System.out.println("=== VISUALIZACIÓN DE DATOS ===");
        Map<String, Object> datosSimulacion = new HashMap<>();
        datosSimulacion.put("Población Inicial", 100);
        datosSimulacion.put("Población Final", 75);
        datosSimulacion.put("Tiempo de Simulación (horas)", 48);

        Visualizacion_Datos_Modelo visualizacionModelo = new Visualizacion_Datos_Modelo(
                "Resumen de Simulación",
                datosSimulacion,
                "Evolución de la población a lo largo del tiempo."
        );
        Visualizacion_Datos_Metodos visualizacionMetodos = new Visualizacion_Datos_Metodos();
        visualizacionMetodos.mostrarDatos(visualizacionModelo);
        visualizacionMetodos.mostrarResumen(visualizacionModelo);
        System.out.println();

        // 6. EVENTOS ALEATORIOS
        System.out.println("=== EVENTOS ALEATORIOS ===");
        Eventos_Aleatorios_Modelo desastreNatural = new Eventos_Aleatorios_Modelo(
                "Desastre Natural",
                "Terremoto devastador",
                0.3,
                -0.4
        );
        Eventos_Aleatorios_Metodos eventosMetodos = new Eventos_Aleatorios_Metodos();
        int poblacionEvento = 1000;

        poblacionEvento = eventosMetodos.aplicarEvento(poblacionEvento, desastreNatural);

        Eventos_Aleatorios_Modelo enfermedad = new Eventos_Aleatorios_Modelo(
                "Enfermedad",
                "Brote infeccioso",
                0.5,
                -0.2
        );
        poblacionEvento = eventosMetodos.aplicarEvento(poblacionEvento, enfermedad);

        Eventos_Aleatorios_Modelo cambioClimatico = new Eventos_Aleatorios_Modelo(
                "Cambio Climático",
                "Condiciones extremas de temperatura",
                0.4,
                -0.1
        );
        poblacionEvento = eventosMetodos.aplicarEvento(poblacionEvento, cambioClimatico);
        System.out.println("Población final tras eventos: " + poblacionEvento);
        System.out.println();

        // 7. RESULTADOS DE LA SIMULACIÓN
        System.out.println("=== RESULTADOS DE LA SIMULACIÓN ===");
        List<Integer> poblacionHistorica = Arrays.asList(1000, 1050, 1100, 1080, 1150);

        Resultados_Simulacion_Modelo resultadosModelo = new Resultados_Simulacion_Modelo(
                "Estadísticas de Simulación",
                "Informe sobre la salud del ecosistema y tendencias poblacionales."
        );
        Resultados_Simulacion_Metodos resultadosMetodos = new Resultados_Simulacion_Metodos();
        resultadosMetodos.actualizarEstadisticas(resultadosModelo, poblacionHistorica);
        resultadosMetodos.presentarEstadisticas(resultadosModelo);
        System.out.println();

        // 8. REGISTRO DE ACTIVIDADES
        System.out.println("=== REGISTRO DE ACTIVIDADES ===");
        Registro_Actividades_Metodos registroMetodos = new Registro_Actividades_Metodos();

        Registro_Actividades_Modelo registro1 = new Registro_Actividades_Modelo(
                "Sim001",
                "Configuración: Ecosistema mixto, parámetros por defecto",
                "Resultado: Ecosistema estable"
        );
        Registro_Actividades_Modelo registro2 = new Registro_Actividades_Modelo(
                "Sim002",
                "Configuración: Aumento de recursos y tasa de crecimiento",
                "Resultado: Población incrementada"
        );

        registroMetodos.agregarRegistro(registro1);
        registroMetodos.agregarRegistro(registro2);
        registroMetodos.mostrarRegistros();
        System.out.println();

        // 9. INTERFAZ DE USUARIO (Modo interactivo, se recomienda probar de forma independiente)

        System.out.println("=== INTERFAZ DE USUARIO ===");
        Interfaz_Usuario_Modelo interfazModelo = new Interfaz_Usuario_Modelo(
                "Simulador de Ecosistemas",
                "Bienvenido al simulador de ecosistemas. Configure y controle sus simulaciones.",
                "1. Configurar Simulación\n2. Iniciar Simulación\n3. Mostrar Resultados\n4. Salir"
        );
        Interfaz_Usuario_Metodos interfazMetodos = new Interfaz_Usuario_Metodos();
        interfazMetodos.iniciarInterfaz(interfazModelo);


        System.out.println("=== FIN DE LA SIMULACIÓN COMPLETA ===");
    }
}