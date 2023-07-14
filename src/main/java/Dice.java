public class Dice {
    ////Create a Dice class that acts like a set of N random-tossed dies.
    private int numberOfDie;

    //https://www.w3schools.com/java/java_constructors.asp
    //create a dice instance with a dice constructor
    public Dice(int x) {
        this.numberOfDie = x;
    }

    // //roll the die
    public int roll(){
        return (int) (6.0 * Math.random() + 1);
    }

    public Integer tossAndSum(){
        int sum = 0;
        for (int i = 0; i < numberOfDie; i++){
            sum += roll();
        }
        return sum;
    }
}
