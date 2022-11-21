package org.example;

public class IdealWeight {
    public static void main(String[] args) {
        //Идеальный вес
        System.out.println("Идеальный вес");
        int height = 170;
        int weight = 68;
        double IdealWeightMinusFive = (height - 100) - ((height - 100) * 0.1) - 5;
        double IdealWeightPlusFive = (height - 100) - ((height - 100) * 0.1) + 5;
        System.out.println("Вес при минус 5 клиграммов: " + IdealWeightMinusFive);
        System.out.println("Вес при плюс 5 клиграммов: " + IdealWeightPlusFive);

        if(IdealWeightMinusFive == weight){
            System.out.println("при минус 5 клиграммов вес идеальный: " + weight + " <-- указанный вес");
        }else {
            System.out.println("при минус 5 клиграммов вес не идеальный ");
        }

        if(IdealWeightPlusFive == weight){
            System.out.println("при плюс 5 клиграммов вес идеальный: " + weight + " <-- указанный вес");
        }
        else {
            System.out.println("при плюс 5 клиграммов вес не идеальный ");
        }
    }
}
