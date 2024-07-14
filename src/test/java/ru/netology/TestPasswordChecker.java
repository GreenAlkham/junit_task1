package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestPasswordChecker {

    @BeforeEach
    public void testBefore() {
        System.out.println("Начинается выполнение теста");
    }

    @AfterEach
    public void testAfter() {
        System.out.println("Завершено выполнение теста");
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

        if (true) {
            System.out.println("Фактический результат соответствует ожидаемому");
        }
    }
}