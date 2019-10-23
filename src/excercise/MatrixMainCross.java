package excercise;

import java.util.Scanner;

public class MatrixMainCross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix;
        int size;
        System.out.println("ENTER SIZE OF MATRIX: ");
        size=sc.nextInt();
        matrix=new int[size][size];
        System.out.println("Input value: ");
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                matrix[i][j]=(int) Math.round(Math.random()*10);
            }
        }
        for (int i = 0; i <size ; i++) {
            System.out.println();
            for (int j = 0; j <size ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
        int sum=0;
        for (int i = 0; i < size; i++) {
                sum+=matrix[i][i];
        }
        System.out.println();
        System.out.println("Result: "+sum);
    }
}
