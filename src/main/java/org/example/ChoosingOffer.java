package org.example;

public class ChoosingOffer {
    public static void main(String[] args) {
        //Выбор оффера
        System.out.println("Выбор оффера");
        int monthlyCompensationOffer1 = 4;
        int monthlyCompensationOffer2 = 5;
        int wayTimeOffer1 = 2;
        int wayTimeOffer2 = 5;
        if (wayTimeOffer1 * 2 > wayTimeOffer2 * 2 && monthlyCompensationOffer1 > monthlyCompensationOffer2){
            System.out.println("лучше выбрать первый офер (1)");
        } else if (wayTimeOffer1 * 2 < wayTimeOffer2 * 2 && monthlyCompensationOffer1 < monthlyCompensationOffer2) {
            System.out.println("лучше выбрать второй офер (2)");
        }
    }
}
