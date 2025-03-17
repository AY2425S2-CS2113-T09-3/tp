package ui;

import java.util.Scanner;

public class Ui {
    private static final String SEPARATOR_LINE = "____________________________________________________________\n";
    private final Scanner scanner;

    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    public String readInput() {
        return scanner.nextLine();
    }

    /**
     * Displays the welcome message to the user.
     */
    public void showWelcome() {
        System.out.println("Welcome to your Travel Diary Management System!\nTo continue, please press one of the " +
                "commands.\n");
    }

    /**
     * Displays a simple line separator to the console.
     */
    public void showLine() {
        System.out.println("----");
    }

    public void showToUser(String message) {
        System.out.println(message);
    }

    public void close() {
        scanner.close();
    }
}
