/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/pangrams
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int size = (int)'z' - (int)'a' + 1;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = 0;
        }
        while(in.hasNext()){
            String s = in.next();
            for(Character c : s.toCharArray()){
                int pos = (int)Character.toLowerCase(c) - (int)'a';
                arr[pos]++;
            }
            
        }
        boolean isPangram = true;
        for(int i = 0; i < size; i++){
            if(arr[i] == 0){
                isPangram = false;
            }
        }
        String returnStr = (isPangram) ? "pangram" : "not pangram";
        System.out.println(returnStr);
    }
}