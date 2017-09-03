/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 */
import java.util.*;
public class Solution {
    /*
        @problem: Given two strings representing integer numbers ("123" , "30") return a string 
        representing the sum of the two numbers ("153")
    */
    public static String sumOfStringIntegers(String a, String b){
        String bigNumStr = (a.length() > b.length()) ? a : b;
        String smallNumStr = (a == bigNumStr) ? b : a;
        int dif = bigNumStr.length() - smallNumStr.length();
        int[] bigNum = new int[bigNumStr.length()];
        int[] smallNum = new int[bigNumStr.length()];
        for(int i = 0; i < bigNumStr.length(); i++){
            bigNum[i] = Character.getNumericValue(bigNumStr.charAt(i));
            if(i < dif){
                smallNum[i] = 0;
            }else{
                smallNum[i] = Character.getNumericValue(smallNumStr.charAt(i-dif));
            }
        }
        int[] result = new int[bigNum.length + 1];
        int overflow = 0;
        for(int i = bigNum.length-1; i >= 0; i--){
            int tempSum = overflow + bigNum[i] + smallNum[i];
            overflow = (tempSum >= 10) ? 1 : 0;
            result[i+1] = tempSum % 10;
        }
        result[0] = overflow;
        String resultStr = "";
        for(int i = 0; i < result.length; i++){
            if(i == 0 && result[i] == 0){
                continue;
            }
            resultStr += result[i];
        }
        return resultStr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(sumOfStringIntegers(a,b));
    }
}