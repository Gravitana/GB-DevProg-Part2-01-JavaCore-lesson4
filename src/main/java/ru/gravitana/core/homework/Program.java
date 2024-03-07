package ru.gravitana.core.homework;

public class Program {
    public static void main(String[] args) {

        final AccountView view = new ConsoleView();
        final AccountService accountService = new AccountService(view);

        int userInput;
        boolean appRunning = true;

        accountService.createAccount();

        while (appRunning) {
            accountService.showBalance();
            view.showMainMenu();

            userInput = accountService.getUserInput();

            switch (userInput) {
                case 1 -> accountService.deposit();
                case 2 -> accountService.getFunds();
                case 0 -> appRunning = false;
            }
        }
        accountService.showBalance();
        view.showAppStopped();
    }
}
