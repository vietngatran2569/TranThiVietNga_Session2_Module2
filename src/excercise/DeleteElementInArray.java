package excercise;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input array size: ");
        int size = sc.nextInt();
        int[] input = new int[size];
        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        System.out.print("Origin array: ");
        for (int i:input){
            System.out.println(i+",");
        }
        System.out.println("Nhap vao gia tri muon xoa: ");
        int number=sc.nextInt();
        int[] newArr=new int[size];
        int index=0;

        for (int i = 0; i <size ; i++) {
            if (input[i]!=number){
                newArr[index]=input[i];
                index++;
            }
        }
        System.out.println("Array sau khi xoa: ");
        for (int i: newArr){
            System.out.print(i+",");
        }
  }
}