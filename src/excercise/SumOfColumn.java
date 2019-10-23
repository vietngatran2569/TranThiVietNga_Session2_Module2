package excercise;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int[][] array;
        int column,row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao hang: ");
        row=sc.nextInt();
        System.out.println("Nhap vao cot: ");
        column=sc.nextInt();
        array= new int[row][column];
        
        int sum=0;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <column ; j++) {
                array[i][j]=(int)(Math.round(Math.random()*10));
            }
        }
        for (int i = 0; i <row; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("Ban muon tinh tong cot thu may: ");
        int k=sc.nextInt();
        for (int i = 0; i <row ; i++) {
                sum+= array[i][k];
            }
        System.out.println("sum of column "+k+" has result: "+sum);
        }


    }

