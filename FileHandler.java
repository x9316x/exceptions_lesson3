package lesson3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Класс для работы с файлами
public class FileHandler {

    // Метод для сохранения информации о человеке в файл
    public static void savePersonToFile(Person person) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(person.getLastName() + ".txt", true))) {
            writer.write(person.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
