/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        Scanner in = new Scanner(System.in);
        int[] scoreChanges = {0,0};
        int maxScore = s[0];
        int lowestScore = s[0];
        for(int i = 1; i < s.length; i++){
            if(maxScore < s[i]){
                maxScore = s[i];
                scoreChanges[0]++;
            }
            if(lowestScore > s[i]){
                lowestScore = s[i];
                scoreChanges[1]++;
            }
        }
        return scoreChanges;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}