import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Person's surname");
        String surname = scanner.nextLine();

        System.out.println("Person's name:");
        String name = scanner.nextLine();

        System.out.println("Person's patronymic:");
        String patronymic = scanner.nextLine();

        System.out.println("Person's date of birth (YYYY-MM-DD):");
        String birthDateStr = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateStr);

        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("Surname and initials: " + surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".");
        System.out.println("Gender: " + Gender(patronymic));
        System.out.println("Age: " + age + " years old");

        scanner.close();
    }

    public static String Gender(String patronymic) {
        char lastChar = patronymic.toLowerCase().charAt(patronymic.length() - 1);
        return (lastChar == 'ч') ? "Мужской" : "Женский";
    }
}