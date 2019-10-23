package practice;

import java.util.Scanner;

public class FindNameInArray {
    public static void main(String[] args) {
        String[] myList = {"Hoa", "Ly", "Lan", "Hong"};
        String inputName;
        Scanner sc = new Scanner(System.in);
        inputName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + inputName + " in the list.");
    }
}
