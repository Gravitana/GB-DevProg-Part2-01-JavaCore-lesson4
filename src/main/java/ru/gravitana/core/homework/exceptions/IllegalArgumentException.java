package ru.gravitana.core.homework.exceptions;

public class IllegalArgumentException extends AccountException{

    private final ErorrMessage erorrMessage;

    public IllegalArgumentException(ErorrMessage erorrMessage) {
        super();
        this.erorrMessage = erorrMessage;
    }

    @Override
    public String getMessage() {
        return "Ошибка! " + erorrMessage.getTitle();
    }
}
