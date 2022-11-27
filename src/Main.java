public class Main {
    public static void main(String[] args) {
        //task 1
        int start = 0;
        int money = 15000;
        int month = 0;
        while (start < 2_459_000){
            money += money/100;
            start += money;
            month++;
            System.out.println("месяц " + month + " сумма накоплений равна " + start + " рублей ");
        }
        System.out.println("\n");

        //task 2
        int number = 1;
        while (number <= 10){
            System.out.print(number + " ");
            number++;
        }
        System.out.println("\n");
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task 3
        int peace = 12_000_000;
        int baby = 17;
        int rip = 8;
        int year = 1;
        while (year <= 10){
            int prirost = peace / 1000 * (baby - rip);
            peace += prirost;
            System.out.println("год " + year + " численность населения составляет " + peace);
            year++;
        }
        System.out.println("\n");

        //task 4
        int firstSalary = 15000;
        int month1 = 0;
        while (firstSalary <= 12_000_000){
            firstSalary += firstSalary * 7 / 100;
            month1++;
            System.out.println("месяц " + month1 + " сумма накоплений равна " + firstSalary);
        }
        System.out.println("\n");

        //task 5
        int sum = 15000;
        int month2 = 0;
        while (sum <= 12_000_000){
            sum += sum * 7 / 100;
            month2++;
            if (month2 % 6 == 0)
                System.out.println("месяц " + month2 + " сумма накоплений равна " + sum);
        }
        System.out.println("\n");

        //task 6
        int month3 = 0;
        int first = 15000;
        while (month3 <= 12 * 9){
            first += first * 7 / 100;
            month3++;
            if (month3 % 6 == 0)
                System.out.println("месяц " + month3 + " сумма накоплений равна " + first);
        }
        System.out.println("\n");

        //task 7
        int day = 2;
        while (day <= 31){
            System.out.println("сегодня пятница " + day + "-е, нужно подготовить отчет");
            day += 7;
        }
        System.out.println("\n");

        //task 8
        int yearComet = 0;
        int yearNow = 2020;
        do {
            yearComet += 79;
            if (yearComet >= yearNow - 200)
                System.out.println("комета пролежает мимо земли в " + yearComet + " году");
        }
        while (yearComet <= yearNow);
        System.out.println("\n");

        //task 9
        int num = 1;
        do {
            System.out.println("2 * " + num + " = " + 2 * num);
            num++;
        }
        while (num <= 10);
    }
}