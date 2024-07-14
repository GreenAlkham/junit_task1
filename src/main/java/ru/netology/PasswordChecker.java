package ru.netology;

public class PasswordChecker {
    private int minLength;
    private int maxRepeats;

    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Введено отрицательное значение");
        } else {
            this.minLength = minLength;
        }
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Введено отрицательное значение или значение равно 0");
        } else {
            this.maxRepeats = maxRepeats;
        }
    }

    public boolean verify(String password) {
        if (minLength == -1 || maxRepeats <= 0) {
            throw new IllegalStateException("Не выставлены значения настроек для минимальной длины пароля или " +
                    "максимально допустимого количества повторений символа подряд");
        }
        if (password.length() < minLength) {
            return false;
        }

        char prevLetter = ' ';
        int counter = 0;
        for (char letter : password.toCharArray()) {
            if (letter == prevLetter) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxRepeats) {
                return false;
            }
            prevLetter = letter;
        }
        return true;
    }
}



