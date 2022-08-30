package day07_ıfStatements;

import java.util.Scanner;

public class C04_basitIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
 *** String icin equals method’unu kullanin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("girilen gun HAFTASONU");

        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")) {
            System.out.println("Girilen gun HAFTAİCİ");
        }
        if (!((girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") || girilenGun.equals("cuma"))
                || girilenGun.equals("cumartesi") || girilenGun.equals("pazar"))) {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }

    }
}
