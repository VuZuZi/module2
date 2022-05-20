package _03_Advanced.exercise.e2;

import java.util.Scanner;

public class ThemGiaTriVaoMang {
    public static void main(String[] args) {
        int [] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner check = new Scanner(System.in);
        int addr,valuenew;
        do {
            System.out.println("nhập vị trí muốn thêm vào mảng");
            addr = check.nextInt();
            if (addr>(1+arr.length))
                System.out.println("vị trí chưa tồn tại");
            else {
                System.out.println("input value ");
                valuenew = check.nextInt();
                for (int i = 0; i < arr.length; i++) {

                }
            }
        }while (addr>(1+arr.length));
    }
}
