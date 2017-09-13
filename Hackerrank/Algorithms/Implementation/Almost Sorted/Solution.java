/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/matrix-rotation-algo/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String resultStr;
    public static boolean canSwap(int[] arr){
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        if(Arrays.equals(arr,sortedArray))
            return true;
        
        int firstSwap = -1;
        int secondSwap = -1;
        for(int i = 0; i < arr.length; i++){
            // Get first swap
            if(arr[i] != sortedArray[i]){
                if(firstSwap == -1){
                    firstSwap = i;
                }else if(secondSwap == -1){
                    secondSwap = i;
                }else{
                    return false;
                }
            }
        }
        if(firstSwap != -1 && secondSwap != -1){
            resultStr = "swap " + (firstSwap + 1) + " " + (secondSwap + 1);
            return true;
        }
        return false;
    }
    public static boolean canReverse(int[] arr){
        //int[] sortedArray = arr.clone();
        //Arrays.sort(sortedArray);
        int startPos = -1;
        int endPos = -1;
        for(int i = 1; i < arr.length; i++){
            
            if(arr[i] < arr[i-1] && startPos == -1){
                startPos = i-1;
            }else if(arr[i] > arr[i-1] && startPos != -1 && arr[i] > arr[startPos]  && endPos == -1){
                endPos = i-1;
                if(arr[endPos] < arr[startPos-1]){
                    return false;
                }
            }else if(arr[i] < arr[i-1] && startPos != -1 && endPos != -1){
                
                return false;
            }
        }
        if(startPos != -1 && endPos != -1){
            resultStr = "reverse " + (startPos + 1) + " " + (endPos + 1);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        resultStr  = "";
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        if(!canSwap(arr)){
            if(!canReverse(arr)){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }else{
            System.out.println("yes");
        }
        if(!resultStr.equals("")){
            System.out.println(resultStr);
        }
    }
}