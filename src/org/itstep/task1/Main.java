package org.itstep.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(maxNumber(a, b ,c));
    }

    private static int maxNumber(int a, int b, int c) {

        return Math.max(a, (Math.max(b, c)));
    }
}
