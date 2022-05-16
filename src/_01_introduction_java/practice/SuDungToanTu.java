package _01_introduction_java.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dài: ");
        height = scanner.nextFloat();

        System.out.println("nhập chiều rộng: ");
        width = scanner.nextFloat();

        float Area = height * width;
        System.out.println("Area = "+Area);
    }
}
