public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Task 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год: " + i);
        }
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Task 8");
        int salary = 29000;
        int bank = 0;
        for (int i = 1; i < 13; i++) {
            bank = bank + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }
        System.out.println("Task 9");
        double salary1 = 29000;
        double bank1 = 0;
        for (int i = 1; i < 13; i++) {
            bank1 = bank1 + salary1 * 1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank1 + " рублей");
        }
        System.out.println("Task 10");
        int dva = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(dva + "*" + i + "=" + (i * dva));
        }
    }
}



