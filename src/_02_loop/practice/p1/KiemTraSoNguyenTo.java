package _02_loop.practice.p1;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số muốn kiểm tra");
        number = sc.nextInt();
        boolean check = false;
        for (int i = 2; i < number ; i++) {
            if (number % i == 0){
                check = true;
        };
        };
        if (check == true){
            System.out.println(number + " không khải là số nt");
        }else {
            System.out.println(number  + " là số nguyên tố");
        }
    }
}
