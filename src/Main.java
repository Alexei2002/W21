import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // task1
        System.out.println("task 1");
        int balance = 0;
        int month = 0;
        while (balance <= 2_459_000){
            balance += 15000;
            ++month;
        }
        System.out.println("месяц" + month + ",сумма накоплений равна" + balance + "рублей");

        System.out.println();

        // task2
        System.out.println("task 2");
        int i = 1;
        while (i <= 10){
            System.out.println(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--){
            System.out.println(i + " ");
        }
        System.out.println();

        // task3
        System.out.println("task 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;

        for (int i1= 1; i <= 10; i++) {
            population += population / 1000 * (fertility - mortality);
            System.out.println("Год" + i + ",численность населения составляет" + population);
        }
        System.out.println();

        // task4
        System.out.println("task 4");
        balance = 0;
        month = 0;
        while (balance <= 12_000_000){
            balance += 15000;
            balance *= 1.07;
            ++month;


            System.out.println("Месяц" + month + ",сумма накоплений равна " + balance +"рублей");

        }
        System.out.println();


        // task5
        System.out.println("task 5");
        balance = 0;
        month = 0;
        while (balance <= 12_000_000) {
            balance += 15000;
            balance *= 1.07;
            ++month;
            if (month % 6 == 0) {
                System.out.println("Месяц" + month + ",сумма накоплений равна " + balance + "рублей");
            }

        }
        System.out.println();




        // task6
        System.out.println("task 6");
        balance = 8;
        for (int i1 = 1; i <= 9 * 12; i++) {
            balance += 15000;
            balance *= 1.07;

            if (i % 6 == 0){
                System.out.println("Месяц " + i + "сумма накоплений равна" + balance + "рублей");
            }
        }
        System.out.println();


        // task7
        System.out.println("task 7");
        for (int friday = 3; friday <= 31; friday += 7){
            System.out.println("Сегодня пятница" + friday + "-e число. Необходимо подготовить отчет");
        }
        System.out.println();

        // task8
        System.out.println("task 8");
        int currentYear = LocalDate.now().getYear();
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int i1 = startYear; i <= endYear ; i++ ){
            if (i % 79 == 0){
                System.out.println(i);
            }
        }
        System.out.println();

    }
}