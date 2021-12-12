package org.itstep.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(countVowel(str));
    }

    public static int countVowel(String str) {

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return  count;
    }
}
