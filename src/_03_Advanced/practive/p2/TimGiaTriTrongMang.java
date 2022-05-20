package _03_Advanced.practive.p2;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner nb = new Scanner(System.in);
        System.out.print("nhập tên của sinh viên cần tìm: ");
        String input = nb.nextLine();
        boolean out = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)){
                System.out.print("Stt trong danh sách của "+input+" : "+(i+1));
                out = true;
                break;
            }
        }
        if (out == false) {
            System.out.println("không tìm thấy " + input + " trong danh sách.");
        }
    }
}
