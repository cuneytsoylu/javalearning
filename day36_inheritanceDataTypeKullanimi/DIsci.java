package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{
    int saatUcreti=11;
    int gunlukMesai=7;

    protected  void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");

    }

    protected void ozelSigortaIsci(){
        System.out.println("ISciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();

        /*
        Bir obje olusturulurken
        Data turu ve constructor ayni class dan ise
        direk o class agidiyorduk


        Eger data turu ve constructor farkli ise
       Obje constructor ın oldugu class in objesidir
       ancak bizden istenen
       Isci class inda ki spesifik ozellikler degil bir iscininn muhasebe class indaki
       tum calisanlarla beraber aship oldugu genel ozelikleri istiyoruz

         */
        System.out.println(isc1.gunlukMesai);// M 8
        System.out.println(isc1.saatUcreti);//M 10
        isc1.maas();// Muhasebe: Personel minimum : 2400 maas alir
        isc1.ozelSigorta(); // Muhasebe: Isteyen calisanlara %50 indirimil ozel sigorta yapilir
        isc1.sigorta();// P
        System.out.println(isc1.isim);// P

        System.out.println(isc1.soyisim);// P
        System.out.println(isc1.departman);// P



        APersonel isc2 = new DIsci();

        //System.out.println(isc2.gunlukMesai); // M 8

        //System.out.println(isc2.saatUcreti); // M 10

        //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir

        isc2.sigorta(); // P

        System.out.println(isc2.isim); // P

        System.out.println(isc2.soyisim); // P

        System.out.println(isc2.departman);// P

/*
Eger Data turu olan class da aradigimiz ozellik yoksa
varsa onun parent  ina gidebilir
ama child a donus olmaz
Aradigi ozelligi bulamazsa CTE verir
 */


        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();



        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */



    }
}
