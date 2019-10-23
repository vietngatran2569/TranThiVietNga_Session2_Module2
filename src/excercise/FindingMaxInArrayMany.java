package excercise;

import java.util.Scanner;

public class FindingMaxInArrayMany {
    public static void main(String[] args) {
//        int [][] array={
//            {1,2,3,4,5},
//            {4,5,6,7,34}
//        };
//        int max=array[0][0];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (max<array[i][j]){
//                    max=array[i][j];
//                }
//            }
//        }
//        System.out.println("max: "+max);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix row number: ");
        int row=sc.nextInt();
        System.out.println("Enter matrix column number: ");
        int column=sc.nextInt();

        int [][] matrix=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.println("enter number at position ["+i+"]["+j+"]: ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for (int i = 0; i <row ; i++) {
          System.out.println();
            for (int j = 0; j <column ; j++) {
                System.out.print(matrix[i][j]);
            }
        }

        int max=matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("  Max is :"+ max);

    }
}
