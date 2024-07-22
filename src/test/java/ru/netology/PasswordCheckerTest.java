package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class PasswordCheckerTest {

    @BeforeEach
    public void testBefore() {
        String s = "Начинается выполнение теста";
    }

    @AfterEach
    public void testAfter() {
        String s = "Завершено выполнение теста";
    }

    @Test
    public void testMinLengthNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            int minLength = -2;
            if (minLength < 0) {
                throw new IllegalArgumentException("Введено отрицательное значение");
            }
        }, "IllegalArgumentException was expected");

        Assertions.assertEquals("Введено отрицательное значение", exception.getMessage());
    }
}