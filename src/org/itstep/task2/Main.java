package org.itstep.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(triangleExists(a, b, c)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean triangleExists(int a, int b, int c) {
        if((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        } else {
            return false;
        }
    }
}
