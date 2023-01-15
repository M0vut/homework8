public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 2459000;
        int i = 0;
        int b = 1;
        while (i <= a) {
            System.out.println("Месяц " + b + " сумма накоплений равна " + i);
            i = i + 15000;
            b = b + 1;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        int b = 10;
        while (i <= b) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println(" ");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");

    }

    public static void task3() {
        System.out.println("Задача 3");
        int Y = 12000000; // численность населения
        int year = 10;
        int inYear = 0; // общий прирост населения в год
        int mortality = 8; // смертность на 1000
        int fertility = 17; // рождаемость на 1000
        int totalPopulationGrowth = fertility - mortality; //на сколько рождаемость перекрыла смертеость

        for (int i = 1; i <= Y; i = i + 1000) {
            inYear = inYear + totalPopulationGrowth;
        }
        for (int j = 1; j <= year; j++) {
            int overallIncrease = j * inYear + Y;
            System.out.println("Год " + j + " численность населения состовляет  " + overallIncrease);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double initialDepositAmount = 15000; // первоночальная сумма
        double totalAmount = 12000000;
        double percent = 7;
        int j = 1;
        while (initialDepositAmount <= totalAmount) {
            System.out.printf(j + " й месяц" + " сумма накоплений " + "%.3f\n",initialDepositAmount);
            initialDepositAmount = initialDepositAmount + initialDepositAmount/100*percent;
            j = j + 1;
        }
        System.out.printf(j + " й месяц сумма накоплений " + "%.3f\n" ,initialDepositAmount);

    }

    public static void task5() {
        System.out.println("Задача 5");
        double initialDepositAmount = 15000; // первоночальная сумма
        double totalAmount = 12000000;
        double percent = 7;
        int j = 1;
        while (initialDepositAmount <= totalAmount) {

            initialDepositAmount = initialDepositAmount + initialDepositAmount / 100 * percent;
            j = j + 1;
            if(j % 6 == 0) {
                System.out.printf(j + " й месяц" + " сумма накоплений " + "%.3f\n", initialDepositAmount);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int numberOfYears = 9 * 12;
        double initialDepositAmount = 15000; // первоночальная сумма
        double percent = 7;
        int j = 0;
        double i;

        for (i = 1; i <= numberOfYears; i = i + 1) {

            initialDepositAmount = initialDepositAmount + initialDepositAmount / 100 * percent;
            j = j + 1;
            if(i % 6 == 0) {
                System.out.printf(j + " й месяц сумма накоплений " + "%.3f\n", initialDepositAmount);
            }
        }

    }
    public static void task7() {
        System.out.println("Задача 7");
        String friday = "Пятница";
        int month = 31;
        int y = 0;
        int i = 0;
        int j = 0;
        for (i = 1; i <= month; i++) {
            y = y + 1;
            if(y == 8){
                y = 1;
            }
            if(y == 5){
                System.out.println("Сегодня " + friday + ", " + i + " -е число.Необходимо подготовить отчет");
            }
        }
    }


    public static void task8() {
        System.out.println("Задача 8");
        int a = 200;
        int b = 100;
        int c = 2023;
        for(int i = c - a ; i <= c; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        for (int i = c + b; i >= c; i--){
            if(i % 79 == 0){
                System.out.println(i);
            }
        }


    }
}