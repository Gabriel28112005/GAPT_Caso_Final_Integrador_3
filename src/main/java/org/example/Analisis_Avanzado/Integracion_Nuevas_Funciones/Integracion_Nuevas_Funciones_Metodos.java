package org.example.Analisis_Avanzado.Integracion_Nuevas_Funciones;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Integracion_Nuevas_Funciones_Metodos {

    // Método para integrar (registrar) un nuevo modelo en el simulador.
    // Aquí se podría agregar el modelo a una colección interna o inicializar la simulación con él.
    public void integrarModelo(Integracion_Nuevas_Funciones_Modelo modelo) {
        // Lógica para integrar el modelo en el simulador
        System.out.println("Modelo integrado: " + modelo.toString());
        // Ejemplo: agregar a una lista de modelos, inicializar parámetros, etc.
    }

    // Método para ejecutar una función personalizada sobre un modelo integrado.
    // Se recibe el modelo y la función (implementada según la interfaz CustomFunction).
    public Object ejecutarFuncionPersonalizada(Integracion_Nuevas_Funciones_Modelo modelo,
                                               Integracion_Nuevas_Funciones_Modelo.CustomFunction funcion) {
        Object resultado = funcion.ejecutar(modelo);
        System.out.println("Resultado de la función personalizada: " + resultado);
        return resultado;
    }
}
