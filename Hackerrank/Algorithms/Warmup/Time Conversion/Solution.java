/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/time-conversion/
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        int hour = Integer.parseInt(time.substring(0,2));
        String hourStr = "00";
        if(time.substring(8).equals("PM") && hour != 12){
            hour += 12;
        }else if(time.substring(8).equals("AM")){
            if(hour == 12){
                hour = 0;
            }
        }
        
        if(hour < 10){
                hourStr = "0" + hour;
            }else{
                hourStr = "" + hour;
            }
        System.out.println(hourStr + time.substring(2,8));
    }
}