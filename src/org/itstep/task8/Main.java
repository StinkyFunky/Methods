package org.itstep.task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if(matchString(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean matchString(String str1, String str2) {
        if(str1.contains(str2)){
            return true;
        }
        return false;
    }
}
