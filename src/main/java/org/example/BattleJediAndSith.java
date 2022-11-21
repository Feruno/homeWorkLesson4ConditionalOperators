package org.example;

public class BattleJediAndSith {
    public static void main(String[] args) {
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
