package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        //Идеальный вес
        System.out.println("Идеальный вес");
        int height = 170;
        int weight = 68;
        double IdealWeightMinusFive = (height - 100) - ((height - 100) * 0.1) - 5;
        double IdealWeightPlusFive = (height - 100) - ((height - 100) * 0.1) + 5;
        System.out.println("Вес при минус 5 клиграммов: " + IdealWeightMinusFive);
        System.out.println("Вес при плюс 5 клиграммов: " + IdealWeightPlusFive);

        if(IdealWeightMinusFive == weight){
            System.out.println("при минус 5 клиграммов вес идеальный: " + weight + " вес");
        }else {
            System.out.println("при минус 5 клиграммов вес не идеальный ");
        }

        if(IdealWeightPlusFive == weight){
            System.out.println("при плюс 5 клиграммов вес идеальный: " + weight + " вес");
        }
        else {
            System.out.println("при плюс 5 клиграммов вес не идеальный ");
        }

        System.out.println("///////////////////////////////////////////////////////////");

        //Время суток
        System.out.println("Время суток");
        int TimeOfDay = 15;
        switch (TimeOfDay) {
            case 1,2,3,4,5,6:  System.out.println("ночь");
                break;
            case 7,8,9,10,11,12:  System.out.println("утро");;
                break;
            case 13,14,15,16,17:  System.out.println("день");;
                break;
            case 18,19,20,21,22,23:  System.out.println("вечер");;
                break;
        }
        System.out.println("///////////////////////////////////////////////////////////");

        //Время суток с уведомлениями об ошибках
        System.out.println("Время суток с уведомлениями об ошибках");
        int TimeOfDayWithErrors = 24;
        if(TimeOfDayWithErrors < 0){
            System.out.println("Время суток нужно ввести правильно");
        } else if (TimeOfDayWithErrors > 23) {
            System.out.println("Следует вернуться с другой планеты на Землю.");
        }
        switch (TimeOfDayWithErrors) {
            case 1,2,3,4,5,6:  System.out.println("ночь");
                break;
            case 7,8,9,10,11,12:  System.out.println("утро");;
                break;
            case 13,14,15,16,17:  System.out.println("день");;
                break;
            case 18,19,20,21,22,23:  System.out.println("вечер");;
                break;
        }
        System.out.println("///////////////////////////////////////////////////////////");

        //Приветствие
        System.out.println("Приветствие");
        int currentHour = 18;
        int dayWeek = 7;
        switch (dayWeek) {
            case 1,2,3,4,5:  System.out.println("По будним дням");
            if(currentHour >= 11 ){
                System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул!");
            } else if (currentHour > 8) {
                System.out.println("Всё пропало ты проспал!");
            } else if (currentHour < 8) {
                System.out.println("Доброе утро!");
            }
                break;
            case 6,7:  System.out.println("По выходным");;
            if(currentHour >= 18 ){
                System.out.println("Дааа, с режимом надо что-то делать!");
            } else if (currentHour >= 16) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            } else if (currentHour >= 12) {
                System.out.println("Лучше поспать ещё!");
            }
                break;
        }
        System.out.println("///////////////////////////////////////////////////////////");

        //Выбор оффера
        //крайне сомнитльно но хз как делать иначе
        System.out.println("Выбор оффера");
        int monthlyCompensationOffer1 = 4;
        int monthlyCompensationOffer2 = 5;
        int wayTimeOffer1 = 2;
        int wayTimeOffer2 = 5;
        if (wayTimeOffer1 * 2 > wayTimeOffer2 * 2 && monthlyCompensationOffer1 > monthlyCompensationOffer2){
            System.out.println("1");
        } else if (wayTimeOffer1 * 2 < wayTimeOffer2 * 2 && monthlyCompensationOffer1 < monthlyCompensationOffer2) {
            System.out.println("2");
        }

        System.out.println("///////////////////////////////////////////////////////////");

        //Контроль на аттракционе
        System.out.println("Контроль на аттракционе");
        int visitorGrowth = 170;
        boolean withParents = false;
        if(visitorGrowth >= 160  || withParents){
            System.out.println("На аттракцион можно");
        }else {
            System.out.println("С таким ростом и без родителй на аттракцион нельзя");
        }

        System.out.println("///////////////////////////////////////////////////////////");

        //Похудательная программа
        System.out.println("Похудательная программа");
        int caloriesConsumedPerDay = 1130;
        final int limit = 1400;
        final int chocolate = 340;
        final int bowlOfPorridge = 250;
        final int pieceBacon = 500;
        //System.out.println("можно кусок сала");
        //System.out.println("можно тарелку каши");
        //System.out.println("можно шоколадку");

        if(caloriesConsumedPerDay + pieceBacon < limit){
            System.out.println("можно кусок сала");
        } else if (caloriesConsumedPerDay + chocolate < limit) {
            System.out.println("можно шоколадку");
        } else if (caloriesConsumedPerDay + bowlOfPorridge < limit) {
            System.out.println("можно тарелку каши");
        }else {
            System.out.println("лимит каллорий на сегодня исчерпан");
        }

        System.out.println("///////////////////////////////////////////////////////////");

        //Бой джедаев и ситхов
        System.out.println("Бой джедаев и ситхов");
        int sithPosition = 110;
        int jediPosition = 110;
        boolean sithPalpatine = false;
        boolean jediObiWan = true;
        boolean darthMaul = true;

        if (sithPosition == jediPosition || true == sithPalpatine) {
            System.out.println("победа остаётся за ситхом.");
        }else if(sithPosition > jediPosition ){
            System.out.println("ситх проиграет.");
        }else if (sithPosition < jediPosition || jediObiWan == darthMaul) {
            System.out.println("джедай выигрывает.");
        }


    }
}
