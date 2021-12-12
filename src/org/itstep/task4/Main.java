package org.itstep.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(duplicateChars(str));
    }

    public static String duplicateChars(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }

        return result;
    }
}
