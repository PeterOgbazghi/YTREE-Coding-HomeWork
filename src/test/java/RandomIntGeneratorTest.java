import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomIntGeneratorTest {
    private RandomIntGenerator randomIntGenerator;


    @RepeatedTest(10)
    public void testMethodReturnIntValue() {
        int[] nums = {-1, 0, 1, 2, 3};
        float[] prob = {0.01f, 0.3f, 0.58f, 0.1f, 0.01f};
        randomIntGenerator = new RandomIntGenerator(nums,prob);
        assertTrue(Integer.class.isInstance(randomIntGenerator.nextNum()));
    }

    /**
     * In the below test we are testing
     * to make sure that the method call
     * returns as expected when called
     * numerous times and the probability
     * of a certain integer returned is
     * inline with probablity provided
     * on the probablity array.
     * EX. the number 1 should be returned
     * greater time as it have the biggest
     * probability.
     * */
    @Test
    public void testMethodReturnsAreValid() {
        int[] nums = {-1, 0, 1, 2, 3};
        float[] prob = {0.01f, 0.3f, 0.58f, 0.1f, 0.01f};
        randomIntGenerator = new RandomIntGenerator(nums,prob);
        int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0;
        int nextRandomNumber;
        for (int j=0; j<100; j++) {
            nextRandomNumber = randomIntGenerator.nextNum();
            if (nextRandomNumber == -1) counter1++;
            if (nextRandomNumber == 0) counter2++;
            if (nextRandomNumber == 1) counter3++;
            if (nextRandomNumber == 2) counter4++;
            if (nextRandomNumber == 3) counter5++;
        }

        assertTrue(counter3 > counter2);
        assertTrue(counter2 > counter4);
    }

    @Test
    public void testEmptyArrayPassed() {
        int[] nums = new int[0];
        float[] prob = {0.01f, 0.3f, 0.58f, 0.1f, 0.01f};
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            randomIntGenerator = new RandomIntGenerator(nums,prob);
        });

        String expectedMessage = "One of the arrays passed is null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
