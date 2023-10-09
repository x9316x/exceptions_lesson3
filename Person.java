package lesson3;

// Класс, представляющий информацию о человеке
public class Person {
    private String lastName;     // фамилия
    private String firstName;    // имя
    private String middleName;   // отчество
    private String birthDate;    // дата рождения
    private String phoneNumber;  // номер телефона
    private char gender;         // пол

    // Конструктор
    public Person(String lastName, String firstName, String middleName, String birthDate, String phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    // Геттер для фамилии
    public String getLastName() {
        return lastName;
    }

    // Преобразование информации о человеке в строку
    @Override
    public String toString() {
        return lastName + firstName + middleName + birthDate + " " + phoneNumber + gender;
    }
}
