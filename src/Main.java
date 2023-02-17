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

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 10;
        short b = 250;
        int C = 1000000;
        long d = 300L;
        float e = 1.34f;
        double g = 3.14;
        System.out.println("Значение переменной а с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной C с типом int равно " + C);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной g с типом double равно " + g);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte a = 67;
        short b = -159;
        short c = 569;
        short d = 27897;
        long e = 987678965549L;
        float f = 2.786f;
        double g = 27.12;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short listiBumagi = 480;
        int listovNaUchenika = listiBumagi / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + listovNaUchenika + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        int oneMinPerformance = bottles / minutes;
        int twentyMinPerformance = oneMinPerformance * 20;
        int oneHourPerformance = oneMinPerformance * 60;
        int twentyFourMinPerformance = oneHourPerformance * 24;
        int threeDaysPerformance = twentyFourMinPerformance * 3;
        int oneMonthPerformance = twentyFourMinPerformance * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinPerformance + " штук бутылок");
        System.out.println("За сутки машина произвела " + twentyFourMinPerformance + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDaysPerformance + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonthPerformance + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte canWithPaint = 120;
        byte whitePaintCanNeeded = 2;
        byte brownPaintCanNeeded = 4;
        int oneClassCanNeeded = whitePaintCanNeeded + brownPaintCanNeeded;
        int classQuantity = canWithPaint / oneClassCanNeeded;
        int whitePaintBought = classQuantity * whitePaintCanNeeded;
        int brownPaintBought = classQuantity * brownPaintCanNeeded;
        System.out.println("В школе, где " + classQuantity + " классов, нужно " + whitePaintBought + " банок белой краски и " + brownPaintBought + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        short milk = 210;
        byte iceCream = 2;
        byte egg = 4;
        int bananaWeight = banana * 80;
        int iceCreamWeight = iceCream * 100;
        int eggWeight = egg * 70;
        int breakfastWeightGram = milk + bananaWeight + iceCreamWeight + eggWeight;
        float breakfastWeightKilo = breakfastWeightGram / 1000f;
        System.out.println(breakfastWeightGram + " грамма весит завтрак");
        System.out.println(breakfastWeightKilo + " килограмма весит завтрак");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        short oneKiloInGram = 1000;
        int weightToLose = 7 * oneKiloInGram;
        short lostInDayLow = 250;
        short lostInDayHigh = 500;
        int daysToLoseLow = weightToLose / lostInDayLow;
        int daysToLoseHigh  =  weightToLose / lostInDayHigh;
        double averageLostPerDay = (lostInDayHigh + lostInDayLow) / 2D;
        double average = (double) weightToLose / averageLostPerDay;
        System.out.println(daysToLoseLow + " дней нужно, если худеть по 250 грамм");
        System.out.println(daysToLoseHigh + " дней нужно, если худеть по 500 грамм");
        System.out.println(average + " дней нужно в среднем");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int salaryRiseMasha = mashaSalary + mashaSalary / 10;
        int salaryRiseDenis = denisSalary + denisSalary / 10;
        int salaryRiseKristina = kristinaSalary + kristinaSalary / 10;
        int deltaYearSalaryMasha = salaryRiseMasha * 12 - mashaSalary * 12;
        int deltaYarSalaryDenis = salaryRiseDenis * 12 - denisSalary * 12;
        int deltaYearSalaryKristina = salaryRiseKristina * 12 - kristinaSalary * 12;
        System.out.println("Маша теперь получает " + salaryRiseMasha + " рублей. Годовой доход вырос на " + deltaYearSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryRiseDenis + " рублей. Годовой доход вырос на " + deltaYarSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryRiseKristina + " рублей. Годовой доход вырос на " + deltaYearSalaryKristina + " рублей");
    }
}