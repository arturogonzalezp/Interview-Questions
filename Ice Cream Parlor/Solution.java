/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/icecream-parlor
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int c = 0; c < cases; c++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            for(int i = 0; i < n; i++){
                boolean found = false;
                for(int j = i+1; j < n; j++){
                    int tempSum = arr[i] + arr[j];
                    if(tempSum == m){
                        System.out.println((i+1) + " " + (j+1));
                        found = true;
                        break;
                    }
                }
                if(found)
                    break;
            }
        }
    }
}