package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите мин. длину пароля: ");
        int minLength = scanner.nextInt();
        passwordChecker.setMinLength(minLength);

        System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
        int maxRepeats = scanner.nextInt();
        passwordChecker.setMaxRepeats(maxRepeats);

        while (true) {
            System.out.print("Введите пароль или end: ");
            String password = scanner.next();
            if (password.equals("end")) {
                break;
            }
            boolean result = passwordChecker.verify(password);
            if (result) {
                System.out.println("Подходит!");
            } else {
                System.out.println("Не подходит!");
            }
        }
    }
}
