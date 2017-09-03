/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 */
import java.util.*;
public class Solution {
    /*
        @problem: Return the length of the longest sequence of increasing numbers in an unsorted array
    */
    public static int longestSequence(int n, int[] sequence){
        int maxCount = 0;
        int tempCount = 0;
        for(int i = 1; i < n; i++){
            if(sequence[i] > sequence[i-1]){
                tempCount++;
            }else{
                maxCount = (tempCount > maxCount) ? tempCount : maxCount;
                tempCount = 0;
            }
        }
        return (tempCount > maxCount) ? tempCount : maxCount;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(longestSequence(n,arr));
    }
}