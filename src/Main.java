public class Main {
    public static void main(String[] args)
    {
        // 1
        int firstVar = 150000;
        byte secondVar = 20;
        short thirdVar = 2000;
        long fourthVar = 20000000L;
        float fifthVar= 15.25f;
        double sixthVar = 150.25784215;
        System.out.println("1 задание\n");
        System.out.println("Значение переменной firstVar с типом int равно " + firstVar);
        System.out.println("Значение переменной secondVar с типом byte равно " + secondVar);
        System.out.println("Значение переменной thirdVar с типом short равно " + thirdVar);
        System.out.println("Значение переменной fourthVar с типом long равно " + fourthVar);
        System.out.println("Значение переменной fifthVar с типом float равно " + fifthVar);
        System.out.println("Значение переменной sixthVar с типом double равно " + sixthVar + "\n");

        // 2
        float flVar = 27.12f;
        long longVar = 987678965549L;
        float flVar2 = 2.786f;
        short shortVar = 569;
        short shortVar2 = -159;
        short intVar = 27897;
        byte byteVar = 67;


        // 3
        byte classLyudmila = 23;
        byte classAnn = 27;
        byte classKate = 30;
        short numberOfSheets = 480;
        int sheetsPerStudents = numberOfSheets / (classLyudmila + classAnn + classKate);
        System.out.println("3 задание\n" + "На каждого ученика рассчитано " + sheetsPerStudents + " листов бумаги \n");

        // 4
        short bottles = 16;
        short time = 2;
        int speedPerMinute = bottles / time;
        int speedPer20Minutes = speedPerMinute * 20;
        int speedPerDay = speedPerMinute * 24 * 60;
        int speedPer3Days = speedPerDay * 3;
        int speedPerMonth = speedPerDay * 30;
        System.out.println("4 задание\n" + "За 20 минут машина произвела "+ speedPer20Minutes + " штук бутылок ");
        System.out.println("За сутки машина произвела "+ speedPerDay + " штук бутылок ");
        System.out.println("За 3 дня машина произвела "+ speedPer3Days + " штук бутылок ");
        System.out.println("За месяц машина произвела "+ speedPerMonth+ " штук бутылок \n");

        // 5
        byte canOfPaints = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int canPerClass = whiteCansPerClass + brownCansPerClass;
        int numberOfClasses = canOfPaints / canPerClass;
        System.out.println("5 задание\n" + "В школе, где "+ numberOfClasses + " классов, нужно " + numberOfClasses * 2 + " банок белой краски и " + numberOfClasses * 4 + " банок коричневой краски \n");

        // 6
        byte bananas = 5, bananasWeight = 80, milkWeight = 105;
        short milkInMl = 200;
        int milkInThing = milkInMl / 100;
        byte iceCream = 2, iceCreamWeight = 100, eggs = 4, eggWeight = 70;
        float weightOfBreakfast = bananasWeight * bananas + milkInThing * milkWeight +
                iceCream * iceCreamWeight + eggs * eggWeight;
        int grPerKg = 1000;
        float weightKg = weightOfBreakfast/(float)grPerKg;
        System.out.println("6 задание\n" + "Вес завтрака в килограммах равен "+ weightKg + " килограмм, а в граммах — " + weightOfBreakfast + " грамм\n");

        // 7
        byte aimInKg = 7;
        short kgPerGr = 1000;
        int weight = aimInKg * kgPerGr;
        short loseOfWeight = 250, loseOfWeight2 = 500;
        int weightInDay = weight / loseOfWeight;
        int weightInDay2 = weight / loseOfWeight2;
        System.out.println("7 задание\n" + "Худея на 250 грамм в день, понадобится " + weightInDay + " дней, чтобы похудеть на 7 кг");
        System.out.println("Худея на 500 грамм в день, понадобится " + weightInDay2 + " дней, чтобы похудеть на 7 кг\n");

        // 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float newSalaryMasha = salaryMasha * 1.1f;
        float newSalaryDenis = salaryDenis * 1.1f;
        float newSalaryKristina = salaryKristina * 1.1f;
        float differenceMasha = (newSalaryMasha - salaryMasha) * 12;
        float differenceDenis = (newSalaryDenis - salaryDenis) * 12;
        float differenceKristina = newSalaryKristina - salaryKristina;
        System.out.println("8 задание\n"+ "Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");

    }
}