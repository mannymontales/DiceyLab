public class Simulation {
//state parameters object
    private Dice numberOfDie;
    private int numberOfTosses;
    public Simulation(int numberOfDie, int numberOfTosses){
        this.numberOfDie = new Dice(numberOfDie);
        this.numberOfTosses = numberOfTosses;

    }
    public void runSimulation(){
        Bins result = new Bins(2,12);
        for (int i = 0; i < numberOfTosses; i++){
            int resetSum = 0;
            //get the result of the roll first
            resetSum = this.numberOfDie.tossAndSum();
            //store the result in bin
            result.incrementBin(resetSum);
        }

        for (int j = 0; j < 13; j++){
            System.out.println("this is the " + j + " value is "+ result.getBin(j));
        }
    }
    public void printResults(){
        for (int i = 0; i < 14; i++){

        }
    }

    //Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
    public static void main(String[] args) {
        //create 2 instances of an object from dice class
        //Dice dice = new Dice(1);
        //System.out.print(dice.roll());
        //System.out.print(dice.tossAndSum());

//        Bins result = new Bins(2,12);
//        result.incrementBin(10);
//        Integer numberOfTens = result.getBin(10);
//        result.incrementBin(10);
//        System.out.println(numberOfTens);
        Simulation sim = new Simulation(2,10000);
        sim.runSimulation();


    }



}
