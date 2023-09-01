import model.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntGenerator {

    private int[] numbers;
    private float[] probablities;
    private Pair pair;
    private List<Pair> pairs = new ArrayList<>();
    private Random rand = new Random();
    private float sumOfProbabilities;

    /*
    * In the below constructor we are doing
    * some check on edge cases and assigning
    * the arrays passed to the local arrays
    * of this class. After that we are adding
    * them to array list of Pair for better
    * processing.
    * sumOfProbabilities is the sum of all
    * probablities used for returning random
    * int from the array.
    * */
    public RandomIntGenerator(int[] numbers, float[] probabilities) {
        if (numbers.length ==0 || numbers == null || probabilities.length == 0 || probabilities == null) {
            throw new IllegalStateException("One of the arrays passed is null or empty");
        }
        this.numbers = numbers;
        this.probablities = probabilities;
        for (int i=0;i<numbers.length;i++) {
            pair = new Pair(numbers[i],probabilities[i]);
            pairs.add(pair);
        }
        for (Pair p: pairs) {
            sumOfProbabilities += p.getProbability();}
    }

    /*
    * nextNum() will use next float
    * to get a pseudo random number
    * as an index of the array
    * */
    public int  nextNum() {
        float index = rand.nextFloat(sumOfProbabilities);
        float sum = 0;
        int i=0;
        while(sum < index ) {
            sum = sum + pairs.get(i++).getProbability();
        }
        return pairs.get(Math.max(0,i-1)).getNumber();
    }
}
