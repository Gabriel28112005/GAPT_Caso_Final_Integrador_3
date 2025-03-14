package org.example.Dinamicas_Poblacionales.Eventos_Aleatorios;

public class Eventos_Aleatorios_Metodos {

    /**
     * Simula la ocurrencia de un evento aleatorio.
     * Si el evento ocurre (según su probabilidad), se aplica el impacto sobre la población.
     *
     * @param poblacion Población actual antes del evento.
     * @param evento Instancia del modelo que define el evento.
     * @return La nueva población luego de aplicar el impacto del evento (o la población original si no ocurre).
     */
    public int aplicarEvento(int poblacion, Eventos_Aleatorios_Modelo evento) {
        // Generamos un número aleatorio entre 0 y 1 para determinar si el evento ocurre
        double randomValue = Math.random();
        System.out.println("Valor aleatorio: " + randomValue + " (Probabilidad requerida: " + evento.getProbabilidad() + ")");

        if(randomValue < evento.getProbabilidad()) {
            // El evento ocurre: se aplica el impacto a la población
            int nuevaPoblacion = (int)(poblacion * (1 + evento.getImpactoPoblacion()));
            System.out.println("Evento '" + evento.getTipoEvento() + "' ocurrido: " + evento.getDescripcion());
            System.out.println("Impacto en la población: " + (evento.getImpactoPoblacion() * 100) + "%");
            System.out.println("Población original: " + poblacion + " -> Nueva población: " + nuevaPoblacion);
            return nuevaPoblacion;
        } else {
            System.out.println("No ocurrió el evento '" + evento.getTipoEvento() + "'. La población se mantiene en " + poblacion);
            return poblacion;
        }
    }

    // Método para mostrar la información del evento
    public void mostrarEvento(Eventos_Aleatorios_Modelo evento) {
        System.out.println("Detalles del evento aleatorio:");
        System.out.println(evento.toString());
    }
}


