/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 *
 * @author Vinicius
 */
public class Problem5 {

    public static void main(String[] args) {
        System.out.println(smallestMultiple(1, 20));
    }

    public static int smallestMultiple(int rangeStart, int rangeEnd) {
        int number = rangeEnd;
        boolean achou = false;
        while (!achou) {
            for (int i = rangeEnd; i >= rangeStart; i--) {
                achou = true;
                if (number % i != 0) {
                    number++;
                    achou = false;
                    break;
                }
            }
        }
        return number;
    }

}
