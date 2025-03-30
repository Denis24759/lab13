package tasck2;

// Класс Tester
public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    // Первый конструктор
    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0);
    }

    // Второй конструктор
    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "Unknown", 0.0);
    }

    // Третий конструктор
    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    // Перегруженные методы
    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(int mode) {
        if (mode == 1) {
            System.out.println("Name: " + name);
        } else {
            System.out.println("Surname: " + surname);
        }
    }

    public void printInfo(double salary) {
        System.out.println("Salary: " + salary);
    }

    // Статический метод
    public static void printGreeting() {
        System.out.println("Hello, welcome to the Tester class!");
    }
}