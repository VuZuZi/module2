package _03_Advanced.exercise.e1;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int [] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner check = new Scanner(System.in);
        System.out.print("Nhập giá trị cần xóa: ");
        int find = check.nextInt();
        int cnb;
        boolean a = false;
        for (int  i = 0; i < arr.length; i++) {
            if (arr[i]==find){
                cnb = i;
                System.out.println("số "+find+" ở vị trí "+i);
                for (int j = 0; j < i ; j++) {
                    System.out.println("vị trí thứ "+(j+1)+" trong mảng: "+arr[j]);
                }
                for (int j = i; j < arr.length-1; j++) {
                    System.out.println("vị trí thứ "+(j+1)+" trong mảng: "+arr[j+1]);
                }
                System.out.println("vị trí thứ cuối cùng trong mảng: 0");
                a=true;
                break;

            }
        }
        if (a == false){
            System.out.print("không có "+find+" trong mảng");
        }


    }
}
