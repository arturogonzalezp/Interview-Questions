/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/sock-merchant/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            Integer temp = 0;
            if(hashMap.containsKey(ar[i])){
                temp = hashMap.get(ar[i]);
            }
            temp++;
            hashMap.put(ar[i],temp);
        }
        int counter = 0;
        for(Integer x : hashMap.values()){
            int div = x/2;
            counter = (div >= 1) ? counter+div : counter;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}