/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/simple-text-editor/
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
        Stack<String> stack = new Stack<String>();
        stack.add("");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            switch(in.nextInt()){
                case 1:
                    stack.push(stack.peek() + in.next());
                    break;
                case 2:
                    stack.push(stack.peek().substring(0,stack.peek().length() - in.nextInt()));
                    break;
                case 3:
                    System.out.println(stack.peek().charAt(in.nextInt()-1));
                    break;
                case 4:
                    stack.pop();
                    break;
            }
        }
    }
}