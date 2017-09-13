/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/day-of-the-programmer/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String solve(int year){
        // Complete this function
        boolean isJulianLeap = year%4 == 0;
        boolean isGregorianLeap = (year%400 == 0 || (isJulianLeap && year%100 != 0));
        
        return (year == 1918) ? "26.09.1918" : ((year < 1918) ? isJulianLeap : isGregorianLeap) ? "12.09." + year : "13.09." + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}