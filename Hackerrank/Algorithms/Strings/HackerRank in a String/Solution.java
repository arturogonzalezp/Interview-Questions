/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/hackerrank-in-a-string/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            StringBuilder sb = new StringBuilder("hackerrank");
            for(Character c : s.toCharArray()){
                if(sb.charAt(0) == c)
                    sb.deleteCharAt(0);
                if(sb.length() == 0)
                    break;
            }
            if(sb.length() == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}