package _01_introduction_java.exercise.e2;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("nhập số muốn đọc");
        Scanner sc = new Scanner(System.in);
        int nb;
//        String nbr;
        nb = sc.nextInt();
        int nb2 = sc.nextInt();
        if(nb<=10){
        switch (nb){
            case 0:
                System.out.printf("không");
                break;
            case 1:
                System.out.printf("một");
                break;
            case 2:
                System.out.printf("hai");
                break;
            case 3: System.out.printf("ba");
                break;
            case 4: System.out.printf("bốn");
                break;
            case 5: System.out.printf("năm");
                break;
            case 6: System.out.printf("sáu");
                break;
            case 7: System.out.printf("bảy");
                break;
            case 8: System.out.printf("tám");
                break;
            case 9: System.out.printf("chín");
                break;
            case 10: System.out.printf("mười");
                break;
        }}
//        System.out.printf("%s",+ nbr);
    }
}
