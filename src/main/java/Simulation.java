public class Simulation {



    //Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
    public static void main(String[] args) {
        //create 2 instances of an object from dice class
        Dice dice = new Dice(2);
        //System.out.print(dice.roll());
        System.out.print(dice.tossAndSum());
    }



}
