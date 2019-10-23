package practice;

public class FindMinInArrayByMethod {
    public static void main(String[] args) {
           int[] array={12,13,5,7};
           int text=findMin(array);
        System.out.println("So nho nhat la: "+array[text]);
    }
    private static int findMin(int[] array) {
        int min = array[0];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index=i;
            }
        }
        return index;
    }
}
