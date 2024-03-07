package ru.gravitana.core.homework;

public class Account {

    private int balance;

    public Account () {
        this.balance = 0;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addFunds(int funds) {
        this.balance += funds;
    }

    public void drewFunds(int funds) {
        this.balance -= funds;
    }
}
