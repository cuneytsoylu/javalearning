package day34_inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir class varsa
    veya ilerde bu class i parent yapmak isteyenler olabilir diyorsaniz
    o zaman variable ve methodlarin
    access modifier ini protected(tam olarak inheritance icin olusturulmus)

     */

     protected int persNo;
    protected String isim="Isim belirtilmedi";
    protected String departman="Departman belirtilmedi";



    protected void maas(){
        System.out.println("Tum personelin maasi vardir");


    }
    protected void mesai(){

        System.out.println("Tum personel statusune göre mesai yapar");


    }


    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune göre alir");
    }

}
