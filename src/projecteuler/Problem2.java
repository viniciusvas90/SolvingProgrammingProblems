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
public class Problem2 {

    public static void main(String[] args) {
        System.out.println(evenFibonacciNumbers());
        System.out.println(fibonacciSum2());
    }

    public static long evenFibonacciNumbers() {
        long sum = 0;
        long number = 2;
        long prevNumber = 1;
        do {
            if (number % 2 == 0) {
                sum += number;
            }
            long aux = prevNumber;
            prevNumber = number;
            number += aux;
        } while (number <= 4000000);
        return sum;
    }

    public static long fibonacciSum2() {
        long previousNumber = 1;
        long sum = 0;

        for (long i = 2; i <= 4000000;) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            long aux = previousNumber;
            previousNumber = i;
            i += aux;
        }
        return sum;
    }
}
