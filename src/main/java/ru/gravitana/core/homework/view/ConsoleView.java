package ru.gravitana.core.homework.view;

public class ConsoleView implements AccountView {
    @Override
    public void showWelcome() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ Открытие банковского счёта ║");
        System.out.println("╚════════════════════════════╝");
    }

    @Override
    public void showMainMenu() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ 1 - Внести средства        ║");
        System.out.println("║ 2 - Снять средства         ║");
        System.out.println("║ 0 - Выйти из программы     ║");
        System.out.println("╚════════════════════════════╝");
    }

    @Override
    public void showInputPrompt(String text) {
        System.out.print(text);
    }

    @Override
    public void showBalance(int balance) {
        System.out.println("╔════════════════════════════╗");
        System.out.printf("║ Ваш баланс: %-14d ║\n", balance);
        System.out.println("╚════════════════════════════╝");
    }

    @Override
    public void showAppStopped() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║    Программа завершена     ║");
        System.out.println("╚════════════════════════════╝");

    }
}
