package org.itstep.task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("login:");
        String login = scanner.next();

        System.out.println("password:");
        String password = scanner.next();

        if(checkCredential(login,password)){
            System.out.println("Authentication completed");
        } else {
            System.out.println("Invalid login or password");
        }
    }

    private static boolean checkCredential(String login, String password) {
        if(login.equals("admin") && password.equals("qwerty")) {
            return true;
        } else {
            return false;
        }
    }
}
