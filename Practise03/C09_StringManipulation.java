package Practise03;

import java.util.Scanner;

public class C09_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim ve soyismizi giriniz: \nisim");
        String isim = scan.next();
        System.out.println("soyisim");
        String soyismiz= scan.next();
if(isim.length()>soyismiz.length()){
    System.out.println("isminiz soyisminizden uzundur");

        }else if(isim.length()==soyismiz.length()){
    System.out.println("isminiz ve soyisminiz esit uzunlukta");

        }else System.out.println("soyisminiz isminizde uzun");



    }
}
