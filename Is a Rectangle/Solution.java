/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 */
import java.util.*;
public class Solution{
    public static boolean isRectangle(int[][] points){
        int[] topLeft = { points[0][0], points[0][1] };
        int[] topRight = { points[0][0], points[0][1] };
        int[] bottomLeft = { points[0][0], points[0][1] };
        int[] bottomRight = { points[0][0], points[0][1] };

        for(int i = 1; i < points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            if(topLeft[0] < x && topLeft[1] > y){
                topLeft[0] = x;
                topLeft[1] = y;
            }
            if(bottomLeft[0] < x && bottomLeft[1] < y){
                bottomLeft[0] = x;
                bottomLeft[1] = y;
            }
            if(topRight[0] > x && topRight[1] > y){
                topRight[0] = x;
                topRight[1] = y;
            }
            if(bottomRight[0] > x && bottomRight[1] < y){
                bottomRight[0] = x;
                bottomRight[1] = y;
            }
        }
        return (topLeft[0] + topRight[0] + bottomLeft[0] + bottomRight[0]) == (topLeft[1] + topRight[1] + bottomLeft[1] + bottomRight[1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] points = new int[n][2];
        for(int i = 0; i < n; i++){
            points[i][0] = in.nextInt();
            points[i][1] = in.nextInt();
        }
        String retStr = isRectangle(points) ? "Rectangle" : "Not Rectangle";
        System.out.println(retStr);
    }
}