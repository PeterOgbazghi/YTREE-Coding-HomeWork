
public class YTREETechnicalTestStarter {

    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 2, 3};
        float[] probabilities = {0.01f, 0.3f, 0.58f, 0.1f, 0.01f};
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator(numbers,probabilities);
        while (true) randomIntGenerator.nextNum();
        //System.out.println("Integer returned is : " + randomIntGenerator.nextNum());
    }
}
