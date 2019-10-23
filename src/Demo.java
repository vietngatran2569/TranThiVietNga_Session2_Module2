import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        int [][] matrix={
//                {1,2,3},
//                {3,4,5},
//                {5,6,7},
//                {3,4,5},
//        };
//        System.out.println(matrix.length);

       // matrix=new int[3][4];
       // matrix[0][0]=1;matrix[0][1]=2;matrix[0][2]=3

//        int[][] triangleArray=new int[5][];
//        triangleArray[0]=new int[5];
//        triangleArray[0]=new int[4];
//        triangleArray[0]=new int[3];
//        triangleArray[0]=new int[2];
//        triangleArray[0]=new int[1];
        int [][] matrix=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+matrix.length+" rows and "+matrix[0].length+" columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column <matrix[row].length ; column++) {
                matrix[row][column]=sc.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
