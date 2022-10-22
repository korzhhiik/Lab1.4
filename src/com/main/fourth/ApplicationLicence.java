package com.main.fourth;

import java.util.Scanner;

public class ApplicationLicence {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Choose a key between pro and trial or the both to unlock full content. Or leave this section blank:");

        String key = scanner.nextLine();
        if (key == null || key.isEmpty()) {
            System.out.println("Your access level is Common");
            allowCommon();
            key = scanner.nextLine();
        }
        if (key.equalsIgnoreCase("trial")) {
            System.out.println("Your access level is Trial");
            allowTrial();
        } else if (key.equalsIgnoreCase("pro")) {
            System.out.println("Your access level is Pro");
            allowPro();
        } else if (key.equalsIgnoreCase("trial & pro")) {
            System.out.println("You've got both pro & trial levels");
            allowTrial();
            allowPro();
        }
    }

    public static void allowTrial() {
        System.out.println("Trial version");
    }

    public static void allowCommon() {
        System.out.println("Allow common");
    }

    public static void allowPro() {
        System.out.println("Allow pro");
    }
}
