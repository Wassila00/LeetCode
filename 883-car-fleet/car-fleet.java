class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Étape 1 : créer une liste des paires (position, temps)
        double[][] cars = new double[n][2]; // chaque voiture a [position, temps]

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            // temps = (distance restante) / vitesse
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        // Étape 2 : trier les voitures par position décroissante
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        // Étape 3 : compter les flottes avec une pile (ou variable)
        int fleets = 0;
        double lastTime = 0.0;

        for (int i = 0; i < n; i++) {
            double time = cars[i][1];

            if (time > lastTime) {
                // Si cette voiture met plus de temps que la flotte devant
                // => elle ne peut pas rattraper => elle crée une nouvelle flotte
                fleets++;
                lastTime = time; // mettre à jour le temps de la dernière flotte
            }
            // Sinon, elle rejoint une flotte existante => on ne compte pas une nouvelle
        }

        return fleets;
    }
}
