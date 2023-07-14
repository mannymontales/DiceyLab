public class MainApplication {
    public static void main(String[] args) {
        Simulation sim = new Simulation(2 , 100000);

        sim.runSimulation();
        sim.printResults();
    }
}
