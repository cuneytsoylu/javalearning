package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{

    int saatUcreti=12;
    int gunlukMesai=9;

    protected  void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");

    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);// 12
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();// Personel
        System.out.println(mmr1.isim);// Personel

        System.out.println(mmr1.soyisim);// Personel
        System.out.println(mmr1.departman);// Personel

        BMuhasebe mhsb1= new BMuhasebe();

        /*
        Her ne kadar memur class inin icinde olsamda olusturdugum obje Muhasebe
        class indan
        cunku data turu ve constructor BMuhasebe

 String str="Murat";
        ArrayList<Integer> list = new ArrayList<>();
        Integer sayi=20;
        Bmuhasebe class i da obje olusturulabilen bir class tir yani data turudur



         */

        System.out.println(mhsb1.gunlukMesai);//8 Muhasebeden
        System.out.println(mhsb1.saatUcreti);// 10 Muhasebeden
        mhsb1.maas();//Muhasebeden
        mhsb1.ozelSigorta();//Muhasebeden
        mhsb1.sigorta();// Personel
        System.out.println(mhsb1.isim);// Personel

        System.out.println(mhsb1.soyisim);// Personel
        System.out.println(mhsb1.departman);// Personel

    }


}
