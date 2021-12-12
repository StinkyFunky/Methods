package org.itstep.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String symbol = scanner.next();

        char c = symbol.charAt(0);

        System.out.println(findChar(str, c));
    }

    public static int findChar(String str, char symbol) {

        String s = str.toLowerCase();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(s.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
