package Practise01;

import java.util.Scanner;

public class Q16_NotHesaplama {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner (System.in);
        System.out.print("lütfen vize1 notunuzu giriniz: ");
int vize1=scan.nextInt();
        System.out.print("lutfen vize2 notunuzu giriniz:");
        int vize2=scan.nextInt();
        System.out.print("lutfen final notunuzu giriniz:");
        int finalNot=scan.nextInt();
        double sonuc=(((vize2+vize1)/2)*0.3)+(finalNot*0.7);
        System.out.println("sınav notunuz: "+sonuc);

    }
}
