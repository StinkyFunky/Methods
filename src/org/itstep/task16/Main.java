package org.itstep.task16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        findMaxElements(arr);
    }

    public static void findMaxElements(int[][] arr) {
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
            max = 0;
        }
    }
}
