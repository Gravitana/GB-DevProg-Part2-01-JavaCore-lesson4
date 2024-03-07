package ru.gravitana.core.homework;

import ru.gravitana.core.homework.exceptions.IllegalArgumentException;
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
                case 1 -> accountService.deposit();
                case 2 -> accountService.getFunds();
                case 0 -> nextPart = true;
            }
        }
        accountService.showBalance();
        view.showAppStopped();
    }
}
