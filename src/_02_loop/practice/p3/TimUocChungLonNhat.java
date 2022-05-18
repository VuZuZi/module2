package _02_loop.practice.p3;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);
        System.out.println("nhập số thứ nhất");
        int nb1 = nb.nextInt();
        System.out.println("nhập số thứ 2");
        int nb2 = nb.nextInt();
        if (nb2<nb1){
            int a = nb1;
            nb1 = nb2;
            nb2 = a;
        }
        for (int i = nb1; i >0 ; i--) {
            if (nb1%i==0&&nb2%i==0){
                System.out.println(i+" là ước chung lớn nhất của "+nb1+" và "+nb2);
                break;
            }
        }
    }
}
