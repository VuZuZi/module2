package _03_Advanced.practive.p3;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner add = new Scanner(System.in);
        do {
            System.out.print("nhập số lượng phần tử trong mảng: ");
            size = add.nextInt();
            if (size > 20) {
                System.out.println("số lượng phần tử không quá 20");
            } else {
                array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.print("nhập giá trị vào vị trí thứ " + (i + 1) + ": ");
                    array[i] = add.nextInt();
                }
                int max = array[0];
                for (int i = 0; i < size; i++) {
                    if (array[i]>max){
                        max = array[i];
                    }
                }
                System.out.print("phần tử lớn nhất trong mảng: "+max);
            }


        }while (size>20);
    }
}