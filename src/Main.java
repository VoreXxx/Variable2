public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 1.1F;
        double f = 2.2;
        System.out.println("Значение переменной a с типом byte равно "+ a);
        System.out.println("Значение переменной b с типом short равно "+ b);
        System.out.println("Значение переменной c с типом int равно "+ c);
        System.out.println("Значение переменной d с типом long равно "+ d);
        System.out.println("Значение переменной e с типом float равно "+ e);
        System.out.println("Значение переменной f с типом double равно "+ f);

        float one = 27.12F;
        long two = 987678965549L;
        short three = 2786;
        short four = 569;
        short five = -159;
        int six = 27897;
        byte seven = 67;

        short class1 = 23;
        short class2 = 27;
        short class3 = 30;
        short allPaper = 480;
        int oneChild = allPaper / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + oneChild + " листов бумаги");

        int machinePerformance = 16 / 2;
        int machinePerformanceTo20Min = machinePerformance * 20;
        int machinePerformanceTo1Day = (machinePerformance * 60) * 24;
        int machinePerformanceTo3Day = machinePerformanceTo1Day * 3;
        int machinePerformanceTo1Month = machinePerformanceTo1Day * 30;
        System.out.println("За 20 минут машина произвела " + machinePerformanceTo20Min + " штук бутылок");
        System.out.println("За 1 день машина произвела " + machinePerformanceTo1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformanceTo3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machinePerformanceTo1Month + " штук бутылок");

        byte allBanks = 120;
        byte whiteBanksOneClassRoom = 2;
        byte brownBanksOneClassRoom = 4;
        int totalBanksOneClassRoom = whiteBanksOneClassRoom + brownBanksOneClassRoom;
        int totalClassRoom = allBanks / totalBanksOneClassRoom;
        int totalWhiteBanks = totalClassRoom * whiteBanksOneClassRoom;
        int totalBrownBanks = totalClassRoom * brownBanksOneClassRoom;
        System.out.println("В школе, где " + totalClassRoom + " классов, нужно " + totalWhiteBanks + " банок белой краски и " + totalBrownBanks + " банок коричневой краски");

        int bananas = 5;
        int massBananas = bananas * 80;
        int milk = 2;
        int massMilk = milk * 105;
        int iceCream = 2;
        int massIceCream = iceCream * 100;
        int egg = 4;
        int massEgg = egg * 70;
        int totalMassGram = massEgg + massBananas + massMilk + massIceCream;
        float totalMassKg = totalMassGram / 1000F;
        System.out.println("Общий вес " + totalMassGram + " грамм");
        System.out.println("Общий вес " + totalMassKg + " кг");

        int lostMass = 7;
        int lostMinMassToDay = 250;
        int lostMaxMassToDay = 500;
        float lostMinKgToDay = lostMinMassToDay / 1000F;
        float lostMaxKgToDay = lostMaxMassToDay / 1000F;
        float dayLostMinMass = lostMass / lostMinKgToDay;
        float dayLostMaxMass = lostMass / lostMaxKgToDay;
        float mediumDaylostMass = (dayLostMinMass + dayLostMaxMass) / 2F;
        System.out.println("При минимальной потере веса потребуется " + dayLostMinMass + " дней");
        System.out.println("При максимальной потере веса потребуется " + dayLostMaxMass + " дней");
        System.out.println("В среднем потребуется " + mediumDaylostMass + " дней");

        int salaryMary = 67760;
        int salaryDen = 83690;
        int salaryCris = 76230;
        float procent = 10 / 100F;
        float newSalaryMary = (salaryMary * procent) + salaryMary;
        float newSalaryDen = (salaryDen * procent) + salaryDen;
        float newSalaryCris = (salaryCris * procent) + salaryCris;
        int salaryYearMary = salaryMary * 12;
        int salaryYearDen = salaryDen * 12;
        int salaryYearCris = salaryCris * 12;
        float newSalaryYearMary = newSalaryMary * 12F;
        float newSalaryYearDen = newSalaryDen * 12F;
        float newSalaryYearCris = newSalaryCris * 12F;
        float differenceSalaryMary = newSalaryYearMary - salaryYearMary;
        float differenceSalaryDen = newSalaryYearDen - salaryYearDen;
        float differenceSalaryCris = newSalaryYearCris - salaryYearCris;
        System.out.println("Маша теперь получает " + newSalaryMary + " рублей. Годовой доход вырос на " + differenceSalaryMary + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей. Годовой доход вырос на " + differenceSalaryDen + " рублей");
        System.out.println("Кристна теперь получает " + newSalaryCris + " рублей. Годовой доход вырос на " + differenceSalaryCris + " рублей");






    }
}