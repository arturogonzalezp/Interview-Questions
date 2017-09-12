/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/migratory-birds/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        HashMap<Integer,Integer> birds = new HashMap<>();
        for(Integer i : ar){
            int x = 1;
            if(birds.containsKey(i))
                x += birds.get(i);
            birds.put(i,x);
        }
        int birdId = 0;
        int birdCount = 0;
        for(Map.Entry<Integer,Integer> entry : birds.entrySet()){
            if(birdCount == entry.getValue() && birdId > entry.getKey()){
                birdId = entry.getKey();
            }else if(birdCount < entry.getValue()){
                birdId = entry.getKey();
                birdCount = entry.getValue();
            }
        }
        return birdId;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}