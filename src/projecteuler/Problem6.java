/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... +
 * 102 = 385
 *
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10)2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 * @author Vinicius
 */
public class Problem6 {

    public static void main(String[] args) {
        System.out.println(sumSquareDifference(100));
    }

    public static int sumSquareDifference(int n) {
        int sumOfSquares = (2 * n + 1) * (n + 1) * n / 6;
        int sum = n * (n + 1) / 2;
        return sum * sum - sumOfSquares;
    }
}
