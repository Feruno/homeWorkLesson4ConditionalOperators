package org.example;

public class TimeOfDayWithErrorNotifications {
    public static void main(String[] args) {
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
    }
}
