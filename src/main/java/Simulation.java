public class Simulation {
//state parameters object
//Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
    private Dice numberOfDie;
    private int numberOfTosses;

    Bins result = new Bins(2,12);
    public Simulation(int numberOfDie, int numberOfTosses){
        this.numberOfDie = new Dice(numberOfDie);
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation(){
        for (int i = 0; i < numberOfTosses; i++){
            int resetSum = 0;
            //get the result of the roll first
            resetSum = this.numberOfDie.tossAndSum();
            //store the result in bin
            result.incrementBin(resetSum);
        }
    }

    public void printResults(){
        for (int j = 2; j < 13; j++){
            System.out.println(j + ":   " + "Occurred: "+ result.getBin(j));
        }
    }
}
