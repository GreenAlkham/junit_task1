package org.example;

public class CreditAccount extends Account {
    int limit = -180000;

    public CreditAccount() {
        super(-20000);
    }

    public boolean add(int amount) {
        if (this.balance + amount > 0) {
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }

    public boolean pay(int amount) {
        if (this.balance - amount < this.limit) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}

