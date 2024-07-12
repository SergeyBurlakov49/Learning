package leetcode.SeddleElements;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SeddlePoints {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число строк");
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Введите число столбцов");
        int m = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int [][] matrix = createAndPrintRandomMatrix(n,m);
        findSaddlePoints(matrix).forEach(System.out::println);
    }

    public static int[][] createAndPrintRandomMatrix(int n, int m){
        int [][] matrix = new int[n][];
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = new int[m];
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 10 - 5);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    public static ArrayList<Point> findSaddlePoints (int [][] matrix){
        ArrayList<Point> mins = findRowMins(matrix);
        ArrayList<Point> saddlePoints = new ArrayList<>();
        for (Point min:mins){
            boolean findLarger = false;
            for (int i = 0; i < matrix.length; i++){
                if (i != min.x){
                    if (matrix[i][min.y] > matrix[min.x][min.y]){
                        findLarger = true;
                        break;
                    }
                }
            }
            if (!findLarger) saddlePoints.add(min);
        }
        return saddlePoints;
    }

    public static ArrayList<Point> findRowMins(int [][] matrix){
        ArrayList<Point> mins = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0, min = Integer.MAX_VALUE, addedMins = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    for (int k = 0; k < addedMins; k++) mins.remove(mins.size() - 1);
                    addedMins = 1;
                    mins.add(new Point(i,j));
                } else if (matrix[i][j] == min) {
                    mins.add(new Point(i,j));
                    addedMins++;
                }
            }
        }
        return mins;
    }
}
