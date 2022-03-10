package geekBrains.ru.lesson2;

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args) {
        invertArray();
        System.out.println(" ");
        fillArray();
        System.out.println(" ");
        changeArray();
        System.out.println(" ");
        fillDiagonal();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    public static void fillArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + ", ");
        }
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void fillDiagonal() {
        int[][] arr = { {1, 1},
                        {2, 2},
                        {3, 3},
                        {4, 4}
                                };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + arr[i][j] + "]");
            }
            System.out.println();
        }
    }

}

