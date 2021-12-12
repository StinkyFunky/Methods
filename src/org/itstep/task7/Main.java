package org.itstep.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if(palindromeCheck(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean palindromeCheck(String str) {
        if(str.equals(new StringBuilder(str).reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
