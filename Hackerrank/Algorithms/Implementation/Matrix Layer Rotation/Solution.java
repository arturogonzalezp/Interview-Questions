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
    public static int[][] rotate(int[][] matrix, int k){
        int n = matrix.length;
        int m = matrix[0].length;
        int lap = (2*n) + (2*m) - 4;
        int rotations = k%lap;
        
        // Number of rotations
        for(int x = 0; x < rotations; x++){
            
            int saved = matrix[0][0];
            // Top
            for(int i = 1; i < m; i++){
                matrix[0][i-1] = matrix[0][i];
            }
            // Right
            for(int i = 1; i < n; i++){
                matrix[i-1][m-1] = matrix[i][m-1];
            }
            // Bottom
            for(int i = m-1; i > 0; i--){
                matrix[n-1][i] = matrix[n-1][i-1];
            }
            // Left
            for(int i = n-1; i > 0; i--){
                matrix[i][0] = matrix[i-1][0];
            }
            matrix[1][0] = saved;
        }
        
        int newN = n-1;
        int newM = m-1;
        if(newN > 2 && newM > 2){
            int[][] newMatrix = new int[newN-1][newM-1];
            for(int i = 0; i < newN-1; i++)
                for(int j = 0; j < newM-1; j++)
                    newMatrix[i][j] = matrix[i+1][j+1];
            
            newMatrix = rotate(newMatrix,k);
            for(int i = 0; i < newN-1; i++)
                for(int j = 0; j < newM-1; j++)
                    matrix[i+1][j+1] = newMatrix[i][j];
        }
        return matrix;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        matrix = rotate(matrix,k);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}