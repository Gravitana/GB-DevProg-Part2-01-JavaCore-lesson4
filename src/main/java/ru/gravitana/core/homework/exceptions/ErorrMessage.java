package ru.gravitana.core.homework.exceptions;

public enum ErorrMessage {
    NOT_A_NUMBER("Введённое значение не является числом"),
    NEGATIVE_BALANCE("Попытка создать счет с отрицательным начальным балансом"),
    NEGATIVE_DEPOSIT("Попытка внести депозит с нулевой или отрицательной суммой"),
    ;

    private final String title;

    ErorrMessage(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
