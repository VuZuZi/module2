package _01_introduction_java.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tháng nào bạn muốn biết số ngày?");
        int month = scanner.nextInt();

        switch (month){
            case 2:
                System.out.println("tháng 2 có 28 hoặc 29 ngày!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng "+month+" có 31 ngày");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng "+month+" có 30 ngày!");
                break;
            default:
                System.out.println("chỉ có 12 tháng trong 1 năm!");
                break;
        }
    }
}
