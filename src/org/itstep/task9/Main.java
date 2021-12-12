package org.itstep.task9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(elementsNotZero(arr));
    }

    private static int elementsNotZero(int[] arr){

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                count++;
            }
        }
        return count;
    }
}
