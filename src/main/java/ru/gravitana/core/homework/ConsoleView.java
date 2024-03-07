package ru.gravitana.core.homework;

public class ConsoleView {
    public void showMainMenu() {
        System.out.println("╔═════════════════════════╗");
        System.out.println("║ 1 - Создать счёт        ║");
        System.out.println("║ 2 - Внести средства     ║");
        System.out.println("║ 3 - Снять средства      ║");
        System.out.println("║ 0 - Выйти из программы  ║");
        System.out.println("╚═════════════════════════╝");
    }

    public void showInputPrompt(String text) {
        System.out.print(text);
    }

}
