/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/mars-exploration/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] options = {'S','O','S'};
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(options[i%3] != s.charAt(i)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}