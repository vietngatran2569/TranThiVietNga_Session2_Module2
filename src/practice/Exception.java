package practice;

import java.util.Random;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Exception arrayExample = new Exception();
        Integer[] arr = arrayExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so : ");
        int x = sc.nextInt();
        try {
            System.out.println("gtri cua pha tu co chi so " + x + " la: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[10];
        System.out.println("Danh sach phan tu of mang: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt(10);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}
