package javaarray;

import java.util.Scanner;

public class RemoveValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of list number: ");
        int number = scanner.nextInt();

        int listnumber[] = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the element: " + i);
            listnumber[i] = scanner.nextInt();
        }

        System.out.println("Enter the number: ");
        int value = scanner.nextInt();

        SearchElement(listnumber, value);
        if (RemoveElement(listnumber, value) == true) {
            for (int i = 0; i < listnumber.length - 1; i++) {
                System.out.print(listnumber[i] + "\t");
            }
        } else {
            System.out.println("Fail remove");
        }


    }

    public static int SearchElement(int array[], int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value) {
                return i; //Tìm thấy x tại vị trí thứ i
            }
        return -1; //Không tìm thấy x trong mảng
    }

    //=======================================================================
    public static boolean RemoveElement(int array[], int value) {
        int vt = SearchElement(array, value); //Tìm vị trí x trong mảng
        if (vt == -1) {
            return false;
        } else {
            for (int i = vt; i <= array.length - 2; i++) {
                array[i] = array[i + 1]; //Dịch các phần tử sang trái 1 vị trí
            }
            int i = array.length;
            i--; //Giảm số phần tử bớt 1
            return true;
        }
    }
}
