public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();

    }

    public static void task1() {
        int capital = 0;
        int contribution = 15_000;
        int i = 0;
        while (capital < 2_249_000) {
            capital = capital + contribution;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей");
        }
    }

    public static void task2() {
        for (int i = 1; i <11; i ++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 10; i > 0; i --) {
            System.out.print(" " + i);
        }
    }
    public static void task3() {
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int populationGrowth = fertilityPerThousand - mortalityPerThousand;
        for (int i = 1; i <10; i++) {
            population = (population / 1000) * populationGrowth + population;
            System.out.println("Год " + i + " население равно " + population);
        }

    }

    public static void task4() {
        int capital = 15_000;
        for (int i = 1; capital < 12_000_000; i++) {
            capital = capital + capital/100*7;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей");
        }
    }

    public static void task5() {
        int capital = 15_000;
        for (int i = 1; capital < 12_000_000; i++) {
            capital = capital + capital/100*7;
            if (i % 6 ==0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей");
            }
        }
    }

    public static void task6() {
        int capital = 15_000;
        int monthsForNineYears = 12 * 9;
        for (int i = 1; i <= monthsForNineYears; i++) {
            capital = capital + capital/100*7;
            if (i % 18 ==0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей");
            }
        }
    }

    public static void task7() {
        int Friday = 3;
        if (Friday<=31){
            while (Friday <= 31) {
              System.out.println("Сегодня пятница " + Friday + " число. Необходимо подготовить отчет");
              Friday = Friday + 7;
             }
        }
    }

    public static void task8() {
        for (int Year = 0; Year < 2123; Year ++) {
            if (Year % 79 ==0) {
                if (Year >=1823) {
                    System.out.println(Year);
                }
            }
        }
    }
}