package _02_loop.practice.p2;

import java.util.Scanner;

public class TInhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tháng");
        int month = sc.nextInt();
        System.out.println("nhập lãi suât(%)");
        double lai = sc.nextDouble();
        System.out.println("nhập tiền gửi (triệu đồng)");
        int money = sc.nextInt();
        double sum = money*(lai/100)/12*month ;
        System.out.println("tiền lãi sau "+ month+" bằng "+ sum + "triệu đồng" );
    }
}
