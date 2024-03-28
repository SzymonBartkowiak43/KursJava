package Zajecia2.CodeSynchronization;

public class Account {

    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw (int amonut) {
        balance -= amonut;
    }
}

