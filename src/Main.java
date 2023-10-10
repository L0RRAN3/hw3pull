// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int typeInt = 100;
        System.out.println("Значение переменной typeInt с типом int равно " + typeInt);
        byte typeByte = 50;
        System.out.println("Значение переменной typeByte с типом byte равно " + typeByte);
        short typeShort = 3;
        System.out.println("Значение переменной typeShort с типом short равно " + typeShort);
        long typeLong = 3645275;
        System.out.println("Значение переменной typeLong с типом long равно " + typeLong);
        double typeDouble = 56.34535;
        System.out.println("Значение переменной typeDouble с типом double равно " + typeDouble);

        System.out.println();

        System.out.println("Задача 2");
        float f1 = 27.12f;
        long l1 = 987_678_965_549L;
        double d2 = 2.786;
        short s1 = 569;
        int i1 = -159;
        char c1 = 27897;
        byte b1 = 67;

        System.out.println();

        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        int peoplePaper = paper / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + peoplePaper + " листов бумаги");

        System.out.println();

        System.out.println("Задача 4");
        short min1 = 16/2;
        int min = min1 * 20;
        System.out.println("За 20 минут машина произвела " + min + " штук бутылок");
        int day = (min1 * 60) * 24;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int day3 = day * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int mounth = day * 30;
        System.out.println("За месяц машина произвела " + mounth + " штук бутылок");

        System.out.println();

        System.out.println("Задача 5");
        int kr = 120;
        int white = 2;
        int brown = 4;
        int classes = kr / (white + brown);
        System.out.println("В школе, где " + classes + " классов, нужно " + (classes * white) +
                " банок белой краски и " + (classes * brown) + " банок коричневой краски");

        System.out.println();

        System.out.println("Задача 6");
        int bananas = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int shake = (bananas + milk + iceCream + eggs);
        System.out.println("Вес спортзавтрака - " + shake + " грамм");
        System.out.println("Вес спортзавтрака - " + ((float)shake / 1000) + " кг");

        System.out.println();

        System.out.println("Задача 7");
        int weight = 7*1000;
        System.out.println((weight / 250) + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 250 грамм");
        System.out.println((weight / 500) + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(((weight / 250) + (weight / 500))/2 + " день может потребоваться в среднем, чтобы добиться " +
                "результата похудения");

        System.out.println();

        System.out.println("Задача 8");
        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;
        int mashaNew = masha + (masha / 10);
        int mashaYear = (mashaNew * 12) - (masha * 12);
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на "
                + mashaYear + " рублей");
        int denisNew = denis + (denis / 10);
        int denisYear = (denisNew * 12) - (denis * 12);
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на "
                + denisYear + " рублей");
        int krisNew = kris + (kris / 10);
        int krisYear = (krisNew * 12) - (kris * 12);
        System.out.println("Кристина теперь получает " + krisNew + " рублей. Годовой доход вырос на "
                + krisYear + " рублей");
    }
}