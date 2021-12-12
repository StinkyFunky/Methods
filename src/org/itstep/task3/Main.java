package org.itstep.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(even(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean even(int a) {
        if(a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
