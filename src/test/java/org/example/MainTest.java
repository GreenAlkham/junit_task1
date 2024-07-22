package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.Main.statement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @BeforeEach
    public void testBefore() {
        String s = "Начинается выполнение теста";
    }

    @AfterEach
    public void testAfter() {
        String s = "Завершено выполнение теста";
    }

    @DisplayName("Проверка выписки")
    @Test
    public void testStatement() {
        Account creditAccount = new CreditAccount();

        List<String> expected = new ArrayList<>();

        expected.add("Баланс кредитной карты: " + creditAccount.getBalance());
        creditAccount.add(20000);
        expected.add("Баланс кредитной карты после пополнения: " + creditAccount.getBalance());
        creditAccount.pay(10000);
        expected.add("Баланс кредитной карты после списания: " + creditAccount.getBalance());

        List<String> actual = statement();

        assertEquals(expected, actual);
    }
}
