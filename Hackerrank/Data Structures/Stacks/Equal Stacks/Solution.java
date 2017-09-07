/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/equal-stacks/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum1[] = new int[n1];
        int sum2[] = new int[n2];
        int sum3[] = new int[n3];
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        HashSet<Integer> set3 = new HashSet<Integer>();
        
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        for(int i = n1-1; i >= 0; i--){
            sum1[i] = (i == n1-1) ? h1[i] : sum1[i+1] + h1[i];
            set1.add(sum1[i]);
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        for(int i = n2-1; i >= 0; i--){
            sum2[i] = (i == n2-1) ? h2[i] : sum2[i+1] + h2[i];
            set2.add(sum2[i]);
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        for(int i = n3-1; i >= 0; i--){
            sum3[i] = (i == n3-1) ? h3[i] : sum3[i+1] + h3[i];
            set3.add(sum3[i]);
        }
        int maxArr[] = new int[1];
        int s1[] = new int[1];
        int s2[] = new int[1];
        HashSet<Integer> setS1 = new HashSet<Integer>();
        HashSet<Integer> setS2 = new HashSet<Integer>();
        if(n1 >= n2 && n1 >= n3){
            maxArr = sum1;
            s1 = sum2;
            s2 = sum3;
            setS1 = set2;
            setS2 = set3;
        }else if(n2 >= n1 && n2 >= n3){
            maxArr = sum2;
            s1 = sum1;
            s2 = sum3;
            setS1 = set1;
            setS2 = set3;
        }else if(n3 >= n1 && n3 >= n2){
            maxArr = sum3;
            s1 = sum1;
            s2 = sum2;
            setS1 = set1;
            setS2 = set2;
        }
        int result = 0;
        for(int i = 0; i < maxArr.length; i++){
            if(setS1.contains(maxArr[i]) && setS2.contains(maxArr[i])){
                result = maxArr[i];
                break;
            }
        }
        System.out.println(result);
    }
}