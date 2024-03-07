package ru.gravitana.core.homework;

public interface AccountView {
    void showWelcome();
    void showMainMenu();
    void showInputPrompt(String text);
    void showBalance(int balance);
    void showAppStopped();
}
