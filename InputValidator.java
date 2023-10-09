package lesson3;

import java.util.regex.Pattern;

// Класс для проверки корректности введенных данных
public class InputValidator {

    // Метод для проверки введенных данных
    public static void validate(String[] data) throws Exception {
        if (data.length != 6) {
            throw new IllegalArgumentException("Количество введенных данных не соответствует требованиям!");
        }

        // Проверка формата даты
        Pattern datePattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
        if (!datePattern.matcher(data[3]).matches()) {
            throw new Exception("Неверный формат даты рождения!");
        }

        // Проверка формата номера телефона
        if(!data[4].matches("\\d+")) {
            throw new Exception("Неверный формат номера телефона!");
        }

        // Проверка формата пола
        if(data[5].charAt(0) != 'ж' && data[5].charAt(0) != 'м') {
            throw new Exception("Неверный символ пола!");
        }
    }
}
