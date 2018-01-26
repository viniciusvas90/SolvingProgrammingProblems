/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 *
 * @author Vinicius
 */
public class Problem4 {

    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct());
    }

    public static int largestPalindromeProduct() {
        int largestPalindromeProduct = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                String number = String.valueOf(i * j);
                if (number.equals(new StringBuilder(number).reverse().toString())) {
                    if (Integer.parseInt(number) > largestPalindromeProduct) {
                        System.out.println(i + " x " + j + " = " + number);
                        largestPalindromeProduct = Integer.parseInt(number);
                        break;
                    }
                }
            }
        }
        return largestPalindromeProduct;
    }
}
