package _02_loop.practice.p4;

import java.util.Scanner;

public class ThietKeLogoChoUngDung {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("chọn số tương ứng hình muốn in");
        System.out.println("1 hình tam giác cân");
        System.out.println("2 hình vuông");
        System.out.println("3 hình chữ nhật");
        System.out.println("4 Thoát");
        int chosse = inp.nextInt();
        switch (chosse){
            case 1:
                System.out.println("    *    ");
                System.out.println("   ***   ");
                System.out.println("  *****  ");
                System.out.println(" ******* ");
                System.out.println("*********");
                break;
            case 2:
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("* * * * * * * * *");
                System.out.println("* * * * * * * * *");
                System.out.println("* * * * * * * * *");
                System.out.println("* * * * * * * * *");
                break;
            default:
                System.out.println("Không chọn");
        }
    }
}
