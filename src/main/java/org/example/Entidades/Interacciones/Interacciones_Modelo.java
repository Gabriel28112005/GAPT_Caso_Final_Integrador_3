package org.example.Entidades.Interacciones;

public class Interacciones_Modelo {
    // Modelo para simular una interacción de predación
    public class Predacion {
        private String predator;
        private String prey;
        private int predatorPopulation;
        private int preyPopulation;
        private double predationRate; // Tasa de depredación

        public Predacion(String predator, String prey, int predatorPopulation, int preyPopulation, double predationRate) {
            this.predator = predator;
            this.prey = prey;
            this.predatorPopulation = predatorPopulation;
            this.preyPopulation = preyPopulation;
            this.predationRate = predationRate;
        }

        // Getters y Setters
        public String getPredator() { return predator; }
        public void setPredator(String predator) { this.predator = predator; }

        public String getPrey() { return prey; }
        public void setPrey(String prey) { this.prey = prey; }

        public int getPredatorPopulation() { return predatorPopulation; }
        public void setPredatorPopulation(int predatorPopulation) { this.predatorPopulation = predatorPopulation; }

        public int getPreyPopulation() { return preyPopulation; }
        public void setPreyPopulation(int preyPopulation) { this.preyPopulation = preyPopulation; }

        public double getPredationRate() { return predationRate; }
        public void setPredationRate(double predationRate) { this.predationRate = predationRate; }

        @Override
        public String toString() {
            return "Predacion{" +
                    "predator='" + predator + '\'' +
                    ", prey='" + prey + '\'' +
                    ", predatorPopulation=" + predatorPopulation +
                    ", preyPopulation=" + preyPopulation +
                    ", predationRate=" + predationRate +
                    '}';
        }
    }

    // Modelo para simular la competencia por recursos entre dos especies
    public class Competencia {
        private String species1;
        private String species2;
        private int populationSpecies1;
        private int populationSpecies2;
        private int resourceAvailability; // Recursos disponibles en el entorno

        public Competencia(String species1, String species2, int populationSpecies1, int populationSpecies2, int resourceAvailability) {
            this.species1 = species1;
            this.species2 = species2;
            this.populationSpecies1 = populationSpecies1;
            this.populationSpecies2 = populationSpecies2;
            this.resourceAvailability = resourceAvailability;
        }

        // Getters y Setters
        public String getSpecies1() { return species1; }
        public void setSpecies1(String species1) { this.species1 = species1; }

        public String getSpecies2() { return species2; }
        public void setSpecies2(String species2) { this.species2 = species2; }

        public int getPopulationSpecies1() { return populationSpecies1; }
        public void setPopulationSpecies1(int populationSpecies1) { this.populationSpecies1 = populationSpecies1; }

        public int getPopulationSpecies2() { return populationSpecies2; }
        public void setPopulationSpecies2(int populationSpecies2) { this.populationSpecies2 = populationSpecies2; }

        public int getResourceAvailability() { return resourceAvailability; }
        public void setResourceAvailability(int resourceAvailability) { this.resourceAvailability = resourceAvailability; }

        @Override
        public String toString() {
            return "Competencia{" +
                    "species1='" + species1 + '\'' +
                    ", species2='" + species2 + '\'' +
                    ", populationSpecies1=" + populationSpecies1 +
                    ", populationSpecies2=" + populationSpecies2 +
                    ", resourceAvailability=" + resourceAvailability +
                    '}';
        }
    }

    // Modelo para simular la polinización entre plantas y polinizadores
    public class Polinizacion {
        private String plant;
        private String pollinator;
        private int plantPopulation;
        private int pollinatorPopulation;
        private double pollinationEfficiency; // Eficiencia de la polinización

        public Polinizacion(String plant, String pollinator, int plantPopulation, int pollinatorPopulation, double pollinationEfficiency) {
            this.plant = plant;
            this.pollinator = pollinator;
            this.plantPopulation = plantPopulation;
            this.pollinatorPopulation = pollinatorPopulation;
            this.pollinationEfficiency = pollinationEfficiency;
        }

        // Getters y Setters
        public String getPlant() { return plant; }
        public void setPlant(String plant) { this.plant = plant; }

        public String getPollinator() { return pollinator; }
        public void setPollinator(String pollinator) { this.pollinator = pollinator; }

        public int getPlantPopulation() { return plantPopulation; }
        public void setPlantPopulation(int plantPopulation) { this.plantPopulation = plantPopulation; }

        public int getPollinatorPopulation() { return pollinatorPopulation; }
        public void setPollinatorPopulation(int pollinatorPopulation) { this.pollinatorPopulation = pollinatorPopulation; }

        public double getPollinationEfficiency() { return pollinationEfficiency; }
        public void setPollinationEfficiency(double pollinationEfficiency) { this.pollinationEfficiency = pollinationEfficiency; }

        @Override
        public String toString() {
            return "Polinizacion{" +
                    "plant='" + plant + '\'' +
                    ", pollinator='" + pollinator + '\'' +
                    ", plantPopulation=" + plantPopulation +
                    ", pollinatorPopulation=" + pollinatorPopulation +
                    ", pollinationEfficiency=" + pollinationEfficiency +
                    '}';
        }
    }

}
