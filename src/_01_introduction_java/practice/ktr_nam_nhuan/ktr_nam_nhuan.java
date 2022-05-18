package _01_introduction_java.practice.ktr_nam_nhuan;

import java.util.Scanner;

public class ktr_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm bạn muốn kiểm tra");
        int year;
        year = scanner.nextInt();
        boolean check;
        if (year % 4 == 0){
            if (year %100 ==0){
                if (year % 400 == 0){
//                    System.out.printf("%d đây là năm nhuận", year);
                    check = true;
                }else {
//                    System.out.printf("%d đây không phải là năm nhuận", year);
                    check = false;
                }
            }else {
//                System.out.printf("%d đây là năm nhuận", year);
                check = true;
            }
        }else {
//            System.out.printf("%d đây không phải là năm nhuận",year);
            check = false;
        }
        if (check){
            System.out.printf("%d là năm nhuận",year);
        }else {
            System.out.printf("%d không phải là năm nhuận", year);
        }

    }
}
