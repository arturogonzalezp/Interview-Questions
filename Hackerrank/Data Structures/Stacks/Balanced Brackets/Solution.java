/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/balanced-brackets/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        // Complete this function
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '(')
                    return "NO";
            }else if(c == ']'){
                if(stack.isEmpty() || stack.pop() != '[')
                    return "NO";
            }else if(c == '}'){
                if(stack.isEmpty() || stack.pop() != '{')
                    return "NO";
            }else{
                stack.push(c);
            }
        }
        return (stack.isEmpty()) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}