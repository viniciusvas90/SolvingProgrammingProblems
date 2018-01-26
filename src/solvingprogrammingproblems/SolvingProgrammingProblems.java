/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solvingprogrammingproblems;

import java.util.HashMap;

/**
 *
 * @author Vinicius
 */
public class SolvingProgrammingProblems {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(firstRecurring("DBCABA"));
    }
    
    public static char firstRecurring(String str) throws Exception {
        HashMap<Character,Integer> chars = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (chars.containsKey(c)) return c;
            chars.put(c, 1);
        }
        throw new Exception("String vazia.");
    }
    
}
