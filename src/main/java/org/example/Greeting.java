package org.example;

public class Greeting {
    public static void main(String[] args) {
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
    }
}
