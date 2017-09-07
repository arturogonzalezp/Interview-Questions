/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/largest-rectangle/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static long largestRectangle(int[] height) {
        // Complete this function
        Stack<Integer> current = new Stack<>();
        Map<Integer, Integer> heights = new HashMap<>();
        int maxRectangle = 0;

        if (height.length > 0){
            current.push(height[0]);
            int count = 1;
            if (heights.containsKey(height[0]))
                count += heights.get(height[0]);

            heights.put(height[0], count);
        }

        for (int i = 1; i < height.length; i++) {
            int k = current.peek();
            if (k > height[i]){
                int count = 0;
                while (!current.isEmpty() && k > height[i]) {
                    current.pop();
                    count = heights.get(k);
                    if (count * k > maxRectangle)
                        maxRectangle = count * k;
                    heights.put(k, 0);
                    k = current.isEmpty() ? 0 : current.peek();
                }
                if (k < height[i]){
                    current.push(height[i]);
                    if (heights.containsKey(height[i]))
                        count += heights.get(height[i]);

                    heights.put(height[i], count);
                }
            }
            else if (k < height[i])
                current.push(height[i]);

            for(Integer uniqueHeight : current){
                int count = 1;
                if (heights.containsKey(uniqueHeight))
                    count += heights.get(uniqueHeight);
                
                heights.put(uniqueHeight, count);
            }
        }

        for(Integer uniqueHeight : heights.keySet()) {
            int temp = heights.get(uniqueHeight) * uniqueHeight;
            if (temp > maxRectangle)
                maxRectangle = temp;
        }

        return maxRectangle;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int h_i = 0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        long result = largestRectangle(h);
        System.out.println(result);
        in.close();
    }
}