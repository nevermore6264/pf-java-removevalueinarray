package hieutt.demo;

import java.util.Scanner;

public class RemoveValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng: ");
        int number = scanner.nextInt();

        int list[] = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + i);
            list[i] = scanner.nextInt();
        }

        System.out.println("Nhập giá trị phần tử cần xóa: ");
        int value = scanner.nextInt();

        TimPhanTu(list, number, value);
        XoaPhanTu(list, number, value);

        for (int i = 0; i < list.length - 1; i++) {
            System.out.println(list[i] + "\t");
        }

    }

    public static int TimPhanTu(int a[], int n, int x) {
        for (int i = 0; i < n; i++)
            if (a[i] == x) {
                return i; //Tìm thấy x tại vị trí thứ i
            }
        return -1; //Không tìm thấy x trong mảng
    }

    //=======================================================================
    public static void XoaPhanTu(int a[], int n, int x) {
        int vt = TimPhanTu(a, n, x); //Tìm vị trí x trong mảng
        if (vt == -1) {
            System.out.printf("\nKhong tim thay phan tu %d muon xoa.", x);
        } else {
            for (int i = vt; i <= n - 2; i++)
                a[i] = a[i + 1]; //Dịch các phần tử sang trái 1 vị trí
            n--; //Giảm số phần tử bớt 1
        }
    }
}
