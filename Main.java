package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос на ввод данных
        System.out.println("Введите данные через пробел: Фамилия Имя Отчество дата рождения номер телефона пол");
        String input = scanner.nextLine();

        try {
            // Проверка введенных данных
            InputValidator.validate(input.split(" "));

            // Преобразование введенных данных в объект типа Person
            String[] data = input.split(" ");
            Person person = new Person(data[0], data[1], data[2], data[3], data[4], data[5].charAt(0));

            // Сохранение информации в файл
            FileHandler.savePersonToFile(person);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
