import java.util.ArrayList;

public class Bins {
    //Create a tracking class Bins that can be used to track these results.
    ArrayList<Integer> numberBin = new ArrayList<>();

    public Bins (int minRange, int maxRange){

        //shifts the array to line up given the range in the read me's case 2 to 12
        int shiftArray = maxRange + minRange;

        while (minRange <= shiftArray){
            this.numberBin.add(0);
            minRange += 1;
        }
    }

    public Integer getBin(Integer occurrences){
        return this.numberBin.get(occurrences);
    }

    public void incrementBin(int rolledNum){

        for (int i = 0; i < numberBin.size(); i++) {
            //i is index because of the for loop and numberBin.get(i) is the value
            if (i == rolledNum) {
                int value = (numberBin.get(i) + 1);
                numberBin.set(i , value);
            }
        }
    }
}
