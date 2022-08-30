package day04_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1=-132;

        byte sayi2= (byte) sayi1;

        System.out.println(sayi2);// 50

        /*
         GEnis data turundeki degeri dar data turundeki variable a atamak isterseniz
         Java sizin genis data turundeki degerin dar data turunun sinirlarina uyup uymayacagini
         calistirana kadar bilemez ama Java Risk almaz
         Riski sifira indirmek icin burada bir sorun olursa sorumlulugu kabul etmenizi bekle
         bunun icin degerin onune parantez icerisinde istedigimiz data turunu
         yazmamız yeterlidir

         bu riski ustlendigimizde,3durum olusur
         1- bizim degerimiz dar kalip degerlerine uygun olursa hicbir kayip olmada n cast olur
         2- double bir sayıyı int a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
         3-genis kalipta degeri dar kaliba koydugunuzda sinirleari asan durumlarda veri
         baskalasabilir

         */




    }
}
