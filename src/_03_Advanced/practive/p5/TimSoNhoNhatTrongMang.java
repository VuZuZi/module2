package _03_Advanced.practive.p5;

public class TimSoNhoNhatTrongMang {
    public static void main(String[] args) {
        int [] arr = {4, 12, 7, 8, 1, 6, 9};
        checkmin(arr);
        int index = checkmin(arr);
        System.out.print("giá trị nhỏ nhất trong mảng: "+ arr[index]);
    }
    public static int checkmin(int[] array){
        int index =0;
        for (int i = 1; i < array.length ; i++) {
            if (array[index]>array[i]){
                index = i;
            }
        }
        return index;
    }
}
