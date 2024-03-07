package ru.gravitana.core.homework;

import ru.gravitana.core.homework.exceptions.ErorrMessage;
import ru.gravitana.core.homework.exceptions.IllegalArgumentException;
import ru.gravitana.core.homework.view.AccountView;

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

    public void createAccount() throws IllegalArgumentException {
        view.showWelcome();
        view.showInputPrompt("Введите начальный баланс счета: ");

        int amount;

        try {
            amount = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            throw new IllegalArgumentException(ErorrMessage.NOT_A_NUMBER);
        }

        if (amount < 0) {
            throw new IllegalArgumentException(ErorrMessage.NEGATIVE_BALANCE);
        }

        account.setBalance(amount);
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
