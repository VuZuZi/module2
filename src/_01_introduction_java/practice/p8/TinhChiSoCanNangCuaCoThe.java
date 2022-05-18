package _01_introduction_java.practice.p8;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        double height, weight,bmi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập cân nặng");
        weight = scanner.nextDouble();

        System.out.println("nhập chiểu cao");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);

        if(bmi < 18.5){
            System.out.println("gầy");
        }else if (bmi < 24.9){
            System.out.println("cân đối");
        }else if (bmi < 29.9){
            System.out.println("thừa cân");
        }else if (bmi < 34.9){
            System.out.println("béo phì");
        }else {
            System.out.println("oversize");
        }
    }
}
