package org.itstep.task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        averageOfEvenElements(arr);
    }

    public static void averageOfEvenElements(int[] arr) {
        int sum = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.print(sum / count);
    }
}
