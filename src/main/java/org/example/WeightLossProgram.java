package org.example;

public class WeightLossProgram {
    public static void main(String[] args) {
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
    }
}
