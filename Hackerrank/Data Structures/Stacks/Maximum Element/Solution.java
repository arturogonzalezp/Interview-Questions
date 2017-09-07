/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/maximum-element
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Long> stack = new Stack<Long>();
        PriorityQueue<Long> maxHeap = new PriorityQueue<Long>(n,Collections.reverseOrder());
        
        for(int i = 0; i < n; i++){
            switch(in.nextInt()){
                case 1:
                    Long l = in.nextLong();
                    stack.push(l);
                    maxHeap.add(l);
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        Long tempL = stack.pop();
                        maxHeap.remove(tempL);
                    }
                    break;
                case 3:
                    if(!stack.isEmpty())
                        System.out.println(maxHeap.peek());
                    break;
            }
        }
    }
}