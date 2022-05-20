package _03_Advanced.practive.p1;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner add = new Scanner(System.in);
        do {
            System.out.print("nhập số lượng phần tử trong mảng: ");
            size = add.nextInt();
            if (size > 20){
                System.out.println("số lượng phần tử không quá 20");
            }else {
                array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.print("nhập giá trị vào vị trí thứ "+(i+1)+": ");
                    array[i] = add.nextInt();
                }
                System.out.printf("%-20s%s","giá trị trong mảng ban đầu: "," ");
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j] + "\t");
                }
                for (int i = 0; i < (array.length/2); i++) {
                    int temp = array[i];
                    array[i]=array[size-1-i];
                    array[size-1-i]=temp;
                }
                System.out.printf("%-20s%s","giá trị trong mảng sau đảo: "," ");
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j] + "\t");
                }
            }
        }while (size>20);
    }
}
