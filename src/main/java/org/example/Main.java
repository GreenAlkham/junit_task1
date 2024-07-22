package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> statement = new ArrayList<>();

public static List<String> statement() {

        Account creditAccount = new CreditAccount();

        statement.add("Баланс кредитной карты: " + creditAccount.getBalance());
        creditAccount.add(20000);
        statement.add("Баланс кредитной карты после пополнения: " + creditAccount.getBalance());
        creditAccount.pay(10000);
        statement.add("Баланс кредитной карты после списания: " + creditAccount.getBalance());
       // System.out.println(statement);
        return statement;
    }

    public static void main(String[] args) {
        statement();
    }
}
