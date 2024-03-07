package ru.gravitana.core.homework;

import java.util.Scanner;

public class AccountService {
    private final Scanner scanner = new Scanner(System.in);

    private final ConsoleView view = new ConsoleView();

    public int getUserInput() {
        view.showInputPrompt("Введите номер действия: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
