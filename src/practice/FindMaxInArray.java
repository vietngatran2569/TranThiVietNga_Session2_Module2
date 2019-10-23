package practice;

public class FindMaxInArray {
    public static void main(String[] args) {
       int [] arr={10,20,89,26};
       int max=arr[1];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max=arr[i];
                System.out.println("Maxx is: "+max);
            }
        }
    }
}
