package excercise;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi ki tu: ");
        String myChar=sc.nextLine();
        System.out.println("Dem so ki tu: ");
        String c=sc.nextLine();

        int count=0;
        char test=c.charAt(0);
        for (int i = 0; i <myChar.length() ; i++) {
            if (myChar.charAt(i)==test){
                count++;
            }
        }
        System.out.println("Vay "+c+" xuat hien "+count+" lan");
    }

}
