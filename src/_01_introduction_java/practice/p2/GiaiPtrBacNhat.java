package _01_introduction_java.practice.p2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GiaiPtrBacNhat {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc nhất");
        System.out.println("phương trình có dạng Ax + b = c");

        Scanner scanner = new Scanner(System.in);

        System.out.println("A: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a!=0){
            double answer = (c - b) / a;
            System.out.printf("x = %f!\n", answer);
        }else if (b==c){
            System.out.println("phương trình có vô số nghiệm");
        }else {
            System.out.println("Phương trình vô nghiệm");


    }
}}
