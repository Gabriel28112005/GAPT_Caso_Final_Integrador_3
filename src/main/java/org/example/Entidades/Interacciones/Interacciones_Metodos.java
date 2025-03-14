package org.example.Entidades.Interacciones;

public class Interacciones_Metodos {

    // Método para simular la interacción de predación
    public void simularPredacion(Interacciones_Modelo.Predacion predacion) {
        // Se calcula la cantidad de presas que son cazadas según la tasa de depredación y la población de depredadores
        int presasCazadas = (int) (predacion.getPredationRate() * predacion.getPredatorPopulation());
        int nuevasPreyPopulation = predacion.getPreyPopulation() - presasCazadas;
        if (nuevasPreyPopulation < 0) {
            nuevasPreyPopulation = 0;
        }
        predacion.setPreyPopulation(nuevasPreyPopulation);

        // Modelo simplificado: cada presa consumida aumenta la población de depredadores en 1 unidad
        predacion.setPredatorPopulation(predacion.getPredatorPopulation() + presasCazadas);

        System.out.println("Después de la predación: " + predacion.toString());
    }

    // Método para simular la competencia por recursos entre dos especies
    public void simularCompetencia(Interacciones_Modelo.Competencia competencia) {
        // Se calcula la proporción de recursos que le corresponde a cada especie en función de su población
        int totalPopulation = competencia.getPopulationSpecies1() + competencia.getPopulationSpecies2();
        if (totalPopulation == 0) {
            System.out.println("No hay población para competir.");
            return;
        }
        double recursosSpecies1 = ((double) competencia.getPopulationSpecies1() / totalPopulation) * competencia.getResourceAvailability();
        double recursosSpecies2 = ((double) competencia.getPopulationSpecies2() / totalPopulation) * competencia.getResourceAvailability();

        // Se actualizan las poblaciones: se incrementan en un 10% de los recursos asignados (modelo simplificado)
        int nuevaPop1 = competencia.getPopulationSpecies1() + (int)(recursosSpecies1 * 0.1);
        int nuevaPop2 = competencia.getPopulationSpecies2() + (int)(recursosSpecies2 * 0.1);

        competencia.setPopulationSpecies1(nuevaPop1);
        competencia.setPopulationSpecies2(nuevaPop2);

        System.out.println("Después de la competencia: " + competencia.toString());
    }

    // Método para simular la polinización
    public void simularPolinizacion(Interacciones_Modelo.Polinizacion polinizacion) {
        // La polinización incrementa la población de plantas en función de la eficiencia y la cantidad de polinizadores
        int incrementoPlantas = (int)(polinizacion.getPollinatorPopulation() * polinizacion.getPollinationEfficiency());
        polinizacion.setPlantPopulation(polinizacion.getPlantPopulation() + incrementoPlantas);

        System.out.println("Después de la polinización: " + polinizacion.toString());
    }
}
