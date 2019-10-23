package excercise;
import java.util.Scanner;

public class ExceptionTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao canh a: ");
        int a=sc.nextInt();
        System.out.println("Nhap vao canh b: ");
        int b=sc.nextInt();
        System.out.println("Nhap vao canh c: ");
        int c=sc.nextInt();

        try{
            if (a+b>c || a+c>b || b+c>a){
                System.out.println("Khong phai tam giac");
            }else {
                System.out.println("La 1 tam giac.");
            }
        }catch (java.lang.Exception e){
            e.printStackTrace();
        }

    }
}
