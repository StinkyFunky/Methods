package org.itstep.task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        maxAndMinValue(arr);
    }

    public static void maxAndMinValue(int[] arr) {
        int max = 0;
        int min = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min + " " + "Max: " + max);
    }
}
