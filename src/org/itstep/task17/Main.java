package org.itstep.task17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        evenElements(arr);
    }

    public static void evenElements(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0 && arr[i] != 23) {
                System.out.print(arr[i] + " ");
            } else if (arr[i] == 23) {
                break;
            }
        }
    }
}
