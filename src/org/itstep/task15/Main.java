package org.itstep.task15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        swapRows(arr);
    }

    public static void swapRows(int[][] arr) {

        for(int i = 0; i < arr[0].length; i++) {
            int temp = arr[0][i];
            arr[0][i] = arr[arr.length - 1][i];
            arr[arr.length - 1][i] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
