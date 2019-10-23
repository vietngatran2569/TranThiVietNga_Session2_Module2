package practice;

import java.util.Scanner;

public class ReverseInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size=sc.nextInt();
            if (size>20){
                System.out.println("Size doesnt exceed 20");
            }
        }while (size>20);

        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element: "+(i+1)+": ");
            array[i]=sc.nextInt();
            i++;
        }

        System.out.printf("%-20s%s","Elements is array: ","");
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]+"\t");
        }

        //Dao nguoc phan tu
        for (int j = 0; j < array.length/2; j++) {
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        //in ra final
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
