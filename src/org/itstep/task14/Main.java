package org.itstep.task14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operation = scanner.next();

        simpleCalculator(a, b, operation.charAt(0));
    }

    public static void simpleCalculator(int a, int b, char operator) {

        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong operation!");
        }
    }
}
