package day07_ıfStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun
        ger yas 65
 den kucuk ise "emekli olamazsın,calıimalisin",
          65 e essit veya buyukse "Emekli olabilirsin " yazdirin

          */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas =scan.nextInt();
        if (yas<65){
            System.out.println("Emekli olamazsın" + " " + (65 - yas) + " yıl daha" + " çalışmalısın");
        } else {
            System.out.println("Emekli olabilirsin");
        }




    }
}
