package Practise01;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen Y yada N ikilisinden birini giriniz: y" +
                "");
        char harf=scan.next().toUpperCase().charAt(0);
        if (harf=='Y'){
            System.out.println("yes");
        }else if(harf=='N'){
            System.out.println("no");

        }else{
            System.out.println("lutfen sadece y ve n  giriniz");
        }







    }
}
