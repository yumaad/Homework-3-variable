public class Main {
    public static void main(String[] args)
    {
        // 1
        int firstVar = 150000;
        byte secondVar = 20;
        short thirdVar = 2000;
        long fourthVar = 20000000L;
        float fifthVar= 15.25f;
        double sixthVar = 150;
        System.out.println("1 задание\n" + "Значение переменной firstVar с типом int равно " + firstVar);
        System.out.println("Значение переменной secondVar с типом byte равно " + secondVar);
        System.out.println("Значение переменной thirdVar с типом short равно " + thirdVar);
        System.out.println("Значение переменной fourthVar с типом long равно " + fourthVar);
        System.out.println("Значение переменной fifthVar с типом float равно " + fifthVar);
        System.out.println("Значение переменной sixthVar с типом double равно " + sixthVar + "\n");

        // 2
        float flVar = 27.12f;
        long longVar = 987678965549L;
        double doubleVar = 2.786;
        short shortVar = 569;
        short shortVar2 = -159;
        int intVar = 27897;
        byte byteVar = 67;

        // 3
        byte classLyudmila = 23;
        byte classAnn = 27;
        byte classKate = 30;
        short numberOfSheets = 480;
        int sheetsPerStudents = numberOfSheets / (classLyudmila + classAnn + classKate);
        System.out.println("3 задание\n" + "На каждого ученика рассчитано " + sheetsPerStudents + " листов бумаги \n");

        // 4 /
        short speedPerMinute = 16 / 2;
        System.out.println("4 задание\n" + "За 20 минут машина произвела "+ speedPerMinute * 20 + " штук бутылок ");
        System.out.println("За сутки машина произвела "+ speedPerMinute * 24 * 60 + " штук бутылок ");
        System.out.println("За 3 дня машина произвела "+ speedPerMinute * 24 * 60 * 3 + " штук бутылок ");
        System.out.println("За месяц машина произвела "+ speedPerMinute * 24 * 60 * 30 + " штук бутылок \n");

        // 5
        byte canOfPaints = 120;
        byte canPerClass = 2 + 4;
        int numberOfClasses = canOfPaints / canPerClass;
        System.out.println("5 задание\n" + "В школе, где "+ numberOfClasses + " классов, нужно " + numberOfClasses * 2 + " банок белой краски и " + numberOfClasses * 4 + " банок коричневой краски \n");

        // 6
        byte bananas = 5, bananasWeight = 80, milkWeight = 105, milk = 200 / 100;
        byte iceCream = 2, iceCreamWeight = 100, eggs = 4, eggWeight = 70;
        float weightOfBreakfast = bananasWeight * bananas + milk * milkWeight +
                iceCream * iceCreamWeight + eggs * eggWeight;
        int grPerKg = 1000;
        float weightKg = weightOfBreakfast/(float)grPerKg;
        System.out.println("6 задание\n" + "Вес завтрака в килограммах равен "+ weightKg + " килограмм, а в граммах — " + weightOfBreakfast + " грамм\n");

        // 7
        short weight = 7 * 1000, loseOfWeight = 250, loseOfWeight2 = 500;
        System.out.println("7 задание\n" + "Худея на 250 грамм в день, понадобится " + weight / loseOfWeight + " дней, чтобы похудеть на 7 кг");
        System.out.println("Худея на 500 грамм в день, понадобится " + weight / loseOfWeight2 + " дней, чтобы похудеть на 7 кг\n");

        // 8
        int salaryMasha = 67760, salaryDenis = 83690, salaryKristina = 76230;
        float newSalaryMasha = salaryMasha * 1.1f, newSalaryDenis = salaryDenis * 1.1f, newSalaryKristina = salaryKristina * 1.1f;
        System.out.println("8 задание\n"+ "Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newSalaryMasha - salaryMasha)* 12 + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryDenis - salaryDenis)* 12 + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (newSalaryKristina - salaryKristina)* 12 + " рублей");
    }
}