package excercise;

import java.util.Scanner;

public class FindingMinInArrayMany {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size=sc.nextInt();
            if (size>20){
                System.out.println("Not over 20");
            }
        }while (size>20);

        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element: "+(i+1)+": ");
            array[i]=sc.nextInt();
            i++;
        }
        System.out.println("Elements is array: ");
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]);
        }
        int min=array[0];
        for (int j = 0; j <array.length ; j++) {
            if (min>array[j]){
                min=array[j];
            }
        }
        System.out.println("Min of array is: "+min);
    }
}
