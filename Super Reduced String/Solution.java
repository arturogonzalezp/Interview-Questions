/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/reduced-string
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function
        StringBuilder sb = new StringBuilder(s);
        int position = 1;
        while(position < sb.length()){
            if(sb.charAt(position) == sb.charAt(position-1)){
                sb.delete(position-1, position+1);
                position = 0;
            }
            position++;
        }
        return (sb.length() > 0) ? sb.toString() : "Empty String";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}