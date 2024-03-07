package ru.gravitana.core.homework;

import java.util.Scanner;

public class AccountService {
    private final Account account;

    private final AccountView view;

    final Scanner scanner = new Scanner(System.in);

    public AccountService(AccountView view) {
        this.view = view;
        this.account = new Account();
    }

    public int getUserInput() {
        view.showInputPrompt("Введите номер действия: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void createAccount() {
        view.showWelcome();
        view.showInputPrompt("Введите начальный баланс счета: ");
        account.setBalance(Integer.parseInt(scanner.nextLine()));
    }

    public void showBalance() {
        view.showBalance(account.getBalance());
    }

    public void deposit() {
        view.showInputPrompt("Введите сумму депозита: ");
        account.addFunds(Integer.parseInt(scanner.nextLine()));
    }

    public void getFunds() {
        view.showInputPrompt("Введите сумму снятия: ");
        account.drewFunds(Integer.parseInt(scanner.nextLine()));
    }
}
