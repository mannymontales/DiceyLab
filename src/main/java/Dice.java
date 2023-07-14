public class Dice {

    //int numberOfSides;
    int numberofDie;
    //Create a Dice class that acts like a set of N random-tossed dies.

    // //create a dice with a dice constructor
    public Dice(int x) {

        this.numberofDie = x;
    }


    // //roll the die
    int roll(){
        return    (int) (6.0 * Math.random() + 1);

    }
}
