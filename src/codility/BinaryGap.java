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
public class BinaryGap {

    /**
     * For example, given N = 1041 the function should return 5, because N has
     * binary representation 10000010001 and so its longest binary gap is of
     * length 5.
     */
    public static int solution(int n) {
        String[] zeroes = Integer.toBinaryString(n).split("1");
        int count = 0;
        for (String zeroe : zeroes) {
            if (zeroe.length() > count) {
                count = zeroe.length();
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(0));
    }
}
