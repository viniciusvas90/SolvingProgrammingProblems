/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Vinicius
 */
public class Problem1 {

    /**
     * *
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of
     * all the multiples of 3 or 5 below 1000. Ex:
     * 3,5,6,9,10,12,15,18,20,21,24,25
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(multiplesOf3And5BruteForce(1000000));
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        System.out.println(multiplesOf3And5(1000000));
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        System.out.println(multiplesOf3And5Answered(1000000));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static long multiplesOf3And5BruteForce(long value) {
        long sum = 0;
        for (long i = 3; i < value; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static long multiplesOf3And5(long value) {
        long sum = 0;
        long i = 3;
        while (i < value) {
            sum += i;
            i += 3;
        }
        i = 5;
        while (i < value) {
            sum += i;
            i += 5;
        }
        i = 15;
        while (i < value) {
            sum -= i;
            i += 15;
        }
        return sum;
    }

    public static long multiplesOf3And5Answered(long value) {
        return sumDivisibleBy(3, value-1) + sumDivisibleBy(5, value-1) - sumDivisibleBy(15, value-1);
    }

    public static long sumDivisibleBy(long n, long target) {
        long p = target / n;
        return n * (p * (p + 1) / 2);
    }
}
