package org.example;

import org.junit.jupiter.api.*;

public class CreditAccountTest {

    @BeforeEach
    public void testBefore() {
        String s = "Начинается выполнение теста";
    }

    @AfterEach
    public void testAfter() {
        String s = "Завершено выполнение теста";
    }

    @DisplayName("Проверка метода add")
    @Test
    public void testAdd() {
       Account creditAccount = new CreditAccount();

        Assertions.assertTrue(creditAccount.add(20000));
        }

    @DisplayName("Проверка метода pay")
    @Test
    public void testPay() {
        Account creditAccount = new CreditAccount();

        Assertions.assertFalse(creditAccount.pay(200000));
    }
}
