package org.example.Analisis_Avanzado.Resolucion_Problemas;

public class Resolucion_Problemas_Metodos {

    // Método para buscar un equilibrio ecológico.
    // Se asume que los datos del problema son un Map<String, Integer> representando poblaciones de especies.
    public void buscarEquilibrioEcologico(Resolucion_Problemas_Modelo modelo) {
        if (modelo.getDatosProblema() instanceof java.util.Map) {
            java.util.Map<String, Integer> poblaciones = (java.util.Map<String, Integer>) modelo.getDatosProblema();
            int suma = 0;
            int count = 0;
            for (Integer value : poblaciones.values()) {
                suma += value;
                count++;
            }
            double equilibrio = (count > 0) ? (double) suma / count : 0;
            modelo.setResultado("Equilibrio ecológico teórico (media de poblaciones): " + equilibrio);
            System.out.println("Resultado de la búsqueda de equilibrio ecológico: " + modelo.getResultado());
        } else {
            System.out.println("Los datos del problema no tienen el formato esperado para el equilibrio ecológico.");
        }
    }

    // Método para evaluar estrategias de conservación.
    // Se espera que los datos sean un Map<String, Object> con al menos las claves "estrategia" y "eficiencia".
    public void evaluarEstrategiaConservacion(Resolucion_Problemas_Modelo modelo) {
        if (modelo.getDatosProblema() instanceof java.util.Map) {
            java.util.Map<String, Object> datos = (java.util.Map<String, Object>) modelo.getDatosProblema();
            if (datos.containsKey("estrategia") && datos.containsKey("eficiencia")) {
                String estrategia = (String) datos.get("estrategia");
                double eficiencia = Double.parseDouble(datos.get("eficiencia").toString());
                String evaluacion = "La estrategia '" + estrategia + "' presenta una eficiencia del " + eficiencia + "%.";
                modelo.setResultado(evaluacion);
                System.out.println("Resultado de la evaluación de la estrategia de conservación: " + modelo.getResultado());
            } else {
                System.out.println("Los datos del problema no contienen los campos esperados para evaluar la estrategia.");
            }
        } else {
            System.out.println("Los datos del problema no tienen el formato esperado para evaluar la estrategia de conservación.");
        }
    }
}