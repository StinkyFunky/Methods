package org.itstep.task10;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        uniqueInteger(arr);
    }

    public static void uniqueInteger(int[] arr) {
        Set<Integer> setUniqueNumbers = new LinkedHashSet();
        for(int x : arr) {
            setUniqueNumbers.add(x);
        }
        for(Integer x : setUniqueNumbers) {
            System.out.print(x + " ");
        }
    }
}
