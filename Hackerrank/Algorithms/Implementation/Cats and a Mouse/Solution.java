/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/cats-and-a-mouse/
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
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int aCatDif = Math.abs(x-z);
            int bCatDif = Math.abs(y-z);
            
            if(aCatDif < bCatDif){
                System.out.println("Cat A");
            }else if(aCatDif > bCatDif){
                System.out.println("Cat B");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
}