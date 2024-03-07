package ru.gravitana.core.homework;

import ru.gravitana.core.homework.exceptions.IllegalArgumentException;
import ru.gravitana.core.homework.exceptions.InsufficientFundsException;
import ru.gravitana.core.homework.view.AccountView;
import ru.gravitana.core.homework.view.ConsoleView;

public class Program {
    public static void main(String[] args) {

        final AccountView view = new ConsoleView();
        final AccountService accountService = new AccountService(view);

        int userInput;
        boolean nextPart = false;

        while (!nextPart) {
            try {
                accountService.createAccount();
                nextPart = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        nextPart = false;
        while (!nextPart) {
            accountService.showBalance();
            view.showMainMenu();

            userInput = accountService.getUserInput();

            switch (userInput) {
                case 1 -> {
                    try {
                        accountService.deposit();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        accountService.getFunds();
                    } catch (IllegalArgumentException | InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 0 -> nextPart = true;
            }
        }
        accountService.showBalance();
        view.showAppStopped();
    }
}
