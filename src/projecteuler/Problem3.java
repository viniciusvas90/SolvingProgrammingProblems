package projecteuler;

/**
 *
 * @author Vinicius
 */
public class Problem3 {

    /**
     * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
     * factor of the number 600851475143 ?
     */
    public static void main(String[] args) {
        System.out.println("Result: " + largestPrimeFactor(600851475143l));
    }

    public static long largestPrimeFactor(long number) {
        long lpf = 2;
        while (number > lpf) {
            if (number % lpf == 0) {
                number = number / lpf;
                lpf = 2;
            } else {
                lpf++;
            }
        }
        return lpf;
    }

    public static boolean isPrime(long number) {
        //check if n is a multiple of 2
        if (number % 2 == 0) {
            return false;
        }
        //if not, then just check the odds
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
