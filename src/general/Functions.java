package general;

import java.util.Random;
import java.util.Scanner;

/**
 * @author barzy
 */
public class Functions {

    private static boolean isDevMode;
    private static Scanner sc;
    private static Random rn;
    private static final String spaces = "      ";

    public static boolean getDevMode() {
        return isDevMode;
    }

    public static void toggleDevMode() {
        isDevMode = !isDevMode;
        plSpace("Dev mode " + (getDevMode() ? "enabled." : "disabled."));
    }

    // starting print methods
    static public void p(String str) {
        System.out.print(str);
    }

    static public void pSpace(String str) {
        p(spaces + str);
    }

    static public void pl(String str) {
        System.out.println(str);
    }

    static public void plSpace(String str) {
        pl(spaces + str);
    }

    static public void debugPrint(String str) {
        if (getDevMode()) {
            pl("\t" + str);
        }
    }

    // starting input methods
    public static void scInit() {
        sc = new Scanner(System.in);
    }

    public static void scDispose() {
        sc.close();
    }

    public static String inputString() {
//            System.out.print("Enter a string: ");
        String input = sc.next();
        return input;
    }

    public static int inputInt() {
        int input = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
//                System.out.print("Enter a number: ");
                input = sc.nextInt();
                isValidInput = true;
            } catch (Exception e) {
                pSpace("Invalid input. Please enter a valid number: ");
                sc.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }
        return input;
    }

    public static boolean inputBoolean() {
        boolean input = false;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
//                System.out.print("Enter a number: ");
                input = sc.nextBoolean();
                isValidInput = true;
            } catch (Exception e) {
                pSpace("Invalid input. Please enter a valid boolean: ");
                sc.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }
        return input;
    }

    // starting Random number methods
    public static void rnInit() {
        rn = new Random();
    }

    public static void rnDispose() {
        rn = null;
    }

    public static Integer getRandomNumber(final int limit) {
        return rn.nextInt(limit);
    }

    public static Boolean getRandomBoolean() {
        return rn.nextBoolean();
    }

    public static String getRandomString() {
        // AI generated code
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int randomIndex = rn.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomString.append(randomChar);
        }
        return randomString.toString();
    }
}
