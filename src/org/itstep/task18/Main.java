package org.itstep.task18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        findElements(arr);
    }

    public static void findElements(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0 && arr[i] < 50) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
