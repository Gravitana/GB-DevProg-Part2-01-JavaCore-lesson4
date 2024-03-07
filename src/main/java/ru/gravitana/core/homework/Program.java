package ru.gravitana.core.homework;

public class Program {
    public static void main(String[] args) {
        int userInput;
        AccountService accountService = new AccountService();

        boolean appRunning = true;
        while (appRunning) {


            /*

                TODO !!!!!!! Запутался, начал заново. Сегодня за ночь переделаю !!!!!!!

             */

            userInput = accountService.getUserInput();
            switch (userInput) {
                case 1 -> System.out.println("Создать счёт");
                case 2 -> System.out.println("Внести средства");
                case 3 -> System.out.println("Снять средства");
                case 4 -> System.out.println("Выйти из программы");
                case 0 -> appRunning = false;
            }

        }
    }
}
