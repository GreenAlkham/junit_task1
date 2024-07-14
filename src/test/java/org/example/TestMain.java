package org.example;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.example.Main.statement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @BeforeEach
    public void testBefore() {
        System.out.println("Начинается выполнение теста");
    }

    @AfterEach
    public void testAfter() {
        System.out.println("Завершено выполнение теста");
    }

    @DisplayName("Проверка метода add")
    @Test
    public void testAdd() {
       Account creditAccount = new CreditAccount();

        Assertions.assertTrue(creditAccount.add(20000));

        if (true) {
                System.out.println("Фактический результат соответствует ожидаемому");
            }
        }

    @DisplayName("Проверка метода pay")
    @Test
    public void testPay() {
        Account creditAccount = new CreditAccount();

        Assertions.assertFalse(creditAccount.pay(200000));

        if (true) {
            System.out.println("Фактический результат соответствует ожидаемому");
        }
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

        System.out.println("Ожидаемый результат:");
        System.out.println(expected);

        System.out.println("Фактический результат:");
        List<String> actual = statement();

        assertEquals(expected, actual);
    }
}
