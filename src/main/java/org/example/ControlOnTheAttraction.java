package org.example;

public class ControlOnTheAttraction {
    public static void main(String[] args) {
        //Контроль на аттракционе
        System.out.println("Контроль на аттракционе");
        int visitorGrowth = 170;
        boolean withParents = false;
        if(visitorGrowth >= 160  || withParents){
            System.out.println("На аттракцион можно");
        }else {
            System.out.println("С таким ростом и без родителй на аттракцион нельзя");
        }
    }
}
