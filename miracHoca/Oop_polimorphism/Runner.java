package miracHoca.Oop_polimorphism;

public class Runner {


    public static void main(String[] args) {



        Civciv civciv1=new Civciv();
        ordek ordek1=new ordek();
        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek1);


    }
  /*  public static void hayvanSesCikar(Civciv civciv){
        civciv.sesiCikar();

    }
    public static void hayvanSesCikar(ordek ordek){
        ordek.sesiCikar();

    }*/
   //  BUNLARI YAZMAK YERİNE AŞAGIDAKİ GİBİ DATA TURUNU GENEL YAPMAMIZ LAZIM O ZAMAN HEPSİNİ TEK SEFERDE ÇALIŞTIRABİLİRİZ

    public static void hayvanSesCikar(Animal animal){
        animal.sesiCikar();
    }






}
