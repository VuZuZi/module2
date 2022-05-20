package _03_Advanced.practive.p4;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        double nhietdo,check;
        Scanner ndo = new Scanner(System.in);
        System.out.println("nhập nhiệt độ");
        nhietdo = ndo.nextDouble();
        int chon;
        System.out.print("nhập 1 để đổi C sang F");
        System.out.println("nhập 2 để đổi F sang C");
        chon = ndo.nextInt();
        switch (chon){
            case 1:
               check = (nhietdo*1.8)+32;
                System.out.print(nhietdo + " độ C = " +check+" độ F");
                break;
            case 2:
                check = (nhietdo-32)/1.8;
                System.out.print(nhietdo + " độ C = " +check+" độ F");
                break;
        }
    }
}
