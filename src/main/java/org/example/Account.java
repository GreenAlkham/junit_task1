package org.example;

    public abstract class Account {
        protected int balance;
        protected int limit;

        public Account(int balance) {
            this.balance = balance;
        }

        public boolean add(int amount) {
            this.balance += amount;
            return this.balance > 0L;
        }

        public boolean pay(int amount) {
            this.balance -= amount;
            return this.balance > 0L;
        }

        public int getBalance() {
            return this.balance;
        }
    }
