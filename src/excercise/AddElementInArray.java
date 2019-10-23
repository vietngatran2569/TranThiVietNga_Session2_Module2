package excercise;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int [] array={2,3,5,6,7};
        Scanner sc=new Scanner(System.in);
        for (int a:array) {
            System.out.println("Mang ban dau gom: "+a+",");
        }
        System.out.println();
        System.out.print("Nhap vao vi tri ban muon them phan tu: ");
        int index=sc.nextInt();
        System.out.println("Nhap vao gia tri ban muon them phan tu: ");
        int value=sc.nextInt();

        if (index<0 || index>array.length){
            System.out.println("Warning!");
        }else {
            array=addElementIntoArray(array,index,value);
            System.out.println("Mang sau khi da them la:");
            for (int b:array) {
                System.out.println(b+",");
            }
        }
    }
    private static int[] addElementIntoArray (int[] arr,int index,int value ){
            int[] temp=new int[arr.length+1];
        for (int i = 0; i <index ; i++) {
            temp[i]=arr[i];
        }
        temp[index]=value;
        for (int i = index+1; i <temp.length ; i++) {
            temp[i]=arr[i-1];
        }
        return temp;
    }
}
