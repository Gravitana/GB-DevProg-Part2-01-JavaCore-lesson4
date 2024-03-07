package ru.gravitana.core.homework.exceptions;

public class InsufficientFundsException extends AccountException{

    private final ErorrMessage erorrMessage;
    private final int balance;
    private final int amount;

    public InsufficientFundsException(ErorrMessage erorrMessage, int balance, int amount) {
        super();
        this.erorrMessage = erorrMessage;
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "Ошибка! " + erorrMessage.getTitle() + "\nСнимаемая сумма: " + amount + "\nБаланс: " + balance;
    }
}
