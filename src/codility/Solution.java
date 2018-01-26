/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author Vinicius
 */
public class Solution {

    /**
     * For example, given N = 1041 the function should return 5, because N has
     * binary representation 10000010001 and so its longest binary gap is of
     * length 5.
     */
    public static int solution(int n) {
        String binary = Integer.toBinaryString(n);
        System.out.println("binary: "+binary);
        String[] zeroes = binary.split("1");
        if (n % 2 == 0) zeroes[zeroes.length-1]="";
        int count = 0;
        for (int i = 0; i < zeroes.length; i++) {
            if (zeroes[i].length() > count) {
                count = zeroes[i].length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(solution(2));
//        System.out.println(solution(9));
        System.out.println(solution(2000000000));
        System.out.println(solution(2000000000/2));
        System.out.println(solution((2000000000/2)/2));
        System.out.println(solution(((2000000000/2)/2)/2));
//        System.out.println(solution(1042));
//        System.out.println(solution(1043));
//        System.out.println(solution(1044));
//        System.out.println(solution(1045));
    }
}
