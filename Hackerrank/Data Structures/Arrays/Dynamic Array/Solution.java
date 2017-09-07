/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/dynamic-array
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int formula(int x, int lastAnswer, int n){
        return (x ^ lastAnswer) % n;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        int lastAnswer = 0;
        for(int i = 0; i < n; i++){
            lists.add(i,new ArrayList<Integer>());
        }
        for(int i = 0; i < q; i++){
            int type = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            ArrayList<Integer> seq = lists.get(formula(x,lastAnswer,n));
            if(type == 1){
                seq.add(y);
            }else if(type == 2){
                lastAnswer = seq.get(y%seq.size());
                System.out.println(lastAnswer);
            }
        }
    }
}