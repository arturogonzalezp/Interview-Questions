/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/counting-valleys/
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
        String hike = in.next();
        int lastNum = 0;
        int actualNum = 0;
        int counter = 0;
        for(int i = 0; i < hike.length(); i++){
            Character c = hike.charAt(i);
            lastNum = actualNum;
            if(c == 'U'){
                actualNum++;
            }else if(c == 'D'){
                actualNum--;
            }
            if(lastNum == 0 && actualNum == -1)
                counter++;
        }
        System.out.println(counter);
    }
}