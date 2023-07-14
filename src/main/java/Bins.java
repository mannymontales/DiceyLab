import java.util.ArrayList;

public class Bins {


    ArrayList<Integer> numberBin = new ArrayList<>();
    //Create a tracking class Bins that can be used to track these results.
    public Bins (int minRange, int maxRange){

        //shifts the array to line up given the range in the read me's case 2 to 12
        int shiftArray = maxRange + minRange;

        while (minRange <= shiftArray){
            this.numberBin.add(0);
            minRange += 1;
        }
    }
    public Integer getBin(Integer x){

        return this.numberBin.get(x);
    }
    public void incrementBin(int x){

        for (int i = 0; i < numberBin.size(); i++) {

            //i is index because of the for loop and numberBin.get(i) is the value
            if (i == x) {
                int value = (numberBin.get(i) + 1);
                //System.out.println(i);
                //System.out.println(numberBin.get(i));
                numberBin.set(i , value);

            }

        }
        System.out.print(numberBin);
    }

    public static void main(String[] args) {

        Bins results = new Bins(2, 12);

        Integer numberOfTens = results.getBin(10);
        results.incrementBin(10);
        results.incrementBin(10);
        //Integer numberOfTens = results.getBin(10);
        System.out.println("the element in " + numberOfTens);
    }

}
