package tasck2;

public class Start {
    public static void main(String[] args) {
        // Создание объекта Tester
        Tester tester = new Tester("John", "Doe", 5, "Advanced", 50000);
        tester.printInfo(); // вызов обычного метода
        tester.printInfo(1); // вызов перегруженного метода
        tester.printInfo(5000.00); // вызов перегруженного метода

        // Вызов статического метода
        Tester.printGreeting();
    }
}
