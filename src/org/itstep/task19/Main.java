package org.itstep.task19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        sumElements(arr);
    }

    public static void sumElements(int[] arr) {

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
